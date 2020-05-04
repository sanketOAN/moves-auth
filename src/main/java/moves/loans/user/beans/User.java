package moves.loans.user.beans;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

  private String id;
  private String username;
  private String password;

  public User(String id, String password) {
    this.id = id;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public User setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getPassword() {
    return password;
  }


}
