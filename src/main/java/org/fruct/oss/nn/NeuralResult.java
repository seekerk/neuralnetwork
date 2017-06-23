/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fruct.oss.nn;

/**
 * Структура хранения данных результата работы нейронной сети
 * @author kulakov
 */
class NeuralResult {
    
    /**
     * найденный объъект
     */
    private Object value = null;
    
    /**
     * вероятность правильности найденного объекта
     */
    private double probability = 0.0;
    
    /**
     * успешность поиска
     */
    private boolean success = false;

    /**
     * создание результата успешного поиска
     * @param val найденный объект
     * @param prob вероятность правильности
     */
    public NeuralResult(Object val, double prob) {
        value = val;
        probability = prob;
        success = true;
    }

    /**
     * Создание результата неуспешного поиска
     */
    public NeuralResult() {
    }
    
    /**
     * Получение найденного объекта
     * @return найденнй объект или null если результат неуспешен
     */
    public Object getValue() {
        return value;
    }
    
    /**
     * Получение вероятности найденного объекта
     * @return вероятность [0-1]
     */
    public double getProbability() {
        return probability;
    }
    
    /**
     * успешность результата
     * @return true если успешно, иначе false
     */
    public boolean isSuccess() {
        return success;
    }
    
}
