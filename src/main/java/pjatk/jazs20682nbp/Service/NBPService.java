package pjatk.jazs20682nbp.Service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pjatk.jazs20682nbp.Model.NBPModel;

import java.util.Date;

@Service
public class NBPService {
    private final RestTemplate restTemplate;

    public NBPService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NBPModel avgKurs(Date data_Od, Date data_Do){
        NBPModel forEntity = restTemplate.exchange("http://localhost:8080/nbp/avg/" + data_Od + data_Do, HttpMethod.GET, null, NBPModel.class).getBody();
        return forEntity;
    }
}
