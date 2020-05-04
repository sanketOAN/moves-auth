package moves.loans.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import moves.loans.user.beans.UserProfile;
import moves.loans.user.dao.IUserProfileDao;

@Repository
public class UserProfileDaoImpl implements IUserProfileDao {

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public UserProfile getUserProfileByUserId(String userId) {
		Query query = new Query();
		Criteria userIdCriteria = Criteria.where("userId").is(userId);
		query.addCriteria(userIdCriteria);
		List<UserProfile> userProfiles = mongoTemplate.find(query, UserProfile.class);
		if(userProfiles != null && userProfiles.size()>0)
			return userProfiles.get(0);
		return null;
	}
}
