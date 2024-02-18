package Workit.demo.Service.Implementation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Workit.demo.Entity.Users;
import Workit.demo.Repository.UserRepository;
import Workit.demo.Service.UserService;

@Service
public class UserServiceImplementation implements UserService {

    private static List <Users> list = new ArrayList <> ();

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Users> getUsers() {

        return userRepository.findAll();
    }

    @Override
    public Users addUser(Users user) {

        return userRepository.save(user);
    }

    @Override
    public Users removeUser(UUID ID) {

        Users user = userRepository.findById(ID).get();
        userRepository.delete(user);
        return user;
    
    }

    @Override
    public Users updateUser(UUID ID, Users newUser) {

        
        Users userVar = userRepository.findById(ID).get();
        userVar.setName(newUser.getName());
        userVar.setAge(newUser.getAge());
        userVar.setFitnessGoals(newUser.getFitnessGoals());
        userVar.setGender(newUser.getGender());
        userVar.setHeight(newUser.getHeight());
        userVar.setWeight(newUser.getWeight());

        userRepository.save(userVar);
        return userVar;


    }

    
}
