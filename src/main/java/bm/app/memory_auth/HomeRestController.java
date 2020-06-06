package bm.app.memory_auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeRestController {

    @GetMapping("/admin")
    public String adminRolePlayground(){
        return "home";
    }
}
