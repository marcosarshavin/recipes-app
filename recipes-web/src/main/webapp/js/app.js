// Ionic Starter App

// angular.module is a global place for creating, registering and retrieving Angular modules
// 'starter' is the name of this angular module example (also set in a <body> attribute in index.html)
// the 2nd parameter is an array of 'requires'
//MRBQ: Incluir dependencia LocalStorage a angular (previamente debe haberse incluido el sript en el fichero index.html)
var app = angular.module('starter', ['ionic', 'LocalStorageModule'])


.run(function($ionicPlatform) {
  $ionicPlatform.ready(function() {
    if(window.cordova && window.cordova.plugins.Keyboard) {
      // Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
      // for form inputs)
      cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);

      // Don't remove this line unless you know what you are doing. It stops the viewport
      // from snapping when text inputs are focused. Ionic handles this internally for
      // a much nicer keyboard experience.
      cordova.plugins.Keyboard.disableScroll(true);
    }
    if(window.StatusBar) {
      StatusBar.styleDefault();
    }
  });
})

app.config(function (localStorageServiceProvider) {
    localStorageServiceProvider.setPrefix('todo');
})

//MRBQ: Configurar el MainController
/**
Notice how we have injected localStorageService in the controller so as to help us interact with Local Storage from the controller. We also injected$ionicModal service to help us create tasks from a modal.
*/
app.controller('main', function ($scope, $ionicModal, $http, localStorageService) { //store the entities name in a variable 

	var taskData = 'task';

	//initialize the tasks scope with empty array
	$scope.tasks = [];

	//initialize the task scope with empty object
	$scope.task = {};

	//configure the ionic modal before use
	 $ionicModal.fromTemplateUrl('modal.html', {
		scope: $scope,
		animation: 'slide-in-up'
	}).then(function(modal) {
		$scope.modal = modal; 
	});

	$scope.getTasks = function () {
		$http({
			method: "GET",
			url: "/recipes-web/recipes/findAll"
		}).then(function successCallback(response) {		
				// this callback will be called asynchronously
				// when the response is available
				$scope.tasks = response.data
			}, function errorCallback(response) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
				console.log('Fallo en llamada a servidor!!!', response);
				
				/*var receta = {
					id: 1,
					name: "Huevos",
					nPersonas: 2,
					cookingTime: 300
				};
				$scope.tasks.push(receta);*/
		});
	};
	
	$scope.createTask = function () {
		
		$http({
			method: "POST",
			url: "/recipes-web/recipes",
			data: $scope.task
		}).then(function successCallback(response) {		
				// this callback will be called asynchronously
				// when the response is available
				//creates a new task
				$scope.tasks.push(response.data);
			}, function errorCallback(response) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
				console.log('Fallo en llamada a servidor!!!', response);
				alert('Ocurrió un error al crear receta');
		});		
		
		$scope.task = {};
		//close new task modal
		$scope.modal.hide();
	};
	
	$scope.removeTask = function (id, index) {    
		//removes a task
		$http({
			method: "DELETE",
			url: "/recipes-web/recipes?id=" + id
		}).then(function successCallback(response) {		
				// this callback will be called asynchronously
				// when the response is available
				//creates a new task
				$scope.tasks.splice(index, 1);
			}, function errorCallback(response) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
				console.log('Fallo en llamada a servidor!!!', response);
				alert('Ocurrió un error al eliminar la receta');
		});		
	};
	$scope.completeTask = function () {
		//updates a task as completed 
		if (index !== -1) {
			$scope.tasks[index].completed = true; 
		} 

		localStorageService.set(taskData, $scope.tasks); 
	};
});


