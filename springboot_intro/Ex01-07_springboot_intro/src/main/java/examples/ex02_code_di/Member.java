package examples.ex02_code_di;

public class Member {
	private String name;
	private String nickName;
	private Printer printer;

	public Member() {}

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
