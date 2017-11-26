<%-- 
    Document   : RegisterCustomer
    Created on : 27-Jun-2017, 19:04:33
    Alba Airways application M813-TMA02-RegisterCustomer
    https://github.com/jc184/M813-TMA02-RegCustomer
    @author james chalmers Open University F6418079
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <div class="container">
                <!-- Example row of columns   <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p> --> 
                <h3>New Customer Registration</h3>
                <p>Enter your details in the form below and click 'add' to register</p>
                <form name="form" id="form" class="form" action="CustomerServlet" onsubmit="return validate(this)" method="POST">
                    <table class="form-group" cellspacing="8" border="0">
                        <!-- UNCOMMENT TO USE HTML BELOW -->
                        <tr>
                            <td align="left"><p><label for="title">Title:</label></p></td>
                            <td><input class="form-control" type="text" name="title" id="title" value="" placeholder="Enter title"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p><label for="firstName">Forename:</label></p></td>
                            <td><input class="form-control" type="text" name="firstName" id="firstName" value="" placeholder="Enter first name"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p><label for="surname">Surname:</label></p></td>
                            <td><input class="form-control" type="text" name="surname" id="surname" value="" placeholder="Enter surname"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p><label for="mobileNo">Mobile No:</label></p></td>
                            <td><input class="form-control" type="text" name="mobileNo" id="mobileNo" value="" placeholder="Enter mobile no"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p><label for="homePhoneNumber">Home Phone:</label></p></td>
                            <td><input class="form-control" type="text" name="homePhoneNumber" id="homePhoneNumber" value="" placeholder="Enter home phone no"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p><label for="emailAddress">Email:</label></p></td>
                            <td><input class="form-control" type="text" name="emailAddress" id="emailAddress" value="" placeholder="Enter email"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p><label for="loginName">Login name:</label></p></td>
                            <td><input class="form-control" type="text" name="loginName" id="loginName" value="" placeholder="Enter login name"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p><label for="loginPassword">Login password:</label></p></td>
                            <td><input class="form-control" type="password" name="loginPassword" id="loginPassword" value="" placeholder="Enter login password"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p><label for="dateOfBirth">Date of Birth:</label></p></td>
                            <td><input class="form-control" type="text" name="dateOfBirth" id="dateOfBirth" value="" datepicker="true" datepicker_format="YYYY-MM-DD" placeholder="Enter date of birth"/></td>
                        </tr>
                        <tr>
                            <td><p>Add new Customer</p></td>
                            <td><input type="submit" value="add" name="submit" class="submit" style="width:75px" /><br /></td>
                        </tr>
                    </table>
                </form>

            </div>

        </main>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <script type="text/javascript" src="scripts/datepickercontrol.js"></script>
        <script type="text/javascript" src="scripts/messages.js"></script>
    </body>
</html>
