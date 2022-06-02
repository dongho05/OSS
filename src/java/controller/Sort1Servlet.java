/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Brand;
import model.Category;
import model.Product;

/**
 *
 * @author hophu
 */
public class Sort1Servlet extends HttpServlet {

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
            out.println("<title>Servlet Sort1Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Sort1Servlet at " + request.getContextPath() + "</h1>");
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
       DAO d = new DAO();
       List<Product> list = d.getAll();
       Collections.sort(list, new Comparator<Product>() {
           @Override
           public int compare(Product o1, Product o2) {
               return -(int)o1.getPrice()+(int)o2.getPrice();
           }
        });
//       String id_raw = request.getParameter("id");
//       int id=0;
//        try {
//            id=Integer.parseInt(id_raw);
//        } catch (NumberFormatException e) {
//        }
//       if(id==1){
//           list=d.searchByPrice(500000.0, 1500000.0);
//       }else if(id==2){
//           list=d.searchByPrice(1500000.0, 3000000.0);
//       }else{
//           list=d.searchByPrice(3000000.0, 10000000.0);
//       }
       
       request.setAttribute("data", list);
       List<Category> listCate = d.getAllCate();
        request.setAttribute("cate", listCate);
        List<Brand> listBrand = d.getAllBrand();
        request.setAttribute("brand", listBrand);
       request.getRequestDispatcher("home.jsp").forward(request, response);
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
        processRequest(request, response);
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
