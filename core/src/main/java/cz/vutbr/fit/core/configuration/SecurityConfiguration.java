package cz.vutbr.fit.core.configuration;

import cz.vutbr.fit.core.tools.Constant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * Security configuration class. Class secures admin section.
 *
 */

@Configuration
public class SecurityConfiguration {
    @Bean
    SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        http.csrf().disable();
        http.headers().frameOptions().disable();
        return http
                .authorizeExchange().pathMatchers("/admin").authenticated()
                .anyExchange().permitAll()
                .and()
                .formLogin().loginPage("/login")
                .and()
                .logout().logoutUrl("/logout")
                .and()
                .build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    MapReactiveUserDetailsService userDetailsService() {

        UserDetails admin = User
                .withUsername(Constant.Creditials.ADMIN)
                .password(passwordEncoder().encode(Constant.Creditials.PASSWORD))
                .roles(Constant.Roles.ADMIN)
                .build();
        return new MapReactiveUserDetailsService(admin);
    }
}
