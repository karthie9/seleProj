package com.practice.SeleniumTest;

import java.io.File;
import java.io.FileInputStream;

public class ExcelSet1 {
	File fs = new File("D:\\filepath");
	File[] f = fs.listFiles();
	for(File s: f)
	{
		System.out.println(s);
	}
	

}
