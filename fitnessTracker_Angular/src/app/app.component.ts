import { Component } from '@angular/core';
import {render} from 'creditcardpayments/creditcardpayments';
import { User } from './User';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'WorkoutTrackerUi';

 
  user: User=new User();
}
