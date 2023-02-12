package com.example.footballscoreboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Create the configuration that tells Spring where to find the view files.
 */
@Configuration
public class SpringConfig {
	
	/**
     * Resolve logical view names to .jsp resources in the /WEB-INF/views/
     * directory. 
     * @return ViewResolver object
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
