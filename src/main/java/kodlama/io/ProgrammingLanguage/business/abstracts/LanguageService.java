package kodlama.io.ProgrammingLanguage.business.abstracts;

import kodlama.io.ProgrammingLanguage.business.requests.CreateLanguageRequest;
import kodlama.io.ProgrammingLanguage.business.requests.DeleteLanguageRequest;
import kodlama.io.ProgrammingLanguage.business.responses.UpdateLanguageResponse;
import kodlama.io.ProgrammingLanguage.dataAccess.abstracts.LanguageRepository;
import kodlama.io.ProgrammingLanguage.entities.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LanguageService {
    List<Language> getAll();
    void add(CreateLanguageRequest createLanguageRequest);
    void delete(DeleteLanguageRequest deleteLanguageRequest);
    void update(UpdateLanguageResponse updateLanguageResponse);

}
