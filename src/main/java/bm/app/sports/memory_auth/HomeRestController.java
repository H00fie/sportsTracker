package bm.app.sports.memory_auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class HomeRestController {

    @GetMapping("/admin")
    public String adminRolePlayground(){
        return "home";
    }
}
