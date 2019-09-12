package pl.przemohawryl.msscbrewery.service;

import org.springframework.stereotype.Service;
import pl.przemohawryl.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
