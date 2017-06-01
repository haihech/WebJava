package hai.bk.webjava.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Service;

import hai.bk.webjava.auth.MyAdminAuthenticationService;
import hai.bk.webjava.auth.MyUserAuthenticationService;

@Configuration
@EnableWebSecurity
@Service
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	MyUserAuthenticationService myUserAuth;

	@Autowired
	MyAdminAuthenticationService myAdmin;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Các User trong Database
		auth.userDetailsService(myAdmin);
		auth.userDetailsService(myUserAuth);
		
		// Lay thong tin cua user sau khi dang nhap
//      Authentication auth1 = SecurityContextHolder.getContext().getAuthentication();
//      UserDetails userDetail = (UserDetails) auth1.getPrincipal();
//
//      User u = ((Object) userDetail).getUser(userDetail.getUsername());
//      request.getSession().setAttribute("userId", u.getId());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		// Các trang không yêu cầu login
		http.authorizeRequests().antMatchers("/", "/login", "/logout").permitAll();

		// Trang /userInfo yêu cầu phải login với vai trò USER hoặc ADMIN.
		// Nếu chưa login, nó sẽ redirect tới trang /login.
		// http.authorizeRequests().antMatchers("/userInfo").access("hasAnyRole('ROLE_USER',
		// 'ROLE_ADMIN')");

		// For ADMIN only.
		// Trang chỉ dành cho ADMIN
		 String roleAdmin = "hasRole('ROLE_ADMIN')";
		 http.authorizeRequests().antMatchers("/admin/**").access(roleAdmin);

		// Khi người dùng đã login, với vai trò XX.
		// Nhưng truy cập vào trang yêu cầu vai trò YY,
		// Ngoại lệ AccessDeniedException sẽ ném ra.
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		// Cấu hình cho Login Form.
		http.authorizeRequests().and().formLogin()//

				// Submit URL của trang login
				.loginProcessingUrl("/j_spring_security_check") // Submit URL
				.loginPage("/login")//
				.defaultSuccessUrl("/admin/home")//
				.failureUrl("/login?error=true")//
				.usernameParameter("username")//
				.passwordParameter("password")

				// Cấu hình cho Logout Page.
				.and().logout().logoutUrl("/admin/logout").logoutSuccessUrl("/login");

	}

}
