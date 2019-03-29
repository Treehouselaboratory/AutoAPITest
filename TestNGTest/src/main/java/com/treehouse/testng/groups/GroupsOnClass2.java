package com.treehouse.testng.groups;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.Test;

@Test(groups = {"stu"})
public class GroupsOnClass2 {
    public GroupsOnClass2() {
    }

    public void stu1() {
        System.out.println("GroupsOnClass222中的stu111运行");
    }

    public void stu2() {
        System.out.println("GroupsOnClass222中的stu2222运行");
    }
}
