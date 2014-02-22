package com.sim.events;

import com.sim.network.NetworkEntity;

public class Event implements Comparable{
	
	long timeStamp;
	NetworkEntity source, target;
	
	public Event(long ts, NetworkEntity src, NetworkEntity trg){
		timeStamp = ts;
		source = src;
		target = trg;
	}
	
	@Override
	public int compareTo(Object arg) {
		
		if(arg == null)
			throw new NullPointerException();
		
		if(!(arg  instanceof Event))
			throw new ClassCastException();
		
		Event e = (Event)arg;
		
		if(this.timeStamp < e.timeStamp)
			return -1;
		else if(this.timeStamp == e.timeStamp)
			return 0;
		else
			return 1;
	}

}
