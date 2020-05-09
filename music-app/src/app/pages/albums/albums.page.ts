import { ToastController } from '@ionic/angular';
import { AlbumService } from './../../services/album.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.page.html',
  styleUrls: ['./albums.page.scss'],
})
export class AlbumsPage implements OnInit {

  public albumsList: any = [];

  private toast: any;

  private response: any = {
    entity: {},
    status: '',
    responseText: ''
  }

  constructor(private api: AlbumService, private router: Router, private toastCtrl: ToastController) { }

  ngOnInit() {
  }

  ionViewWillEnter() { // listener
   this.api.getAll().subscribe(
     res => {
       this.albumsList = res;
       console.log(this.albumsList);
     }
   );
  }


  openSongsPage(albumId){
    this.router.navigateByUrl('/songs/' + albumId);
  }

  deleteAlbum(albumId) {
    this.api.deleteById(albumId).subscribe(
      res => {
        this.response = res;

        if ( this.response.status == 'SUCCESS' ) {
          this.successToast(this.response.responseText);
          this.ionViewWillEnter();
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

  editPage(albumId){
    this.router.navigateByUrl('/albums/edit/' + albumId);
  }

}
