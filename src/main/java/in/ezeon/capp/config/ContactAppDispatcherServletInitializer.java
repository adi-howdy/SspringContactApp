package in.ezeon.capp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ContactAppDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {SpringRootConfig.class};
		//business layer
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//System.out.println("webconfig class@@@@@@@@@@@@@@");
		return new Class[]{ SpringWebConfig.class };
		//web layer
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("mappinggggg class@@@@@@@@@@@@@@");
		return new String[] {"/"};
		//means all the mapping would be done here and it says that it starts from root
	}
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		super.onStartup(servletContext); // must prsent wont work if not available
		//configure global task here if required
	}

}
