/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fruct.oss.nn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class NeuralNetworkTest {
    
    /**
     * множество объектов для тестирования
     */
    private List<SmartObject> trainingSet;
    
   
    public NeuralNetworkTest() {
    }
    
    @Before
    public void setUp() {
        trainingSet = new ArrayList();
        Map<String, String> keys = new HashMap();
        keys.put("first", "bool");
        keys.put("second", "bool");
        keys.put("result", "bool");

        Map<String, Object> vals = new HashMap();
        vals.put("first", 0);
        vals.put("second", 0);
        vals.put("result", 0);
        
        trainingSet.add(new SmartObject(keys, vals));
        
        vals.put("first", 1);
        vals.put("second", 1);
        
        trainingSet.add(new SmartObject(keys, vals));
        
        vals.put("second", 0);
        vals.put("result", 1);
        
        trainingSet.add(new SmartObject(keys, vals));
        
        vals.put("first", 0);
        vals.put("second", 1);
        
        trainingSet.add(new SmartObject(keys, vals));
    }
    
    @After
    public void tearDown() {
        trainingSet.clear();
    }

    /**
     * Проверка обучения исключающего или
     */
    @Test
    public void testXOR() {
        System.out.println("train XOR");
        NeuralNetwork instance = null;
        
        instance = new NeuralNetwork(1, "result");
        
        boolean result = instance.retraining(trainingSet);
        assertEquals(true, result);
        
        NeuralResult res = instance.check(trainingSet.get(0));
        
        assertEquals(res.getValue(), "0");
        assertTrue(res.getProbability() > 0.8);
        
    }

}
