package com.sim.network;

import com.sim.events.Event;
import com.sim.events.MissMatchEventException;

public abstract class Mote extends NetworkEntity{

	@Override
	void handleGenericEvent(Event e) throws MissMatchEventException  {
		if(e.getTarget() instanceof Mote)
				handleMoteEvent(e);
		
	}

	abstract protected void handleMoteEvent(Event e) throws MissMatchEventException ;
	
}
