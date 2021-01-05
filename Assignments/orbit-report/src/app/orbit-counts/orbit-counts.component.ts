import { Component, Input, OnInit } from '@angular/core';
import { Satellite } from '../satellite';

@Component({
  selector: 'app-orbit-counts',
  templateUrl: './orbit-counts.component.html',
  styleUrls: ['./orbit-counts.component.css']
})
export class OrbitCountsComponent implements OnInit {
  @Input() satellites: Satellite[];

  constructor() { }

  ngOnInit() {
  }

  typeCount(typeName: string): number {
    let satellitesArr = [];
    for (let i = 0; i < this.satellites.length; i++){
      if(this.satellites[i].type.toLowerCase() === typeName) {
        satellitesArr.push(this.satellites[i].name);
      }
    }
    return satellitesArr.length
  }

}
