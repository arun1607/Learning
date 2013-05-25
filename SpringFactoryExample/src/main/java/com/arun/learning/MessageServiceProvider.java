package com.arun.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageServiceProvider implements ApplicationContextAware {

	private ApplicationContext appContext;

	public List<Myservice> getMyServiceList() {
		Map<String, Myservice> myMap = appContext
				.getBeansOfType(Myservice.class);
		return Collections.unmodifiableList(new ArrayList<>(myMap.values()));
	}

	@Override
	public void setApplicationContext(final ApplicationContext appContext)
			throws BeansException {
		this.appContext = appContext;
	}

}
