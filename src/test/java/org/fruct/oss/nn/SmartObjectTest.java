/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fruct.oss.nn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author kulakov
 */
public class SmartObjectTest {
    
    @Rule
    public final ExpectedException thrown = ExpectedException.none();
    
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
     * @throws org.fruct.oss.nn.PropertyNotFoundException
     */
    @Test
    public void testGetValue() throws PropertyNotFoundException {
        System.out.println("getValue");
        SmartObject instance = new SmartObject();

        instance.addProperty("s", "s");
        instance.addValue("s", "s");
        
        Object result = instance.getValue("s");
        assertTrue(result.equals("s"));
    }

    /**
     * Test of addValue method, of class SmartObject.
     * @throws java.lang.Exception
     */
    @Test
    public void testAddValue() throws Exception {
        System.out.println("addValue");
        SmartObject instance = new SmartObject();

        
        // добавляем значение с типом
        instance.addProperty("s", "s");
        instance.addValue("s", "d");
    }
    
    /**
     * нельзя добавлять значение без типа
     *
     * @throws org.fruct.oss.nn.PropertyNotFoundException */
    @Test
    public void testAddValueException() throws PropertyNotFoundException {
        System.out.println("addValueException");
        SmartObject instance = new SmartObject();
        
        thrown.expect(PropertyNotFoundException.class);
        instance.addValue("s", "s");
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
