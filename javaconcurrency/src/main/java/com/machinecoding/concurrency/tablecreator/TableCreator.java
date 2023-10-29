package com.machinecoding.concurrency.tablecreator;

public class TableCreator implements Runnable{

    int number = 0;

    public TableCreator(int no)
    {
        this.number = no;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println(this.number+" times "+i+" is "+(this.number*i));
        }
    }
}
