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

import hai.bk.webjava.dao.api.AdminDAO;
import hai.bk.webjava.dao.api.RoleDAO;
import hai.bk.webjava.entity.AdminEntity;

@Service
public class MyAdminAuthenticationService implements UserDetailsService{
	
	@Autowired
	private AdminDAO adminDAO;
	
	@Autowired
	private RoleDAO roleDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		// username is Id
		AdminEntity adminEntity = this.adminDAO.findAdmin(username);
		if (adminEntity == null) {
            throw new UsernameNotFoundException("Admin " //
                    + username + " was not found in the database");
        }
		
		List<String> roles = this.roleDAO.listRoleByAdminID(username);
		List<GrantedAuthority> grantList = new ArrayList<>();
		if(roles != null){
			GrantedAuthority gAuthority = new SimpleGrantedAuthority("ROLE_ADMIN");
			grantList.add(gAuthority);
			for(String role : roles){
				GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role);
				grantList.add(authority);
			}
		}
		
		GrantedAuthority gAuthority = new SimpleGrantedAuthority("ROLE_ADMIN");
		grantList.add(gAuthority);
		
		boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        
		UserDetails userDetails = new User(username, adminEntity.getPassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantList);
		return userDetails;
	}

}
