package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.formLogin().and().logout();
//    }
}
