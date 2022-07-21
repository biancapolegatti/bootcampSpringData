package br.dh.meli.spring01.controller;

import br.dh.meli.spring01.model.UserBD;
import br.dh.meli.spring01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*") // essa anotação é pra dizer que é pra aceitar requisições de qualquer lugar
@RequestMapping("/user")
public class UserDBController {

    @Autowired
    private UserService service;


    @GetMapping("/{id}")
    public ResponseEntity<UserBD> buscarPorId(@PathVariable long id) {
        UserBD userFound = service.getUserById(id);
        if (userFound != null) {
            return ResponseEntity.ok(userFound);


        }
        return ResponseEntity.notFound().build();


    }
}
