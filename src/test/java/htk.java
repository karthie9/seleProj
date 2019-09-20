import java.util.HashMap;
import java.util.Map;

import org.apache.avalon.framework.ValuedEnum;

import java.awt.List.*;
import java.util.ArrayList;
import java.util.*;
public class htk 
{
	
	
	Map<Map<String, List>, Arrays> tm = new HashMap<Map<String, List>, Arrays>();
	Map<String, List>  m = new HashMap<String, List>();
	Map<String, String[]>  ms = new HashMap<String, String[]>();
	Map<List, Integer>  m1 = new HashMap<List, Integer>();
	
	 List<Integer> lio = new ArrayList<Integer>();
	 List<Object> c = new ArrayList<Object>();
	 

	//String a = "akk";
	//int b = "b";
	
			
	 void method1()
	{
		lio.add(1);
		lio.add(2);
		lio.add(3);
		m.put("a", lio);
		m.put("b", lio);

		String[] z1 = new String[10];
		z1[0]="1";
		z1[1]="2";
		z1[3]="3";
				

		
		c.addAll(lio);
		c.add("add");
		//m.put("c", lio);
		System.out.println("get-->" + m.get("a"));
		System.out.println("get c-->" + c);
		System.out.println(c.get(3));
		System.out.println(m.get("a"));
	//	m.get
		System.out.println("A1------->" +z1[0]);
		ms.put("pol", z1);
	System.out.println("A1------->" + ms.get("pol")[1]);
	System.out.println(ms.entrySet());
	
		m1.put(lio, 1);
		
		for (Object a1: c)
		{
			System.out.println(a1);
		}
		
		System.out.println("test -----?" + m1.get(lio));
		for (Object f:lio)
		{
			System.out.print(f);
		}

	}
	
	public static void main(String args[])
	{
		System.out.println("ddd");
	//System.out.println(arrylist);
		htk l = new htk();
		l.method1();
	}
}


/*
 * Excel rows = 10 counts = 3
 */



// 