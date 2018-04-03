package in.ezeon.capp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = {"in.ezeon"})
@EnableWebMvc  
//enable mvc module 
//we can add @Import resource here 
//check what extending is doing here 
public class SpringWebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		// all static resource must be handled here like javascript, css etc
	}
	
    @Bean
	public ViewResolver viewResolver(){
		//view resolver is used to resolve the jsp files which are in private location so that 
		//no one can touch them. It is good for security
		System.out.println("view resolver@@@@@@@@@@@@@@@@");
    	InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/WEB-INF/view/");
		vr.setSuffix(".jsp");
		return vr;
	}

	
}
