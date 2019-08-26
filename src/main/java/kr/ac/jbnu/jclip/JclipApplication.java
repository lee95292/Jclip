package kr.ac.jbnu.jclip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class JclipApplication {

	public static void main(String[] args) {
		SpringApplication.run(JclipApplication.class, args);
	}

	@Bean
	public InternalResourceViewResolver setViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setPrefix(".jsp");
		return resolver;
	}
}
