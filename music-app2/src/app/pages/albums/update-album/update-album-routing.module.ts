import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { UpdateAlbumPage } from './update-album.page';

const routes: Routes = [
  {
    path: '',
    component: UpdateAlbumPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class UpdateAlbumPageRoutingModule {}
