package com.jhc.lms.address_service.repostary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jhc.lms.address_service.model.Address;

@Repository
public interface AddressServiceRepository extends JpaRepository<Address, Long>{

	Optional<Address> findByHouseNumb(String houseNumb);

	Optional<Address> findByStreet(String street);

	Optional<Address> findByCity(String city);

	Optional<Address> findByDistrict(String district);

	Optional<Address> findByState(String state);

	Address save(Long id);

}
