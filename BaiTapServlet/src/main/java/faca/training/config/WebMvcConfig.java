package faca.training.config;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer{
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry){
	registry.addResourceHandler("/styles/**").addResourceLocations("/WEB-INF/templates/").setCachePeriod(31556926);
}
@Bean
public ViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/WEB-INF/views/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
}
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer  configurer) {
	configurer.enable();
}
@Bean
public DataSource getDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	dataSource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=SpringGeneral;encrypt=false;trustServerCertificate=false");
	dataSource.setUsername("sa");
	dataSource.setPassword("123456789");
	return dataSource;
}

}
