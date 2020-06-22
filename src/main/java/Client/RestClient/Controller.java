package Client.RestClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/clinic")
public class Controller {

    @GetMapping("/data")
    public List<Object> getPatients(){
        String url = "http://localhost:8081/hospital/patients";
        RestTemplate restTemplate = new RestTemplate();

        Object[] objects = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(objects);
    }
}
