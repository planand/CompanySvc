package com.example.companydemo.configProperties.server;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.Min;


@Component
@Data
@Validated
@ConfigurationProperties(prefix = "server")
@Profile("dev")
public class ServerPropertiesDev implements SProps{
    @Min(1000)
    @Max(65000)
    private int port;

    @NotBlank(message = "Value cannot be blank: connectionTimeout")
    private int connectionTimeout;

    @Value("${server.activeFlag1:1}")
    private int activeFlag1;
}
