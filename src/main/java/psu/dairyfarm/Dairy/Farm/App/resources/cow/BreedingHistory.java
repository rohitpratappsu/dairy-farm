package psu.dairyfarm.Dairy.Farm.App.resources.cow;

import lombok.Data;

import java.util.Date;

@Data
public class BreedingHistory {
    private Date inseminationDate;
    private String sire;
    private Date clavesBornDate;
}
