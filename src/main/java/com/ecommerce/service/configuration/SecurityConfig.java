package com.ecommerce.service.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User; // ← Adicione esta linha
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.ecommerce.service.domain.dto.UsuarioDTO;
import com.ecommerce.service.persistence.entity.UsuarioPersistenceEntity;
import com.ecommerce.service.persistence.mapper.ComandaMapper;
import com.ecommerce.service.persistence.mapper.UsuarioMapper;
import com.ecommerce.service.persistence.repository.jpa.usuario.UsuarioRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()));
        http
            .csrf(csrf -> csrf.disable())
            
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/caixa/**").hasRole("CAIXA")
                .requestMatchers("/garcom/**").hasRole("GARCOM")
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().permitAll()
            )
            .formLogin(form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/")
            );
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    UserDetailsService userDetailsService() {

        UsuarioDTO garcomDTO = UsuarioDTO.builder()
            .username("garcom")
            .password("123")
            .role("GARCOM")
            .build();

        UsuarioDTO caixaDTO = UsuarioDTO.builder()
            .username("caixa")
            .password("123")
            .role("CAIXA")
            .build();    

        return new InMemoryUserDetailsManager(
            UsuarioMapper.INSTANCE.toUser(caixaDTO),
            UsuarioMapper.INSTANCE.toUser(garcomDTO) 
            );
    }

}