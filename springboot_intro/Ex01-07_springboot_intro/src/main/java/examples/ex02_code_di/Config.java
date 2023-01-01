package examples.ex02_code_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration 어노테이션이 붙은 클래스는 스프링 설정으로 사용됨을 의미한다.
@Configuration public class Config {
	// 빈(Bean) : Spring이 IoC 방식으로 관리하는 객체 -> 빈 어노테이션이 붙은 메서드의 리턴값은 빈 객체로 사용됨을 의미한다.
	// 빈 팩토리(BeanFactory) : 스프링의 IoC를 담당하는 핵심 컨테이너
	// 어플리케이션 컨텍스트(ApplicationContext) : 빈 팩토리를 확장한 IoC 컨테이너

	@Bean public Member member1() {
		// Setter Injection (Setter 메서드를 이용한 의존성 주입)
		Member member1 = new Member();
		member1.setName("홍길동");
		member1.setNickName("도사");
		member1.setPrinter(new PrinterA());
		return member1;
	}

	// 어노테이션에 이름을 주면 해당 클래스를 빈으로 등록할 때 입력한 이름으로 빈의 이름을 변경할 수 있다.
	@Bean(name = "hello") public Member member2() {
		// Constructor Injection (생성자를 이용한 의존성 주입)
		return new Member("전우치", "도사", new PrinterA());
	}

	// 별도의 이름을 지정해주지 않으면 메서드의 이름이 빈의 이름으로 등록된다.
	@Bean public PrinterB printerB() {
		return new PrinterB();
	}
}
