package com.mmhernandez.displaydate;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM d, yyyy");
		Date date = new Date();
		
		model.addAttribute("date", dateFormat.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time") 
	public String time(Model model) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("h:m a");
		Date date = new Date();
		
		model.addAttribute("time", timeFormat.format(date));
		return "time.jsp";
	}
}
