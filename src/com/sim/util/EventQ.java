package com.sim.util;

import java.util.ArrayList;

import com.sim.events.Event;


public class EventQ {
	private ArrayList<Event> Q;
	
	private static EventQ singleQ = null;
	
	private EventQ(){
		Q = new ArrayList<Event>();
	}
	
	public static EventQ getEventQ(){
		if(singleQ == null)
			singleQ = new EventQ();
		
		return singleQ;
	}
	
	public void enqueue(Event e){
		
		if(e == null)
			return;
		
		for(int index = 0; index < Q.size(); index++){
			if(e.compareTo(Q.get(index)) < 0){
				Q.add(index, e);
				break;
			}
		}
		
	}
	
	public Event peak(){
		if(Q.isEmpty())
			return null;
		else
			return Q.get(0);
	}
	
	public Event dequeue(){
		if(Q.isEmpty())
			return null;
		else{
			Event e = Q.remove(0);
			Timer.setTime(e.getTimeStamp());
			return e;
		}
	}
}
