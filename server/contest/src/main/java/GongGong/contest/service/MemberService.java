package GongGong.contest.service;


import GongGong.contest.domain.Member;
import GongGong.contest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    
    private final MemberRepository memberRepository;
    
    public boolean joinMember(Member member) {
        
        /**
         * 회원가입 로직 작성
         * 중복 id 있는지 검사해서 true false 반환
         */
        
        Optional<Member> findMember = memberRepository.findById(member.getMemberId());
        //null 인지 검사
        if (findMember.isPresent()) {
            return false;
        } 
        
        memberRepository.save(member);
        return true;
    }
    
}
