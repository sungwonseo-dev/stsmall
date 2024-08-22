package stsmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "GetPhoneNumber_table")
@Data
public class GetPhoneNumber {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String phoneNumber;
}
