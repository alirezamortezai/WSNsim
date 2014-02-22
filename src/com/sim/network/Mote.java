package com.sim.network;

import com.sim.events.Event;

public abstract class Mote extends NetworkEntity{

	@Override
	void handleGenericEvent(Event e) {
		if(e.getTarget() instanceof Mote)
				handleMoteEvent(e);
		
	}

	abstract protected void handleMoteEvent(Event e);
	
}
