package GongGong.contest.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
    String accountId;
    String password;
    String name;
    String gender;
    Integer age;
    String email;
    String call_info;
    String address;
    String intro;
    String disabled_type;
    String is_severe;
    
    public Member toMember() {
        Member member = new Member();
        member.setAccountId(this.accountId);
        member.setPassword(this.password);
        member.setName(this.name);
        member.setGender(this.gender);
        member.setAge(this.age);
        member.setEmail(this.email);
        member.setCall_info(this.call_info);
        member.setAddress(this.address);
        member.setIntro(this.intro);
        
        return member;
    }
    
    public Disabled toDisabled() {
        
        if (disabled_type == null) {
            return null;
        }
        
        Disabled disabled = new Disabled();
        disabled.setDisabled_type(this.disabled_type);
        disabled.setIs_severe(this.is_severe);
        return disabled;
    }
}
