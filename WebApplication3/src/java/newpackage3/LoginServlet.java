import newpackage3.dblogin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("uname");
        String pass = request.getParameter("pass");

        dblogin.insertUser(name, pass);

        PrintWriter out = response.getWriter();
        response.getWriter().println("<html><body>");
        out.println("Thank You!");
        response.getWriter().println("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
