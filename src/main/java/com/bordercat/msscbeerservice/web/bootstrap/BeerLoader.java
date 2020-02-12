package com.bordercat.msscbeerservice.web.bootstrap;

import com.bordercat.msscbeerservice.web.domain.Beer;
import com.bordercat.msscbeerservice.web.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

// class will run on start up every time the spring context starts

@Component
public class BeerLoader implements CommandLineRunner {

    // spring will inject this
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {

        if(beerRepository.count() == 0) {

            beerRepository.save(Beer.builder()
                    .beerName("Punky Bo")
                    .beerStyle("IPA")
                    .quantitiyToBrew(200)
                    .minOnHand(100)
                    .upc(234343434334L)
                    .price(new BigDecimal("5.45"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Garzo")
                    .beerStyle("PALE_ALE")
                    .quantitiyToBrew(230)
                    .minOnHand(200)
                    .upc(334343434334L)
                    .price(new BigDecimal("6.45"))
                    .build());
        }

        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
