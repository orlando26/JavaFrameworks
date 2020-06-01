(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["create-song-create-song-module"],{

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/create-song/create-song.page.html":
/*!*****************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/create-song/create-song.page.html ***!
  \*****************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<ion-header>\r\n  <ion-toolbar color=\"dark\">\r\n    <ion-title>create song</ion-title>\r\n    <ion-buttons slot=\"end\">\r\n      <ion-button color=\"danger\" (click)=\"cancel()\">\r\n        <ion-icon name=\"close-outline\"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n  </ion-toolbar>\r\n</ion-header>\r\n\r\n<ion-content>\r\n  <ion-list>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Title</ion-label>\r\n      <ion-input [(ngModel)]=\"song.title\"></ion-input>\r\n    </ion-item>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Time</ion-label>\r\n      <ion-input [(ngModel)]=\"song.time\"></ion-input>\r\n    </ion-item>\r\n\r\n  </ion-list>\r\n\r\n  <ion-button (click)=\"saveSong()\" expand=\"block\" fill=\"outline\">Save</ion-button>\r\n\r\n</ion-content>\r\n");

/***/ }),

/***/ "./src/app/pages/songs/create-song/create-song-routing.module.ts":
/*!***********************************************************************!*\
  !*** ./src/app/pages/songs/create-song/create-song-routing.module.ts ***!
  \***********************************************************************/
/*! exports provided: CreateSongPageRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CreateSongPageRoutingModule", function() { return CreateSongPageRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");
/* harmony import */ var _create_song_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./create-song.page */ "./src/app/pages/songs/create-song/create-song.page.ts");




const routes = [
    {
        path: '',
        component: _create_song_page__WEBPACK_IMPORTED_MODULE_3__["CreateSongPage"]
    }
];
let CreateSongPageRoutingModule = class CreateSongPageRoutingModule {
};
CreateSongPageRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
        exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]],
    })
], CreateSongPageRoutingModule);



/***/ }),

/***/ "./src/app/pages/songs/create-song/create-song.module.ts":
/*!***************************************************************!*\
  !*** ./src/app/pages/songs/create-song/create-song.module.ts ***!
  \***************************************************************/
/*! exports provided: CreateSongPageModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CreateSongPageModule", function() { return CreateSongPageModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm2015/common.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm2015/forms.js");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @ionic/angular */ "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
/* harmony import */ var _create_song_routing_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./create-song-routing.module */ "./src/app/pages/songs/create-song/create-song-routing.module.ts");
/* harmony import */ var _create_song_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./create-song.page */ "./src/app/pages/songs/create-song/create-song.page.ts");







let CreateSongPageModule = class CreateSongPageModule {
};
CreateSongPageModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [
            _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
            _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"],
            _create_song_routing_module__WEBPACK_IMPORTED_MODULE_5__["CreateSongPageRoutingModule"]
        ],
        declarations: [_create_song_page__WEBPACK_IMPORTED_MODULE_6__["CreateSongPage"]]
    })
], CreateSongPageModule);



/***/ }),

/***/ "./src/app/pages/songs/create-song/create-song.page.scss":
/*!***************************************************************!*\
  !*** ./src/app/pages/songs/create-song/create-song.page.scss ***!
  \***************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL3NvbmdzL2NyZWF0ZS1zb25nL2NyZWF0ZS1zb25nLnBhZ2Uuc2NzcyJ9 */");

/***/ }),

/***/ "./src/app/pages/songs/create-song/create-song.page.ts":
/*!*************************************************************!*\
  !*** ./src/app/pages/songs/create-song/create-song.page.ts ***!
  \*************************************************************/
/*! exports provided: CreateSongPage */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CreateSongPage", function() { return CreateSongPage; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @ionic/angular */ "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");
/* harmony import */ var _services_song_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./../../../services/song.service */ "./src/app/services/song.service.ts");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");





let CreateSongPage = class CreateSongPage {
    constructor(songApi, route, toastCtrl, router) {
        this.songApi = songApi;
        this.route = route;
        this.toastCtrl = toastCtrl;
        this.router = router;
        this.response = {
            entity: {},
            responseText: '',
            status: ''
        };
        this.song = {
            albumId: '',
            title: '',
            time: ''
        };
    }
    ngOnInit() {
    }
    ionViewWillEnter() {
        this.song.albumId = this.route.snapshot.paramMap.get('albumId');
    }
    cancel() {
        this.router.navigateByUrl('/songs/' + this.song.albumId);
    }
    saveSong() {
        this.songApi.saveSong(this.song).subscribe(res => {
            this.response = res;
            console.log(this.response);
            if (this.response.status == "SUCCESS") {
                this.successToast(this.response.responseText);
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
CreateSongPage.ctorParameters = () => [
    { type: _services_song_service__WEBPACK_IMPORTED_MODULE_3__["SongService"] },
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_2__["ActivatedRoute"] },
    { type: _ionic_angular__WEBPACK_IMPORTED_MODULE_1__["ToastController"] },
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"] }
];
CreateSongPage = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_4__["Component"])({
        selector: 'app-create-song',
        template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! raw-loader!./create-song.page.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/create-song/create-song.page.html")).default,
        styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! ./create-song.page.scss */ "./src/app/pages/songs/create-song/create-song.page.scss")).default]
    }),
    tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_song_service__WEBPACK_IMPORTED_MODULE_3__["SongService"],
        _angular_router__WEBPACK_IMPORTED_MODULE_2__["ActivatedRoute"],
        _ionic_angular__WEBPACK_IMPORTED_MODULE_1__["ToastController"],
        _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
], CreateSongPage);



/***/ })

}]);
//# sourceMappingURL=create-song-create-song-module-es2015.js.map