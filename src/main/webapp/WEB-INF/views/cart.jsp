<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

        <script	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
        <script src="/resource/js/controllers.js"></script>

        <title>Cart</title>
    </head>
<body>
    <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Cart</h1>
                    <p>Products in your cart</p>
                </div>
            </div>
        </section>

        <section class="container" ng-app="cartApp">
            <div ng-controller="cartCtrl" ng-init="initCartId('${cartId}')">

                <div>
                    <a class="btn btn-danger pull-left" ng-click="clearCart()">
                        <span class="glyphicon glyphicon-remove-sign"></span> Clean cart
                    </a>
                    <a href="<spring:url value="/checkout?cartId=${cartId}"/>" class="btn btn-success pull-right">
                        <span class="glyphicon-shopping-cart glyphicon"></span> Check out
                    </a>
                </div>
                <table class="table table-hover">
                    <tr>
                        <th>Product</th>
                        <th>Price for each</th>
                        <th>Number of items</th>
                        <th>Price</th>
                        <th>Action</th>

                    </tr>
                    <tr ng-repeat="item in cart.cartItems">
                        <td>{{item.product.productId}}-{{item.product.name}}</td>
                        <td>{{item.product.unitPrice}} $</td>
                        <td>{{item.quantity}}</td>
                        <td>{{item.totalPrice}} $</td>
                        <td><a href="#" class="label label-danger" ng-click="removeFromCart(item.product.productId)"> <span
                                class="glyphicon glyphicon-remove" /></span> Delete
                        </a></td>
                    </tr>
                    <tr>
                        <th></th>
                        <th></th>
                        <th>Total price</th>
                        <th>{{cart.grandTotal}} $</th>
                        <th></th>
                    </tr>
                </table>

                <a href="<spring:url value="/products" />" class="btn btn-default">
                    <span class="glyphicon-hand-left glyphicon"></span> Back to products
                </a>
            </div>
        </section>
    </body>
</html>
