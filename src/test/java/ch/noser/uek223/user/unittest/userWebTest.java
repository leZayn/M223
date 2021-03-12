package ch.noser.uek223.user.unittest;


import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.product.ProductRepository;
import ch.noser.uek223.domain.purchase.PurchaseRepository;
import ch.noser.uek223.domain.role.Role;
import ch.noser.uek223.domain.role.RoleRepository;
import ch.noser.uek223.domain.user.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.yaml.snakeyaml.util.ArrayUtils;



import java.util.*;


@SpringBootTest
@AutoConfigureMockMvc
public class userWebTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Autowired
    private UserMapper userMapper;


    @Test
    @WithMockUser(username = "emily", password = "EA", roles = "")
    public void findById() throws Exception {

        given(userService.findById(UUID.fromString("f605d721-dea9-4f16-b6ce-4e93e8433c59"))).willReturn(new User(UUID.fromString("f605d721-dea9-4f16-b6ce-4e93e8433c59"),"ma@mail.com", "emily", "Admin", "EA", null , null, null));
        User user = userService.findById(UUID.fromString("f605d721-dea9-4f16-b6ce-4e93e8433c59")) ;

        mockMvc.perform(
                MockMvcRequestBuilders.get("/users/{id}", "f605d721-dea9-4f16-b6ce-4e93e8433c59")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(user.getId().toString()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value(user.getFirstName()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.surname").value(user.getSurname()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.roles").value(user.getRoles()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.products").value(user.getProducts()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.purchases").value(user.getPurchases()));

    }
//    @Test
//    public void givenEmployees_whenGetEmployees_thenStatus200()
//            throws Exception {
//
//        createTestEmployee("bob");
//
//        mockMvc.perform(get("/api/employees")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content()
//                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$[0].name", is("bob")));
//    }
}
