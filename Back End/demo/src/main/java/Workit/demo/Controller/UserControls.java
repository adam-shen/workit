package Workit.demo.Controller;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Workit.demo.Entity.Users;
import Workit.demo.Service.UserService;

@RestController
@RequestMapping ("/api/products")
public class UserControls {
    
    @Autowired
    private UserService userServices;

    @GetMapping("/all")
    public List <Users> getUsers() {

       return userServices.getUsers();
    }


    @PostMapping("/insert")
    public Users insert(@RequestBody Users user) {

       return userServices.addUser(user);
    }

    @PutMapping("/update/{id}")
    public Users update(@PathVariable UUID ID, @RequestBody Users user) {

        return userServices.updateUser(ID, user);
    }

    @DeleteMapping("/delete/{id}")
    public Users delete(@PathVariable UUID id) {

        return userServices.removeUser(id);
    }
}
