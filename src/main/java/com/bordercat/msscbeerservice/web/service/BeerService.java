package com.bordercat.msscbeerservice.web.service;

import com.bordercat.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getById(BeerDto beerDto, boolean anyBoolean);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto any);
}
