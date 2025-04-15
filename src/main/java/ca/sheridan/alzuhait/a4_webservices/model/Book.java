// Name: Talal Al Zuhair, Student ID: 991658377
package ca.sheridan.alzuhait.a4_webservices.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String authorName;
    private Double price;
    private Integer quantity;
}
