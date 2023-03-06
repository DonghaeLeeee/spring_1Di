package org.iclass.day1di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Setter;

@Component
public class Buy2Controller {

	@Autowired				//이미 만들어진 Buy2service 객체(bean)을 자동 주입
	private Buy2service service;

//	public Buy2Controller(Buy2service service) {
//		System.out.println(":::Buy2Controller 커스텀 생성자:::");
//		this.service = service;
//	}

	public Buy2Controller() {
		System.out.println(":::Buy2Controller 기본생성자:::");
	}
	
	public void setService(Buy2service service) {
		System.out.println(":::Buy2Controller 다오 setter");
		this.service = service;
	}
	
	public void buy() {
		System.out.println("---Buy2Controller buy() 메소드 ---");
		service.buy();
	}

}//@Component 어노테이션 : bean으로 만들어질 클래스 위에 설정합니다.
