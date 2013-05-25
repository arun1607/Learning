package com.arun.learning;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(final String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "app.xml" });
		MessageServiceProvider messageServiceProvider = ctx.getBean(
				"messageServiceProvider", MessageServiceProvider.class);
		List<Myservice> list = messageServiceProvider.getMyServiceList();
		for (Myservice myservice : list) {
			System.out.println(myservice.doIt());
		}

	}
}
