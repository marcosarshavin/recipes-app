<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width">
    <title></title>

    <link href="lib/ionic/css/ionic.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

    <!-- IF using Sass (run gulp sass first), then uncomment below and remove the CSS includes above
    <link href="css/ionic.app.css" rel="stylesheet">
    -->

    <!-- ionic/angularjs js -->
    <script src="lib/ionic/js/ionic.bundle.js"></script>

    <!-- cordova script (this will be a 404 during development) -->
    <script src="cordova.js"></script>

    <!-- your app's js -->
    <script src="js/app.js"></script>
	
	<!-- MRBQ: Incluir script de local storage-->
	<script src="lib/angular-local-storage/dist/angular-local-storage.js"></script>
	
  </head>
  <!-- your app's js -->
  <body ng-app="starter" ng-controller="main" ng-init="getTasks()">
    <ion-pane>
     <ion-header-bar class="bar-dark">
        <h1 class="title">Recetas</h1>
		<!-- New Task button-->
		<button class="button button-icon" ng-click="modal.show()">
			<i class="icon ion-compose"></i>
		</button>
      </ion-header-bar>
      <ion-content>
		  <div class="list card" ng-repeat="task in tasks track by $index">
				<div class="item item-divider">
					<span ng-bind="task.title"></span>
				</div>
				<div class="item item-body">
					<strong>Receta: <span ng-bind="task.name"></span></strong>
					<ul>
						<li>Comensales: {{task.nPersonas}}</li>
						<li>Tiempo: {{task.cookingTime}}</li>
					</ul>
				</div>

				<div class="item tabs tabs-secondary tabs-icon-left">
					<span class="item item-checkbox">
						<label class="checkbox">
							<input type="checkbox" ng-model="task.completed" ng-click="completeTask($index)">
						</label>
					</span>
					<a class="tab-item assertive" ng-click="removeTask(task.id, $index)">
						<i class="icon ion-android-close"></i>
					</a>
				</div>
			</div>
      </ion-content>
    </ion-pane>
	
	<script id="modal.html" type="text/ng-template">
     <ion-modal-view>
            <ion-header-bar class="bar-dark">
                <h1 class="title">Crear una Receta</h1>
                <button class="button button-icon" ng-click="modal.hide()">
                    <i class="icon ion-android-close"></i>
                </button>
            </ion-header-bar>
            <ion-content>
                <form ng-submit="createTask()">
                    <div class="list list-inset">
                        <label class="item item-input">
                            <input ng-model="task.name" type="text" placeholder="Nombre">
                        </label>
                        <label class="item item-input">
                            <input ng-model="task.nPersonas" type="number" placeholder="Comensales">
                        </label>
                        <label class="item item-input">
                            <input ng-model="task.cookingTime" type="number" placeholder="Tiempo">
                        </label>
                        <!--
							MRBQ: Lo comento por si en el futuro no es util, de momento no lo parece...
							<ul clas="list">
                            <li class="item item-toggle">
                                Completed?
                                <label class="toggle toggle-balanced">
                                    <input type="checkbox" ng-model="task.completed">
                                   <div class="track">
                                        <div class="handle"></div>
                                    </div>
                                </label>
                            </li>
                        </ul>-->
                        <button type="submit" class="button button-block button-positive">Crear Receta</button>
                    </div>
                </form>
            </ion-content>
        </ion-modal-view>
    </script>
  </body>
</html>
