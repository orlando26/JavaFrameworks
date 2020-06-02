import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CreateSongPage } from './create-song.page';

const routes: Routes = [
  {
    path: '',
    component: CreateSongPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CreateSongPageRoutingModule {}
