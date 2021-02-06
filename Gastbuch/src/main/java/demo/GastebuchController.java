package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GastebuchController {

     private final GastbuchManagement gastbuchManagement;

     public GastebuchController(GastbuchManagement gastbuchManagement){
          this.gastbuchManagement = gastbuchManagement;
     }
     @GetMapping("/")
     public String index(){
          return "welcome";
     }


}
