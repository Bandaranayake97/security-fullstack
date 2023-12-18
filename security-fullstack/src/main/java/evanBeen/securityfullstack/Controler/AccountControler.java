package evanBeen.securityfullstack.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/account")

public class AccountControler {

    @GetMapping("/myaccount")
    public String home(){
        return "fuck me if you can";
    }

}
