package GongGong.contest.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Member {
    
    @Id
    String id;
    
    String password;
    
}
