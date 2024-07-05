import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class UserLomBokReqArgs {
    private final long id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
}