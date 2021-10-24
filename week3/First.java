package com.company;
public class First {
    public static void main(String[] args){
        double answer=average(4,3,6,1);
        System.out.println("Avg: "+ answer);
    }
    public static double average(int n1, int n2, int n3, int n4){
        double sum=0;
        double avg;
        sum=n1+n2+n3+n4;
        avg=sum/4;
        return avg;
    }
}
