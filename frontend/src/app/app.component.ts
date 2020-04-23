import { Component } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Contact List';

  listContacts = []
  newContact:any = {};

  constructor(private service: AppService){

    service.getAll().subscribe((result:[]) => {
      console.log(result);
      this.listContacts = result
    });
  }

  saveContact(){

    if(this.newContact != undefined){
      this.service.saveContact(this.newContact).subscribe((response)=>{
        window.location.reload()
      })
    }else{
      alert("fill in all fields")
    }
    
  }

  setSelectedContact(contact){
    this.newContact = contact
  }

  deleteContact(contact){
    if(confirm("Delete that contact?")){
      this.service.deleteContact(contact).subscribe((response)=>{
        window.location.reload()
      })
    }
  }

  contactsEmpty(){
    if(this.listContacts.length>0){
      return false;
    }else{
      return true
    }
  }

  validateFields(){
    if(this.newContact.name != undefined
      && this.newContact.email != undefined
      && this.newContact.sex != undefined
      && this.newContact.phone != undefined
      ){
        return false
    }else{
      return true
    }
  }

}
