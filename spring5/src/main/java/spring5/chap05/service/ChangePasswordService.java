package spring5.chap05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring5.chap05.domain.Member;
import spring5.chap05.exception.MemberNotFoundException;
import spring5.chap05.repository.MemberDao;

@Component
public class ChangePasswordService {

    @Autowired
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
