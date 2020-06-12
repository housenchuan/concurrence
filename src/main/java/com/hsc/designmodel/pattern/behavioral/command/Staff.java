package com.hsc.designmodel.pattern.behavioral.command;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.command.Staff
 * @auther: 侯森川
 * @Date: 2020-6-12 20:15
 **/

public class Staff {
    private List<Commend> commendList = new ArrayList<>();
    public void addCommend(Commend commend){
        commendList.add(commend);
    }
    public void executeCommendList(){
        for (Commend commend :commendList) {
            commend.execute();
        }
    }
}
