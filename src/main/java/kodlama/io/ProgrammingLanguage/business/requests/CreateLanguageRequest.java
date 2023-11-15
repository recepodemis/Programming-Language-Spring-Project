package kodlama.io.ProgrammingLanguage.business.requests;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateLanguageRequest {
    private String name;
    private String subTech;
}
