package com.mycompany.app;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class SitebricksConfig extends GuiceServletContextListener{
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new AbstractModule() {
	      @Override
	      protected void configure() {
	        install(new MyAppModule());
	      }
	    });
	}
}
