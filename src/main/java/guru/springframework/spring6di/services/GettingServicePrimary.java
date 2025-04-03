package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GettingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean!!!";
    }

}
