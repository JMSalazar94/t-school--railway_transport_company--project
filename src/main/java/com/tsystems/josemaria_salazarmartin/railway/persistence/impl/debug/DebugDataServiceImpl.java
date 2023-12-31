package com.tsystems.josemaria_salazarmartin.railway.persistence.impl.debug;

import com.tsystems.josemaria_salazarmartin.railway.persistence.api.debug.IDebugDataService;
import org.springframework.stereotype.Service;

@Service
public class DebugDataServiceImpl implements IDebugDataService {

    private static final String HELLO_WORLD = "1) This is HELLO WORLD from DebugDataService\n";


    public String findHelloWorld() {
        return HELLO_WORLD;
    }


}