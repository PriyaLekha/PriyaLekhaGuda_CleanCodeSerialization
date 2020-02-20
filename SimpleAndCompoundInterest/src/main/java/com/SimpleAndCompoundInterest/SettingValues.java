package com.SimpleAndCompoundInterest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SettingValues {
	double principalamount,timeperiod,rateofinterest;
	Scanner scan=new Scanner(System.in);
	PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	void setElements()
	{
		myout.print("Enter Principal Amount : ");
		principalamount=scan.nextDouble();
		myout.print("Enter Time Period : ");
		timeperiod=scan.nextDouble();
		myout.print("Enter Rate of Interest : ");
		rateofinterest=scan.nextDouble();
	}

}
