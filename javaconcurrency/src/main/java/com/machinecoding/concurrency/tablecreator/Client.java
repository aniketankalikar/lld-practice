package com.machinecoding.concurrency.tablecreator;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        int number  = new  Scanner(System.in).nextInt();

        for(int i =1;i<=number;i++)
        {
            TableCreator tb = new TableCreator(i);
            Thread th = new Thread(tb);
            th.start();
        }

    }
}
