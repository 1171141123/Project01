package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @createDate 2020/6/21-22:55
 *
 * 1.IDEA中代码模板所处位置：setting-Editor-Live Templates /Postfix Completion
 * 2.常用的模板
 */
public class TemplatesTest {

    //模板六：prsf
    private static final Customer CUSTOMER=new Customer();

    //变形：psf
    public static final int NUM=1;

    //变形：psfi psfs
    public static final int NUM2=2;
    public static final String NATION="China";

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");

        int num=10;
        int num2=20;
        System.out.println("num2 = " + num2);
        System.out.println("num = " + num);
        System.out.println(num);

        //模板三：fori
        String[] arr=new  String[]{"Tom","Jerry","Jack","Marry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Object o : list) {

        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //变形：list.forr 倒序便利
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void  method(){
        System.out.println("TemplatesTest.method");

        //模板五：ifn
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }
    }
}
