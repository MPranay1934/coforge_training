import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  standalone: false,
  templateUrl: './counter.html',
  styleUrl: './counter.css',
})
export class Counter {
   count: number;
  constructor() {
    this.count = 0;
  }
  Increment() {
    this.count++;
  }
  Decrement() {
    this.count--;
  }

  reset() {
    this.count = 0;
  }
}
