package moves.loans.user.service;

import moves.loans.user.dto.UserDto;

public interface IUserService {

  UserDto createUser(UserDto userDto);

  UserDto getUserByUsername(String username);
}
