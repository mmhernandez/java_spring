package com.mmhernandez.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ReceiptController {

	@RequestMapping("/")
	public String receipt(Model model) {
		String name = "Grace Hopper";
		String item = "Copper wire";
		double price = 5.25;
		String description = "Metal strips. Also an illustration of nanoseconds";
		String vendor = "Little Things Corner Store";
		
		model.addAttribute("name", name);
		model.addAttribute("item", item);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);
		
		return "index.jsp";
	}
	
}

