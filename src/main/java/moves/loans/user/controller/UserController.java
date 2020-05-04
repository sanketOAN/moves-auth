package moves.loans.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import moves.loans.user.dto.UserDto;
import moves.loans.user.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  IUserService userService;

  @RequestMapping(value = "/create", method = RequestMethod.PUT)
  public UserDto create(@RequestBody UserDto userDto) {
    userDto = userService.createUser(userDto);
    return userDto;
  }

  @RequestMapping(value = "/getbyusername", method = RequestMethod.GET)
  public UserDto getUserByUsername(@RequestParam String username) {
    return userService.getUserByUsername(username);
  }
  
  @RequestMapping(value = "/getbyuserid", method = RequestMethod.GET)
  public UserDto getUserByUserId(@RequestParam String userId) {
    return userService.getUserProfileByUserId(userId);
  }

}
