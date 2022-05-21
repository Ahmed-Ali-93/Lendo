package com.lendo.ahmed.ali.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

@SpringBootApplication
@EnableFeignClients
@EnableOAuth2Client
public class PostsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostsApplication.class, args);
    }


    @Autowired
    private OAuth2ClientContext auth2ClientContext;

    @Bean
    public OAuth2RestTemplate clientCredentialsRestTemplate() {
        OAuth2RestTemplate auth2RestTemplate = new OAuth2RestTemplate(resource(), auth2ClientContext);
        auth2RestTemplate.setRetryBadAccessTokens(true);
        return auth2RestTemplate;
    }

    @Bean
    public OAuth2ProtectedResourceDetails resource() {
        ClientCredentialsResourceDetails details = new ClientCredentialsResourceDetails();
        details.setAccessTokenUri("http://localhost:8080/authorization-server/oauth/token");
        details.setClientId("web");
        details.setClientSecret("test");
        details.setGrantType("client_credentials");
        details.setScope(Arrays.asList("READ", "WRITE"));
        return details;
    }


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
}
