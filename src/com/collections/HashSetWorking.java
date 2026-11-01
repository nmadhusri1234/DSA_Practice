package com.collections;

import java.util.HashSet;
import java.util.Objects;

class Student
{
	int id ;
	String name;
	
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}
	
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		
		if(!(obj instanceof Student))
			return false;
		
		Student s = (Student)obj;
		
		return this.id == s.id ;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name;
	}
	
	
}
public class HashSetWorking {
	
	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<>();
		
		set.add(new Student(101,"Madhu"));
		set.add(new Student(103,"Mouvya"));
		set.add(new Student(101,"Madhu"));
		set.add(new Student(104,"Honey"));
		
		System.out.println(set);
		
	}

}
