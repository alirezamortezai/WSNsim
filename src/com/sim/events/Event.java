package com.sim.events;

import java.util.ArrayList;

import com.sim.network.NetworkEntity;
import com.sim.util.Timer;

public class Event implements Comparable{
	
	public enum EventType{
		NULL,
		LINK_TRANSMIT,
		NODE_RECEIVE,
		NODE_START_SEND,
		NODE_DONE_SEND,
		NODE_START_MOVE,
		NODE_DONE_MOVE;
	}
	
	long timeStamp;
	EventType type;
	NetworkEntity source, target;
	ArrayList<Object> extraPars;
	
	public Event(EventType t, long timeUntil, NetworkEntity src, NetworkEntity trg, ArrayList<Object> ext){
		type = t;
		timeStamp = Timer.getTime() + timeUntil;
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
	
	public long getTimeStamp(){
		return timeStamp;
	}

	public NetworkEntity getTarget() {
		// TODO Auto-generated method stub
		return target;
	}

}
