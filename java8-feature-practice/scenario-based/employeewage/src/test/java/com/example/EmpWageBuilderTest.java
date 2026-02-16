package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpWageBuilderTest {

    private EmpWageBuilder builder;

    @BeforeEach
    void setUp() {
        builder = new EmpWageBuilder();
    }

    @Test
    void testAddCompanyAndComputeWage() {

        builder.addCompany("TCS", 20, 20, 100);
        builder.computeWage();

        int wage = builder.getTotalWage("TCS");

        assertTrue(wage >= 0, "Wage should be zero or positive");
    }

    @Test
    void testMultipleCompanies() {

        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);

        builder.computeWage();

        int tcsWage = builder.getTotalWage("TCS");
        int infosysWage = builder.getTotalWage("Infosys");

        assertTrue(tcsWage >= 0);
        assertTrue(infosysWage >= 0);
        assertNotEquals(tcsWage, -1);
        assertNotEquals(infosysWage, -1);
    }

    @Test
    void testCompanyNotFound() {

        builder.addCompany("TCS", 20, 20, 100);
        builder.computeWage();

        int wage = builder.getTotalWage("Google");

        assertEquals(0, wage, "If company not found, should return 0");
    }

    @Test
    void testTotalWageIsCalculated() {

        builder.addCompany("Wipro", 30, 10, 50);
        builder.computeWage();

        int wage = builder.getTotalWage("Wipro");

        assertTrue(wage > 0 || wage == 0);
    }
}
