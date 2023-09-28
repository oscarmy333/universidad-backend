package com.springsimplespasos.universidad.universidadbackend.exception;

import com.springsimplespasos.universidad.universidadbackend.Exception.ExUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExUtilTest {
    @Test
    @DisplayName("Comprobar que la excepcion es del tipo runtime exception" +
            ".")
    void test_constructor() {

        ExUtil exception = new ExUtil("test");

        RuntimeException runtimeException = exception;

        Assertions.assertSame(runtimeException, exception);
    }
}
