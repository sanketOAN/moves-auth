package moves.loans.user.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import moves.loans.user.beans.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {

  User findByUsername(String username);


}
