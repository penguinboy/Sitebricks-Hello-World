package com.mycompany.app;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.sitebricks.SitebricksModule;
import com.mycompany.app.web.Home;

public class MyAppModule extends SitebricksModule {
	@Override
	protected void configureSitebricks() {
		// grab all the controllers from the web package
		scan(Home.class.getPackage());
	}
}
