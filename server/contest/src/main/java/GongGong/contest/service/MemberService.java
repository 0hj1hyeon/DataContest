package GongGong.contest.service;


import GongGong.contest.domain.Member;
import GongGong.contest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    
    private final MemberRepository memberRepository;
    
    public boolean joinMember(Member member) {
        
        
        /**
         * 회원가입 로직 작성
         * 중복 id 있는지 검사해서 true false 반환
         */
        
        return true;
    }
    
    
}
