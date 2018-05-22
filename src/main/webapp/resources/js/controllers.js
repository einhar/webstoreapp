var cartApp = angular.module('cartApp', []);

cartApp.controller('cartCtrl',  function ($scope, $http) {

    $scope.refreshCart = function(cartId) {
        console.log("~~~~~~$scope.refreshCart = function(cartId)");
        $http.get('/rest/cart/'+$scope.cartId)
            .success(function(data) {
                console.log("~~~~~~ jestem w .success funkcji refreshCart")
                $scope.cart = data;
            });
    };

    $scope.clearCart = function() {
        console.log("~~~~~~$scope.clearCart = function()");
        $http.delete('/rest/cart/'+$scope.cartId)
            .success($scope.refreshCart($scope.cartId));
    };

    $scope.initCartId = function(cartId) {
        console.log("~~~~~~$scope.initCartId = function(cartId)");
        $scope.cartId=cartId;
        $scope.refreshCart($scope.cartId);
    };

    $scope.addToCart = function(productId) {
        console.log("~~~~~~$scope.addToCart = function(productId)");
        $http.put('/rest/cart/add/'+productId)
            .success(function(data) {
                console.log("~~~~~~ jestem w .success funkcji addToCart")
                $scope.refreshCart($http.get('/rest/cart/get/cartId'));
                alert("Produkt pomyślnie dodany do koszyka!");
            });
    };

    $scope.removeFromCart = function(productId) {
        console.log("~~~~~~$scope.removeFromCart = function(productId)");
        $http.put('/rest/cart/remove/'+productId)
            .success(function(data) {
                console.log("~~~~~~ jestem w .success funkcji removeFromCart")
                $scope.refreshCart($http.get('/rest/cart/get/cartId'));
            });
    };
});
