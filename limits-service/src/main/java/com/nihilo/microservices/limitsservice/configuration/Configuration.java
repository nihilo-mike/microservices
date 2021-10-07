package com.nihilo.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    @Getter @Setter
    private int minimum;
    @Getter @Setter
    private int maximum;
}
 