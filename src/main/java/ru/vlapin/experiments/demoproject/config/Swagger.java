package ru.vlapin.experiments.demoproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc //Enables Springfox swagger 2
@Import({SpringDataRestConfiguration.class, BeanValidatorPluginsConfiguration.class})
public class Swagger {
  /**
   * Swagger2 Docket bean.
   */
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2) //Docket, Springfox’s, primary api configuration mechanism is initialized for swagger specification 2.0
               .select() // returns an instance of ApiSelectorBuilder to give fine grained control over the endpoints exposed via swagger
               .apis(RequestHandlerSelectors.any()) //allows selection of RequestHandler's using a predicate. The example here uses an any predicate (default). Out of the box predicates provided are any, none, withClassAnnotation, withMethodAnnotation and basePackage.
               .paths(PathSelectors.any()) // allows selection of Path's using a predicate. The example here uses an any predicate (default). Out of the box we provide predicates for regex, ant, any, none.
               .build();
  }
}
