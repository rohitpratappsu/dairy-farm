package psu.dairyfarm.Dairy.Farm.App.resources.cow;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cows")
public class CowController {
    private final CowService cowService;

    public CowController(CowService cowService) {
        this.cowService = cowService;
    }

    @GetMapping("/")
    public List<Cow> getAllCows() {
        return cowService.getAllCows();
    }

    @GetMapping("/{uniqueId}")
    public Cow getCow(@PathVariable String uniqueId) {
        return this.cowService.findCowByUniqueId(uniqueId);
    }

    @PostMapping("/")
    public Cow insertCow(@RequestBody CowDTO cowDTO) {
        return this.cowService.addNewCow(cowDTO);
    }
}
