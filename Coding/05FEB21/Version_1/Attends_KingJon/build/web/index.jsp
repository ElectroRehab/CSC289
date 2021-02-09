<%-- 
    Document   : index
    Created on : Feb 5, 2021, 11:33:13 PM
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
                <p class="navbar-text" style="color: rgba(0,0,0,0.75);font-family: Andada, serif;font-size: 24px;text-align: left;width: 500px;height: 35px;">&nbsp; &nbsp; &nbsp; &nbsp; LOGIN TO ACCOUNT BELOW</p>
                <p class="ml-auto navbar-text actions"> <a class="btn btn-light action-button" role="button" href="index.jsp" style="background: rgb(234,219,150);font-family: Andada, serif;">Log-In</a><a class="btn btn-light action-button" role="button" href="register.jsp" style="background: rgb(208,133,130);font-family: Andada, serif;">Sign Up</a></p>
            </div>
        </div>
    </nav>
    <p style="height: 0px;color: rgb(107,158,161);font-size: 34px;text-align: center;font-family: Andada, serif;box-shadow: 0px 0px 8px 2px;padding: 0px;border-style: solid;"></p>
    <div class="login-clean" style="padding: 0px;color: rgb(242,245,248);background: rgb(34,34,34);width: 1200px;">
        <form method="post" style="background: rgb(34,34,34);border-width: 6px;border-style: solid;box-shadow: 0px 0px 20px;">
            <h2 class="sr-only">Login Form</h2>
            <div class="illustration"><svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" class="bi bi-key">
                    <path fill-rule="evenodd" d="M0 8a4 4 0 0 1 7.465-2H14a.5.5 0 0 1 .354.146l1.5 1.5a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0L13 9.207l-.646.647a.5.5 0 0 1-.708 0L11 9.207l-.646.647a.5.5 0 0 1-.708 0L9 9.207l-.646.647A.5.5 0 0 1 8 10h-.535A4 4 0 0 1 0 8zm4-3a3 3 0 1 0 2.712 4.285A.5.5 0 0 1 7.163 9h.63l.853-.854a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.793-.793-1-1h-6.63a.5.5 0 0 1-.451-.285A3 3 0 0 0 4 5z"></path>
                    <path d="M4 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0z"></path>
                </svg></div>
            <div class="form-group"><input class="form-control" type="text" name="barcode" placeholder="Scan ID"><button class="btn btn-primary btn-block" type="submit">Log In</button></div><a class="forgot" href="forgot.html">Forgot your PIN?</a>
        </form>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>