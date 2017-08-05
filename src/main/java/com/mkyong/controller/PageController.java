package com.mkyong.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

@ManagedBean
@SessionScoped
public class PageController implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(PageController.class);

	public String process() {

		// logs debug
		if (logger.isDebugEnabled()) {
			logger.debug("PageController.process()");
		}

		// logs exception
		logger.info("ok");
		System.err.println("okokook");

		return "success";
	}

}