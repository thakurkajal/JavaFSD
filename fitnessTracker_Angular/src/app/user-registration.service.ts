import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class RegistrationService {



  constructor(private http:HttpClient) { }

  public doRegistration(user){

    // return this.http.get("http://localhost:8080/user/search/{}")
    
    return this.http.post("http://localhost:8080/user/create",user,{responseType:'text' as 'json'});


    

  }
 
}
