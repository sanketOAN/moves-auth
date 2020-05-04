package moves.loans.user.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import moves.loans.user.beans.UserProfile;

@Repository
public interface IUserProfileRepo extends MongoRepository<UserProfile, String> {

  UserProfile findByUserId(String id);

}
