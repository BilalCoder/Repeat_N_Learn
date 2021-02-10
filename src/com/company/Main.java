package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        int b  = sc.nextInt();
        String tempS = s;
        int times = (b/s.length())+1;
        for(int i=0; i<times; i++){
            s = s+tempS;
        }
        if(s.charAt(a)==s.charAt(b))
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
