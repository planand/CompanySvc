package com.example.companydemo.configProperties;

import jakarta.validation.constraints.Max;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.Min;


@Component
@Data
@Validated
@ConfigurationProperties(prefix = "server")
public class ServerProperties {
    @Min(1000)
    @Max(65000)
    private int port;

    @Value("${server.connectionTimeout:5000}")
    private int connectionTimeout;
}
