package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@Autowired
	private CarService carService;
	@Autowired
	private Car car;

	@GetMapping(value = "/cars")
	public String showCars(@RequestParam(value = "count", required = false, defaultValue = "1000")
									   Integer num, ModelMap model) {

		if(num == null || num > 5 || num > car.getCars().size()) {
			num = car.getCars().size();
		}
		model.addAttribute("cars", carService.carsList(num));
		return "cars";
	}
	
}