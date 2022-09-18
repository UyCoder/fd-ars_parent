package dev.ahmed.yygh.common.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 configuration class
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket webApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                //只显示api路径下的页面
                .paths(Predicates.and(PathSelectors.regex("/api/.*")))
                .build();

    }

    @Bean
    public Docket adminApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("adminApi")
                .apiInfo(adminApiInfo())
                .select()
                //只显示admin路径下的页面
                .paths(Predicates.and(PathSelectors.regex("/admin/.*")))
                .build();

    }

    private ApiInfo webApiInfo() {

        return new ApiInfoBuilder()
                .title("ForumDent-API_Doc")
                .description("This is a simple API for ForumDent_AppointmentAndRegisteration")
                .version("1.0")
                .contact(new Contact("Forum_Dent", "http://ForumDent.com", "ahmedBughra@gmail.com"))
                .build();
    }

    private ApiInfo adminApiInfo() {

        return new ApiInfoBuilder()
                .title("Dashboard-API_Doc")
                .description("This is a simple API for Dashboard")
                .version("1.0")
                .contact(new Contact("Forum_Dent", "http://ForumDent.com", "ahmedBughra@gmail.com"))
                .build();
    }


}
