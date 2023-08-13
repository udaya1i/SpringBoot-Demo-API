package crud.demo.Controller;

import crud.demo.Entity.Model;
import crud.demo.Servi.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    ServiceInterface service;
    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody Model model){
        this.service.createUser(model);
        return ResponseEntity.ok("User Created Sucessfully");
    }
    @GetMapping("/user/{id}")
    public Optional<Model> getUserById(@PathVariable Long id){
     return this.service.getUser(id);
    }
    @GetMapping("/get")
    public List<Model> getAllUser(){
        try{
            return this.service.getAllUser();
        }catch (Exception ex){
            System.out.println("error");
            return null;
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUserByUserId(@PathVariable Long id){
        try {
            this.service.deleteUserById(id);
            return ResponseEntity.ok("User Deleted Successfully");
        }catch (Exception ex){
            System.out.println("Error");
            return ResponseEntity.ok("error");
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody Model model){
            this.service.updateUser(id,model);
            return ResponseEntity.ok("User Update Successfully");
        }

}
