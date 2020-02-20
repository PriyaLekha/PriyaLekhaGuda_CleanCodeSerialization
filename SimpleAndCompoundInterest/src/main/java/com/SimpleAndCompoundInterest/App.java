package com.SimpleAndCompoundInterest;

import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        SimpleInterest sinterest=new SimpleInterest();
    	PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    	myout.print("Simple Interest Calculation\n");
        sinterest.setElements();
        myout.print("Simple Interest = "+sinterest.simpleInterest());
        CompoundInterest cinterest=new CompoundInterest();
        myout.print("\nCompound Interest Calculation\n");
        cinterest.setElements();
        myout.print("Compound Interest = "+cinterest.compoundInterest());
        myout.close();
    }
}
