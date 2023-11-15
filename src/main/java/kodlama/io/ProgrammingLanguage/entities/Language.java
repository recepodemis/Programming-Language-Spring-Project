package kodlama.io.ProgrammingLanguage.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "Languages")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "subTech")
    private String subTech;
}
