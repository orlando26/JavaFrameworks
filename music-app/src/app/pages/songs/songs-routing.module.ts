import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SongsPage } from './songs.page';

const routes: Routes = [
  {
    path: '',
    component: SongsPage
  },
  {
    path: 'create-song',
    loadChildren: () => import('./create-song/create-song.module').then( m => m.CreateSongPageModule)
  },
  {
    path: 'create-song/:albumId',
    loadChildren: () => import('./create-song/create-song.module').then( m => m.CreateSongPageModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SongsPageRoutingModule {}
