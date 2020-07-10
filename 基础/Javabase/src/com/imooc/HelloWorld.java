package com.imooc;

import java.util.Arrays;

/**
 * Created by ealldy on 2020/7/9.
 */
import java.util.Arrays;
public class HelloWorld {

    //完成 main 方法
    public static void main(String[] args) {
        int[] scores=new int[]{89,-23,64,91,119,52,73};
        HelloWorld hello=new HelloWorld();
        hello.sort(scores);
    }

    //定义方法完成成绩排序并输出前三名的功能
    public void sort(int[] scores){
        Arrays.sort(scores);
        System.out.println("考试成绩的前三名为：");
        int n=scores.length-1;
        int count=0;
        while (count<3){
            if ((scores[n]>=0)&&(scores[n]<=100)){
                System.out.println(scores[n]);
                count++;
            }
            n--;
        }
        return;
    }

}