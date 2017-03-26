import org.junit.*;
import static org.junit.Assert.*;

public class JobsTest {

  @Test
  public void Contact_instantiatesCorrectly_true() {
    Contact test = new Contact("", "", "");
    assertEquals(true, test instanceof Contact);
  }

  @Test
  public void Jobs_instantiatesCorrectly_true() {
    Contact test = new Contact("", "", "");
    Jobs testJob = new Jobs("", "", test);
    assertEquals(true, testJob instanceof Jobs);
  }

  @Test
  public void getName_returnsContactName_string() {
    Contact test = new Contact("colin", "", "");
    String expected = "colin";
    assertEquals(expected, test.getName());
  }

  @Test
  public void getEmail_returnsContactEmail_string() {
    Contact test = new Contact("colin", "colin@me.com", "");
    String expected = "colin@me.com";
    assertEquals(expected, test.getEmail());
  }

  @Test
  public void getNumber_returnsContactNumber_string() {
    Contact test = new Contact("colin", "colin@me.com", "678");
    String expected = "678";
    assertEquals(expected, test.getNumber());
  }

  @Test
  public void getTitle_returnsJobTitle_string() {
    Contact colin = new Contact("Colin", "Colinjbloom113@gmail.com", "678-446-9616");
    Jobs testJob = new Jobs("Project Manager", "Manages projects.", colin);
    String expected = "Project Manager";
    assertEquals(expected, testJob.getTitle());
  }

  @Test
  public void getDescription_returnsJobDescription_string() {
    Contact colin = new Contact("Colin", "Colinjbloom113@gmail.com", "678-446-9616");
    Jobs testJob = new Jobs("Project Manager", "Manages projects.", colin);
    String expected = "Manages projects.";
    assertEquals(expected, testJob.getDescription());
  }

  @Test
  public void getInfo_returnsJobInfo_Contact() {
    Contact colin = new Contact("Colin", "Colinjbloom113@gmail.com", "678-446-9616");
    Jobs testJob = new Jobs("Project Manager", "Manages projects.", colin);
    Contact expected = colin;
    assertEquals(expected, testJob.getInfo());
  }
}
