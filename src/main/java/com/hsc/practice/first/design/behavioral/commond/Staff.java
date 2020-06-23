package com.hsc.practice.first.design.behavioral.commond;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.commond.Staff
 * @auther: 侯森川
 * @Date: 2020-6-22 22:20
 **/

public class Staff {
    private List<Commond> commondList = new ArrayList<>();
    public void addCommond(Commond commond){
        commondList.add(commond);
    }
    public void executeCommondList(){
        for (Commond commond : commondList) {
            commond.execute();
        }
    }
}
