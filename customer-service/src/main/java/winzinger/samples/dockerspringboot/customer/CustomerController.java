package winzinger.samples.dockerspringboot.customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/api/v1")
public class CustomerController {
    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
    public String ping() {
        return "pong";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET, produces = "application/json")
    public Customer getCustomer() {
        return new Customer(1, "John", "Doe", LocalDate.of(1973, 7, 18));
    }
}
