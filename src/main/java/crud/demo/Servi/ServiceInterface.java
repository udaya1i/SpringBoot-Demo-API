package crud.demo.Servi;

import crud.demo.Entity.Model;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ServiceInterface {
    public Model createUser(Model model);
    public Optional<Model> getUser(Long id);
    public List<Model> getAllUser();
    public void deleteUserById(Long id);
    public Model updateUser( Long id, Model user);

}
