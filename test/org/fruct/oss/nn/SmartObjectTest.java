/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fruct.oss.nn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kulakov
 */
public class SmartObjectTest {
    
    public SmartObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumProperties method, of class SmartObject.
     */
    @Test
    public void testGetNumProperties() {
        System.out.println("getNumProperties");
        SmartObject instance = new SmartObject();
        int expResult = 0;
        int result = instance.getNumProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class SmartObject.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        String key = "";
        SmartObject instance = new SmartObject();
        String expResult = "";
        Object result = instance.getValue(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addValue method, of class SmartObject.
     */
    @Test
    public void testAddValue() throws Exception {
        System.out.println("addValue");
        String key = "";
        String value = "";
        SmartObject instance = new SmartObject();
        instance.addValue(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProperty method, of class SmartObject.
     */
    @Test
    public void testAddProperty() {
        System.out.println("addProperty");
        String key = "";
        String type = "";
        SmartObject instance = new SmartObject();
        instance.addProperty(key, type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
