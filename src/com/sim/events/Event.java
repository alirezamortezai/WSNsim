package com.sim.events;

import java.util.ArrayList;

import com.sim.network.NetworkEntity;

public class Event implements Comparable{
	
	public enum EventType{
		START_SEND,
		SEND_DONE;
	}
	
	long timeStamp;
	EventType type;
	NetworkEntity source, target;
	ArrayList<Object> extraPars;
	
	public Event(EventType t, long ts, NetworkEntity src, NetworkEntity trg, ArrayList<Object> ext){
		type = t;
		timeStamp = ts;
		source = src;
		target = trg;
		extraPars = new ArrayList<Object>();
		
		if(ext != null){
			for(Object o : ext){
				extraPars.add(o);
			}
		}
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
