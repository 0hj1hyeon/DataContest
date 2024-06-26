package GongGong.contest.controller;

import GongGong.contest.domain.Member;
import GongGong.contest.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor //@Autowired랑 유사한거, final 필드에 DI 해줌
public class MemberController {
    
    private final MemberService memberService;
    
    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody Member member) {
        
        System.out.println("member.getMemberId() = " + member.getMemberId());
        System.out.println("member.getMemberPassword() = " + member.getMemberPassword());
     
        
        boolean b = memberService.joinMember(member);
        
        if (!b) {
            return new ResponseEntity<>("안되용", HttpStatus.BAD_REQUEST);
        }
        
        return new ResponseEntity<>("okzz", HttpStatus.OK);
    }
}



