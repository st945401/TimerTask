
//TestTimer.java
 

package com.timer;
 

import java.util.Timer;
 

public class TestTimer{
 

public static void main(String[] args){
 

MyTask myTask = new MyTask();
 

Timer timer = new Timer();
 

	timer.schedule(myTask, 1000, 1000);
 

	System.out.println("main end");
	}
 

}