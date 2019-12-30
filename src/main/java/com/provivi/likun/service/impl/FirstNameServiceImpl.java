package com.provivi.likun.service.impl;

import com.provivi.likun.entity.FirstName;
import com.provivi.likun.repository.FirstNameRepository;
import com.provivi.likun.service.FirstNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstNameServiceImpl implements FirstNameService {

    @Autowired
    FirstNameRepository firstNameRepository;

    @Override
    public FirstName getOneFirstName() throws Exception {
        FirstName firstName = firstNameRepository.findRandomOne();
        if (firstName == null) {
            throw new Exception("No Last Name is stored in Database.");
        }
        return firstName;
    }
}
