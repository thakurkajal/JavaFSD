import { Component, OnInit } from '@angular/core';
import { render } from 'creditcardpayments/creditCardPayments';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  constructor(){
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
  }


  ngOnInit(): void {
  }

}
