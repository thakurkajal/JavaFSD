import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { PaymentComponent } from './payment/payment.component';
import { VideostreamComponent } from './videostream/videostream.component';

import { DietplanComponent } from './dietplan/dietplan.component';
import { FormsModule, NgModel } from '@angular/forms';
import { ModalComponent } from './modal/modal.component';
import { DialogComponent } from './dialog/dialog.component';

import { LoginComponent } from './login/login.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { SignupComponent } from './signup/signup.component';
import { WorkoutComponent } from './workout/workout.component';
import { GraphsComponent } from './graphs/graphs.component';
import { ChartsModule } from 'ng2-charts';
import { WorkoutANDuserComponent } from './workout-anduser/workout-anduser.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { GetDataComponent } from './get-data/get-data.component';
import { NextComponent } from './next/next.component';




@NgModule({
  declarations: [
    AppComponent,
    PaymentComponent,
    VideostreamComponent,
    DietplanComponent,
    ModalComponent,
    DialogComponent,
    LoginComponent,
    WorkoutComponent,
    SignupComponent,
    GraphsComponent,
    WorkoutANDuserComponent,
    GetDataComponent,
    NextComponent
   ],
  imports: [
    AppRoutingModule,
    FormsModule,
    NgbModule,
    HttpClientModule,
    ChartsModule,
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
