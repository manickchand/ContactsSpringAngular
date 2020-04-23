import { Component } from '@angular/core';
import { AppService } from './app.service';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Contact List';

  listContacts = []

  constructor(private service: AppService){

    this.fakeContacts()

    service.getAll().subscribe((result:[]) => {
      console.log(result);
      this.listContacts = result
    });
  }

  fakeContacts() {
    this.listContacts = [
      {
          "id": 1,
          "name": "Belly Manickchand",
          "sex": "male",
          "phone": "9999999",
          "email": "beeeely"
      },
      {
          "id": 2,
          "name": "Leon Manickchand",
          "sex": "male",
          "phone": "9999999",
          "email": "beeeely"
      },
      {
          "id": 3,
          "name": "Beth Manickchand",
          "sex": "male",
          "phone": "9999999",
          "email": "asdsd"
      }
  ]
  }

}
