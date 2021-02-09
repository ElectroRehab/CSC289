<%-- 
    Document   : register
    Created on : Feb 5, 2021, 11:37:43 PM
    Author     : miste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html style="height: 600px;width: 1200px;">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Attendance</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Andada">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,700">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400">
    <link rel="stylesheet" href="assets/css/dh-navbar-inverse.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="assets/css/sticky-dark-top-nav.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body style="background: rgb(34,34,34);width: 1200px;height: 600px;">
    <nav class="navbar navbar-light navbar-expand-md navbar-fixed-top navigation-clean-button" style="width: 1200px;height: 120px;padding: 0px;border-style: none;background: rgb(107,158,161);">
        <div class="container-fluid"><img style="background: url(&quot;assets/img/logo.jpg&quot;);background-size: contain;width: 135px;height: 86px;border-style: none;border-color: rgba(242,245,248,0);">
            <div class="collapse navbar-collapse" id="navcol-1" style="height: 85px;background: rgb(107,158,161);width: 1200px;">
                <ul class="nav navbar-nav nav-right">
                    <li class="nav-item"></li>
                </ul>
                <p class="navbar-text" style="color: rgba(0,0,0,0.75);font-family: Andada, serif;font-size: 24px;text-align: left;width: 500px;height: 35px;">&nbsp; &nbsp; &nbsp; &nbsp; REGISTER ACCOUNT BELOW</p>
                <p class="ml-auto navbar-text actions"> <a class="btn btn-light action-button" role="button" href="index.jsp" style="background: rgb(234,219,150);font-family: Andada, serif;">Log-In</a><a class="btn btn-light action-button" role="button" href="register.html" style="background: rgb(208,133,130);font-family: Andada, serif;">Sign Up</a></p>
            </div>
        </div>
    </nav>
    <p style="height: 60px;color: rgb(107,158,161);font-size: 34px;text-align: center;font-family: Andada, serif;padding: 5px;">Input your information to receive your ID Number.</p>
    <p style="height: 0px;color: rgb(107,158,161);font-size: 34px;text-align: center;font-family: Andada, serif;box-shadow: 0px 0px 8px 2px;padding: 0px;border-style: solid;"></p>
    <div class="form-group" style="width: 1200px;height: 50px;text-align: center;opacity: 1;padding: 15px;margin: 0px;">
        <label style="color: rgb(107,158,161);box-shadow: 0px 0px 15px 3px;border-style: none;text-shadow: 0px 0px 3px;font-size: 20px;text-align: left;width: 114px;font-family: Andada, serif;">First Name:&nbsp;</label>
        <input type="text" name="fname" style="border-style: none;box-shadow: 0px 0px 15px 2px rgb(107,158,161);text-align: left;width: 250px;height: 30px;padding: 0px;">
    </div>
    <div class="form-group" style="width: 1200px;height: 50px;text-align: center;opacity: 1;padding: 15px;margin: 0px;">
        <label style="color: rgb(107,158,161);box-shadow: 0px 0px 15px 3px rgb(107,158,161);border-style: none;text-shadow: 0px 0px 3px;font-size: 20px;text-align: left;width: 114px;font-family: Andada, serif;">Last Name:&nbsp;</label>
        <input type="text" name="lname" style="border-style: none;box-shadow: 0px 0px 15px 2px rgb(107,158,161);text-align: left;width: 250px;height: 30px;padding: 0px;">
    </div>
    <div class="form-group" style="width: 1200px;height: 50px;text-align: center;opacity: 1;padding: 15px;margin: 0px;">
        <label style="color: rgb(107,158,161);box-shadow: 0px 0px 15px 3px rgb(107,158,161);border-style: none;text-shadow: 0px 0px 3px;font-size: 20px;text-align: left;width: 114px;font-family: Andada, serif;">Phone:&nbsp;</label>
        <input type="text" name="phone" style="border-style: none;box-shadow: 0px 0px 15px 2px rgb(107,158,161);text-align: left;width: 250px;height: 30px;padding: 0px;">
    </div>
    <div class="form-group" style="width: 1200px;height: 50px;text-align: center;opacity: 1;padding: 15px;margin: 0px;">
        <label style="color: rgb(107,158,161);box-shadow: 0px 0px 15px 3px rgb(107,158,161);border-style: none;text-shadow: 0px 0px 3px;font-size: 20px;text-align: left;width: 114px;font-family: Andada, serif;">Email:&nbsp;</label>
        <input type="text" name="email" style="border-style: none;box-shadow: 0px 0px 15px 2px rgb(107,158,161);text-align: left;width: 250px;height: 30px;padding: 0px;">
    </div>
    <div class="form-group" style="width: 1200px;height: 50px;text-align: center;opacity: 1;padding: 15px;margin: 0px;">
        <label style="color: rgb(107,158,161);box-shadow: 0px 0px 15px 3px rgb(107,158,161);border-style: none;text-shadow: 0px 0px 3px;font-size: 20px;text-align: left;width: 114px;font-family: Andada, serif;">4-Digit PIN:&nbsp;</label>
        <input type="text" name="pin" style="border-style: none;box-shadow: 0px 0px 15px 2px rgb(107,158,161);text-align: left;width: 250px;height: 30px;padding: 0px;"></div>
    <div class="form-group" style="width: 1200px;height: 50px;opacity: 1;padding: 15px;margin: 0px;text-align: center;"><span style="margin: 0px;">Text</span>
        <div class="btn-group btn-group-toggle" data-toggle="buttons">
            <label class="btn btn-outline-primary active">Supervisor<br>
                <input type="radio" id="btnradio-1" name="job">
            </label>
            <label class="btn btn-outline-primary">Management
                <input type="radio" id="btnradio-2" name="job">
            </label>
                <label class="btn btn-outline-primary">Laborer
                    <input type="radio" id="btnradio-3" name="job">
                </label>
        </div>
    </div>
    <div class="form-group" style="width: 1200px;height: 50px;opacity: 1;padding: 15px;margin: 0px;text-align: left;">
        <span style="margin: 250px;">Text</span>
        <button class="btn btn-primary" role="button" type="submit" style="text-align: center;width: 138px;background: rgb(107,158,161);border-color: rgb(107,158,161);box-shadow: 0px 0px 15px 2px rgb(107,158,161);">Submit</button></div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>