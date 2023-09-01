package com.Collectionss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Mppsss {

	public static void main(String[] args) {

		Map<Integer, ArrayList<String>> mplis = new HashMap<Integer, ArrayList<String>>();

		ArrayList<String> arli1 = new ArrayList<String>();
		arli1.add("power");
		arli1.add("star");
		arli1.add("kalyan");

		ArrayList<String> arli2 = new ArrayList<String>();
		arli2.add("Gujjula");
		arli2.add("sathish");
		arli2.add("kumar");

		mplis.put(101, arli1);
		mplis.put(102, arli2);

		// Map.Entry<>
		for (Map.Entry<Integer, ArrayList<String>> entry : mplis.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		// using keySet()
		for (Integer key : mplis.keySet()) {
			System.out.println(key + ":" + mplis.get(key));
		}
		System.out.println("******************************************");

		// using values()

		for (ArrayList<String> values : mplis.values()) {
			System.out.println("Values :" + values);

		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//using iterator and entrySet()
		Iterator<Entry<Integer, ArrayList<String>>> itr = mplis.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, ArrayList<String>> entry = itr.next();
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}
		
		System.out.println("**********************************");
		
		//Iterator and keySet()
		
		Iterator<Integer> ittr = mplis.keySet().iterator();
		while(ittr.hasNext()) {
			int key = ittr.next();
			System.out.println(key + ":"+mplis.get(key));
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Iterator<ArrayList<String>> iter =mplis.values().iterator();
		while(iter.hasNext()) {
			ArrayList<String> values = iter.next();
			System.out.println("values :"+values);
		}
		System.out.println("Using the Lambdas and stream API");

		// using lambda and start the both Key and values
		mplis.forEach((K, V) -> System.out.println("keys :" + K + " : " + "Values :" + V));

		System.out.println("----------------------------------------------");

		// start from the keys to iterate over the map
		mplis.keySet().forEach(K -> System.out.println(K + " : " + mplis.get(K)));

		System.out.println("*********************************");

		// start from the Values to iterate over the map
		mplis.values().forEach(v -> System.out.println("values : " + v));
		mplis.values().forEach(V -> System.out.println("valuesss get method :" + V + " : " + mplis.get(V)));

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		// using the entrySet() and stream API
		mplis.entrySet().stream().forEach(
				action -> System.out.println("key - " + action.getKey() + " : " + "Value - " + action.getValue()));

		System.out.println("---------------------------------------");
		mplis.forEach((actK, actV) -> {
			ArrayList<String> hm = mplis.get(actK);
			System.out.println("values of the keys :" + hm);
		});

	}

}

/* output 
 * 101 : [power, star, kalyan]
102 : [Gujjula, sathish, kumar]
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
101:[power, star, kalyan]
102:[Gujjula, sathish, kumar]
******************************************
Values :[power, star, kalyan]
Values :[Gujjula, sathish, kumar]
&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
101:[power, star, kalyan]
102:[Gujjula, sathish, kumar]
**********************************
101:[power, star, kalyan]
102:[Gujjula, sathish, kumar]
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
values :[power, star, kalyan]
values :[Gujjula, sathish, kumar]
Using the Lambdas and stream API
keys :101 : Values :[power, star, kalyan]
keys :102 : Values :[Gujjula, sathish, kumar]
----------------------------------------------
101 : [power, star, kalyan]
102 : [Gujjula, sathish, kumar]
*********************************
values : [power, star, kalyan]
values : [Gujjula, sathish, kumar]
valuesss get method :[power, star, kalyan] : null
valuesss get method :[Gujjula, sathish, kumar] : null
&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
key - 101 : Value - [power, star, kalyan]
key - 102 : Value - [Gujjula, sathish, kumar]
---------------------------------------
values of the keys :[power, star, kalyan]
values of the keys :[Gujjula, sathish, kumar]

 * */
