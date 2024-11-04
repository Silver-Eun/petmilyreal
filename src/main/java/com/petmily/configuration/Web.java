package com.petmily.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class Web implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "home");

	}

//@Bean
//public ClassLoaderTemplateResolver yourTemplateResolver() {
//	ClassLoaderTemplateResolver configurer = new ClassLoaderTemplateResolver();
//	configurer.setPrefix("/WEB-INF/views");
//	configurer.setSuffix(".jsp");
//	configurer.setTemplateMode(TemplateMode.HTML);
//	configurer.setCharacterEncoding("UTF-8");
//	configurer.setOrder(0);  // this is important. This way spring //boot will listen to both places 0 and 1
//	configurer.setCacheable(false);
//	configurer.setCheckExistence(true);
//	return configurer;
//}
}
