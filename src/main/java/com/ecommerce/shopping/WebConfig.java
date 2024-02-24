package com.ecommerce.shopping;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/media/**")
                .addResourceLocations("file:/C:/Users/hp/Documents/workspace-spring-tool-suite-4-4.21.0.RELEASE/cmsshoppingcart/src/main/resources/static/media/");
    }
}
