package com.rays.log4j;

import org.apache.log4j.Logger;

public class TestLog4j {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(TestLog4j.class);

		log.debug("This is debug...!");
		log.info("This is info...!");
		log.warn("This is warn...!");
		log.error("This is error...!");
		log.fatal("This is fatal...!");

		try {
			int i = 0;
			int c = 5 / i;
			System.out.println("Division = " + c);
		} catch (RuntimeException e) {
			log.error("Arithmatic Error", e);
		}
	}
}
