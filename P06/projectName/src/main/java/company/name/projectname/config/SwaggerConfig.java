package company.name.projectname.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [P5·Swagger·配置代码]
 */
//  告诉Spring容器，这个类是一个配置类
@Configuration
//  启用Swagger2功能
@EnableSwagger2
//  启动项目访问http://127.0.0.1:8080/swagger-ui.html即可

public class SwaggerConfig {
    /**
     * 配置Swagger2相关的bean
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //  com包下所有API都交给Swagger2管理
                .apis(RequestHandlerSelectors.basePackage("com"))
                .paths(PathSelectors.any()).build();
    }

    /**
     * API文档页面显示信息
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //  标题
                .title("演示项目API")
                //  描述
                .description("演示项目")
                //  版本
                .version("1.0")
                .build();
    }
}
