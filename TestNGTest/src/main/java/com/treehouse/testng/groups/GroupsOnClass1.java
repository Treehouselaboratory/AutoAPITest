package com.treehouse.testng.groups;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.Test;

@Test(groups = {"stu"})
public class GroupsOnClass1 {
    public GroupsOnClass1() {
    }

    public void stu1() {
        System.out.println("\nGroupsOnClass1中的stu111运行");
    }

    public void stu2() {
        System.out.println("GroupsOnClass1中的stu2222运行");
    }
}
