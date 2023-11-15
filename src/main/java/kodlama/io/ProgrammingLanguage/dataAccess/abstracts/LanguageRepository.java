package kodlama.io.ProgrammingLanguage.dataAccess.abstracts;

import kodlama.io.ProgrammingLanguage.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Integer> {

}
