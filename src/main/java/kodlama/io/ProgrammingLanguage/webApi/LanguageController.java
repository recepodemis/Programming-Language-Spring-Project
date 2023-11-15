package kodlama.io.ProgrammingLanguage.webApi;

import kodlama.io.ProgrammingLanguage.business.abstracts.LanguageService;
import kodlama.io.ProgrammingLanguage.business.requests.CreateLanguageRequest;
import kodlama.io.ProgrammingLanguage.business.requests.DeleteLanguageRequest;
import kodlama.io.ProgrammingLanguage.business.responses.UpdateLanguageResponse;
import kodlama.io.ProgrammingLanguage.entities.Language;
import org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguageController {
    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping()
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @PostMapping()
    public void add(@RequestBody CreateLanguageRequest createLanguageRequest){
        this.languageService.add(createLanguageRequest);
    }
    @DeleteMapping()
    public void delete(@RequestBody DeleteLanguageRequest deleteLanguageRequest){
        this.languageService.delete(deleteLanguageRequest);
    }
    @PostMapping()
    public void update(@RequestBody UpdateLanguageResponse updateLanguageResponse){
        this.languageService.update(updateLanguageResponse);
    }
}
