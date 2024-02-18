package Workit.demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import Workit.demo.Entity.Users;

public interface UserService {
    

    public List <Users> getUsers();

    public Users addUser(Users user);

    public Users removeUser(UUID id);

    public Users updateUser(UUID id, Users newUser);

}
