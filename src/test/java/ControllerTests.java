import controller.PhoneController;
import model.Phone;
import model.PhoneForAdd;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import service.PhoneService;

import java.util.Collection;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = Main.class)

//@RunWith(SpringRunner.class)
@WebMvcTest(PhoneController.class)
public class ControllerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private PhoneService phoneService;
    @Test
    public void testExample() throws Exception {
        //given(this.phoneService.newPhoneWithAdd(phoneForAdd))
        //        .willReturn();
       // this.mvc.perform(get("/phones/phones.json").accept(MediaType.TEXT_PLAIN))
          //      .andExpect(status().isOk()).andExpect((ResultMatcher) content().string("f"));
    }

}