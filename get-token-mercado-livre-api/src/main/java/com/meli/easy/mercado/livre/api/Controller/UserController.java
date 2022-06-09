package com.meli.easy.mercado.livre.api.Controller;


import com.meli.easy.mercado.livre.api.Entity.UserEntity;
import com.meli.easy.mercado.livre.api.repository.UserRepository;
import com.meli.easy.mercado.livre.api.service.UserServic;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//    @AllArgsConstructor

@AllArgsConstructor
@RestController
public class UserController {
        private UserServic userService;




//    private String code = "https://auth.mercadolivre.com.br/authorization?response_type=code&client_id=6979377820219331&redirect_uri=https://localhost:443/login";


        @GetMapping("/login")
    public String userLogin(@RequestParam String code){

            System.out.println(code);
            return code;
    }



}
