package cl.cyadev.app.DouceAmitie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;

/**
 * The Class WebSecurityConfig.
 */
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Configure.
	 *
	 * @param http the http
	 * @throws Exception the exception
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//No perder la vuelta atras
		http.headers().cacheControl().disable();
		
		//Error 403 privado
		http.csrf().disable();

		//Requerimiento de seguridad X-Frame-Options: SAMEORIGIN
		http.headers().frameOptions().sameOrigin();

		//CORS Deshabilitado
		http.cors().disable();
	}
	
	/**
	 * Default http firewall.
	 *
	 * @return the http firewall
	 */
	@Bean
	public HttpFirewall defaultHttpFirewall() {
	    return new DefaultHttpFirewall();
	}
	
}