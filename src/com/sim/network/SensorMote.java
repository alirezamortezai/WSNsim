package com.sim.network;

import com.sim.events.Event;
import com.sim.events.MissMatchEventException;

public class SensorMote extends Mote {

	int seq = 0;
	int id;
	Link nextToSink;
	Link nextToRelay;
	
	
	
	
	@Override
	protected void handleMoteEvent(Event e) throws MissMatchEventException {
		
		
		switch(e.getType()){
		case NODE_START_SEND:
			sendPacketToSink();
			break;
		case NODE_DONE_SEND:
			scheduleNextTransmission();
			break;
		default:
				throw new MissMatchEventException();
		}

	}

	private void scheduleNextTransmission() {
		// TODO Auto-generated method stub
		
	}

	private void sendPacketToSink() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof SensorMote))
			return false;
		
		if(((SensorMote)obj).id != id)
			return false;
		
		return true;
	}

}
