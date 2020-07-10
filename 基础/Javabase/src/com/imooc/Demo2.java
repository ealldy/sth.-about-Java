package com.imooc;

import java.util.Scanner;

/**
 * Created by ealldy on 2020/7/9.
 * 编程输入3个班级每个班级4个学生的成绩，输出每个班级的平均成绩
 */
public class Demo2 {
    public static void main(String[] args) {
        final int classNum=3;
        final int stuNum=4;
        int sum = 0;
        double avg=0;
        Scanner scan = new Scanner(System.in);
        for (int i=1;i<=classNum;i++){
            sum=0;
            System.out.println("******请输入第"+i+"个班级的成绩*****");
            for (int j=1;j<=stuNum;j++){
                System.out.println("请输入第"+j+"个学生的成绩");
                int score=scan.nextInt();
                sum+=score;
            }
            avg=sum/stuNum;
            System.out.println("第"+i+"个班级学生的平均成绩为"+avg);
        }
    }

}
