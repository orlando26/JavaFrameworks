import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AlbumsPage } from './albums.page';

const routes: Routes = [
  {
    path: '',
    component: AlbumsPage
  },
  {
    path: 'create-album',
    loadChildren: () => import('./create-album/create-album.module').then( m => m.CreateAlbumPageModule)
  },
  {
    path: 'update-album',
    loadChildren: () => import('./update-album/update-album.module').then( m => m.UpdateAlbumPageModule)
  },
  {
    path: 'update-album/:albumId',
    loadChildren: () => import('./update-album/update-album.module').then( m => m.UpdateAlbumPageModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AlbumsPageRoutingModule {}
