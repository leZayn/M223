package ch.noser.uek223.user.unittest;

import ch.noser.uek223.domain.product.ProductRepository;
import ch.noser.uek223.domain.product.ProductService;
import ch.noser.uek223.domain.purchase.Purchase;
import ch.noser.uek223.domain.purchase.PurchaseRepository;
import ch.noser.uek223.domain.role.RoleRepository;
import ch.noser.uek223.domain.user.User;
import ch.noser.uek223.domain.user.UserRepository;
import ch.noser.uek223.domain.user.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.*;

import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class userServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Mock
    private UserRepository userRepository;


    @Test
    public void findById()
    {
            when(userRepository.findById(UUID.fromString("f605d721-dea9-4f16-b6ce-4e93e8433c59"))).thenReturn(Optional.of(new User(UUID.fromString("f605d721-dea9-4f16-b6ce-4e93e8433c59"),"ma@mail.com", "emily", "Admin", "EA", null, null,  null)));

            User user = userService.findById(UUID.fromString("f605d721-dea9-4f16-b6ce-4e93e8433c59")) ;

           Assertions.assertEquals(("ma@mail.com"), user.getEmail());
        Assertions.assertEquals(("emily"), user.getFirstName());
        Assertions.assertEquals(("Admin"), user.getSurname());
        Assertions.assertEquals(("EA"), user.getPassword());
        Assertions.assertEquals((null), user.getRoles());
        Assertions.assertEquals((null), user.getProducts());
        Assertions.assertEquals((null), user.getPurchases());



    }
    }
