package demo.catalogue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotoController {
    private final PhotoService photoService;

    public PhotoController(PhotoService photoService){
        this.photoService= photoService;
    }
    @GetMapping("/photosoverview")
    public String photosOverview(Model model){
        model.addAttribute("PhotosList",photoService.findAll());
        return "photosoverview";
    }

}
