package org.xmwu.demo.jmx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xmwu
 */
import java.lang.management.*;  
import java.rmi.registry.LocateRegistry;
import javax.management.*;  
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
  
public class Main {  
    public static final int JMX_PORT = 8899;
    public static void main(String[] args) throws Exception {  
    // Get the Platform MBean Server  
    MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();  
  
    // Construct the ObjectName for the MBean we will register  
    ObjectName name = new ObjectName("org.xmwu.demo.jmx.mbeans:type=Hello");  
  
    // Create the Hello World MBean  
    Hello mbean = new Hello();  
  
    // Register the Hello World MBean  
    mbs.registerMBean(mbean, name);  
    
    //this step will registe the JMX port.
    LocateRegistry.createRegistry(JMX_PORT);
    
    
    JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://0.0.0.0:"+JMX_PORT+"/server");
    JMXConnectorServer cs = JMXConnectorServerFactory.newJMXConnectorServer(url, null, mbs);
    cs.start();
    
    // Wait forever  
    System.out.println("Waiting forever...");  
    Thread.sleep(Long.MAX_VALUE);  
    }  
}  