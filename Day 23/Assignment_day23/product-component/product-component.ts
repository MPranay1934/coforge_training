import { Component } from '@angular/core';

@Component({
  selector: 'app-product-component',
  standalone: false,
  templateUrl: './product-component.html',
  styleUrl: './product-component.css',
})
export class ProductComponent {
  ProductName : string;
  Price : number;
  Category : string;
  Brand : string;
  imagePath : string = "prodimg.jpg";
  height : number = 200;
  width : number = 200;
  Availability : boolean;
  constructor() {
    this.ProductName = "Laptop";
    this.Price = 50000;
    this.Category = "Electronics";
    this.Brand = "Dell";
    this.imagePath = "prodimg.jpg";
    this.Availability = true;
  }
}
