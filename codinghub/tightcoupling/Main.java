package com.codinghub.tightcoupling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
			
		Student student = new Student();
		student.setRoll(18);
		student.setName("Shankar");
		student.setDept("A");
		student.setMarks(98);
//		System.out.println(student);
		
		Employee employee = new Employee(118,"Shankar_abbs","Software",800000);
//		System.out.println(employee);
		
		Products products = new Products();
		products.setPid(1118);
		products.setPname("VolvoCar");
		products.setPrice(5400000);
//		System.out.println(products);
		
		String name = "Shankar";
		int[] arr = {19,18,56,23,6};
		List<Integer> list = new ArrayList(Arrays.asList(19,13,17,80));
		
		Special special = new Special(17,name,arr,list,student,employee,products);
		System.out.println(special); // example of TightCoupling  Dependent on multiple classes
		
		Special2 special2 = new Special2();
		special2.getMinBlanace(); // example of lowerForm of TightCoupling  Dependent on Only one class
		
	}

}
