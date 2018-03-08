package com.training.patterns.behavioral.mediator;

import com.training.patterns.behavioral.observer.Event;

public class EventHolder {
	private Event event;
	private EEventType eType;
	private String destination;

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(final Event event) {
		this.event = event;
	}

	public EEventType geteType() {
		return this.eType;
	}

	public void seteType(final EEventType eType) {
		this.eType = eType;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(final String destination) {
		this.destination = destination;
	}

}
