package com.DIO.ProfileConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage ;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbVariavelAmbiente;

    //endpoint GET
    //exibe mensagem vindo do application.properties
    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/env")
    public String getDbVariavelAmbiente() {
        return "A seguinte variável foi passada: " + dbVariavelAmbiente;
    }
}
