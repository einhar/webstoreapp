<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="WEB-INF/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Incorrect PromoCode</title>
    </head>
    <body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1 class="alert alert-danger"> Incorrect PromoCode :( </h1>
            </div>
        </div>
    </section>

    <section>
        <div class="container">
            <p>
                <a href="<spring:url value="/products" />" class="btn btn-primary">
                    <span class="glyphicon-hand-left glyphicon"></span> Products
                </a>
            </p>
        </div>

    </section>
    </body>
</html>
