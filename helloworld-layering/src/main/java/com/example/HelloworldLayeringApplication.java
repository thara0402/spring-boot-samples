package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.domain.Customer;
import com.example.service.CustomerService;

@SpringBootApplication
public class HelloworldLayeringApplication implements CommandLineRunner{

	@Autowired
	CustomerService customerService;

	@Override
	public void run(String... strings) throws Exception {

		customerService.save(new Customer(1, "高海", "千歌"));
		customerService.save(new Customer(2, "桜内", "梨子"));
		customerService.save(new Customer(3, "松浦", "果南"));
		customerService.save(new Customer(4, "黒澤", "ダイヤ"));
		customerService.save(new Customer(5, "渡辺", "曜"));
		customerService.save(new Customer(6, "津島", "善子"));
		customerService.save(new Customer(7, "国木田", "花丸"));
		customerService.save(new Customer(8, "小原", "鞠莉"));
		customerService.save(new Customer(9, "黒澤", "ルビィ"));
		
		customerService.findAll()
			.forEach(System.out::println);

	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldLayeringApplication.class, args);
	}
}
