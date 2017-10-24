package org.exam.config;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
/**
 * Created by xin on 15/1/7.
 */
public class AnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
		FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encoding-filter", CharacterEncodingFilter.class);
		encodingFilter.setInitParameter("encoding", "UTF-8");
		encodingFilter.setInitParameter("forceEncoding", "true");
		encodingFilter.setAsyncSupported(true);
		encodingFilter.addMappingForUrlPatterns(null, true, "/*");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {AppConfig.class,HttpSessionConfig.class,WebMvcConfig.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {};
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
