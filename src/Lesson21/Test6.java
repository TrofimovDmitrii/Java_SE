package Lesson21;

public class Test6 {
}

interface I3 {

	private static void method1() {
		System.out.println("static method");
	}

	private void method2() {
		System.out.println("non-static method");
	}

	default void method3() {
		method1();
		method2();
	}

	static void method4() {
		method1();
	}
}