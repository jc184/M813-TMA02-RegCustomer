/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;
import javax.servlet.ServletConfig;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class MockServletTest {
    private CustomerServlet servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() {
        servlet = (CustomerServlet) new CustomerServlet().getServletConfig();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }

    @Test
    public void correctDetailsInRequest() throws ServletException, IOException, ParseException {
       
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
        System.out.println(response);
        servlet.processRequest(request, response);
        

       

        // ... etc
    }
}
