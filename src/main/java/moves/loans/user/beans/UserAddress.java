package moves.loans.user.beans;

public class UserAddress {

  private String addressLine1;
  private String addressLine2;
  private String unitNumber;
  private String city;
  private String province;
  private String country;
  private String postalCode;

  public String getAddressLine1() {
    return addressLine1;
  }

  public UserAddress setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public UserAddress setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  public String getUnitNumber() {
    return unitNumber;
  }

  public UserAddress setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

  public String getCity() {
    return city;
  }

  public UserAddress setCity(String city) {
    this.city = city;
    return this;
  }

  public String getProvince() {
    return province;
  }

  public UserAddress setProvince(String province) {
    this.province = province;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public UserAddress setCountry(String country) {
    this.country = country;
    return this;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public UserAddress setPostalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }


}
