package com.test.springsql.controller;

import com.test.springsql.model.SpringDataModel;
import com.test.springsql.service.SpringDataService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/spring")
@RestController
@AllArgsConstructor
@Slf4j
public class SpringController {

    private SpringDataService springDataService;

    @GetMapping("/data")
    public SpringDataModel getData() {
        log.info("Spring data model service start");
        return springDataService.getSpringData();
    }
}
