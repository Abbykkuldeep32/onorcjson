package com.example.onorcjson.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.onorcjson.model.Dealer;
import com.example.onorcjson.service.DealerService;

@RestController
public class DealerController {
	
	private DealerService dealerService;
	
	@Autowired
	public DealerController(DealerService dealerService) {
		this.dealerService = dealerService; 
	}

    @GetMapping("/api/dealers")
    public Dealer getDealer() throws IOException {
        // Fetch data from JSON file using the service
        return dealerService.readDealerFromClasspath();
    }

	
}
