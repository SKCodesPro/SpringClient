package com.sk.practice.springclient.web.client;

import com.sk.practice.springclient.web.dto.wrench.RoleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@ConfigurationProperties(prefix =  "spring.client", ignoreUnknownFields = false)
public class SpringClient {
    private RestTemplate restTemplate;
    @Setter
    private String apiHost;

    private final String ROLE_PATH = "getwrench?roleName=";
    @Autowired
    public void setRestTemplate(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }
    public RoleDto getRolesFromMS(String roleName){
        return restTemplate.getForObject(apiHost + ROLE_PATH + roleName, RoleDto.class);
    }
}
