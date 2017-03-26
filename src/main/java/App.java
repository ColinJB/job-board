import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("jobs", request.session().attribute("jobs"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/jobs", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      ArrayList<Jobs> jobs = request.session().attribute("jobs");
      if (jobs == null) {
        jobs = new ArrayList<Jobs>();
        request.session().attribute("jobs", jobs);
      }
      String title = request.queryParams("jobTitle");
      String description = request.queryParams("jobDescription");

      Contact newContact = new Contact(request.queryParams("contactName"), request.queryParams("contactEmail"), request.queryParams("contactNumber"));

      Jobs newJob = new Jobs(title, description, newContact);
      jobs.add(newJob);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
