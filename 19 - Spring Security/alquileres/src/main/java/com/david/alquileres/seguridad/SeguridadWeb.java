package com.david.alquileres.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.david.alquileres.servicios.UsuarioServicio;

@Configuration
@EnableWebSecurity
public class SeguridadWeb {
    @Autowired
    public UsuarioServicio usuarioServicio;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioServicio)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // http
        //         .authorizeHttpRequests()
        //         .requestMatchers("/css/*", "/js/*", "/img/*", "/**")
        //         .permitAll();
        http
                                .authorizeHttpRequests()
                                .requestMatchers("/admin/*").hasRole("ADMIN")
                                .requestMatchers("/css/*", "/js/*", "/img/*", "/**")
                                .permitAll()
                                .and().formLogin()
                                .loginPage("/familias/ingreso")
                                .loginProcessingUrl("/verificar_login_familias")
                                .usernameParameter("email")
                                .passwordParameter("clave")
                                .defaultSuccessUrl("/familias")
                                .permitAll()
                                .and().logout()
                                .logoutUrl("/familias/logout")
                                .logoutSuccessUrl("/familias/ingreso")
                                .permitAll()
                                .and().csrf()
                                .disable();
        return http.build();
    }
}