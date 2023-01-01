package examples.ex03_annotation_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Component 어노테이션은 다음에 나오는 클래스인 Member 클래스를 빈으로 등록하겠다는 의미이다.
@Component public class Member {
	// Value 어노테이션은 세터의 역할을 수행하기에, 객체가 생성될 때 값을 가지고 만들 수 있도록 값의 지정이 가능하다.
	// Value 어노테이션은 name 변수의 기본값으로 "홍길동"을 지정한다.
	@Value("홍길동") private String name;

	// Value 어노테이션은 name 변수의 기본값으로 "도사"를 지정한다.
	@Value("도사") private String nickName;

	// Autowired 는 printer 변수가 참조할 객체를 자동으로 찾아온다.
	// Qualifier 는 유사한 객체가 여러 개일 때 빈의 이름으로 정확하게 지정한다.
	@Autowired @Qualifier("printerA") private Printer printer;

	public Member() {
	}

	public Member(String name, String nickName, Printer printer) {
		this.name = name;
		this.nickName = nickName;
		this.printer = printer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		printer.print("Hello " + name + " : " + nickName);
	}
}
