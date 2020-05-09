import { ActivatedRoute, Router } from '@angular/router';
import { AlbumService } from './../../../services/album.service';
import { Component, OnInit } from '@angular/core';
import { ToastController } from '@ionic/angular';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.page.html',
  styleUrls: ['./edit.page.scss'],
})
export class EditPage implements OnInit {

  album: any = {
    id: '',
    title: '',
    releaseDate: '',
    price: '',
    genre: ''
  }

  private response: any = {
    entity: {},
    responseText: '',
    status: ''
  }

  private toast: any;

  constructor(private albumApi: AlbumService,
              private route: ActivatedRoute,
              private toastCtrl: ToastController,
              private router: Router) { }

  ngOnInit() {
  }

  ionViewWillEnter() {
   this.album.id = this.route.snapshot.paramMap.get('albumId');

   this.albumApi.findById(this.album.id).subscribe(
     res => {
       this.album = res;
     }
   );
  }

  update(){
    this.albumApi.update(this.album).subscribe(
      res => {
        this.response = res;

        if (this.response.status === 'SUCCESS') {
          this.successToast(this.response.responseText);
          this.router.navigateByUrl('/');
        } else {
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
