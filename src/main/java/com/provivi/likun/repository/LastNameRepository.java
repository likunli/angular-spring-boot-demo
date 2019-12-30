package com.provivi.likun.repository;


import com.provivi.likun.entity.FirstName;
import com.provivi.likun.entity.LastName;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LastNameRepository extends CrudRepository<LastName, Long> {

    @Query(value = "SELECT * FROM USER_LAST_NAME ORDER BY RAND() LIMIT 1", nativeQuery = true)
    LastName findRandomOne();
}
