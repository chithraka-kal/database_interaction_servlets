import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import newpackage3.dblogin;

@WebServlet(name = "PrefectServlet", urlPatterns = {"/PrefectServlet"})
public class PrefectServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String action = request.getParameter("action");

        if ("remove".equals(action)) {
            // Remove data from prefect table
            dblogin.removePrefect(username, password);
            // Redirect back to prefect.jsp
            response.sendRedirect("prefect.jsp");
        } else {
            // Redirect back to student.jsp
            response.sendRedirect("student.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
