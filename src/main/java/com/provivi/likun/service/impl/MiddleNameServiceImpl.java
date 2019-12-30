package com.provivi.likun.service.impl;

import com.provivi.likun.entity.MiddleName;
import com.provivi.likun.repository.MiddleNameRepository;
import com.provivi.likun.service.MiddleNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MiddleNameServiceImpl implements MiddleNameService {

    @Autowired
    MiddleNameRepository middleNameRepository;

    @Override
    public MiddleName getOneMiddleName() throws Exception {
        MiddleName middleName = middleNameRepository.findRandomOne();
        if (middleName == null) {
            throw new Exception("No Middle Name is stored in Database.");
        }
        return middleName;
    }
}
