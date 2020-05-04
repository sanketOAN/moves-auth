package moves.loans.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import moves.loans.user.beans.User;
import moves.loans.user.beans.UserAddress;
import moves.loans.user.beans.UserProfile;
import moves.loans.user.dao.IUserProfileRepo;
import moves.loans.user.dao.IUserRepository;
import moves.loans.user.dao.IUserProfileDao;
import moves.loans.user.dto.UserDto;
import moves.loans.user.service.IUserService;
import moves.loans.utils.IUniqueIdGenerator;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUniqueIdGenerator idGenerator;

	@Autowired
	private IUserRepository userRepo;

	@Autowired
	private IUserProfileRepo userProfileRepo;

	@Autowired
	private IUserProfileDao userProfileDao;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = new User(idGenerator.generateNextUniqueId(), userDto.getPassword());
		user.setUsername(userDto.getUsername());

		UserAddress userAddress = new UserAddress().setAddressLine1(userDto.getAddressLine1())
				.setAddressLine2(userDto.getAddressLine2()).setCity(userDto.getCity())
				.setProvince(userDto.getProvince()).setCountry(userDto.getCountry());

		UserProfile userProfile = new UserProfile(idGenerator.generateNextUniqueId(), user.getId())
				.setFirstName(userDto.getFirstName()).setLastName(userDto.getLastName()).setUserAddress(userAddress);

		User savedUser = userRepo.save(user);
		UserProfile savedUserProfile = userProfileRepo.save(userProfile);

		return userDto.setUserId(user.getId());
	}

	@Override
	public UserDto getUserByUsername(String username) {
		User user = userRepo.findByUsername(username);
		UserProfile userProfile = userProfileRepo.findByUserId(user.getId());
		UserDto userDto = new UserDto();
		userDto.setUserId(user.getId());
		userDto.setUsername(user.getUsername());
		userDto.setAddressLine1(userProfile.getUserAddress().getAddressLine1());

		return userDto;
	}

	@Override
	public UserDto getUserProfileByUserId(String userId) {
	  UserProfile userProfile = userProfileDao.getUserProfileByUserId(userId);
	  UserDto userDto = new UserDto();
	    userDto.setUserId(userProfile.getUserId());
	    userDto.setAddressLine1(userProfile.getUserAddress().getAddressLine1());
	    return userDto;
  }
}
