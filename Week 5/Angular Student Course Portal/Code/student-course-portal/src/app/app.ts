import { Component } from '@angular/core';
import { Header } from './components/header/header';
import { Home } from './components/home/home';
import { LifecycleDemo } from './components/lifecycle-demo/lifecycle-demo';
import { Parent } from './components/parent/parent';
import { StudentList } from './components/student-list/student-list';
import { CourseList } from './components/course-list/course-list';
import { Footer } from './components/footer/footer';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Header, Home, LifecycleDemo, Parent, StudentList, CourseList, Footer],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {}
