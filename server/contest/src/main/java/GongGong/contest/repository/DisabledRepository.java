package GongGong.contest.repository;

import GongGong.contest.domain.Disabled;
import GongGong.contest.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisabledRepository  extends JpaRepository<Disabled, Long> {
    
}
