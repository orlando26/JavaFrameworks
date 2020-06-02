import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { UpdateSongPage } from './update-song.page';

const routes: Routes = [
  {
    path: '',
    component: UpdateSongPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class UpdateSongPageRoutingModule {}
