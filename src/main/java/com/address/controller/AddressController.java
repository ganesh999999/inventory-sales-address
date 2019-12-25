package com.address.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.entity.Address;
import com.address.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;

	@PostMapping
	public void createAddress(@RequestBody Address address) {
		addressService.createAddress(address);
	}

	@GetMapping("/{addressId}")
	public Optional<Address> getAddressById(@PathVariable String addressId) {
		Optional<Address> address = addressService.getAddressById(addressId);
		return address;
	}

	@GetMapping
	public List<Address> getAddresses() {
		List<Address> addresses = addressService.getAddresses();
		return addresses;
	}

}
