import { Component, OnInit, Input} from '@angular/core';
import { render } from 'creditcardpayments/creditCardPayments';

import { HttpClient } from '@angular/common/http'; 
import { User } from '../User';
import { CurrentUserService } from '../current-user.service';



@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  payment :boolean=true;
  isPhoneNumberUsed : any;
  responseData : any;
  user: User=new User();
  message:any;
  count : number=0;
  notifyMessage : String;
  
  constructor(private http:HttpClient, private userService : CurrentUserService) {
    
   }
   showPayment() : void{
   
   
   if(this.payment==true){
    render(
     
      {
        id :"#myPaypalButtons",
        currency :"INR",

        value : "1",
        onApprove: (details) => {
          alert("Transaction Successful");
          
        }
      }
    );
   this.payment=false;
  }
  

   }






  ngOnInit(): void {
    this.userService.currentMessage.subscribe(message =>{ this.message=message;
    })
  }

  public registerNow(){

    let resp=this.doRegistration(this.user);
    resp.subscribe((data)=>this.message=data);

      if(this.count==0){
        
         console.log(this.isPhoneNumberUsed)
          if(!this.isPhoneNumberUsed){
    this.notifyMessage ="Registration Successful :) please login... "
    
    this.count++;
      }
      else{
      this.notifyMessage= "Already your phone Number is registered. please login";
      }
      }
      public doRegistration(user){

        return this.http.post("http://localhost:8089/user/create",user);

      }

}
