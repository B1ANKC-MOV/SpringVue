package company.name.projectname.config;

import company.name.projectname.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [P4·拦截器注册·演示代码]
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
//  拦截器注册
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/**");
    }
}