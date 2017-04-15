import { Component } from '@angular/core';
import { Receta } from './model/Receta';

const RECETAS: Receta[] = [
  {
    "id": 1,
    "nombre": "Fabada",
    "comensales": 3
  },
  {
    "id": 2,
    "nombre": "Tortiella",
    "comensales": 4
  }
];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  recetas = RECETAS;
}
