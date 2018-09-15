package com.retail.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.services.DiscountService;
import com.retail.view.models.DiscountRequest;

@RestController
public class DiscountsController {

	@Autowired
	DiscountService discountService;

	@PostMapping("/discount-bill")
	public ResponseEntity<?> getDiscoutnBill(@RequestBody DiscountRequest discountRequest, BindingResult errors) {

		if (errors.hasErrors()) {
			return ResponseEntity.badRequest().body(errors.getAllErrors());
		}

		return ResponseEntity.accepted().body(discountService.getDiscount(discountRequest));
	}

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<String> exceptionHandler(Exception e) {
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(e.getMessage());
	}
}
