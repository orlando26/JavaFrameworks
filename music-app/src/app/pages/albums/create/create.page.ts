import { AlbumService } from './../../../services/album.service';
import { Component, OnInit } from '@angular/core';
import { ToastController } from '@ionic/angular';

@Component({
  selector: 'app-create',
  templateUrl: './create.page.html',
  styleUrls: ['./create.page.scss'],
})
export class CreatePage implements OnInit {

  private toast: any;

  private response: any = {
    entity: {},
    responseText: '',
    status: ''
  }

  album = {
    title: '',
    releaseDate: '',
    price: '',
    genre: ''
  }

  constructor(private albumApi: AlbumService, private toastCtrl: ToastController) { }

  ngOnInit() {
  }

  saveAlbum() {
    this.albumApi.saveAlbum(this.album).subscribe(
      res => {
        this.response = res;
        console.log(this.response);

        if(this.response.status == "SUCCESS"){
          this.successToast(this.response.responseText);
        }else{
          this.errorToast(this.response.responseText);
        }
      }
    );
  }

  successToast(msg) {
    this.toast = this.toastCtrl.create(
      {
        message: msg,
        duration: 2000,
        color: 'success'
      }
    ).then(toastData => {
      toastData.present();
    });
  }

  errorToast(msg) {
    this.toast = this.toastCtrl.create(
      {
        message: msg,
        duration: 2000,
        color: 'danger'
      }
    ).then(toastData => {
      toastData.present();
    });
  }

}
