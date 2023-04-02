package com.actadi.program;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ProgramStreamRepository extends CrudRepository<ProgramStreamEntity, String> {

    Collection<ProgramStreamEntity> findAllByOrderByName();
}
