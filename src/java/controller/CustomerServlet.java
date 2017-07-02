/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CustomerManager;

/**
 *
 * @author james
 */
@WebServlet(name = "CustomerServlet", urlPatterns = {"/CustomerServlet"})
public class CustomerServlet extends HttpServlet {

    CustomerManager customerManager;

    @Override
    public void init() throws ServletException {
        customerManager = new CustomerManager();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.text.ParseException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        String url = "/registercustomer.jsp";
        Date sdfDateOfBirth = null;

        String submit = request.getParameter("submit");
        if (submit != null && submit.length() > 0) {
            if (submit.equals("add")) {
                String title = request.getParameter("title");
                String firstName = request.getParameter("firstName");
                String surname = request.getParameter("surname");
                String mobileNo = request.getParameter("mobileNo");
                String homePhoneNumber = request.getParameter("homePhoneNumber");
                String emailAddress = request.getParameter("emailAddress");
                String loginName = request.getParameter("loginName");
                String loginPassword = request.getParameter("loginPassword");
                String dateOfBirth = request.getParameter("dateOfBirth");
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                sdfDateOfBirth = formatter.parse(dateOfBirth);
                String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
                if (title.equalsIgnoreCase("") || firstName.equalsIgnoreCase("") || surname.equalsIgnoreCase("") || mobileNo.equalsIgnoreCase("") || homePhoneNumber.equalsIgnoreCase("") || emailAddress.equalsIgnoreCase("") || !emailAddress.matches(regex) || loginName.equalsIgnoreCase("") || loginPassword.equalsIgnoreCase("") || dateOfBirth.equalsIgnoreCase("")) {
                    url = "/albavalidation.jsp";
                } else {
                    customerManager.addCustomer(title, firstName, surname, mobileNo, homePhoneNumber, emailAddress, loginName, loginPassword, sdfDateOfBirth);
                    int customerId = customerManager.getCustomerIdByAdd(loginName, loginPassword);
                    request.setAttribute("customerId", customerId);
                    url = "/albaregconfirmation.jsp";
                }
            }
        }
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
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
