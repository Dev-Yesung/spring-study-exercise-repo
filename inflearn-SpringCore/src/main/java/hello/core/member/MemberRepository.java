package hello.core.member;

public interface MemberRepository {

    // 회원정보 저장 메서드
    void save(Member member);

    // 회원조회 메서드
    Member findById(Long memberId);
}
