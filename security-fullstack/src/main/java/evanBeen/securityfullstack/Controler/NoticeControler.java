package evanBeen.securityfullstack.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notice")
public class NoticeControler {

    @GetMapping("/notice")
    public String getMyNotice(){
        return "fuck me if yo u can";
    }
}
