package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.min.js\" integrity=\"sha512-QSkVNOCYLtj73J4hbmVoOV6KVZuMluZlioC+trLpewV8qMjsWqlIQvkn1KGX2StWvPMdWGBqim1xlC8krl1EKQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.esm.js\" integrity=\"sha512-jUlTTDoq6IvZiinGFQetLcklithBTp8sVUkkUBEYQvYd3hwMuCTd59kAzVpJwvRTmZ2palO++nX+vKC+cK9lqg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.js\" integrity=\"sha512-Lii3WMtgA0C0qmmkdCpsG0Gjr6M0ajRyQRQSbTF6BsrVh/nhZdHpVZ76iMIPvQwz1eoXC3DmAg9K51qT5/dEVg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"width: 60%;height: 70%\">\n");
      out.write("            <!--<canvas id=\"myChart\" width=\"400\" height=\"400\"></canvas>-->\n");
      out.write("            <canvas id=\"myChart\" width=\"900\" height=\"700\"></canvas>\n");
      out.write("            <script>\n");
      out.write("//                let x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12;\n");
      out.write("//                x1=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.get(1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                const ctx = document.getElementById('myChart');\n");
      out.write("                const myChart = new Chart(ctx, {\n");
      out.write("                    type: 'bar',\n");
      out.write("                    data: {\n");
      out.write("                        labels: ['January', 'February', 'March', 'April', 'May', 'June','July','May','September','October','November','December'],\n");
      out.write("                        datasets: [{\n");
      out.write("                                label: '# of Votes',\n");
      out.write("                                data: [0, 0, 147690000, 0, 0, 0,0,0,0,0,0,0],\n");
      out.write("                                backgroundColor: [\n");
      out.write("                                    'rgba(255, 99, 132, 0.2)',\n");
      out.write("                                    'rgba(54, 162, 235, 0.2)',\n");
      out.write("                                    'rgba(255, 206, 86, 0.2)',\n");
      out.write("                                    'rgba(75, 192, 192, 0.2)',\n");
      out.write("                                    'rgba(153, 102, 255, 0.2)',\n");
      out.write("                                    'rgba(255, 159, 64, 0.2)'\n");
      out.write("                                ],\n");
      out.write("                                borderColor: [\n");
      out.write("                                    'rgba(255, 99, 132, 1)',\n");
      out.write("                                    'rgba(54, 162, 235, 1)',\n");
      out.write("                                    'rgba(255, 206, 86, 1)',\n");
      out.write("                                    'rgba(75, 192, 192, 1)',\n");
      out.write("                                    'rgba(153, 102, 255, 1)',\n");
      out.write("                                    'rgba(255, 159, 64, 1)'\n");
      out.write("                                ],\n");
      out.write("                                borderWidth: 1\n");
      out.write("                            }]\n");
      out.write("                    },\n");
      out.write("                    options: {\n");
      out.write("                        scales: {\n");
      out.write("                            y: {\n");
      out.write("                                beginAtZero: true\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("\n");
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
