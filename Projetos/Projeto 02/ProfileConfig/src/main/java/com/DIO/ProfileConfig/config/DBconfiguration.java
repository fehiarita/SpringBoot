package com.DIO.ProfileConfig.config;
//arquivo para configurar os profiles relacionado aos arquivos .properties

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBconfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    //método para dev
    @Profile("dev")
    @Bean
    public String devDataDaseConnection(){
        System.out.printf("Conexão DEV DB-H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "teste de conexão do H2";
    }
    //método para produção
    @Profile("prod")
    @Bean
    public String prodDataDaseConnection(){
        System.out.printf("Conexão PROD DB-MYSQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "teste de conexão do MYSQL";
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
