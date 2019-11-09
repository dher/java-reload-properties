package com.example.propwatcher.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by derryaditiya on 09/11/19.
 */
@Configuration
public class ConfigResource {

    @Bean
    public PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer ppc = new PropertySourceConfig();
        ppc.setIgnoreUnresolvablePlaceholders(true);
        return ppc;
    }

}