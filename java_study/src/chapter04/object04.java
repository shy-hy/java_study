package chapter04;

	// 클래스 생성 (Book, Person, ...)
	// : 속성 2개
	// : 메서드 1개

class Book { 
	
	// t=클래스 
	String name; 
	int year; 
	// 클래스 내부의 데이터 (속성)
 	Book(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
 	// 클래스 내부의 동작 (메서드)
	void display(){
		System.out.println("Name: " + name + ", year" + year);
	}

	
	public void displayInfo() {
		// TODO Auto-generate36d method stub
		
	}}


public class object04 {
 public static void main(String[] args) {
	 
	 Book myBook = new Book ("백설공주", 2024);
	 
	 System.out.println(myBook.name);
	 System.out.println(myBook.year);
	 
	 myBook.displayInfo();
	 
	 
	 // 속성 출력
	 
	 // 메서드 호출

 }}



