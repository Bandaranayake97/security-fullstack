package evanBeen.securityfullstack.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/long")

public class LongControler {

    @GetMapping("/Loan")
    public String getMyLoan (){
        return "fuck me if you can";
    }
}
