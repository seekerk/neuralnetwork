/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fruct.oss;

import java.util.HashMap;
import java.util.Map;
import org.fruct.oss.nn.NeuralNetwork;

/**
 *
 * @author kulakov
 */
public class NetworkKp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. ========== создаем сеть для исключающего или
        NeuralNetwork nn = new NeuralNetwork(1, "first");
        
        // 2. ========== обучающая выборка
        // ключи
        Map<String, String> keys = new HashMap();
        keys.put("first", "bool");
        keys.put("second", "bool");
    }
    
}
