import { Component } from '@angular/core';
import { Product1 } from './product1';

@Component({
  selector: 'app-product',
  standalone: false,
  templateUrl: './product.html',
  styleUrl: './product.css',
})
export class Product {
    products: Product[] = [

    { id: 101, name: 'Laptop', category: 'Electronics', price: 65000 },
    { id: 102, name: 'Mobile', category: 'Electronics', price: 25000 },
    { id: 103, name: 'Headphones', category: 'Accessories', price: 2500 },
    { id: 104, name: 'Keyboard', category: 'Accessories', price: 1500 },
    ]
}
