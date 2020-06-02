import { SongService } from 'src/app/services/song.service';
import { ToastService } from './../../../services/toast.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-song',
  templateUrl: './update-song.page.html',
  styleUrls: ['./update-song.page.scss'],
})
export class UpdateSongPage implements OnInit {

  song: Song = {
    id: 0,
    albumId: 0,
    title: '',
    time: ''
  }

  response: any = {
    entity: {},
    status: '',
    responseText: ''
  }

  constructor(private route: ActivatedRoute, private router: Router,private toastService: ToastService, private songApi: SongService) { }

  ngOnInit() {
  }

  ionViewDidEnter(){
    let id = this.route.snapshot.paramMap.get('id');
   this.songApi.findById(id).subscribe(
     res => {
      this.song = res;
     }
   );
  }

  save() {
    this.songApi.update(this.song).subscribe(
      res => {
        this.response = res;

        if (this.response.status === 'SUCCESS') {
          this.toastService.successToast(this.response.responseText);
          this.router.navigateByUrl('/songs/' + this.response.entity.albumId);
        } else {
          this.toastService.errorToast(this.response.responseText);
        }
      }
    );
  }

}
