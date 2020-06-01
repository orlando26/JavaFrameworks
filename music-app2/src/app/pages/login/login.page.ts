import { ToastService } from './../../services/toast.service';
import { PersonService } from 'src/app/services/person.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {

  auth: Authenticate = {
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

  login(){
    this.personApi.authenticate(this.auth).subscribe(
      res => {
        this.response = res;

        if(this.response.status === 'SUCCESS'){
          this.toastService.successToast(this.response.responseText);
          this.router.navigateByUrl('/albums');
        } else {
          this.toastService.errorToast(this.response.responseText);
        }
      }
    );
  }

}
