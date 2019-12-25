package com.address.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.entity.Address;
import com.address.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void createAddress(Address address) {
		addressRepository.saveAndFlush(address);
	}

	@Override
	public Optional<Address> getAddressById(String addressId) {
		Optional<Address> address = addressRepository.findById(addressId);
		return address;
	}

	@Override
	public List<Address> getAddresses() {
		List<Address> addresses = addressRepository.findAll();
		return addresses;
	}

}
