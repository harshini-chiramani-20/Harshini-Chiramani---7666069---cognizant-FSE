import { Component, Input, OnInit, OnChanges, OnDestroy, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-lifecycle-demo',
  standalone: true,
  imports: [],
  templateUrl: './lifecycle-demo.html',
  styleUrl: './lifecycle-demo.css',
})
export class LifecycleDemo implements OnInit, OnChanges, OnDestroy {
  @Input() title = '';

  constructor() {
    console.log('Constructor Called');
  }

  ngOnInit(): void {
    console.log('ngOnInit Called');
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('ngOnChanges Called', changes);
  }

  ngOnDestroy(): void {
    console.log('ngOnDestroy Called');
  }
}
