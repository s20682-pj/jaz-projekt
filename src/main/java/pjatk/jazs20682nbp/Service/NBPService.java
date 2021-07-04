package pjatk.jazs20682nbp.Service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pjatk.jazs20682nbp.Exception.GlobalExceptionHandler;
import pjatk.jazs20682nbp.Model.NBPModel;

import java.util.Date;

@Service
public class NBPService {
    private final RestTemplate restTemplate;

    public NBPService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NBPModel avgKurs(Date data_Od, Date data_Do) throws GlobalExceptionHandler {
        NBPModel forEntity = restTemplate.getForEntity("http://api.nbp.pl/api/cenyzlota/" + data_Od + "/" + data_Do, NBPModel.class).getBody();
        return forEntity;
    }
}
