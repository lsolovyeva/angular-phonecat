import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;


@SpringBootApplication
@ComponentScan({"controller", "model", "service", "repository"})
public class Main {
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

    @Configuration
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {


        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/**/*.js", "/**/*.css", "/**/*.html");
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http
                    .formLogin().and()
                    .logout().and()
                    .authorizeRequests()

                    .antMatchers("/")
//                    .antMatchers("/index.html", "/home.html", "/login.html", "/"
//
//                            , "/bower_components/**",
//                             "/core/**","/img/**",
//                            "/app.animations.css",
//                            "/app.animations.js",
//                            "/app.config.js",
//                            "/app.css",
//                            "/app.module.js",
//                            "/hello.js"
//
//                            )
                    .permitAll().and().authorizeRequests()
                    .anyRequest().authenticated().and().csrf().disable();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}