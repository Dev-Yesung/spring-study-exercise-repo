package spring5.chap05.service;

import spring5.chap05.domain.Member;

public class MemberSummaryPrinter extends MemberPrinter {

    @Override
    public void print(Member member) {
        System.out.printf(
                "회원 정보: 이메일=%s, 이름=%s\n",
                member.getEmail(), member.getName());
    }
}
