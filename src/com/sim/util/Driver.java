package com.sim.util;

import java.util.Random;

import com.sim.events.Event;


public class Driver {
	
	static Random prg = null;
	static Driver drv = null;
	public static double getRandomGsn(double mean, double std){
		return mean + std * prg.nextGaussian();
	}
	
	private Driver(){}
	
	
	Driver getDriver(){
		if(drv == null) {
			drv = new Driver();
	      }
	      return drv;
	}
	
	public static double getRandomGsn(){
		return  prg.nextGaussian();
	}
	
	public static double getRandomNrm(double min, double max){
		if(min > max)
			throw new IllegalArgumentException("min must be smaller than max in value");
		return  min + prg.nextDouble() * Math.abs(max - min);
	}
	
	public static double getRandomNrm(){
		return  prg.nextDouble();
	}
	
	public void addNewEvent(Event e){
		//TODO: must complete
	}
	
	public static void main(String args[]){
		prg = new Random(Config.SEED);
	}
	
}
