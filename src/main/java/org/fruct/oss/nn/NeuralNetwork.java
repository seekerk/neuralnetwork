/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fruct.oss.nn;

import java.util.List;

/**
 * класс обработки нейронной сети. Сеть строится для поиска значения property объекта SmartObject.
 * @author kulakov
 */
public class NeuralNetwork {
    
    /**
     * количество сенсоров/рецепторов
     */
    private int numS;
    
    /**
     * количество внутренних слоев
     */
    private final int numLayers;
    
    /**
     * размеры внутренних узлов
     */
    private final int []numA;
    
    /**
     * количество выходов
     */
    private int numR;
    
    /**
     * возможность сети обрабатывать запросы
     */
    private boolean isActive = false;
    
    private final String property;
    
    /**
     * конструктор сети
     * @param l - кол-во внутренних слоев
     * @param property - искомое свойство для объекта SmartObject
     */
    
    public NeuralNetwork(int l, String property) {
        
        // создаем нейронную сеть
        numLayers = l;
        numA = new int[l];

        this.property = property;
    }
    
    
    /**
     * Функция переобучения нейроной сети
     * @param items обучающая выборка
     * @return истина, если обучение прошло успешно, иначе ложь
     */    
    public boolean retraining(List<SmartObject> items) {
        
        //TODO: сделать обучение сети
        return false;
    }
    
    /**
     * Дообучение сети
     * @param item новый тест
     * @return true если обучение прошло успешно, иначе false
     */
    public boolean train(SmartObject item) {
        
        //TODO: 
        
        //TODO: сделать добавление теста в выборку и обучение сети
        return false;
    }
    
    /**
     * функция анализа объеткта
     * @param item
     * @return 
     */
    public NeuralResult check(SmartObject item) {
        return new NeuralResult();
    }
}
