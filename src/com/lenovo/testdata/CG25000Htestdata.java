package com.lenovo.testdata;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

import com.lenovo.buy.CG25000H;



public class CG25000Htestdata {
	@DataProvider(name="ProCG25000Htestdata")
	public static Object[][] ProCG25000Htestdata(){
		return new Object[][] {
			{"https://shop.lenovo.com.cn/","17612889019","CG6554239"}
		};
	}
	
	@Factory(dataProvider="ProCG25000Htestdata")
	public Object[] creatTeat1(String url,String account,String password) {
		Object[] tests=new Object[1];
		tests[0]=new CG25000H(url,account,password);
		return tests;
	};

}
