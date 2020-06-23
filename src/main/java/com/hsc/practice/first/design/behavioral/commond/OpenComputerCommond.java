package com.hsc.practice.first.design.behavioral.commond;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.commond.OpenComputerCommond
 * @auther: 侯森川
 * @Date: 2020-6-22 22:18
 **/

public class OpenComputerCommond implements Commond {
    private Computer computer;

    public OpenComputerCommond(Computer computer) {
        this.computer = computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.open();
    }
}
