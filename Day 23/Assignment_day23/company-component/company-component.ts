import { Component } from '@angular/core';

@Component({
  selector: 'app-company-component',
  standalone: false,
  templateUrl: './company-component.html',
  styleUrl: './company-component.css',
})
export class CompanyComponent {
  CompanyName : string;
  CEO : string;
  Location : string;
  EmployeesCount : number;
  Revenue : number;
  constructor() {
    this.CompanyName = "Tech Solutions";
    this.CEO = "Saud";
    this.Location = "New York";
    this.EmployeesCount = 500;
    this.Revenue = 1000000;
  }
}
