package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	/* 실습 1
	public void method1() {
		System.out.println("TestBean1의 method1 호출");
	}
	*/
	
	//실습2
	public void method1() throws Exception{
		int i=10/0;
		System.out.println("TestBean1의 method1 호출");
	}
}
