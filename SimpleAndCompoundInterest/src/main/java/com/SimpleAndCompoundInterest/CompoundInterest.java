package com.SimpleAndCompoundInterest;

public class CompoundInterest extends SettingValues{
	double compoundInterest()
	{
		return (principalamount*Math.pow(1+rateofinterest, timeperiod))-principalamount;
	}

}
