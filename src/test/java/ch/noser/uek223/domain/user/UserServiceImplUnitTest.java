package ch.noser.uek223.domain.user.unitTest;

import ch.noser.uek223.domain.user.User;
import ch.noser.uek223.domain.user.UserRepository;
import ch.noser.uek223.domain.user.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceImplUnitTest {
    @Mock
    private UserRepository userRepository;

    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void save_saveNewUser_savedUser() {
        UUID uuid = UUID.randomUUID();
        String encryptedPassword = "bCryptEncryptedPassword";
        User user = new User();
        user.setFirstName("Test First Name").setLastName("Test Last Name").setEmail("Test Email").setPassword("Test Password");

        when(userRepository.findByEmail(anyString())).thenReturn(Optional.empty());
        when(bCryptPasswordEncoder.encode(anyString())).thenReturn(encryptedPassword);
        when(userRepository.saveAndFlush(any(User.class))).then((u -> ((User) u.getArgument(0)).setId(uuid)));

        User userActual = userService.save(user);
        user.setId(uuid).setPassword(encryptedPassword);

        assertEquals(user, userActual);
    }
}
