class Jobs {
  private String mTitle;
  private String mDescription;
  private Contact mInfo;

  public Jobs(String title, String description, Contact info) {
    mTitle = title;
    mDescription = description;
    mInfo = info;
  }

  public String getTitle() {
    return mTitle;
  }
  public String getDescription() {
    return mDescription;
  }
  public Contact getInfo() {
    return mInfo;
  }
}
