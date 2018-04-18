import controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.security.Principal;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
@ContextConfiguration(classes = {UserController.class})
public class UserTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetCurrentUser() throws Exception {
        Principal mockPrincipal = Mockito.mock(Principal.class);
        Mockito.when(mockPrincipal.getName()).thenReturn("me");

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/user")
                .principal(mockPrincipal)
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = result.getResponse();
        int status = response.getStatus();
        Principal testprincipal = UserController.user(mockPrincipal);
        assertNotNull(testprincipal);
        //Assert.assertEquals("response status is wrong", 200, status);
    }
}