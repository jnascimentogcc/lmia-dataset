package com.actadi.search;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface SearchRepository extends CrudRepository<SearchEntity, String> {

    Collection<SearchEntity> findAllByOrderByCreateTSDesc();
}
