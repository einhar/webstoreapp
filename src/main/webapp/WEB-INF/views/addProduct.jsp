<%--
  Created by IntelliJ IDEA.
  User: Oskar
  Date: 03.05.2018
  Time: 00:01
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="WEB-INF/css/bootstrap.min.css">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            <title>Add New Product</title>
        </head>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Products</h1>
                    <p>Add Product</p>
                </div>
                <a href="<c:url value="/j_spring_security_logout" />" class="btn btn-danger btn-mini pull-right">Logout</a>
                <div class="pull-right" style="padding-right:50px">
                    <a href="?lang=en" >en</a>|<a href="?lang=pl" >pl</a>
                </div>
            </div>
        </section>
        <section class="container">
            <form:form  modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data">
                <fieldset>
                    <legend>Add new product</legend>
                    <form:errors path="*" cssClass="alert alert-danger" element="div"/>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="productId">
                            <spring:message code="addProduct.form.productId.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="productId" path="productId" type="text" class="form:input-large"/>
                            <form:errors path="productId" cssClass="text-danger"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2" for="name">
                            <spring:message code="addProduct.form.name.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="name" path="name" type="text" class="form:input-large"/>
                            <form:errors path="name" cssClass="text-danger"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2" for="unitPrice">
                            <spring:message code="addProduct.form.unitPrice.label"/>
                        </label>
                        <div class="col-lg-10">
                            <div class="form:input-prepend">
                                <form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
                                <form:errors path="unitPrice" cssClass="text-danger"/>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2" for="description">
                            <spring:message code="addProduct.form.description.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:textarea id="description" path="description" rows = "2"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2" for="manufacturer">
                            <spring:message code="addProduct.form.manufacturer.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2" for="category">
                            <spring:message code="addProduct.form.category.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="category" path="category" type="text" class="form:input-large"/>
                            <form:errors path="category" cssClass="text-danger"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2" for="unitsInStock">
                            <spring:message code="addProduct.form.unitsInStock.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
                            <form:errors path="unitsInStock" cssClass="text-danger"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2" for="condition">
                            <spring:message code="addProduct.form.condition.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:radiobutton id="condition" path="condition" value="New" />
                                <spring:message code="addProduct.form.productCondition.new.label"/>
                            <form:radiobutton id="condition" path="condition" value="Old" />
                                <spring:message code="addProduct.form.productCondition.old.label"/>
                            <form:radiobutton id="condition" path="condition" value="Refurbished" />
                                <spring:message code="addProduct.form.productCondition.refurbished.label"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2" for="productImage">
                            <spring:message code="addProduct.form.productImage.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input path="productImage" id="productImage" type="file" class="form:input-large" />
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add new"/>
                        </div>
                    </div>

                </fieldset>
            </form:form>
        </section>
    </body>
</html>