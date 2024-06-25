package GongGong.contest.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {
    
    @Id
    String MemberId;
    
    String MemberPassword;
    
    
}
