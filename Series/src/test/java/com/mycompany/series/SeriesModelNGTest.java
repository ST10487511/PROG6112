/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.series;

import static org.testng.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class SeriesModelNGTest {
    
    public SeriesModelNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getSeriesId method, of class SeriesModel.
     */
    @org.testng.annotations.Test
    public void testGetSeriesId() {
        System.out.println("getSeriesId");
        SeriesModel instance = null;
        String expResult = "";
        String result = instance.getSeriesId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeriesName method, of class SeriesModel.
     */
    @org.testng.annotations.Test
    public void testGetSeriesName() {
        System.out.println("getSeriesName");
        SeriesModel instance = null;
        String expResult = "";
        String result = instance.getSeriesName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeriesAge method, of class SeriesModel.
     */
    @org.testng.annotations.Test
    public void testGetSeriesAge() {
        System.out.println("getSeriesAge");
        SeriesModel instance = null;
        String expResult = "";
        String result = instance.getSeriesAge();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeriesNumberOfEpisodes method, of class SeriesModel.
     */
    @org.testng.annotations.Test
    public void testGetSeriesNumberOfEpisodes() {
        System.out.println("getSeriesNumberOfEpisodes");
        SeriesModel instance = null;
        String expResult = "";
        String result = instance.getSeriesNumberOfEpisodes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeriesAge method, of class SeriesModel.
     */
    @org.testng.annotations.Test
    public void testSetSeriesAge() {
        System.out.println("setSeriesAge");
        String seriesAge = "";
        SeriesModel instance = null;
        instance.setSeriesAge(seriesAge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SeriesModel.
     */
    @org.testng.annotations.Test
    public void testToString() {
        System.out.println("toString");
        SeriesModel instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
