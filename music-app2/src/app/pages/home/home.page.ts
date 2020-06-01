import { ToastService } from './../../services/toast.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PersonService } from 'src/app/services/person.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.page.html',
  styleUrls: ['./home.page.scss'],
})
export class HomePage implements OnInit {

  person: Person = {
    name: '',
    lastName: '',
    email: '',
    password: ''
  }

  response: any = {
    entity: {},
    status: '',
    responseText: ''
  }



  constructor(private router: Router, private personApi: PersonService, private toastService: ToastService) { }



  ngOnInit() {
  }


  save(){
    console.log(this.person);
    this.personApi.save(this.person).subscribe(
      res => {
        this.response = res;

        if (this.response.status === 'SUCCESS') {
          this.toastService.successToast(this.response.responseText);
          this.router.navigateByUrl('/');
        } else {
          this.toastService.errorToast(this.response.responseText);
        }
      }
    );
  }

  cancel(){
    this.router.navigateByUrl('/');
  }

  // HttpClient

}
