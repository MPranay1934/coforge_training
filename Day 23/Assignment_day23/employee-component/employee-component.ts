import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent {
  EmployeeID : number;
  Name :  string;
  Department : string;  
  Salary : number;
  constructor() {
    this.EmployeeID = 101;
    this.Name = "Pranay";
    this.Department = "IT";
    this.Salary = 50000;
  }
}
