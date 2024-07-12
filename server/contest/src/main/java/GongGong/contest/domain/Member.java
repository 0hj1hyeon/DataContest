package GongGong.contest.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long memberId;
    
    @Column(length = 50)
    String id;
    
    String password;
    
    @Column(length = 50)
    String name;
    
    @Column(length = 50)
    String gender;
    
    Integer age;
    
    @Column(length = 50)
    String email;
    
    @Column(length = 50)
    String call_info;
    
    @Column(length = 50)
    String address;
    
    @Lob
    String intro;
    
    @OneToOne
    @JoinColumn
    Disabled disabled;
}
