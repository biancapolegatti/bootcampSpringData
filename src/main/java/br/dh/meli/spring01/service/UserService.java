package br.dh.meli.spring01.service;


import br.dh.meli.spring01.model.UserBD;
import br.dh.meli.spring01.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepo repo;

    public UserBD getUserById(long id) {
        return (UserBD) repo.findById(id).orElse(null);

    }
}
