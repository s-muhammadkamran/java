package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository //Instead of Component we use more specific notation for Bean like it's a Repository component
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1,2,3,4,5};
    }
}
