import { Component } from '@angular/core';

@Component({
  selector: 'app-student-component',
  standalone: false,
  templateUrl: './student-component.html',
  styleUrl: './student-component.css',
})
export class StudentComponent {
  Name : string;
  Course : string;
  College : string;
  imagePath : string = "studentpic.jpg";
  width : number = 200;
  height : number = 200;
  constructor() {
    this.Name = "Sharath";
    this.Course = "B.Tech";
    this.College = "JNTU";
    this.imagePath = "studentpic.jpg";
  }
}
