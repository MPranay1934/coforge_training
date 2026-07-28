import { Component } from '@angular/core';
import { Student } from './student';

@Component({
  selector: 'app-student-result',
  standalone: false,
  templateUrl: './student-result.html',
  styleUrl: './student-result.css',
})
export class StudentResult {
   students: Student[] = [

    { id: 101, name: 'Rahul', marks: 85 },
    { id: 102, name: 'Priya', marks: 62 },
    { id: 103, name: 'Amit', marks: 28 },
    { id: 104, name: 'Sneha', marks: 74 },
     ];

  get passCount(): number {
    return this.students.filter(student => student.marks >= 35).length;
  }

  get failCount(): number {
    return this.students.filter(student => student.marks < 35).length;
  }
}
