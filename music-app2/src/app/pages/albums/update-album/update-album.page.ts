import { ToastService } from './../../../services/toast.service';
import { AlbumService } from 'src/app/services/album.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update-album',
  templateUrl: './update-album.page.html',
  styleUrls: ['./update-album.page.scss'],
})
export class UpdateAlbumPage implements OnInit {

  albumId;

  album: Album = {
    id: 0,
    title: '',
    genre: '',
    price: '',
    releaseDate: ''
  }

  response: any = {
    entity: {},
    status: '',
    responseText: ''
  }

  constructor(private route: ActivatedRoute,
              private albumApi: AlbumService,
              private toastService: ToastService,
              private router: Router) { }

  ngOnInit() {
  }

  ionViewWillEnter(){
   this.albumId = this.route.snapshot.paramMap.get('albumId');

   this.albumApi.findById(this.albumId).subscribe(
     res => {
       this.album = res;
     }
   );
  }

  update(){
    console.log(this.album);
    this.albumApi.update(this.album).subscribe(
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
