package in.suryaumapathy.notificationapp.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {

        @Bean
        public OpenAPI customOpenAPI() {
                return new OpenAPI()
                                .components(new Components().addSecuritySchemes("basicScheme",
                                                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
                                .info(new Info().title("AUTH API").version("1.0.0")
                                                .description("Used to maintain a list of tasks to be done")
                                                .termsOfService("http://swagger.io/terms/")
                                                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
        }

}
