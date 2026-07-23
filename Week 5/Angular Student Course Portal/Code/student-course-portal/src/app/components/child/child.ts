import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  standalone: true,
  imports: [],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child {
  @Input() studentName = '';

  @Output() notifyParent = new EventEmitter<string>();

  sendMessage() {
    this.notifyParent.emit('Hello Parent! Message received from Child.');
  }
}
