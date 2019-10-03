package com.example.yingyang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Yang implements Talking{

//    @Autowired
    Ying ying;

    @Autowired
    public void setYing(Ying ying) {
        this.ying = ying;
    }

//    @Autowired
//    public Yang(Ying ying) {
//    }
}
