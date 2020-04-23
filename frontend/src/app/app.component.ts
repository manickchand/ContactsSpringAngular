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
  newContact = {};

  constructor(private service: AppService){

    service.getAll().subscribe((result:[]) => {
      console.log(result);
      this.listContacts = result
    });
  }

  saveContact(){
    this.service.saveContact(this.newContact).subscribe((response)=>{
      window.location.reload()
    })
  }

  setSelectedContact(contact){
    this.newContact = contact
  }

}
