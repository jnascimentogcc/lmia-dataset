package com.actadi.lmia;

import com.actadi.employer.EmployerEntity;
import com.actadi.noc.OccupationEntity;
import com.actadi.program.ProgramStreamEntity;
import com.actadi.sgc.CityEntity;
import com.actadi.sgc.ProvinceEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class LmiaRepository {

    @Autowired
    EntityManager em;

    public List<LmiaEntity> findAll(HashMap<String, String> params) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<LmiaEntity> cq = cb.createQuery(LmiaEntity.class);
        Root<LmiaEntity> rootLmia = cq.from(LmiaEntity.class);
        List<Predicate> listPredicate = new ArrayList<>();
        String idProvince = params.get("PROVINCE");
        if (idProvince != null) {
            ProvinceEntity provinceEntity = new ProvinceEntity();
            provinceEntity.setId(idProvince);
            listPredicate.add(cb.equal(rootLmia.get("provinceEntity"), provinceEntity));
        }
        String idCity = params.get("CITY");
        if (idCity != null) {
            CityEntity cityEntity = new CityEntity();
            cityEntity.setId(idCity);
            listPredicate.add(cb.equal(rootLmia.get("cityEntity"), cityEntity));
        }
        String idProgramStream = params.get("PROGRAM");
        if (idProgramStream != null) {
            ProgramStreamEntity programStreamEntity = new ProgramStreamEntity();
            programStreamEntity.setId(idProgramStream);
            listPredicate.add(cb.equal(rootLmia.get("programStreamEntity"), programStreamEntity));
        }
        String idEmployer = params.get("EMPLOYER");
        if (idEmployer != null) {
            EmployerEntity employerEntity = new EmployerEntity();
            employerEntity.setId(idEmployer);
            listPredicate.add(cb.equal(rootLmia.get("employerEntity"), employerEntity));
        }
        String idNOC = params.get("NOC");
        if (idNOC != null) {
            OccupationEntity occupationEntity = new OccupationEntity();
            occupationEntity.setId(idNOC);
            listPredicate.add(cb.equal(rootLmia.get("occupationEntity"), occupationEntity));
        }
        cq.where(listPredicate.toArray(new Predicate[0]));

        TypedQuery<LmiaEntity> query = em.createQuery(cq);
        return query.getResultList();
    }
}
