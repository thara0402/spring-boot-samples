package com.example.helloworlddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//import com.example.AppConfig;
import com.example.app.Argument;
import com.example.app.ArgumentResolver;
import com.example.app.Calculator;
//import com.example.app.Frontend;

import java.util.Scanner;

@SpringBootApplication
//@EnableAutoConfiguration
//@Import(AppConfig.class)
//@ComponentScan
public class HelloworldDiApplication implements CommandLineRunner{
	@Autowired
    ArgumentResolver argumentResolver;
    @Autowired
    Calculator calculator;

	@Override
	public void run(String... strings) throws Exception {
		System.out.print("Enter 2 numbers like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("result = " + result);
	}
	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(HelloworldDiApplication.class, args);

		// Scanner scanner = new Scanner(System.in);
		// System.out.print("Enter 2 numbers like 'a b' : ");
		// int a = scanner.nextInt();
		// int b = scanner.nextInt();
		// Calculator calculator = context.getBean(Calculator.class);
		// int result = calculator.calc(a, b);

		// System.out.print("Enter 2 numbers like 'a b' : ");
		// ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
		// Argument argument = argumentResolver.resolve(System.in);
		// Calculator calculator = context.getBean(Calculator.class);
		// int result = calculator.calc(argument.getA(), argument.getB());
		// System.out.println("result = " + result);

		// Frontend frontend = context.getBean(Frontend.class);
		// frontend.run();

		SpringApplication.run(HelloworldDiApplication.class, args);
	}


}
