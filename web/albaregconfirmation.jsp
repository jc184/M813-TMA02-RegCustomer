<%-- 
    Document   : albaregconfirmation
    Created on : 27-Jun-2017, 20:12:27
    Alba Airways application M813-TMA02-RegisterCustomer
    https://github.com/jc184/M813-TMA02-RegCustomer
    @author james chalmers Open University F6418079
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String customerId = request.getParameter("customerId");
    String title = request.getParameter("title");
    String firstName = request.getParameter("firstName");
    String surname = request.getParameter("surname");
    String mobileNo = request.getParameter("mobileNo");
    String homePhoneNumber = request.getParameter("homePhoneNumber");
    String emailAddress = request.getParameter("emailAddress");
    String loginName = request.getParameter("loginName");
    String loginPassword = request.getParameter("loginPassword");
    String dateOfBirth = request.getParameter("dateOfBirth");

    session.setAttribute("customerId", customerId);
    session.setAttribute("title", title);
    session.setAttribute("firstName", firstName);
    session.setAttribute("surname", surname);
    session.setAttribute("mobileNo", mobileNo);
    session.setAttribute("homePhoneNumber", homePhoneNumber);
    session.setAttribute("emailAddress", emailAddress);
    session.setAttribute("loginName", loginName);
    session.setAttribute("loginPassword", loginPassword);
    session.setAttribute("dateOfBirth", dateOfBirth);
%>

<html>
    <head>
        <title>AlbaAirways</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <link href="styles/messages.css" rel="stylesheet">
        <link rel="stylesheet" href="styles/datepickercontrol.css"/>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <!-- Custom styles for this template -->
        <link href="styles/jumbotron.css" rel="stylesheet">

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light rounded">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Disabled</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown01">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- UNCOMMENT HTML WITH THIS -->
        <main role="main">
            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">
                    <h1>AlbaAirways Flight Booking System</h1>
                    <!-- Example row of columns   <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p> --> 
                </div> 
            </div>
            <div class="container"><h2>Registration Confirmation</h2><br /><!-- ***ADDS THE REG TWICE IF PRESS REFRESH BUTTON*** -->
                <h3>Thankyou. Your details have been registered</h3>
                <h5>Your registration details are as follows:</h5>
                <p>Customer registration number is <%= request.getAttribute("customerId")%></p>
                <p>Title: <%= session.getAttribute("title")%></p>
                <p>Name: <%= session.getAttribute("firstName")%> <%= session.getAttribute("surname")%></p>
                <p>Mobile number is <%= session.getAttribute("mobileNo")%></p>
                <p>Home Phone number is <%= session.getAttribute("homePhoneNumber")%></p>
                <p>Email address <%= session.getAttribute("emailAddress")%></p>
                <p>Username is <%= session.getAttribute("loginName")%></p>
                <p>Password is <%= session.getAttribute("loginPassword")%></p>
                <p>Date of Birth is <%= session.getAttribute("dateOfBirth")%></p><br />
            </div>

    </body>
</html>
