package com.angryBeaver.jackson.configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.schema.configuration.ObjectMapperConfigured;

@Configuration
public class ApplicationConfig implements ApplicationListener<ObjectMapperConfigured> {
    @Primary
    @Bean(name="jdk8ObjectMapper")
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new Jdk8Module());
        return mapper;
    }

    @Override
    public void onApplicationEvent(ObjectMapperConfigured event) {
        event.getObjectMapper().registerModule(new Jdk8Module());
    }

    @Bean
    public Module jdk8JacksonModule() {
        return new Jdk8Module();
    }
}
