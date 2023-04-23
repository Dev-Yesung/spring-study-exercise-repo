package spring5.chap06.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring5.chap06.domain.Member;
import spring5.chap06.dto.RegisterRequest;
import spring5.chap06.exception.DuplicateMemberException;
import spring5.chap06.repository.MemberDao;

@Component
public class MemberRegisterService {

    @Autowired
    private MemberDao memberDao;

    public MemberRegisterService() {
    }

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
