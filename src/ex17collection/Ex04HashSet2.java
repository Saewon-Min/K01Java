package ex17collection;

import java.util.HashSet;

import common.Person;

public class Ex04HashSet2 {
	public static void main(String[] args) {
		
		HashSet<Person> hashSet = new HashSet<Person>();
		
		/*
		두 메소드의 오버라이딩은 Person클래스를 참조하면 됨.
		 */
		Person p1 = new Person("정우성1",30);
		Person p2 = new Person("정우성2",32);
		Person p3 = new Person("정우성3",30);
		
		hashSet.add(p1);
		hashSet.add(p2);
		
		boolean b = hashSet.add(p3);
	
		System.out.println("p3의 객체 저장 여부: "+b);
		System.out.println("HashSet에 저장된 객체수 : "+hashSet.size());
	}
}
