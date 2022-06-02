/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Brand;
import model.Category;
import model.Product;
import model.Status;

/**
 *
 * @author hophu
 */
public class AddServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("addproduct.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AdminDAO ad = new AdminDAO();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String url = request.getParameter("url");
        String info = request.getParameter("info");
        String status = request.getParameter("status");
        String quantity = request.getParameter("quantity");
        String create = request.getParameter("createDay");
        String update = request.getParameter("updateDay");
        String cid = request.getParameter("cid");
        String bid = request.getParameter("bid");
        boolean check = ad.existedCat(id);
        int status1=0, cid1=0, bid1=0,quantity1=0;
        double price1=0.0;

        if (check) {
            String er = id + " existed!!!";
            request.setAttribute("error", er);
            request.getRequestDispatcher("addproduct.jsp").
                    forward(request, response);
        } else {
            try {
                quantity1=Integer.parseInt(quantity);
                price1 = Double.parseDouble(price);
                status1 = Integer.parseInt(status);
                cid1 = Integer.parseInt(cid);
                bid1 = Integer.parseInt(bid);
            } catch (NumberFormatException e) {
            }
            Status s = new Status(status1, "");
            Category c = new Category(cid1, "");
            Brand b= new Brand(bid1, "");
            Product p = new Product(id, name, price1, url, info, s,quantity1, create, update, c, b);
            ad.insert(p);
            response.sendRedirect("manage");
//request.getRequestDispatcher("manage").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
