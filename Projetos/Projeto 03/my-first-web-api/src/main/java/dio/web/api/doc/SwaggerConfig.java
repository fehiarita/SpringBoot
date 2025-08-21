package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Minha Primeira API Web com Swagger")
                        .description("Api exemplo de uso de Springboot RestFull")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new License()
                                .name("Licença de teste")
                                .url("http://www.meusite.com.br"))
                        .contact(new Contact()
                                .name("Fernanda")
                                .url("nandahiarita.15@gmail.com")
                                .email("vcs@site.com.br")));
    }


}
