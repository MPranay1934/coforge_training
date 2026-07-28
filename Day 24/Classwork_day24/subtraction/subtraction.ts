import { Component } from '@angular/core';
import { CalculatorService } from '../calculator-service/calculator-service';

@Component({
  selector: 'app-subtraction',
  standalone: false,
  templateUrl: './subtraction.html',
  styleUrl: './subtraction.css',
})
export class Subtraction {
  result : string;
  constructor(private calculatorService: CalculatorService) {
    this.result = "Subtraction Result :" + this.calculatorService.subtract(1, 2).toString();



  }

}
