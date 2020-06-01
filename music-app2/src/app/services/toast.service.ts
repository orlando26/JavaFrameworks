import { Injectable } from '@angular/core';
import { ToastController } from '@ionic/angular';

@Injectable({
  providedIn: 'root'
})
export class ToastService {

  constructor(private toastCtrl: ToastController) { }

  // async son procesos asincronos(Hilos o  threads)
  async successToast(msg){
    const toast = await this.toastCtrl.create(
      {
        message: msg,
        duration: 2000,
        color: 'success'
      }
    );
    toast.present();
  }

  async errorToast(msg){
    const toast = await this.toastCtrl.create(
      {
        message: msg,
        duration: 2000,
        color: 'danger'
      }
    );
    toast.present();
  }


}
