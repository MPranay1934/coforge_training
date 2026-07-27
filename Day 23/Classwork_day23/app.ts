import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',// name of the component , directive
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})

export class App {
  name : string
  age : number
  email : string
  imagePath : string = "5380.webp"
  myStyle = {};
  myClass : string;
  width : number 
  height : number
  fName : string = "";
  constructor() {
    this.name = "Sharath";
    this.age = 20;
    this.email = "sharath@eripu.com";
    this.imagePath = "5380.webp";
    this.myStyle = { "color" : "green" , "font-size" : "5px"};
    this.myClass = "ZoomIn";
    this.width = 200;
    this.height = 200;
  }
  getAddition(a : number, b :number) : number {
    return a + b;
  }
  changeName() {
    if(this.name === "M Pro")
      this.name = "Pronay";
    else
      this.name = "M Pro"
  }

  ZoomInOut() {
    if(this.myClass === "ZoomIn")
      this.myClass = "ZoomOut";
    else
      this.myClass = "ZoomIn";

  }

}
//spec file = Jasmine karma