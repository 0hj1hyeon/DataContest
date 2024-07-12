package GongGong.contest.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Disabled {
    
    @Id
    Long disabled_id;
    
    @Column(length = 50)
    String disabled_type;
    
    @Column(length = 50)
    String is_severe;
}
