package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.user.dto.UserDTOSupplierDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@RestController
//@RequestMapping("/users")
public class UserWeb {

    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserWeb(UserService userService, UserMapper userMapper){

        this.userService = userService;
        this.userMapper = userMapper;
    }

//    @GetMapping({"/", ""})
//    public ResponseEntity<Collection<User>> findAll(){
//        return ResponseEntity.ok().body(userService.findAll());
//    }

    @PostMapping
    public ResponseEntity<UserDTOSupplierDetail> create(@RequestBody UserDTOSupplierDetail userDTOSupplierDetail){
        return new ResponseEntity<UserDTOSupplierDetail>(userMapper.toDTO(userService.create(userMapper.userDTOTOUser(userDTOSupplierDetail))), HttpStatus.CREATED) ;
    }

        @GetMapping("/users/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(userService.findById(UUID.fromString("f605d721-dea9-4f16-b6ce-4e93e8433c59")));
    }

}
