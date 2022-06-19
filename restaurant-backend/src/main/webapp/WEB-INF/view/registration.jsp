<%-- 
    Document   : home
    Created on : Nov 5, 2021, 10:49:20 AM
    Author     : Mariam Ragab
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Fonts -->
        <link rel="dns-prefetch" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600" rel="stylesheet" type="text/css">

        <!------ Include the above in your HEAD tag ---------->
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/jquery.validate.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/jquery.validate.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/additional-methods.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/additional-methods.min.js"></script>

        <link rel="icon" href="Favicon.png">
        <link rel="stylesheet" href="/css/styleRegistration.css">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

        <title>Registration</title>
    </head>
    <body>



        <main class="my-form">
            <div class="cotainer">
                <div class="row justify-content-center" style="margin-top: 5%;margin-left: 20%;">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header" style=" color: #FFC312;
                                 text-align: center;
                                 font-size: 200%;
                                 font-weight: bold">Register</div>
                            <div class="card-body">
                                <form:form action="homeFromRegistration" method="post" modelAttribute="user">
                                    <div class="form-group row">
                                        <label for="userName" class="col-md-5 col-form-label text-md-right">UserName *</label>
                                        <div class="col-md-6">
                                            <form:input type="text" id="userName" class="form-control" path="userName" cssClass="input"/>
                                            <form:errors path="userName" cssClass="error"/>
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label for="email" class="col-md-5 col-form-label text-md-right">Email *</label>
                                        <div class="col-md-6">
                                            <form:input type="text" id="email" class="form-control" path="email" cssClass="input" />
                                            <form:errors path="email" cssClass="error"/>
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label for="UserName" class="col-md-5 col-form-label text-md-right">phone *</label>
                                        <div class="col-md-6">
                                            <form:input type="text" id="phone" class="form-control" path="phone" cssClass="input" />
                                            <form:errors path="phone" cssClass="error"/>
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label for="password" class="col-md-5 col-form-label text-md-right">password *</label>

                                        <div class="col-md-6">
                                            <form:input type="password" id="password" class="form-control" cssClass="input" path="password" name="pass" />
                                            <form:errors path="password" cssClass="error"/>
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label for="present_address" class="col-md-5 col-form-label text-md-right">ConfirmPass *</label>
                                        <div class="col-md-6">
                                            <form:input type="password" id="confirmPassword" class="form-control" cssClass="input" path=""/>
                                            <%--<form:errors path="userName" cssClass="error"/>--%>
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label for="present_address" class="col-md-5 col-form-label text-md-right">Credit Limit *</label>
                                        <div class="col-md-6">
                                            <form:input  id="creditLimit" class="form-control" path="creditLimit" cssClass="input" />
                                            <form:errors path="creditLimit" cssClass="error"/>
                                        </div>
                                    </div>

                                    <div class=" form-group col-md-6 offset-md-4">
                                        <input type="submit" value="Sing up" class="btn btn-warning login_btn">
                                    </div>
                                    <%--                            <div class="col-md-6 offset-md-4">--%>
                                    <%--                                <button type="submit" class="btn btn-primary">--%>
                                    <%--                                    Register--%>
                                    <%--                                </button>--%>
                                    <%--                            </div>--%>

                                </form:form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </main>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </body>
</html>
