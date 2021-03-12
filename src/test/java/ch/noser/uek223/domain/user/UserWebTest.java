package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.product.Product;
import ch.noser.uek223.domain.purchase.Purchase;
import ch.noser.uek223.domain.role.Role;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserWebTest {
    @InjectMocks
    private UserWeb userWeb;
    @Mock
    private UserServiceImpl userService;
    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Mock
    private UserRepository userRepository;
    @Autowired
    private MockMvc mvc;

    //@Test
    //public void findAll_requestAllUsers_returnsAllUsers() throws Exception {
    //    User user1 = new User(UUID.randomUUID(), "figo.gomez@gmail.com", "hetshgern123", "figo", "gomez", Set.of(new Role()), Set.of(new Product()), Set.of(new Purchase()));
    //    User user2 = new User(UUID.randomUUID(), "joni.3@gmail.com", "joniCaptImmer3", "joni", "ruben", Set.of(new Role()), Set.of(new Product()), Set.of(new Purchase()));
    //    List<User> listOfUsersToBeTestedAgainst = List.of(user1, user2);
//
    //    given(userWeb.findAll()).willReturn(listOfUsersToBeTestedAgainst);
    //    mvc.perform(
    //            MockMvcRequestBuilders.get("/users")
    //                    .accept(MediaType.APPLICATION_JSON))
    //            .andExpect(MockMvcResultMatchers.status().isOk())
    //            .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(2)))
    //            .andExpect(MockMvcResultMatchers.jsonPath("$[*].id").value(Matchers.containsInAnyOrder(user1.getId(),user2.getId())))
    //            .andExpect(MockMvcResultMatchers.jsonPath("$[*].firstName").value(Matchers.containsInAnyOrder(user1.getFirstName(), user2.getFirstName())))
    //            .andExpect(MockMvcResultMatchers.jsonPath("$[*].lastName").value(Matchers.containsInAnyOrder(user1.getLastName(), user2.getLastName())))
    //            .andExpect(MockMvcResultMatchers.jsonPath("$[*].email").value(Matchers.containsInAnyOrder(user1.getEmail(), user2.getEmail())))
    //            .andExpect(MockMvcResultMatchers.jsonPath("$[*].roles[*].name").value(Matchers.containsInAnyOrder(List.of(user1.getRoles().stream().map(Role::getName).toArray(), user2.getRoles().stream().map(Role::getName).toArray()))))
    //            .andExpect(MockMvcResultMatchers.jsonPath("$[*].roles[*].authorities[*].name").value(Matchers.containsInAnyOrder(List.of(user1.getRoles().stream().map(Role::getAuthorities).flatMap(Collection::stream).map(Authority::getName).toArray(), user2.getRoles().stream().map(Role::getAuthorities).flatMap(Collection::stream).map(Authority::getName).toArray()))));
    //    verify(userService, times(1)).findAll();
    //}
}
