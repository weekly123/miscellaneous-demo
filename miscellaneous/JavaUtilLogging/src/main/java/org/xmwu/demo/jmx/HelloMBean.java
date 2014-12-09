package org.xmwu.demo.jmx;


/**
 * This is a Standard MBean, so we should follow the name convention.
 * This interface's name should with suffix "MBean".
 * @author xmwu
 */
public interface HelloMBean {  
    // operations  
  
    public void sayHello();  
    public int add(int x, int y);  
  
    // attributes  
  
    // a read-only attribute called Name of type String  
    public String getName();  
  
    // a read-write attribute called CacheSize of type int  
    public int getCacheSize();  
    public void setCacheSize(int size);  
}  
