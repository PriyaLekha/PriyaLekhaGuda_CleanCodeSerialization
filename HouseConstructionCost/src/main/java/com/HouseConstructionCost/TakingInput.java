package com.HouseConstructionCost;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TakingInput {
	Scanner scan=new Scanner(System.in);
	PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	int typeofmaterial,areaofhouse,totalcost=0;
	void selectInputs()
	{
		myout.print("Select Type of materials :(1/2/3/4) \n");
		myout.print("1.Standard Materials\n2.Above Standard Materials\n3.High Standard Materials\n4.High Standard materials with fully Automated House\n");
		typeofmaterial=scan.nextInt();
		switch(typeofmaterial)
		{
		case 1 : totalcost+=1200;break;
		case 2 : totalcost+=1500;break;
		case 3 : totalcost+=1800;break;
		case 4 : totalcost+=2500;break;
		default: myout.print("Enter valid case and try again\n");break;
		}
		myout.print("Enter area of house in sqft : ");
		areaofhouse=scan.nextInt();
	}
}
