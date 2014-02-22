package com.sim.events;

import com.sim.network.NetworkEntity;

public class StartSendEvent extends Event{
	
	int packetLength;
	public StartSendEvent(long ts, NetworkEntity src, NetworkEntity trg, int pktLngt) {
		super(ts, src, trg);
		packetLength = pktLngt;
	}

}
