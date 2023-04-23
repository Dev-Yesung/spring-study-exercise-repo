package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 다음의 코드는 인터페이스에도 의존하지만 구체적인 구현에도 의존하고 있다.
    // 즉 OCP, DIP 를 모두 어기고 있다.
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
