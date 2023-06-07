package org.br.mineradora;

import io.quarkus.test.junit.QuarkusTest;

import org.eclipse.microprofile.reactive.messaging.Message;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

@QuarkusTest
class MyReactiveMessagingApplicationTest {

    @Inject
    MyReactiveMessagingApplication application;

    @Test
    void test() {
        assertEquals("HELLO", application.toUpperCase(Message.of("Hello")).getPayload());
        assertEquals("BONJOUR", application.toUpperCase(Message.of("bonjour")).getPayload());
    }
}
