package com.treehouse.testng.groups;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.Test;

@Test(
        groups = {"teacher"}
)
public class GroupsOnClass3 {
    public GroupsOnClass3() {
    }

    public void teacher1() {
        System.out.println("GroupsOnClass3中的teacher1运行");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass3中的teacher1运行");
    }
}
