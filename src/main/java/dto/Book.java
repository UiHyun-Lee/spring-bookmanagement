package dto;


import lombok.*;

import java.io.Serializable;
import java.security.PublicKey;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Book implements Serializable {
    private String isbn;
    private String title;
    private String author;
    private int price;
    private String content;
    private String image;

    public Book(){
        super();
    }
}
