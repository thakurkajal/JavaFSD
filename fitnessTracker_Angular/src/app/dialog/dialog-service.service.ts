import { Injectable } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { DialogComponent } from './dialog.component';

@Injectable({
  providedIn: 'root'
})
export class DialogServiceService {
  modalRef: any;

  constructor(private NgbModal: NgbModal) { }

  openDialog(props : any):Promise<any> {
    this.modalRef = this.NgbModal.open(DialogComponent, {
      size: 'sm',
      backdrop: 'static',
    });

    this.modalRef.componentInstance.setDialogProps(props);
    return this.modalRef.result;
  }

  // getWorkouts(){
  //   return this.httpClient.get("http://localhost:8080/workouts/all");
  //  }

}
