import { Component } from '@angular/core';
import { RECETAS } from './mock_data/Recetas';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  recetas = RECETAS;
}
