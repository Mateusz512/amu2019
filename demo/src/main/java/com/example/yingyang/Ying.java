package com.example.yingyang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ying implements Talking{
//    @Autowired
//    Yang yang;

//    @Autowired
//    public Ying(Yang yang) {
//    }

    Yang yang;

    @Autowired
    public void setYang(Yang yang) {
        this.yang = yang;
    }
}
