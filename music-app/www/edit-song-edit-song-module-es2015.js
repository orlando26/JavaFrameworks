(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["edit-song-edit-song-module"],{

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/edit-song/edit-song.page.html":
/*!*************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/edit-song/edit-song.page.html ***!
  \*************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<ion-header>\r\n  <ion-toolbar color=\"dark\">\r\n    <ion-title>Edit song</ion-title>\r\n    <ion-buttons slot=\"end\">\r\n      <ion-button color=\"danger\" (click)=\"cancel()\">\r\n        <ion-icon name=\"close-outline\"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n  </ion-toolbar>\r\n</ion-header>\r\n\r\n<ion-content>\r\n  <ion-list>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Title</ion-label>\r\n      <ion-input [(ngModel)]=\"song.title\"></ion-input>\r\n    </ion-item>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Time</ion-label>\r\n      <ion-input [(ngModel)]=\"song.time\"></ion-input>\r\n    </ion-item>\r\n\r\n  </ion-list>\r\n\r\n  <ion-button (click)=\"update()\" expand=\"block\" fill=\"outline\">Update</ion-button>\r\n\r\n</ion-content>\r\n");

/***/ }),

/***/ "./src/app/pages/songs/edit-song/edit-song-routing.module.ts":
/*!*******************************************************************!*\
  !*** ./src/app/pages/songs/edit-song/edit-song-routing.module.ts ***!
  \*******************************************************************/
/*! exports provided: EditSongPageRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EditSongPageRoutingModule", function() { return EditSongPageRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");
/* harmony import */ var _edit_song_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./edit-song.page */ "./src/app/pages/songs/edit-song/edit-song.page.ts");




const routes = [
    {
        path: '',
        component: _edit_song_page__WEBPACK_IMPORTED_MODULE_3__["EditSongPage"]
    }
];
let EditSongPageRoutingModule = class EditSongPageRoutingModule {
};
EditSongPageRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
        exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]],
    })
], EditSongPageRoutingModule);



/***/ }),

/***/ "./src/app/pages/songs/edit-song/edit-song.module.ts":
/*!***********************************************************!*\
  !*** ./src/app/pages/songs/edit-song/edit-song.module.ts ***!
  \***********************************************************/
/*! exports provided: EditSongPageModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EditSongPageModule", function() { return EditSongPageModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm2015/common.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm2015/forms.js");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @ionic/angular */ "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
/* harmony import */ var _edit_song_routing_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./edit-song-routing.module */ "./src/app/pages/songs/edit-song/edit-song-routing.module.ts");
/* harmony import */ var _edit_song_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./edit-song.page */ "./src/app/pages/songs/edit-song/edit-song.page.ts");







let EditSongPageModule = class EditSongPageModule {
};
EditSongPageModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [
            _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
            _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"],
            _edit_song_routing_module__WEBPACK_IMPORTED_MODULE_5__["EditSongPageRoutingModule"]
        ],
        declarations: [_edit_song_page__WEBPACK_IMPORTED_MODULE_6__["EditSongPage"]]
    })
], EditSongPageModule);



/***/ }),

/***/ "./src/app/pages/songs/edit-song/edit-song.page.scss":
/*!***********************************************************!*\
  !*** ./src/app/pages/songs/edit-song/edit-song.page.scss ***!
  \***********************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL3NvbmdzL2VkaXQtc29uZy9lZGl0LXNvbmcucGFnZS5zY3NzIn0= */");

/***/ }),

/***/ "./src/app/pages/songs/edit-song/edit-song.page.ts":
/*!*********************************************************!*\
  !*** ./src/app/pages/songs/edit-song/edit-song.page.ts ***!
  \*********************************************************/
/*! exports provided: EditSongPage */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EditSongPage", function() { return EditSongPage; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _services_song_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./../../../services/song.service */ "./src/app/services/song.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @ionic/angular */ "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");





let EditSongPage = class EditSongPage {
    constructor(router, songApi, route, toastCtrl) {
        this.router = router;
        this.songApi = songApi;
        this.route = route;
        this.toastCtrl = toastCtrl;
        this.song = {
            id: '',
            albumId: '',
            title: '',
            time: ''
        };
        this.response = {
            entity: {},
            responseText: '',
            status: ''
        };
    }
    ngOnInit() {
    }
    ionViewWillEnter() {
        this.song.id = this.route.snapshot.paramMap.get('songId');
        this.songApi.findById(this.song.id).subscribe(res => {
            this.song = res;
        });
    }
    cancel() {
        this.router.navigateByUrl('/songs/' + this.song.albumId);
    }
    update() {
        this.songApi.update(this.song).subscribe(res => {
            this.response = res;
            if (this.response.status == 'SUCCESS') {
                this.successToast(this.response.responseText);
                this.cancel();
            }
            else {
                this.errorToast(this.response.responseText);
            }
        });
    }
    successToast(msg) {
        this.toast = this.toastCtrl.create({
            message: msg,
            duration: 2000,
            color: 'success'
        }).then(toastData => {
            toastData.present();
        });
    }
    errorToast(msg) {
        this.toast = this.toastCtrl.create({
            message: msg,
            duration: 2000,
            color: 'danger'
        }).then(toastData => {
            toastData.present();
        });
    }
};
EditSongPage.ctorParameters = () => [
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"] },
    { type: _services_song_service__WEBPACK_IMPORTED_MODULE_1__["SongService"] },
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_2__["ActivatedRoute"] },
    { type: _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["ToastController"] }
];
EditSongPage = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-edit-song',
        template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! raw-loader!./edit-song.page.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/edit-song/edit-song.page.html")).default,
        styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! ./edit-song.page.scss */ "./src/app/pages/songs/edit-song/edit-song.page.scss")).default]
    }),
    tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"],
        _services_song_service__WEBPACK_IMPORTED_MODULE_1__["SongService"],
        _angular_router__WEBPACK_IMPORTED_MODULE_2__["ActivatedRoute"],
        _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["ToastController"]])
], EditSongPage);



/***/ })

}]);
//# sourceMappingURL=edit-song-edit-song-module-es2015.js.map