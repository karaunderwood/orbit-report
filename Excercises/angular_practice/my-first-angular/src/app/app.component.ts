import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hey-ooo';
  name: string = 'Kara';
  itemList: string[] = ['bananas', 'chocolate', 'whipped cream', 'cherries'];

  rectangle = {
    length: 5,
    width: 6,
    area: function() {
      return this.length * this.width;
    }
  }
}
