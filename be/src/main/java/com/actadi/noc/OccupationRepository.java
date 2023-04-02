package com.actadi.noc;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface OccupationRepository extends CrudRepository<OccupationEntity, String> {

    Collection<OccupationEntity> findByLevelOrderByCode(Integer level);

    Collection<OccupationEntity> findByOccupationEntityOrderByCode(OccupationEntity occupationEntity);

    Collection<OccupationEntity> findByLevelAndTitleContains(Integer level, String name);

    Optional<OccupationEntity> findByCode(String code);
}
