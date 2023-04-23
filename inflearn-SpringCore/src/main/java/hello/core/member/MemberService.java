package hello.core.member;

public interface MemberService {

    // 회원가입 메서드
    void join(Member member);

    // 회원조회 메서드
    Member findMember(Long memberId);
}
