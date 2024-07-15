package GongGong.contest.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Disabled {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @Column(length = 50)
    String disabled_type;
    
    @Column(length = 50)
    String is_severe;
}
