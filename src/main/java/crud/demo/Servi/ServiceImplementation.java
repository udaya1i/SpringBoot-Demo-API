package crud.demo.Servi;

import crud.demo.Entity.Model;
import crud.demo.Repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImplementation implements ServiceInterface {
    @Autowired
    Repository repository;

    @Override
    public Model createUser(Model model) {
       return this.repository.save(model);
    }

    @Override
    public Optional<Model> getUser(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public List<Model> getAllUser() {
        return this.repository.findAll();
    }

    @Override
    public void deleteUserById(Long id ) {
        this.repository.deleteById(id);
    }

    @Override
    public Model updateUser(Long id, Model user) {
        Model user1 = this.repository.findById(id).get();
        user1.setAddress(user.getAddress());
        user1.setName(user.getName());
        this.repository.save(user1);
        return user1;
    }
}
