package winzinger.samples.dockerspringboot.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/api/v1")
public class AccountController {
    @Value("${some.config.item}")
    String name = "dummy";

    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
    public String ping() {
        return "pong";
    }

    // curl localhost:8080/api/v1/config
    @RequestMapping(value = "/config", method = RequestMethod.GET, produces = "application/json")
    public String dumpConfig() {
        return name;
    }

    @RequestMapping(value = "/account", method = RequestMethod.GET, produces = "application/json")
    public Account getAccount() {
        return new Account(1, 17);
    }
}
