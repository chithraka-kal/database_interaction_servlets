import newpackage3.dblogin;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
        } else {
            // Insert data into prefect table
            String uname = request.getParameter("uname");
            String passwd = request.getParameter("passwd");
            dblogin.insertPrefect(uname, passwd);
            // Redirect back to students.jsp
            response.sendRedirect("students.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
