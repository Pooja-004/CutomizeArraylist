package com.justtest;

import java.beans.Customizer;
import java.util.ArrayList;

public class CustArrayList extends ArrayList<Object> {
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
			return super.add(o);
		}
	}
	public static void main(String[] args) {
		CustArrayList ca=new CustArrayList();
		ca.add(1);
		ca.add("india");
		ca.add(1);
		ca.add("india");
		ca.add(1);
		ca.add("india");
		System.out.println(ca);
		
	}
}
