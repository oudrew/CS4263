import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;
import java.util.Random;


@SuppressWarnings("serial")
public class main extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
        Random rand = new Random();
        int num = rand.nextInt(1000000);
    resp.setContentType("text/plain");
    resp.getWriter().println("{ \"name\": " + num + "}");
  }
}