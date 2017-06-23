/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fruct.oss.nn;

import java.util.logging.Level;
import java.util.logging.Logger;
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
    }

    /**
     * Test of getValue method, of class SmartObject.
     */
    @Test
    public void testGetValue() throws PropertyNotFoudException {
        System.out.println("getValue");
        SmartObject instance = new SmartObject();

        instance.addProperty("s", "s");
        instance.addValue("s", "s");
        
        Object result = instance.getValue("s");
        assertTrue(result.equals("s"));
    }

    /**
     * Test of addValue method, of class SmartObject.
     */
    @Test
    public void testAddValue() throws Exception {
        System.out.println("addValue");
        SmartObject instance = new SmartObject();

        // нельзя добавлять значение без типа
        try {
            instance.addValue("s", "s");
        } catch (PropertyNotFoudException e) {
            assertTrue(e != null);
        }
        
        // добавляем значение с типом
        instance.addProperty("s", "s");
        instance.addValue("s", "d");
    }

    /**
     * Test of addProperty method, of class SmartObject.
     */
    @Test
    public void testAddProperty() {
        System.out.println("addProperty");
        String key = "single";
        String type = "single";
        SmartObject instance = new SmartObject();
        instance.addProperty(key, type);
        assertEquals(instance.getNumProperties(), 1);
    }
    
}
