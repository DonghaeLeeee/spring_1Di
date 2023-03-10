package org.iclass.day1di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class Buy2service {
	@Autowired
	private Buy2Dao dao;
	
//	public Buy2service(Buy2Dao dao) {
//		System.out.println(":::Buy2Service 커스텀 생성자:::");
//		this.dao = dao;
//	}
	
	public Buy2service() {
		System.out.println(":::Buy2Service 기본 생성자:::");
	}
	
	public void setDao(Buy2Dao dao) {
		System.out.println(":::Buy2Service setter생성자:::");
		this.dao = dao;
	}
	
	public void buy() {
		System.out.println("--- Buy2Service buy() 메소드 ---");
		dao.buy();
	}

}
