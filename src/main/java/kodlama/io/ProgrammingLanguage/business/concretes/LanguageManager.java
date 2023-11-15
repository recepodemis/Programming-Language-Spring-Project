package kodlama.io.ProgrammingLanguage.business.concretes;

import kodlama.io.ProgrammingLanguage.business.abstracts.LanguageService;
import kodlama.io.ProgrammingLanguage.business.requests.CreateLanguageRequest;
import kodlama.io.ProgrammingLanguage.business.requests.DeleteLanguageRequest;
import kodlama.io.ProgrammingLanguage.business.responses.UpdateLanguageResponse;
import kodlama.io.ProgrammingLanguage.core.utilities.mappers.ModelMapperManager;
import kodlama.io.ProgrammingLanguage.dataAccess.abstracts.LanguageRepository;
import kodlama.io.ProgrammingLanguage.entities.Language;
import org.aspectj.apache.bcel.classfile.LineNumber;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private ModelMapperManager modelMapperManager;

    public LanguageManager(LanguageRepository languageRepository, ModelMapperManager modelMapperManager) {
        this.languageRepository = languageRepository;
        this.modelMapperManager = modelMapperManager;
    }

    @Override
    public List<Language> getAll() {
        return this.languageRepository.findAll();
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = this.modelMapperManager.forRequest().map(createLanguageRequest,Language.class);
        this.languageRepository.save(language);
    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        Language language = this.modelMapperManager.forRequest().map(deleteLanguageRequest,Language.class);
        this.languageRepository.delete(language);
    }

    @Override
    public void update(UpdateLanguageResponse updateLanguageResponse) {
        Language language = this.modelMapperManager.forResponse().map(updateLanguageResponse,Language.class);
        this.languageRepository.save(language);
    }
}
