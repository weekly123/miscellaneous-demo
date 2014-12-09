/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xmwu.demo.jmx;

/**
 * This class's name should be the prefix of the MBean interfase .
 * For example ,this class's name is "Hello" which is the prefix of "HelloMBean".
 * @author xmwu
 */
public class Hello implements HelloMBean {  
    public void sayHello() {  
    System.out.println("hello, world");  
    }  
  
    public int add(int x, int y) {  
    return x + y;  
    }  
  
    public String getName() {  
    return this.name;  
    }  
  
     public int getCacheSize() {  
    return this.cacheSize;  
    }  
  
    public synchronized void setCacheSize(int size) {  
    this.cacheSize = size;  
  
    System.out.println("Cache size now " + this.cacheSize);  
    }  
  
    private final String name = "Reginald";  
    private int cacheSize = DEFAULT_CACHE_SIZE;  
    private static final int DEFAULT_CACHE_SIZE = 200;  
}  

