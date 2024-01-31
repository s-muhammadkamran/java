package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataService;

    //Use the Qualifier syntax to pass specific dependency implementation
    public BusinessCalculationService(@Qualifier("mySQLDataService") DataService dataService) {
        super();
        System.out.println(dataService);
        this.dataService = dataService;
    }

    //Use the DataService defined as Primary
    /*public BusinessCalculationService(DataService dataService) {
        super();
        System.out.println(dataService);
        this.dataService = dataService;
    }*/

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
