package com.actadi.sgc;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ProvinceRepository  extends CrudRepository<ProvinceEntity, String> {

    Collection<ProvinceEntity> findAllByOrderByName();
}
