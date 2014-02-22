package com.sim.util;

public class Timer {	
	static long curTime = 0;
	
	private Timer(){}
	
	static public long getTime(){
		return curTime;
	}
	
	static void setTime(long time){
		curTime = time;
	}
}
