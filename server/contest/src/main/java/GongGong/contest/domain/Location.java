package GongGong.contest.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
public class Location {
    
    @Id
    String locationId;
    
    @Column(precision = 10, scale = 7)
    BigDecimal latitude;
    
    @Column(precision = 10, scale = 7)
    BigDecimal longitude;
    
    @Column(length = 50)
    String address;
    
    @Column(length = 50)
    String name;
    
    @Column(length = 50)
    String recruitment_period;
    
    @Column(length = 50)
    String job_category;
    
    @Column(length = 50)
    String employment_type;
    
    @Column(length = 50)
    String salary_type;
    
    Integer salary;
    
    @Column(length = 50)
    String entry_type;
    
    @Column(length = 50)
    String required_experience;
    
    @Column(length = 50)
    String required_education;
    
    @Column(length = 50)
    String major_field;
    
    @Column(length = 50)
    String certifications;
    
    @Column(length = 50)
    String responsible_agency;
    
    @Column(length = 50)
    String call_info;
}
