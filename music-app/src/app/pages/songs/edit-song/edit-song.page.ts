import { SongService } from './../../../services/song.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { ToastController } from '@ionic/angular';

@Component({
  selector: 'app-edit-song',
  templateUrl: './edit-song.page.html',
  styleUrls: ['./edit-song.page.scss'],
})
export class EditSongPage implements OnInit {

  song: any = {
    id: '',
    albumId: '',
    title: '',
    time: ''
  }

  private response: any = {
    entity: {},
    responseText: '',
    status: ''
  }

  private toast: any;

  constructor(private router: Router,
              private songApi: SongService,
              private route: ActivatedRoute,
              private toastCtrl: ToastController) { }

  ngOnInit() {
  }

  ionViewWillEnter() {
   this.song.id = this.route.snapshot.paramMap.get('songId');

   this.songApi.findById(this.song.id).subscribe(
     res => {
       this.song = res;
     }
   );
  }

  cancel() {
    this.router.navigateByUrl('/songs/' + this.song.albumId);
  }

  update() {
    this.songApi.update(this.song).subscribe(
      res => {
        this.response = res;

        if (this.response.status == 'SUCCESS'){
          this.successToast(this.response.responseText);
          this.cancel();
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
