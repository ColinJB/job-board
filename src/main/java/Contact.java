class Contact {
  private String mName;
  private String mEmail;
  private String mNumber;

  public Contact(String name, String email, String number) {
    mName = name;
    mEmail = email;
    mNumber = number;
  }
  public String getName() {
    return mName;
  }
  public String getEmail() {
    return mEmail;
  }
  public String getNumber() {
    return mNumber;
  }
}
