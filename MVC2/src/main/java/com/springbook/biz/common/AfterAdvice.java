package com.springbook.biz.common;

public class AfterAdvice {
	public void allPointcut() {}
	
	public void finallyLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작");
	}
}
