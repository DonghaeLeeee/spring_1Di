package org.iclass.day2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.iclass.day2") // 해당 패키지의 component를 모두 bean으로 생성
public class ProductConfig {

}
