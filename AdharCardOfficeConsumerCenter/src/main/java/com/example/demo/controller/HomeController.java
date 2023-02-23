package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.adhar.Adhar;

@RestController
@RequestMapping("/api")
public class HomeController {
	@Autowired
	RestTemplate rTemp;

	@RequestMapping("/getAdharData")
	public List<Adhar> getAllAdhar() {
		// String url = "http://localhost:1711/api/producerAdhar";
		
		String url = "http://zuul/aproducer/api/producerAdhar";

		List<Adhar> adharList = rTemp.getForObject(url, List.class);
		return adharList;

	}

}
