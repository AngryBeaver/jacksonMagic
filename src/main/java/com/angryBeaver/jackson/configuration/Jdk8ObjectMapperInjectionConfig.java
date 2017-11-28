package com.angryBeaver.jackson.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Component
public class Jdk8ObjectMapperInjectionConfig {

    @Resource(name = "jdk8ObjectMapper")
    private ObjectMapper jdk8ObjectMapper;

    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    @Resource
    public void setRequestMappingHandlerAdapter(
            RequestMappingHandlerAdapter requestMappingHandlerAdapter
    ) {
        this.requestMappingHandlerAdapter = requestMappingHandlerAdapter;
    }

    @PostConstruct
    public void injectJdk8ObjectMapperIntoDefaultMappingJacksonHttpMessageConverter() {
        List<HttpMessageConverter<?>> converters =
                this.requestMappingHandlerAdapter.getMessageConverters();
        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof MappingJackson2HttpMessageConverter) {
                MappingJackson2HttpMessageConverter m =
                        (MappingJackson2HttpMessageConverter) converter;
                m.setObjectMapper(this.jdk8ObjectMapper);
            }
        }
    }
}

