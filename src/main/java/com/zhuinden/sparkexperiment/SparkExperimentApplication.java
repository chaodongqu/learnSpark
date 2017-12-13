package com.zhuinden.sparkexperiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SparkExperimentApplication {

	public static void main(String[] args) {
		System.setProperty("hadoop.home.dir","D:\\study\\stu\\hadoop");

				SpringApplication.run(SparkExperimentApplication.class, args);
	}
}
