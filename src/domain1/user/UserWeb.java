package ch.noser.uek223.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserWeb {

    private final UserService userService;

    @Autowired
    public UserWeb(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users/findAll")
    public ResponseEntity<List<Users>> findAllUsers(){
        return ResponseEntity.ok().body(userService.findAllUsers());
    }
}
