package evanBeen.securityfullstack.Controler;

import evanBeen.securityfullstack.model.User;
import evanBeen.securityfullstack.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/login")
@CrossOrigin
public class LoginControler {
    @Autowired
    private  PasswordEncoder passwordEncoder;
    @Autowired
    private  UserRepo userRepo;

    @PostMapping("/Register")
    public ResponseEntity<String> register(@RequestBody User user){
        ResponseEntity response = null;
        try{
            String hashpasword = passwordEncoder.encode(user.getPassword());
            user.setPassword(hashpasword);
            User saveuser = userRepo.save(user);
            if(user.getUserid()>0){
                response = ResponseEntity
                        .status(HttpStatus.CREATED).body("succses for registertion");
            }
        }catch (Exception e){
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("user did not save "+e.getMessage());


        }
        return response;

    }
}
