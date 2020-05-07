package io.radomir.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphController {

	@GetMapping("/displayBarGraph")
	public String barGraph(Model model) {
		Map<String, Integer> surveyMap = new LinkedHashMap<>();
		surveyMap.put("Java", 45);
		surveyMap.put("Kotlin", 23);
		surveyMap.put(".NET", 55);
		surveyMap.put("Python", 66);
		surveyMap.put("PHP", 42);
		model.addAttribute("surveyMapKeys", surveyMap.keySet());
		model.addAttribute("surveyMapValues", surveyMap.values());
		
		
		return"barGraph";
	}
	
	@GetMapping("/displayPieChart")
	public String pieChart(Model model) {
		model.addAttribute("pass", 70);
		model.addAttribute("fail", 30);
		return "pieChart";
	}
}
