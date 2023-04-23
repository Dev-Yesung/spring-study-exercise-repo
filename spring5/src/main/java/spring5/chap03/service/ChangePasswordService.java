package spring5.chap03.service;

import spring5.chap03.domain.Member;
import spring5.chap03.exception.MemberNotFoundException;
import spring5.chap03.repository.MemberDao;

public class ChangePasswordService {

    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void changePassword(String email, String oldPwd, String newPwd) {
        Member member = memberDao.selectByEmail(email);
        if (member == null) {
            throw new MemberNotFoundException();
        }

        member.changePassword(oldPwd, newPwd);
        memberDao.update(member);
    }
}
