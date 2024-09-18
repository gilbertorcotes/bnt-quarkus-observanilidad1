package com.darthill.arquetipo;

import com.darthill.observabilidad.Main;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MainTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainTest.class);

    @Test
    public void testMainExecution() {
        LOGGER.info("Iniciando test del método main");
        assertDoesNotThrow(() -> Main.main());
        LOGGER.info("Test del método main completado exitosamente");
    }
}