package hai.bk.webjava.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hai.bk.webjava.dao.api.UserDAO;
import hai.bk.webjava.entity.UserEntity;

//sử dụng để tùy biến xác thực, nó thi hành interface AuthenticationService
@Service
public class MyUserAuthenticationService implements UserDetailsService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserEntity user = userDAO.findUser(Integer.parseInt(username));
		System.out.println("User: "+user);
		if (user == null) {
            throw new UsernameNotFoundException("User " //
                    + username + " was not found in the database");
        }
		
		List<GrantedAuthority> grantList = new ArrayList<>();
		GrantedAuthority gAuthority = new SimpleGrantedAuthority("ROLE_USER");
		grantList.add(gAuthority);
		
		boolean enabled =true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        
		UserDetails userDetails = new User(username, user.getPassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantList);
		return userDetails;
	}

}
