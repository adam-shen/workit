package Workit.demo.Repository;
import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import Workit.demo.Entity.Users;


@Repository
public interface UserRepository extends MongoRepository <Users, UUID>{
    
}
