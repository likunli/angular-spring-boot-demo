package com.provivi.likun.repository;


import com.provivi.likun.entity.FirstName;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstNameRepository extends CrudRepository<FirstName, Long> {

    @Query(value = "SELECT * FROM USER_FIRST_NAME ORDER BY RAND() LIMIT 1", nativeQuery = true)
    FirstName findRandomOne();
}
