(function() {
	
	angular.module('phonebook', ['ngRoute', 'phonebookController']).config(function($routeProvider){
		$routeProvider.when('/contacts', {
			templateUrl: 'pages/contacts.html',
			controller: 'PhonebookCtrl'
		}).when('/', {
			templateUrl: 'pages/contacts.html',
			controller: 'PhonebookCtrl'
		}).when('/addContact', {
			templateUrl: 'pages/addContact.html',
			controller: 'PhonebookCtrl'
		}).otherwise('/');
	});
	
})();