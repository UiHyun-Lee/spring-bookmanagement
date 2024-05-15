package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value="/")
    public String home() {

        return "index";

    }

    @RequestMapping(value="/index")
    public String index() {

        return "index";
    }
}
