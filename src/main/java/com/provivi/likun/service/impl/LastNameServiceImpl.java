package com.provivi.likun.service.impl;

import com.provivi.likun.entity.LastName;
import com.provivi.likun.repository.LastNameRepository;
import com.provivi.likun.service.LastNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LastNameServiceImpl implements LastNameService {

    @Autowired
    LastNameRepository lastNameRepository;

    @Override
    public LastName getOneLastName() throws Exception {
        LastName lastName = lastNameRepository.findRandomOne();
        if (lastName == null) {
            throw new Exception("No Last Name is stored in Database.");
        }
        return lastName;
    }
}
