package jpabook.jpashop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
}
