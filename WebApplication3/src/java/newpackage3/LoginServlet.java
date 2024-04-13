import java.io.FileOutputStream;
import newpackage3.dblogin;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("uname");
        String pass = request.getParameter("pass");
        Part file = request.getPart("img"); 
        
        String imgFileName = file.getSubmittedFileName();
        String uploadPath = "img/"+imgFileName;
//        "C:/Users/chith/OneDrive/Documents/2nd year/2nd/database_interaction_servlets/WebApplication3/web"

        
        try {
            
            FileOutputStream fos = new FileOutputStream(uploadPath);
            InputStream is = file.getInputStream();
            
            byte[] data = new byte[is.available()];
            is.read(data);
            fos.write(data);
            fos.close();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        dblogin.insertUser(name, pass, imgFileName);

        response.sendRedirect("form.html");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
