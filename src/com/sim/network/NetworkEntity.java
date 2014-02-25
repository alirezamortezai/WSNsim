package com.sim.network;

import com.sim.events.Event;
import com.sim.events.MissMatchEventException;
import com.sim.util.Driver;

public abstract class NetworkEntity {
	
	Driver driver;
	
	abstract void handleGenericEvent(Event e)throws MissMatchEventException ;
	public final void setMainDriver(Driver d){
		driver = d;
	}
	public final void trigger(Event e){
		driver.addNewEvent(e);
	}
}
