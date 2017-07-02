<%-- 
    Document   : albavalidation
    Created on : 27-Jun-2017, 20:11:48
    Author     : james
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div class="box"><h3>Sorry, but you entered your details incorrectly.</h3><br />
        <p>Click on the Back button in your browser and re-enter your details.</p><br />
        <table>
            <tr>
                <td>
                    <!-- UNCOMMENT HTML WITH THIS -->
                <td><p>Back to previous page</p></td>
                <td><input type="button" value="back" onclick="location.href = document.referrer; return false;" style="width:75px" /></td>
                </td>
            </tr>
        </table>
    </div>
</html>
