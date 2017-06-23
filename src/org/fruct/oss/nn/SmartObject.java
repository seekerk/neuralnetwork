/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fruct.oss.nn;

import java.util.HashMap;
import java.util.Map;

/**
 * Хранение данных об онтологическом объекте
 * @author kulakov
 */
class SmartObject {
    
    // типы объектов (заполняется на основе онтологии)
    private Map<String, String> propertyTypes;
    
    // значения объектов (заполняется на основе запроса в ИП)
    private Map<String, Object> propertyValues;
    
    public SmartObject() {
        propertyTypes = new HashMap();
        propertyValues = new HashMap();
    }
    
    public SmartObject(Map<String, String> types) {
        propertyTypes = new HashMap();
        propertyValues = new HashMap();
        
        propertyTypes.putAll(types);
    }
    
    public SmartObject(Map<String, String> types, Map<String, Object> values) {
        propertyTypes = new HashMap();
        propertyValues = new HashMap();
        
        propertyTypes.putAll(types);
        propertyValues.putAll(values);
    }
    
    public int getNumProperties() {
        return propertyTypes.size();
    }
    
    public Object getValue(String key) {
        return propertyValues.get(key);
    }
    
    public void addValue(String key, String value) throws PropertyNotFoudException {
        if (!propertyTypes.containsKey(key))
            throw new PropertyNotFoudException(key);
        propertyValues.put(key, value);
    }
    
    public void addProperty(String key, String type) {
        propertyTypes.put(key, type);
    }
}
