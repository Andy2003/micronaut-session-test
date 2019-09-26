package com.github.andy2003.micronaut.session;

import javax.inject.Singleton;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.session.event.SessionExpiredEvent;

@Singleton
public class SessionListener implements ApplicationEventListener<SessionExpiredEvent> {
	@Override
	public void onApplicationEvent(SessionExpiredEvent event) {
		System.out.println("session expired");
	}
}
