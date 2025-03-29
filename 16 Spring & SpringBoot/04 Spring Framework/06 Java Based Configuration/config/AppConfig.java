package com.anirudh.config;

import com.anirudh.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This file will replace the spring.xml file
@Configuration
public class AppConfig {
    @Bean(name = "com")
    public Desktop desktop()
    {
        return new Desktop();
    }

}
