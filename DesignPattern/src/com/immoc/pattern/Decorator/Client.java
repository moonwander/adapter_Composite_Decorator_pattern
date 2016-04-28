package com.immoc.pattern.Decorator;

/** 
* Created by IntelliJ IDEA. 
* 客户端测试 
*/ 
public class Client { 
    public static void main(String args[]) { 
        Project employe = new Employe();        //代码工人 
        Project managerA = new ManagerA(employe); //项目经理 
        Project managerB = new ManagerB(employe); //项目经理 
        //以经理的名义将编码完成，功劳都是经理的，实际编码的是工人 
        managerA.doCoding(); 
        managerB.doCoding(); 
    } 
}
/*
运行结果：
项目经理A 在做需求分析 
项目经理A 在做架构设计 
项目经理A 在做详细设计 
代码工人 在编写代码，加班编啊编啊，终于编完了！ 
项目经理B 在做需求分析 
项目经理B 在做详细设计 
代码工人 在编写代码，加班编啊编啊，终于编完了！ 
项目经理B 在做收尾工作 
 */