package com.darthill.observabilidad;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@QuarkusMain
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        LOGGER.info("Iniciando el microservicio de observabilidad...");
        LOGGER.debug("Este es un mensaje de depuración.");
        LOGGER.warn("Este es un mensaje de advertencia.");
        LOGGER.error("Este es un mensaje de error.");

        // Inicia la aplicación Quarkus
        Quarkus.run(args);

        LOGGER.info("Microservicio de observabilidad finalizado.");
    }
}