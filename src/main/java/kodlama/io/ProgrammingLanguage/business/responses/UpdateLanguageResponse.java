package kodlama.io.ProgrammingLanguage.business.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateLanguageResponse {
    private int id;
    private String name;
    private String subTech;
}
