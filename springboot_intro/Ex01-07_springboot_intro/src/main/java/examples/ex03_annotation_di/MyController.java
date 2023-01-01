package examples.ex03_annotation_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller public class MyController {
	@Autowired Member member1;
	@Autowired @Qualifier("printerB") Printer printer;
	@Autowired Member member2;

	// @RequestMapping 은 웹 브라우저에서 사용자가 /로 get 방식의 url 호출을 하면 root() 메서드를 실행시킨다.
	// @ResponseBody 어노테이션은 Json 이나 Xml 등 REST Api 형태의 응답을 할 경우,
	// 다시 말해 html 태그 없이 순수하게 스트링 데이터만으로 응답을 할 경우 지정한다.
	@RequestMapping("/") public @ResponseBody String root() {
		// 1. Member Bean 가져오기
		member1.print();

		// 2. PrinterB Bean 가져오기
		member1.setPrinter(printer);
		member1.print();

		// 3. 싱글톤인지 확인
		if (member1 == member2) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}

		return "Annotation 사용하기";
	}
}
