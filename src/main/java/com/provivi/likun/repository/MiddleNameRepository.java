package com.provivi.likun.repository;

import com.provivi.likun.entity.FirstName;
import com.provivi.likun.entity.MiddleName;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiddleNameRepository extends CrudRepository<MiddleName, Long> {

    @Query(value = "SELECT * FROM USER_MIDDLE_NAME ORDER BY RAND() LIMIT 1", nativeQuery = true)
    MiddleName findRandomOne();
}
