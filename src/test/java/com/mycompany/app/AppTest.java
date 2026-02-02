package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testWelcomeMessage() {
        App app = new App();
        assertEquals(
            "Welcome to CloudWithVarJosh Demo!",
            app.getWelcomeMessage()
        );
    }

    @Test
    void testAdminUser() {
        App app = new App();
        assertTrue(app.isAdminUser("admin"));
    }

    @Test
    void testNonAdminUser() {
        App app = new App();
        assertFalse(app.isAdminUser("user"));
    }
}
