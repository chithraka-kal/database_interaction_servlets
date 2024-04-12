package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import newpackage3.dblogin;
import newpackage3.User;

public final class students_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Students</title>\n");
      out.write("    <style>\n");
      out.write("        .user {\n");
      out.write("            width: 25%;\n");
      out.write("            float: left;\n");
      out.write("            padding: 10px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .user img {\n");
      out.write("            width: 100px;\n");
      out.write("            height: 100px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Student Details</h1>\n");
      out.write("    <div class=\"max-container\">\n");
      out.write("    ");
 
    List<User> userList = dblogin.getAllUsers();
    for (User user : userList) {
    
      out.write("\n");
      out.write("    <div class=\"user\">\n");
      out.write("        <img src=\"user.jpg\" alt=\"User Image\">\n");
      out.write("        <div>User Name: ");
      out.print( user.getUname() );
      out.write("</div>\n");
      out.write("        <div>Password: ");
      out.print( user.getPasswd() );
      out.write("</div>\n");
      out.write("        <form action=\"PrefectServlet\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"uname\" value=\"");
      out.print( user.getUname() );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"passwd\" value=\"");
      out.print( user.getPasswd() );
      out.write("\">\n");
      out.write("            <button class=\"button\" type=\"submit\">Prefect</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    <div style=\"clear: both;\"></div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
