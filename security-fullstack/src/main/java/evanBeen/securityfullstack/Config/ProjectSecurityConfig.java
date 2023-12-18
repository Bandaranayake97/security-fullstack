package evanBeen.securityfullstack.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests()
                .antMatchers("/myaccount").authenticated()
                .antMatchers("/notice").permitAll()
                .and().formLogin().and().
    }`
}
