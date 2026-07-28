import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  standalone: false,
  templateUrl: './employee.html',
  styleUrl: './employee.css',
})
export class Employee {
  employee = {
    id: 101,
    name: 'Enkates',
    department: 'CSE',
    salary: 50000
  };

  showEmployee: boolean = true;

  toggleEmployee() {
    this.showEmployee = !this.showEmployee;
  }
}
