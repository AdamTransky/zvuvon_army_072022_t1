package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZvuvonController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/calculate")
	public ZvuvonCalculatorResults greeting(@RequestParam(value = "velocity") Double velocity,
											@RequestParam(value = "height") Double height,
											@RequestParam(value = "angle") Double angle) {
		ZvuvonCalculator zc = new ZvuvonCalculator(velocity, height, angle);
		return zc.calculateDistance();
	}
}