package psu.dairyfarm.Dairy.Farm.App.resources.cow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cows")
public class Cow {

    @Id
    private String uniqueId;
    private String pictureUrl;
    private Date dateOfBirth;
    private Date nextVaccinationDate;
    private Status status;
    private List<BreedingHistory> breedingHistory;
}
