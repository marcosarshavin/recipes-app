import { Injectable } from '@angular/core';
import { Receta } from '../model/Receta'; 
//Mock Data:
import { RECETAS } from '../mock_data/RECETAS'; 

@Injectable()
export class RecipesService {

  recipesURL = "http://127.0.0.1:8080/recipes-web/recipes/findAll"

  constructor() { }

  /*
    Note on promises:
    When using a remote server, users don't have to wait for the server to respond; 
    additionally, you aren't able to block the UI during the wait.

    A Promise essentially promises to call back when the results are ready
  */
  findAllRecipes(): Promise<Receta[]>  {
    return Promise.resolve(RECETAS);
  }
}
