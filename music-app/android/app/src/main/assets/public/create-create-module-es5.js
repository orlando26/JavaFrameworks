function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["create-create-module"], {
  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/create/create.page.html":
  /*!********************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/create/create.page.html ***!
    \********************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppPagesAlbumsCreateCreatePageHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<ion-header>\r\n  <ion-toolbar color=\"dark\">\r\n    <ion-title>create</ion-title>\r\n    <ion-buttons slot=\"end\">\r\n      <ion-button color=\"danger\" routerLink=\"/\">\r\n        <ion-icon name=\"close-outline\"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n  </ion-toolbar>\r\n</ion-header>\r\n\r\n<ion-content>\r\n\r\n  <ion-list>\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Title</ion-label>\r\n      <ion-input [(ngModel)]=\"album.title\" ></ion-input>\r\n    </ion-item>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Release Date</ion-label>\r\n      <ion-input [(ngModel)]=\"album.releaseDate\"></ion-input>\r\n    </ion-item>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Price</ion-label>\r\n      <ion-input [(ngModel)]=\"album.price\"></ion-input>\r\n    </ion-item>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Genre</ion-label>\r\n      <ion-input [(ngModel)]=\"album.genre\"></ion-input>\r\n    </ion-item>\r\n  </ion-list>\r\n\r\n  <ion-button (click)=\"saveAlbum()\" expand=\"block\" fill=\"outline\">Save</ion-button>\r\n\r\n</ion-content>\r\n";
    /***/
  },

  /***/
  "./src/app/pages/albums/create/create-routing.module.ts":
  /*!**************************************************************!*\
    !*** ./src/app/pages/albums/create/create-routing.module.ts ***!
    \**************************************************************/

  /*! exports provided: CreatePageRoutingModule */

  /***/
  function srcAppPagesAlbumsCreateCreateRoutingModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CreatePageRoutingModule", function () {
      return CreatePageRoutingModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");
    /* harmony import */


    var _create_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./create.page */
    "./src/app/pages/albums/create/create.page.ts");

    var routes = [{
      path: '',
      component: _create_page__WEBPACK_IMPORTED_MODULE_3__["CreatePage"]
    }];

    var CreatePageRoutingModule = function CreatePageRoutingModule() {
      _classCallCheck(this, CreatePageRoutingModule);
    };

    CreatePageRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
      exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
    })], CreatePageRoutingModule);
    /***/
  },

  /***/
  "./src/app/pages/albums/create/create.module.ts":
  /*!******************************************************!*\
    !*** ./src/app/pages/albums/create/create.module.ts ***!
    \******************************************************/

  /*! exports provided: CreatePageModule */

  /***/
  function srcAppPagesAlbumsCreateCreateModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CreatePageModule", function () {
      return CreatePageModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/common */
    "./node_modules/@angular/common/fesm2015/common.js");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/fesm2015/forms.js");
    /* harmony import */


    var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @ionic/angular */
    "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
    /* harmony import */


    var _create_routing_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! ./create-routing.module */
    "./src/app/pages/albums/create/create-routing.module.ts");
    /* harmony import */


    var _create_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! ./create.page */
    "./src/app/pages/albums/create/create.page.ts");

    var CreatePageModule = function CreatePageModule() {
      _classCallCheck(this, CreatePageModule);
    };

    CreatePageModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"], _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"], _create_routing_module__WEBPACK_IMPORTED_MODULE_5__["CreatePageRoutingModule"]],
      declarations: [_create_page__WEBPACK_IMPORTED_MODULE_6__["CreatePage"]]
    })], CreatePageModule);
    /***/
  },

  /***/
  "./src/app/pages/albums/create/create.page.scss":
  /*!******************************************************!*\
    !*** ./src/app/pages/albums/create/create.page.scss ***!
    \******************************************************/

  /*! exports provided: default */

  /***/
  function srcAppPagesAlbumsCreateCreatePageScss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL2FsYnVtcy9jcmVhdGUvY3JlYXRlLnBhZ2Uuc2NzcyJ9 */";
    /***/
  },

  /***/
  "./src/app/pages/albums/create/create.page.ts":
  /*!****************************************************!*\
    !*** ./src/app/pages/albums/create/create.page.ts ***!
    \****************************************************/

  /*! exports provided: CreatePage */

  /***/
  function srcAppPagesAlbumsCreateCreatePageTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CreatePage", function () {
      return CreatePage;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _services_album_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! ./../../../services/album.service */
    "./src/app/services/album.service.ts");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _ionic_angular__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @ionic/angular */
    "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");

    var CreatePage = /*#__PURE__*/function () {
      function CreatePage(albumApi, toastCtrl) {
        _classCallCheck(this, CreatePage);

        this.albumApi = albumApi;
        this.toastCtrl = toastCtrl;
        this.response = {
          entity: {},
          responseText: '',
          status: ''
        };
        this.album = {
          title: '',
          releaseDate: '',
          price: '',
          genre: ''
        };
      }

      _createClass(CreatePage, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }, {
        key: "saveAlbum",
        value: function saveAlbum() {
          var _this = this;

          this.albumApi.saveAlbum(this.album).subscribe(function (res) {
            _this.response = res;
            console.log(_this.response);

            if (_this.response.status == "SUCCESS") {
              _this.successToast(_this.response.responseText);
            } else {
              _this.errorToast(_this.response.responseText);
            }
          });
        }
      }, {
        key: "successToast",
        value: function successToast(msg) {
          this.toast = this.toastCtrl.create({
            message: msg,
            duration: 2000,
            color: 'success'
          }).then(function (toastData) {
            toastData.present();
          });
        }
      }, {
        key: "errorToast",
        value: function errorToast(msg) {
          this.toast = this.toastCtrl.create({
            message: msg,
            duration: 2000,
            color: 'danger'
          }).then(function (toastData) {
            toastData.present();
          });
        }
      }]);

      return CreatePage;
    }();

    CreatePage.ctorParameters = function () {
      return [{
        type: _services_album_service__WEBPACK_IMPORTED_MODULE_1__["AlbumService"]
      }, {
        type: _ionic_angular__WEBPACK_IMPORTED_MODULE_3__["ToastController"]
      }];
    };

    CreatePage = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["Component"])({
      selector: 'app-create',
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./create.page.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/create/create.page.html"))["default"],
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./create.page.scss */
      "./src/app/pages/albums/create/create.page.scss"))["default"]]
    }), tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_album_service__WEBPACK_IMPORTED_MODULE_1__["AlbumService"], _ionic_angular__WEBPACK_IMPORTED_MODULE_3__["ToastController"]])], CreatePage);
    /***/
  }
}]);
//# sourceMappingURL=create-create-module-es5.js.map