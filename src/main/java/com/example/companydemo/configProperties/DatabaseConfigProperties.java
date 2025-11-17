package com.example.companydemo.configProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Data
@Validated
@ConfigurationProperties(prefix = "spring.datasource")
public class DatabaseConfigProperties {
    @NotBlank(message = "Cannot be blank : url")
    private String url;
    @NotBlank(message = "Cannot be blank : driver")
    private String driver;
    @NotBlank(message = "Cannot be blank : username")
    private String username;
    @NotBlank(message = "Cannot be blank: password")
    private String password;
}
