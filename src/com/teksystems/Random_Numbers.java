package com.teksystems;

import java.util.Random;

import org.testng.annotations.Test;

public class Random_Numbers {
	@Test
	public void rand(){
		Random ran=new Random();
		
		int i=ran.nextInt(10);
		System.out.println(i);
		
		
	}

}
