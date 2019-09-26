package com.github.andy2003.micronaut.session;

import javax.inject.Inject;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.session.Session;

@Produces(value = MediaType.TEXT_HTML)
@Controller
public class DemoController {

	@Inject
	private RequestBean requestBean;

	@Get
	String getAsset(Session session) {
		requestBean.foo();
		session.put("foo", "bar");
		return "foo";
	}
}
