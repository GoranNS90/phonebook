(function() {
	
	var serviceModule = angular.module('serviceModule', []);
	
	serviceModule.service('PhonebookService', function($q, $http) {
		
		this.saveContact = function(contact) {
			var deferred = $q.defer();
			
			$http.post('/saveContact', contact).then(function(response){
				deferred.resolve(response);
			}, function(error) {
				deferred.reject(error);
			});
			return deferred.promise;
		};
		
		this.getAllContacts = function() {
			var deferred = $q.defer();
			
			$http.get('/getAll').then(function(response) {
				deferred.resolve(response);
			}, function(error) {
				deferred.reject(error);
			});
			return deferred.promise;
		};
		
	});
	
})();