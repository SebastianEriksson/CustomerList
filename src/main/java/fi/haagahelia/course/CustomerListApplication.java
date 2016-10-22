package fi.haagahelia.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CustomerListApplication {
	private static final Logger log = LoggerFactory.getLogger(CustomerListApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerListApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
		return (args) -> {
			jdbcTemplate.update("insert into customer(firstName, lastName, email, address, postcode,"
					+ " phone) values (?, ?, ?, ?, ?, ?)", "Terttu", "Mainio",
					"terttu.mainio@mail.com", "Tertunkuja 12", "02243", "0409372898");
			jdbcTemplate.update("insert into customer(firstName, lastName, email, address, postcode,"
					+ " phone) values (?, ?, ?, ?, ?, ?)", "Kai", "Nyholm",
					"kai.nyholm@huuhuu.com", "Tulikatu 64", "05463", "0402824318");
			jdbcTemplate.update("insert into customer(firstName, lastName, email, address, postcode,"
					+ " phone) values (?, ?, ?, ?, ?, ?)", "Tuomo", "Tilli",
					"tilli.silli@kukko.fi", "Sanoma-aseman tie 2", "01220", "0507802437");
		};
	}
}
