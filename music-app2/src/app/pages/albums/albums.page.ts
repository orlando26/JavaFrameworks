import { ToastService } from './../../services/toast.service';
import { Component, OnInit } from '@angular/core';
import { AlbumService } from 'src/app/services/album.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.page.html',
  styleUrls: ['./albums.page.scss'],
})
export class AlbumsPage implements OnInit {

  albums: Album[];

  response: any = {
    entity: {},
    status: '',
    responseText: ''
  }

  constructor( private albumApi: AlbumService, private router: Router, private toastService: ToastService ) { }

  ngOnInit() {
  }

  ionViewWillEnter() {
    // observables - lazy loading - lambda functions/arrow function
   this.albumApi.findAll().subscribe(
    res => {
      this.albums = res;
    }
   );
  }

  songsPage(albumId){
    this.router.navigateByUrl('/songs/' + albumId);
  }

  delete(id: number){
    this.albumApi.delete(id).subscribe(
      res => {
        this.response = res;

        if(this.response.status === 'SUCCESS'){
          this.toastService.successToast(this.response.responseText);
          this.ionViewWillEnter();
        } else {
          this.toastService.errorToast(this.response.responseText);
        }
      }
    );
  }

  update(id: number){
    this.router.navigateByUrl('/albums/update-album/' + id);
  }


}
