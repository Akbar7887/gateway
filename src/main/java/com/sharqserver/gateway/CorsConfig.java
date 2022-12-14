//package com.sharqserver.gateway;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Collections;
//
////@EnableWebFluxSecurity
////@EnableReactiveMethodSecurity
//@Configuration
//public class CorsConfig {
//
//
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource()  {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//
//        config.setAllowedOrigins(Collections.singletonList("http://localhost:8087"));
//        config.setAllowedMethods(Collections.singletonList("GET"));
//        config.setAllowedHeaders(Collections.singletonList("*"));
//        source.registerCorsConfiguration("/**", config);
//        return source;
//    }
//}
