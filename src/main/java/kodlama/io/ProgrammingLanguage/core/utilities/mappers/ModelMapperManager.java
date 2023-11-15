package kodlama.io.ProgrammingLanguage.core.utilities.mappers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Getter
@Setter
@Service
public class ModelMapperManager implements ModelMapperService {
    private ModelMapper modelMapper;

    // Modify the existing constructor to include initialization logic
    @Autowired
    public ModelMapperManager(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        configureModelMapper();
    }

    private void configureModelMapper() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);
    }

    @Override
    public ModelMapper forResponse() {
        return this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        return this.modelMapper;
    }
}
