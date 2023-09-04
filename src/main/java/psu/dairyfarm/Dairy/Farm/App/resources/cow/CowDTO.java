package psu.dairyfarm.Dairy.Farm.App.resources.cow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CowDTO {

    private String uniqueId;
    private Date dateOfBirth;
    private String pictureUrl;
    private Date nextVaccinationDate;
    private Status status;
}
