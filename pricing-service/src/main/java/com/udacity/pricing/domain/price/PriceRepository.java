package com.udacity.pricing.domain.price;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//creating a repository that extends CrudRepository
@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {



}
