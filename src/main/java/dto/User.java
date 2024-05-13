package dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class User {

    private String id;
    private String name;
    private String pass;
    private String rec_id;

    public User(){
        super();
    }
}
