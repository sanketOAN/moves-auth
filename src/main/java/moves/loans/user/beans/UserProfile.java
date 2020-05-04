package moves.loans.user.beans;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserProfile")
public class UserProfile {

  private String id;
  private String userId;
  private String firstName;
  private String lastName;
  private UserAddress userAddress;


  public UserProfile(String id, String userId) {
    this.id = id;
    this.userId = userId;
  }

  public String getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public UserProfile setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public UserProfile setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public UserAddress getUserAddress() {
    return userAddress;
  }

  public UserProfile setUserAddress(UserAddress userAddress) {
    this.userAddress = userAddress;
    return this;
  }


}
