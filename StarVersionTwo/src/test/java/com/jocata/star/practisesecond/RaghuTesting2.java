package com.jocata.star.practisesecond;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class RaghuTesting2 {

	public static int count = 0;

	public static String getData(Integer number) {

		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(0, "Ravi");
		hmap.put(1, "Yadav");
		hmap.put(2, "Gopalpet");
		hmap.put(3, "Saurabh");
		hmap.put(4, "Vamshi");
		hmap.put(5, "Ashok");
		String result = hmap.get(number);

		try {
			if (!new File("D://JavaLearn//raghutest.txt").exists())
				System.out.println("result " + RaghuTesting2.getData(0));
			else {
				BufferedReader br = new BufferedReader(new FileReader(new File("D://JavaLearn//raghutest.txt")));

				/*
				 * String countString = br.readLine(); if (countString != null)
				 * { count = Integer.parseInt(countString); } br.close();
				 */

				// System.out.println("count before reader " + count);
				// System.out.println("result " + RaghuTesting2.getData(count));
			}
			number = number + 1;
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D://JavaLearn//raghutest.txt")));
			System.out.println("count before writer " + number);
			bw.write(Integer.toString(number));
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	public static void main(String[] args) throws IOException {	
		//FileInputStream fis=new FileInputStream("E://JavaLearn//ravi");
		int count=0;
		if (!new File("D://JavaLearn//raghutest.txt").exists())
			System.out.println("result " + RaghuTesting2.getData(0));
		else {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(new File("D://JavaLearn//raghutest.txt")));

			String countString = br.readLine();
			if (countString != null) {
				count = Integer.parseInt(countString);
			}
			//br.close();
		}
		//RaghuTesting2 rr=new RaghuTesting2();
	String reads=RaghuTesting2.getData(count);
	System.out.println(reads);	
	
	
	}

	
	}

