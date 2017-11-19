package com.example.helloworldjdbc;

import com.example.helloworldjdbc.domain.Customer;
import com.example.helloworldjdbc.repository.CustomerRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

@SpringBootApplication
public class HelloworldJdbcApplication implements CommandLineRunner{

	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	CustomerRepository customerRepository;


	@Override
	public void run(String... args) throws Exception {
		// String sql = "SELECT id, first_name, last_name FROM customers WHERE id = :id";
		// SqlParameterSource param = new MapSqlParameterSource()
		// 		.addValue("id", 5);

		// Customer result = jdbcTemplate.queryForObject(sql, param,
		// (rs, rowNum) -> new Customer(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"))
		// );
		
		// System.out.println("result = " + result);

		// データ追加
		Customer created = customerRepository.save(new Customer(null, "渡辺", "曜"));
		System.out.println(created + " is created!");
		// データ表示
		customerRepository.findAll()
				.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloworldJdbcApplication.class, args);
	}
}
