package com.bordercat.msscbeerservice.web.repositories;

import com.bordercat.msscbeerservice.web.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;
// spring data jpa
//no need to add @Repository. it is added by default
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
