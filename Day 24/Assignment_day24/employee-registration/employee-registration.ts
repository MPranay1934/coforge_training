import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-registration',
  standalone: false,
  templateUrl: './employee-registration.html',
  styleUrl: './employee-registration.css',
})
export class EmployeeRegistration {
    employee = {
    id: '',
    name: '',
    email: '',
     department: ''
      };

  register() {
    alert("Employee Registered Successfully");
    console.log(this.employee);
  }
}
