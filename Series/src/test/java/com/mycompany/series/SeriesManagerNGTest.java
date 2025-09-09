/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.series;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author RC_Student_lab
 */
public class SeriesManagerNGTest {
    
    public SeriesManagerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of addSeries method, of class SeriesManager.
     */
    @Test
    public void testAddSeries() {
        System.out.println("addSeries");
        String id = "";
        String name = "";
        String age = "";
        String episodes = "";
        SeriesManager instance = new SeriesManager();
        instance.addSeries(id, name, age, episodes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchSeries method, of class SeriesManager.
     */
    @Test
    public void testSearchSeries() {
        System.out.println("searchSeries");
        String id = "";
        SeriesManager instance = new SeriesManager();
        SeriesModel expResult = null;
        SeriesModel result = instance.searchSeries(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSeriesAge method, of class SeriesManager.
     */
    @Test
    public void testUpdateSeriesAge() {
        System.out.println("updateSeriesAge");
        String id = "";
        String newAge = "";
        SeriesManager instance = new SeriesManager();
        boolean expResult = false;
        boolean result = instance.updateSeriesAge(id, newAge);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSeries method, of class SeriesManager.
     */
    @Test
    public void testDeleteSeries() {
        System.out.println("deleteSeries");
        String id = "";
        SeriesManager instance = new SeriesManager();
        boolean expResult = false;
        boolean result = instance.deleteSeries(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport method, of class SeriesManager.
     */
    @Test
    public void testPrintReport() {
        System.out.println("printReport");
        SeriesManager instance = new SeriesManager();
        instance.printReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
