package com.github.andy2003.micronaut.session;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import io.micronaut.runtime.http.scope.RequestScope;

@RequestScope
public class RequestBean {

	public void foo() {
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct request");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy request");
	}
}
