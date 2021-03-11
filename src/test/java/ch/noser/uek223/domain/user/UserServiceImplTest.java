package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.product.Product;
import ch.noser.uek223.domain.purchase.Purchase;
import ch.noser.uek223.domain.role.Role;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceImplUnitTest {
    @InjectMocks
    private UserServiceImpl userService;
    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Mock
    private UserRepository userRepository;

    @Test
    public void findById_provideUserId_returnsUserOfId(){
        User user1 = new User(UUID.randomUUID(), "figo.gomez@gmail.com", "hetshgern123", "figo", "gomez", Set.of(new Role()), Set.of(new Product()), Set.of(new Purchase()));

        when(userService.findById(UUID.randomUUID())).thenReturn(user1);
        assertEquals("figo", userService.findById(UUID.randomUUID()).getFirstName());
    }

}
