package com.concretepage;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.bridge.SLF4JBridgeHandler;

public class MyListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg) {
		System.out.println("contextInitialized....");
		
		SLF4JBridgeHandler.removeHandlersForRootLogger();
		SLF4JBridgeHandler.install();
	}

	public void contextDestroyed(ServletContextEvent arg) {
		System.out.println("contextDestroyed....");

	}

}