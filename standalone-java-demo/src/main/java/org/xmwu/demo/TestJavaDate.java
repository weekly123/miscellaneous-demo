/**
 * Copyright (c) 2016,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:standalone-java-demo
 * Package Name:org.xmwu.demo
 * File Name:TestJavaDate.java
 * Date:2016年7月25日 下午2:30:05
 * 
 */
package org.xmwu.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

 /**
 * ClassName: TestJavaDate <br/>
 * Description: TODO <br/>
 * Date: 2016年7月25日 下午2:30:05 <br/>
 * <br/>
 * 
 * @author xmwu(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class TestJavaDate {
    public static void main(String[] args){
        Date date = new Date();
        
        SimpleDateFormat bartDateFormat = new SimpleDateFormat("EEEE-MM-dd-yyyy");
        System.out.println(bartDateFormat.format(date));

        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        System.out.println(shortDateFormat.format(date));

        DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        System.out.println(mediumDateFormat.format(date));

        DateFormat longDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        System.out.println(longDateFormat.format(date));

        DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        System.out.println(fullDateFormat.format(date));
    }

}
