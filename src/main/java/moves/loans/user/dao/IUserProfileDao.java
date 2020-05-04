package moves.loans.user.dao;

import moves.loans.user.beans.UserProfile;

public interface IUserProfileDao {

	UserProfile getUserProfileByUserId(String userId);

}
