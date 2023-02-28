package dk.spisop.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/om-os")
    public String omOs() {return "omOs";}

    @GetMapping("/kontakt")
    public String kontakt() {return "kontakt";}

    @GetMapping("/tilmeld")
    public String tilmeld() {return "tilmeld";}

    @GetMapping("/madspild-i-danmark")
    public String madspildIDanmark() {return "madspild-i-danmark";}

}
