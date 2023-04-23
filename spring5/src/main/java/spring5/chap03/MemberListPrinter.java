package spring5.chap03;

import java.util.Collection;
import spring5.chap03.domain.Member;
import spring5.chap03.repository.MemberDao;

public class MemberListPrinter {

    private MemberDao memberDao;
    private MemberPrinter printer;

    public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
        this.memberDao = memberDao;
        this.printer = printer;
    }

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(printer::print);
    }

}
