import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/costs", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      double width = Double.parseDouble(request.queryParams("width"));
      double height = Double.parseDouble(request.queryParams("height"));
      double depth = Double.parseDouble(request.queryParams("depth"));
      double weight = Double.parseDouble(request.queryParams("weight"));
      Parcel myParcel = new Parcel(width, height, depth, weight);
      model.put("myParcel", myParcel);
      model.put("template", "templates/costs.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
