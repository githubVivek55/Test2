package com.myblog.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * Spring Mvc configurer
 * @author viks
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.myblog")
public class SpringWebMvcConfig extends WebMvcConfigurerAdapter {
	/**
	 * configure tiles configurer
	 */
	@Bean
	public TilesConfigurer tilesConfigurer(){
		TilesConfigurer tilesconf=new TilesConfigurer();
		tilesconf.setDefinitions(new String[]{"/WEB-INF/views/**/tiles.xml"});
		tilesconf.setCheckRefresh(true);
		return tilesconf;
	}
	
	/**
     * Configure ViewResolvers to deliver preferred views.
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        TilesViewResolver viewResolver = new TilesViewResolver();
        registry.viewResolver(viewResolver);
    }
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
	 */
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
	/**
	 * configure message properties for internationalization
	 */
	@Bean
	public MessageSource messageSource(){
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.setBasename("message");
		return messageSource;
	}
}
