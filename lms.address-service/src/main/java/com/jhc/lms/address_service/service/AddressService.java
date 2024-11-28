package com.jhc.lms.address_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhc.lms.address_service.model.Address;
import com.jhc.lms.address_service.repostary.AddressServiceRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressServiceRepository repository;

	public Address addAddress(Address address) {
		Address address1 = repository.save(address);
		return address1;
	}

	public List<Address> getAllAddress() {
		List<Address> address=(List<Address>) repository.findAll();
		return address;
	}

	public Optional<Address> getById(Long id) {
		return repository.findById(id);
	}

	public Optional<Address> getByHouseNumb(String houseNumb) {
		return repository.findByHouseNumb(houseNumb);	
	}

	public Optional<Address> getByStreet(String street) {
		return repository.findByStreet(street);
	}

	public Optional<Address> getByCity(String city) {
		return repository.findByCity(city);
	}

	public Optional<Address> getByDistrict(String district) {
		return repository.findByDistrict(district);
	}

	public Optional<Address> getByState(String state) {
		return repository.findByState(state);
	}

	public Address updateById(Long id) {
		return repository.save(id);
	}


}
