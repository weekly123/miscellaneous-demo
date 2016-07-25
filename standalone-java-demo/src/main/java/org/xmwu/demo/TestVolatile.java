package org.xmwu.demo;


/**
 * This class is a java volatile key word test.
 * If the attribute keepRunning is not volatile, this class will run  indefinitely on a server jvm ( specity -server vm parameter).
 * @author wxm
 *
 */
class TestVolatile extends Thread {

	//volatile
    boolean keepRunning = true;

    public void run() {
        while (keepRunning) {
        	//System.out.println(1);
        }

        System.out.println("Thread terminated.");
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile t = new TestVolatile();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}
