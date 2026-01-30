package com.junit;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    public void setUp(){
        db = new DatabaseConnection();
        db.connect();                       // run before each test
    }

    @AfterEach
    public void tearDown(){
        db.disconnect();                    // run after each test
    }

    @Test
    public void testConnectionEstablished(){
        assertTrue(db.getStatus());
    }

    @Test
    public void testConnectionClosed(){
        db.disconnect();
        assertFalse(db.getStatus());
    }
}
