(function() {
	
	var controllerModule = angular.module('phonebookController', ['serviceModule']);
	
	controllerModule.controller('PhonebookCtrl', function($scope, PhonebookService) {
		
		$scope.contacts = {};
		
		$scope.saveContact = function(contact) {
			PhonebookService.saveContact(contact).then(function(response){
				$scope.success = true;
				$scope.error = false;
			}, function(error) {
				$scope.success = false;
				$scope.error = true;
			});
		};
		
		$scope.getAllContacts = function() {
			PhonebookService.getAllContacts().then(function(response) {
				$scope.contacts = response.data;
			}, function(error) {
				
			});
		};
		
		$scope.getAllContacts();
		
	});
	
})();