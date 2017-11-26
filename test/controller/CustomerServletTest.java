/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 *
 * @author james
 */
public class CustomerServletTest {
    private CustomerServlet servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    
    public CustomerServletTest() {
    }
    
    @Before
    public void setUp() throws ServletException {
        servlet = new CustomerServlet();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
        servlet.init(servlet);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class CustomerServlet.
     * @throws java.lang.Exception
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        //servlet = new CustomerServlet();
        servlet.init();
        assertEquals(request, this);
    }

    /**
     * Test of processRequest method, of class CustomerServlet.
     * @throws java.lang.Exception
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
//        request = null;
//        response = null;
        request.addParameter("title", "mr");
        request.addParameter("firstName", "james");
        request.addParameter("surname", "chalmers");
        request.addParameter("mobileNo", "07552605450");
        request.addParameter("homePhoneNumber", "01343547869");
        request.addParameter("emailAddress", "james.chalmers184@gmail.com");
        request.addParameter("loginName", "jc184");
        request.addParameter("loginPassword", "password");
        request.addParameter("dateOfBirth", "1966-04-03");
        System.out.println(request);
        servlet.processRequest(request, response);
    }

    /**
     * Test of doGet method, of class CustomerServlet.
     * @throws java.lang.Exception
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        request = null;
        response = null;
        //servlet = new CustomerServlet();
        servlet.doGet(request, response);
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class CustomerServlet.
     * @throws java.lang.Exception
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        request = null;
        response = null;
        //servlet = new CustomerServlet();
        servlet.doPost(request, response);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class CustomerServlet.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        //servlet = new CustomerServlet();
        String expResult = "Short description";
        String result = servlet.getServletInfo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
