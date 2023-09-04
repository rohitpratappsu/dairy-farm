package psu.dairyfarm.Dairy.Farm.App.resources.cow;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CowRepository extends MongoRepository<Cow, String> {

    Cow findCowByUniqueId(String uniqueId);
}
