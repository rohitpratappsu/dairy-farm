package psu.dairyfarm.Dairy.Farm.App.resources.cow;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import psu.dairyfarm.Dairy.Farm.App.resources.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class CowService {

    private final CowRepository cowRepository;
    private final ModelMapper modelMapper;

    public CowService(final CowRepository cowRepository, ModelMapper modelMapper) {
        this.cowRepository = cowRepository;
        this.modelMapper = modelMapper;
    }

    public List<Cow> getAllCows() {
        return this.cowRepository.findAll();
    }

    public Cow findCowByUniqueId(String uniqueId) {
        Cow cow = this.cowRepository.findCowByUniqueId(uniqueId);
        return Optional.ofNullable(cow).orElseThrow(() -> {
            String errorMessage = String.format("Cow doesn't existing having uniqueId %s", uniqueId);
            return new ResourceNotFoundException(errorMessage);
        });
    }

    public Cow addNewCow(CowDTO cowDTO) {
        Cow cow = modelMapper.map(cowDTO, Cow.class);
        return this.cowRepository.insert(cow);
    }
}
