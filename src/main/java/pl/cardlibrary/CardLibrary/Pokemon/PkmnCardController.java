package pl.cardlibrary.CardLibrary.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PkmnCardController {

    @Autowired
    PkmnCardRepository pkmnRepo;

    @GetMapping("/test")
    public int test() {
        return 1;
    }

    //Wszystkie karty
    @GetMapping("")
    public List<PkmnCard> getAll(){
        return pkmnRepo.getAll();
    }

    //Karty po numerze id
    @GetMapping("/{id}")
    public PkmnCard getID(@PathVariable("id")int id){
        return pkmnRepo.getID(id);
    }


    @PostMapping("")
    public int save(@RequestBody List<PkmnCard> Cards){
        return pkmnRepo.save(Cards);
    }
}