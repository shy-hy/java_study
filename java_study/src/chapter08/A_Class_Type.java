package chapter08;

// ===자바에서의 타입 변환===
// 자료형 변환 : 변수 & 자료형에서의 자동 형 변환, 강제 형 변환
// 클래스 타입 변환: 자동, 강제 형 변환
// - 자료형 변환보다 가능한 범위가 좁음
// - 서로 상송 관계에 있는 클래스 사이세서만 변환 가능

class Parent {
	void displayInfo() {
		System.out.println("부모 클래스입니다.");
	}
}

class Child extends Parent {
	// 메서드 재정의 : 오버라이딩 (상속 관계에서만 가능)
	void displayInfo() {
		System.out.println("자식 클래스입니다.");
	}
	
	void ownMethod() {
		System.out.println("자식만의 메서드입니다.");
	}
}



public class A_Class_Type {
	public static void main(String[] args) {
		// === 클래스의 자동 타입 변환(Upcasting, 업케스팅) ===
		// : 자식 클래스의 객체를 부모 클래스 타입으로 변환하는 것
		// >> 직접 명시 X, 자동 타입 변환이 일어남
		
		// 1. 자식 객체를 생성하면서 바로 부모 타입으로 변환
		// 부모클래스 객체변수 = new 자식클래스();
		Parent childObject = new Child();
		
		childObject.displayInfo(); // 자식 클래스입니다.
		// childObject.ownMethod(); // - Error
		// >> 자동 형 변환의 경우, 해당 객체는 보존되면서
		//	사용은 부모 객체처럼 사용
		// >> 두 클래스 간에 공통된 특성이 아닌 경우 자식만의 기능은 사용X
		
		// 2. 이미 만들어진 자식 책체를 부모 타입으로 변환
		Child c1 = new Child();
		
		// 부모클래스 객체 변수 = 자식클래스 객체변수;
		Parent p1 = c1;
		// p2.ownMethod(); - Error
		
		Parent p2 = new Child();
		
		Child c2 = (Child)p2;
		c2.ownMethod();
		
	}
}
