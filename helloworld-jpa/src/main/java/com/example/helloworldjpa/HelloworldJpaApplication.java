package com.example.helloworldjpa;

import com.example.helloworldjpa.domain.Customer;
import com.example.helloworldjpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldJpaApplication implements CommandLineRunner {


	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void run(String... strings) throws Exception {
		// データ追加
		Customer created = customerRepository.save(new Customer(null, "渡辺", "曜"));
		System.out.println(created + " is created!");
		// データ表示
		customerRepository.findAll()
				.forEach(System.out::println);
	}

	

	public static void main(String[] args) {
		SpringApplication.run(HelloworldJpaApplication.class, args);
	}
}
