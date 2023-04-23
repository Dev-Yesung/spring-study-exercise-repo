package spring5.chap03.service;

import java.time.LocalDateTime;
import spring5.chap03.domain.Member;
import spring5.chap03.dto.RegisterRequest;
import spring5.chap03.exception.DuplicateMemberException;
import spring5.chap03.repository.MemberDao;

public class MemberRegisterService {

    private MemberDao memberDao;

    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public Long regist(RegisterRequest req) {
        Member member = memberDao.selectByEmail(req.getEmail());
        if (member != null) {
            throw new DuplicateMemberException("[ERROR] duplicate email : " + req.getEmail());
        }
        Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(),
                                      LocalDateTime.now());
        memberDao.insert(newMember);
        return newMember.getId();
    }
}
