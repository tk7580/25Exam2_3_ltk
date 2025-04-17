package org.example;

import java.util.ArrayList;
import java.util.List;

public class wiseSayingService {

    List<wiseSaying> wiseSayings;
    int LastId;

    public wiseSayingService() {
        wiseSayings = new ArrayList<wiseSaying>();
        LastId = 0;
    }
}
