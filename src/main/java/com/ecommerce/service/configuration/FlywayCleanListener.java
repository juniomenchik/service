package com.ecommerce.service.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

@Configuration
public class FlywayCleanListener {

    private final Flyway flyway;

    @Value("${spring.flyway.clean-disabled:false}")
    private boolean cleanDisabled;

    public FlywayCleanListener(Flyway flyway) {
        this.flyway = flyway;
    }

    @PostConstruct
    public void cleanAndMigrate() {
        if (!cleanDisabled) {
            // Apaga o banco de dados
            flyway.clean();
        }
        // Reaplica as migrações
        flyway.migrate();
    }
}