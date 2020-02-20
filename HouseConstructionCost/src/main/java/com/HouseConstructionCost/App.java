package com.HouseConstructionCost;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class App 
{
    public static void main( String[] args )
    {
        TakingInput obj=new TakingInput();
        PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        obj.selectInputs();
        myout.print("Total cost required or construction of house = "+obj.areaofhouse*obj.totalcost+" INR");
        myout.close();
    }
}
