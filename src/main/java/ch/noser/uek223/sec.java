//package ch.noser.uek223;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.cors().and().csrf().disable()
////                .authorizeRequests().antMatchers("/products/", "/products/**").hasAnyRole("Admin")
////                .antMatchers("/products/", "/products/**").hasAnyRole("Consumer")
//            .authorizeRequests().antMatchers("/products/", "/products/**").hasAuthority("can_see_product")
//                .antMatchers( "/users/", "/users/**", "/login").permitAll()
//                .anyRequest().authenticated().and().formLogin();
//    }
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("admin")
//                        .password("password")
//                        .roles("Admin")
//                        .authorities("can_see_product")
//                        .build();
//        UserDetails user2 =
//                User.withDefaultPasswordEncoder()
//                        .username("supplier")
//                        .password("password")
//                        .roles("Supplier")
//                        .build();
//        UserDetails user3 =
//                User.withDefaultPasswordEncoder()
//                        .username("consumer")
//                        .password("password")
//                        .roles("Consumer")
//                        .build();
//        return new InMemoryUserDetailsManager(user, user2, user3);
//    }
//}