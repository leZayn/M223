package ch.noser.uek223.domain.user;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.UUID;

public interface UserService extends UserDetailsService {

    List<User> findAll();

    User findById(UUID id);

    User create(User user);
}
