package examples.ex03_annotation_di;

import org.springframework.stereotype.Component;

// PrinterA 클래스를 빈으로 등록하겠다는 의미이다.
// 이때 등록할 이름으로 printerA를 사용하겠다고 이름도 지정한 것이다.
@Component("printerA") public class PrinterA implements Printer {
	@Override public void print(String message) {
		System.out.println("Printer A : " + message);
	}
}
