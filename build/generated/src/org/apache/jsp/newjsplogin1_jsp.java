package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsplogin1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css?family=Montserrat:400,800');\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background: #f6f5f7;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("                height: 100vh;\n");
      out.write("                margin: -20px 0 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2 {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p {\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 100;\n");
      out.write("                line-height: 20px;\n");
      out.write("                letter-spacing: 0.5px;\n");
      out.write("                margin: 20px 0 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            span {\n");
      out.write("                font-size: 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                color: #333;\n");
      out.write("                font-size: 14px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 15px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                border-radius: 20px;\n");
      out.write("                border: 1px solid #FF4B2B;\n");
      out.write("                background-color: #FF4B2B;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("                font-size: 12px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding: 12px 45px;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                transition: transform 80ms ease-in;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:active {\n");
      out.write("                transform: scale(0.95);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:focus {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button.ghost {\n");
      out.write("                background-color: transparent;\n");
      out.write("                border-color: #FFFFFF;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                background-color: #FFFFFF;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                padding: 0 50px;\n");
      out.write("                height: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input {\n");
      out.write("                background-color: #eee;\n");
      out.write("                border: none;\n");
      out.write("                padding: 12px 15px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0 14px 28px rgba(0,0,0,0.25), \n");
      out.write("                    0 10px 10px rgba(0,0,0,0.22);\n");
      out.write("                position: relative;\n");
      out.write("                overflow: hidden;\n");
      out.write("                width: 768px;\n");
      out.write("                max-width: 100%;\n");
      out.write("                min-height: 750px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-container {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                height: 100%;\n");
      out.write("                transition: all 0.6s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sign-in-container {\n");
      out.write("                left: 0;\n");
      out.write("                width: 50%;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .sign-in-container {\n");
      out.write("                transform: translateX(100%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sign-up-container {\n");
      out.write("                left: 0;\n");
      out.write("                width: 50%;\n");
      out.write("                opacity: 0;\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .sign-up-container {\n");
      out.write("                transform: translateX(100%);\n");
      out.write("                opacity: 1;\n");
      out.write("                z-index: 5;\n");
      out.write("                animation: show 0.6s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes show {\n");
      out.write("                0%, 49.99% {\n");
      out.write("                    opacity: 0;\n");
      out.write("                    z-index: 1;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                50%, 100% {\n");
      out.write("                    opacity: 1;\n");
      out.write("                    z-index: 5;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay-container {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 50%;\n");
      out.write("                width: 50%;\n");
      out.write("                height: 100%;\n");
      out.write("                overflow: hidden;\n");
      out.write("                transition: transform 0.6s ease-in-out;\n");
      out.write("                z-index: 100;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .overlay-container{\n");
      out.write("                transform: translateX(-100%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("/*            .overlay {\n");
      out.write("                background: #FF416C;\n");
      out.write("                background: -webkit-linear-gradient(to right, #FF4B2B, #FF416C);\n");
      out.write("                background: linear-gradient(to right, #FF4B2B, #FF416C);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: 0 0;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("                position: relative;\n");
      out.write("                left: -100%;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 200%;\n");
      out.write("                transform: translateX(0);\n");
      out.write("                transition: transform 0.6s ease-in-out;\n");
      out.write("            }*/\n");
      out.write("\n");
      out.write("            .container.right-panel-active .overlay {\n");
      out.write("                transform: translateX(50%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay-panel {\n");
      out.write("                position: absolute;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                padding: 0 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                top: 0;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 50%;\n");
      out.write("                transform: translateX(0);\n");
      out.write("                transition: transform 0.6s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay-left {\n");
      out.write("                transform: translateX(-20%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .overlay-left {\n");
      out.write("                transform: translateX(0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay-right {\n");
      out.write("                right: 0;\n");
      out.write("                transform: translateX(0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .overlay-right {\n");
      out.write("                transform: translateX(20%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .social-container {\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .social-container a {\n");
      out.write("                border: 1px solid #DDDDDD;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                display: inline-flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                margin: 0 5px;\n");
      out.write("                height: 40px;\n");
      out.write("                width: 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer {\n");
      out.write("                background-color: #222;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 14px;\n");
      out.write("                bottom: 0;\n");
      out.write("                position: fixed;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("                text-align: center;\n");
      out.write("                z-index: 999;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer p {\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer i {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer a {\n");
      out.write("                color: #3c97bf;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" id=\"container\">\n");
      out.write("            <div class=\"form-container sign-up-container\">\n");
      out.write("                <form action=\"#\">\n");
      out.write("                    <h1>Create Account</h1>\n");
      out.write("<!--                    <div class=\"social-container\">\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    </div>-->\n");
      out.write("                    <span>or use your email for registration</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"Account Name\" value=\"id\"/>\n");
      out.write("                    <input type=\"text\" placeholder=\"First Name\" value=\"fname\"/>\n");
      out.write("                    <input type=\"text\" placeholder=\"Middle Name\" value=\"mname\"/>\n");
      out.write("                    <input type=\"text\" placeholder=\"Last Name\" value=\"lname\"/>\n");
      out.write("                    <input type=\"text\" placeholder=\"username\" value=\"user\"/>\n");
      out.write("                    <input type=\"number\" placeholder=\"Mobile Phone\" value=\"phone\"/>\n");
      out.write("                    <input type=\"email\" placeholder=\"Email\" value=\"email\" />\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" value=\"pass\"/>\n");
      out.write("                    <button>Sign Up</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-container sign-in-container\">\n");
      out.write("                <form action=\"login\" method=\"post\">\n");
      out.write("                    <h1>Sign in</h1>\n");
      out.write("<!--                    <div class=\"social-container\">\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    </div>-->\n");
      out.write("                    <span>or use your account</span>\n");
      out.write("                    <input type=\"email\" placeholder=\"Name Account\" value=\"user1\" />\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" value=\"pass1\"/>\n");
      out.write("                    <a href=\"#\">Forgot your password?</a>\n");
      out.write("                    <button>Sign In</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"overlay-container\">\n");
      out.write("                <div class=\"overlay\">\n");
      out.write("                    <div class=\"overlay-panel overlay-left\">\n");
      out.write("                        <h1>Welcome Back!</h1>\n");
      out.write("                        <p>To keep connected with us please login with your personal info</p>\n");
      out.write("                        <button class=\"ghost\" id=\"signIn\">Sign In</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"overlay-panel overlay-right\">\n");
      out.write("                        <h1>Hello, Friend!</h1>\n");
      out.write("                        <p>Enter your personal details and start journey with us</p>\n");
      out.write("                        <button class=\"ghost\" id=\"signUp\">Sign Up</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
