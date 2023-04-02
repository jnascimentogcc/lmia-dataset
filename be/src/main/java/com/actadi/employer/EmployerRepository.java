package com.actadi.employer;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface EmployerRepository extends CrudRepository<EmployerEntity, String> {

    Collection<EmployerEntity> findByNameContains(String name);
}
