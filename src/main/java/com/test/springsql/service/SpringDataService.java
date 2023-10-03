package com.test.springsql.service;

import com.test.springsql.model.SpringDataModel;
import org.springframework.stereotype.Service;

@Service
public class SpringDataService {
    public SpringDataModel getSpringData() {
        return SpringDataModel.builder()
                .id(11)
                .name("Spring data 1")
                .description("this is test application")
                .build();
    }
}
