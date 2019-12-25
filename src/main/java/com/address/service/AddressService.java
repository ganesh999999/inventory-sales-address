package com.address.service;
import java.util.List;
import java.util.Optional;

import com.address.entity.Address;

public interface AddressService {
	public void createAddress(Address address);
	public Optional<Address> getAddressById(String addressId);
	public List<Address> getAddresses();

}
