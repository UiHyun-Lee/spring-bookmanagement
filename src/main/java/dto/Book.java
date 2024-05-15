package dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.security.PublicKey;

@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
@ToString
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long isbn;

    private String title;
    private String author;
    private int price;
    private String content;
    private String image;

    public Book(){
        super();
    }
}
