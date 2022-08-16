import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "member")
@Getter
@Setter
public class Member {

    @Id
    private int id;
    private String username;
}
