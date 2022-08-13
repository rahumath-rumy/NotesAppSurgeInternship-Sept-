package Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import Model.User;

public interface UserRepo extends MongoRepository<User, Integer>{

//	 List<User> findByEmail(String email);
	
	 
//	 public void getUserbyEmail(String email) {
//         System.out.println("Getting item by name: " + email);
//         User item = UserRepo.getUserbyEmail(email);
//         System.out.println(getUserbyEmail(email));
//     }

}
