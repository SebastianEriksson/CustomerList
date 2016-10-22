package fi.haagahelia.course.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value = "/customers")
	public String customerlist(Model model) {
		List<Map<String, Object>> customers = jdbcTemplate.queryForList("select * from customer");
		model.addAttribute("customers", customers);
		return "customers";
		
	}

}
