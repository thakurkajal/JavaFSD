import { Component, Input, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  flag: boolean= false;
  flag1: any;
  responseDataUsers: any;

  @Input('fullNameUser') fullNameUser : string;
  @Input('newPassword') newPassword: any;
 
  responseDataFromfullName: any;
  result :any;

  constructor(private httpClient : HttpClient) { }

  ngOnInit(){
  
}

getUsers(){
  //console.log("Inside user.....");
  let responseUrl = this.httpClient.get("http://localhost:8080/user/get");
  responseUrl.subscribe((responseData) => {
    this.responseDataUsers = responseData;
    //console.log(responseData);
    this.flag1= this.compareUser(this.responseDataUsers, this.fullNameUser);
    //console.log(this.flag1);
    if(this.flag1==true){
      // console.log("correct user....");
      this.getPassword();
    }else{
      //  console.log("wrong user....");
      this.result="Please try logging in with valid username....";
    }
  });  
}

 
  compare(responseDataFromfullName: any) :void{
    // console.log("inside compare, response : " + this.responseDataFromfullName[0].password);
     
        if(this.responseDataFromfullName[0].password==this.newPassword){
          this.result="User logged in successfully";
        }else{
          this.result="Invalid Password, Please try again..";
        }
      
  }
  getPassword():void{
    // console.log("full name :" + this.fullNameUser);
    let responseUrl = this.httpClient.get("http://localhost:8080/user/create/"+ this.fullNameUser);
    responseUrl.subscribe((responseData) => {
    this.responseDataFromfullName = responseData;
    // console.log("response : " + this.responseDataFromfullName[0].password);
    this.compare(this.responseDataFromfullName);
    // console.log(this.result);
    });     
}
compareUser(responseDataFromUser: any,fullname : any) :boolean{
  // console.log(responseDataFromUser);
  for(var item of responseDataFromUser){
    // console.log(item);
    // console.log(fullname);
    if(item===fullname){
      this.flag=true;
      break;
    }else{
      this.flag=false;
      // console.log(this.flag);
    }
  }
  return this.flag; 
}

}
