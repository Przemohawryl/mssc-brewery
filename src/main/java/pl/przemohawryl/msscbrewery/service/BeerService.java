package pl.przemohawryl.msscbrewery.service;

import pl.przemohawryl.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
