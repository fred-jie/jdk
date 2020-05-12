package com.FredJie.test.java.util.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: jdk
 * @Package: com.FredJie.test.java.util.List
 * @ClassName: List
 * @Description:
 * @Author: Fredjie
 * @CreateDate: 2020/5/4 11:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/4 11:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> newlist = new ArrayList<>();
        newlist.add("s");
        String[] arrays = {"1", "2", "3"};
        List<String> list = Arrays.asList(arrays);
        list.stream().forEach(System.out::print);
        list.add("4");

    }
}
