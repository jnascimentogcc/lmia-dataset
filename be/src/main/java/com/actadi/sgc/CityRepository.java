package com.actadi.sgc;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CityRepository extends CrudRepository<CityEntity, String> {

    Collection<CityEntity> findByIdProvinceOrderByName(String idProvince);
}
