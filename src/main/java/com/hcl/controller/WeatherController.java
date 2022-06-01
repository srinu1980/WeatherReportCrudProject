package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.domain.WeatherReport;
import com.hcl.repository.WeatherRepositor;

//Fill your code here
@RestController
public class WeatherController {

	//Fill your code here
	@Autowired
	private WeatherRepositor weatherRepositor;
	
	
	//Fill your code here
	@GetMapping("/weatherReport")
	public List<WeatherReport> getData() 
	{
		//Fill your code here
		return weatherRepositor.findAll();
	}
	
	@PostMapping("/weatherReport")
	public WeatherReport addWeatherReport(@RequestBody WeatherReport weatherReport) 
	{
		//Fill your code here
		return weatherRepositor.save(weatherReport);
	}
/*	
	Fill your code here
	public WeatherReport updateWeatherReport(Fill your code here) {
		Fill your code here
	}
	
	Fill your code here
	public WeatherReport view(Fill your code here) {
		Fill your code here
	}
	
	Fill your code here
	public Boolean deleteUsers(/*Fill your code here) {
		Fill your code here
	}
	
	*/
}
