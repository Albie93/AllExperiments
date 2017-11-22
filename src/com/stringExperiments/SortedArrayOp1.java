package com.stringExperiments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class SortedArrayOp1 {

	public static void main(String[] args) {
		int temp;
		System.out.println("Enter Number of Total Input Valuse: `");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter All elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();

		}

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		System.out.println("Ascending Order:");
		for (int i = 0; i < n - 1; i++) {

			System.out.println(a[i]);

		}
		System.out.print(a[n - 1]);
		
		
		
		

		// ArrayList<Integer> l1 = new ArrayList<Integer>();
		// l1.add(5);
		// l1.add(8);
		// l1.add(12);
		// l1.add(20);
		// l1.add(1);
		//
		// java.util.Iterator<Integer> I1 = l1.iterator();
		// while(I1.hasNext()){
		// System.out.println(I1.next());
		//
		// }
		//
		// System.out.println("Printing Values In Ascending Order: ");
		//
		// for(int i=0;i<l1.size();i++){
		// for(int j=1;j<l1.size();j++){
		// if(l1.indexOf(i)>l1.indexOf(j)){
		// temp = l1.indexOf(i);
		//
		//
		// }
		//
		// }

	}

}
