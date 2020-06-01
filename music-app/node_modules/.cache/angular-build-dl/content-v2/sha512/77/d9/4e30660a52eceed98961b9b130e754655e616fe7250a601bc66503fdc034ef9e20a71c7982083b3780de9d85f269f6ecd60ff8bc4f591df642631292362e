function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["edit-edit-module"], {
  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/edit/edit.page.html":
  /*!****************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/edit/edit.page.html ***!
    \****************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppPagesAlbumsEditEditPageHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<ion-header>\r\n  <ion-toolbar color=\"dark\">\r\n    <ion-title>Edit Album</ion-title>\r\n    <ion-buttons slot=\"end\">\r\n      <ion-button color=\"danger\" routerLink=\"/\">\r\n        <ion-icon name=\"close-outline\"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n  </ion-toolbar>\r\n</ion-header>\r\n\r\n<ion-content>\r\n  <ion-list>\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Title</ion-label>\r\n      <ion-input [(ngModel)]=\"album.title\" ></ion-input>\r\n    </ion-item>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Release Date</ion-label>\r\n      <ion-input [(ngModel)]=\"album.releaseDate\"></ion-input>\r\n    </ion-item>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Price</ion-label>\r\n      <ion-input [(ngModel)]=\"album.price\"></ion-input>\r\n    </ion-item>\r\n\r\n    <ion-item>\r\n      <ion-label position=\"floating\">Genre</ion-label>\r\n      <ion-input [(ngModel)]=\"album.genre\"></ion-input>\r\n    </ion-item>\r\n  </ion-list>\r\n\r\n  <ion-button (click)=\"update()\" expand=\"block\" fill=\"outline\">Update</ion-button>\r\n\r\n\r\n</ion-content>\r\n";
    /***/
  },

  /***/
  "./src/app/pages/albums/edit/edit-routing.module.ts":
  /*!**********************************************************!*\
    !*** ./src/app/pages/albums/edit/edit-routing.module.ts ***!
    \**********************************************************/

  /*! exports provided: EditPageRoutingModule */

  /***/
  function srcAppPagesAlbumsEditEditRoutingModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "EditPageRoutingModule", function () {
      return EditPageRoutingModule;
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


    var _edit_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./edit.page */
    "./src/app/pages/albums/edit/edit.page.ts");

    var routes = [{
      path: '',
      component: _edit_page__WEBPACK_IMPORTED_MODULE_3__["EditPage"]
    }];

    var EditPageRoutingModule = function EditPageRoutingModule() {
      _classCallCheck(this, EditPageRoutingModule);
    };

    EditPageRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
      exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
    })], EditPageRoutingModule);
    /***/
  },

  /***/
  "./src/app/pages/albums/edit/edit.module.ts":
  /*!**************************************************!*\
    !*** ./src/app/pages/albums/edit/edit.module.ts ***!
    \**************************************************/

  /*! exports provided: EditPageModule */

  /***/
  function srcAppPagesAlbumsEditEditModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "EditPageModule", function () {
      return EditPageModule;
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


    var _edit_routing_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! ./edit-routing.module */
    "./src/app/pages/albums/edit/edit-routing.module.ts");
    /* harmony import */


    var _edit_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! ./edit.page */
    "./src/app/pages/albums/edit/edit.page.ts");

    var EditPageModule = function EditPageModule() {
      _classCallCheck(this, EditPageModule);
    };

    EditPageModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"], _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"], _edit_routing_module__WEBPACK_IMPORTED_MODULE_5__["EditPageRoutingModule"]],
      declarations: [_edit_page__WEBPACK_IMPORTED_MODULE_6__["EditPage"]]
    })], EditPageModule);
    /***/
  },

  /***/
  "./src/app/pages/albums/edit/edit.page.scss":
  /*!**************************************************!*\
    !*** ./src/app/pages/albums/edit/edit.page.scss ***!
    \**************************************************/

  /*! exports provided: default */

  /***/
  function srcAppPagesAlbumsEditEditPageScss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL2FsYnVtcy9lZGl0L2VkaXQucGFnZS5zY3NzIn0= */";
    /***/
  },

  /***/
  "./src/app/pages/albums/edit/edit.page.ts":
  /*!************************************************!*\
    !*** ./src/app/pages/albums/edit/edit.page.ts ***!
    \************************************************/

  /*! exports provided: EditPage */

  /***/
  function srcAppPagesAlbumsEditEditPageTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "EditPage", function () {
      return EditPage;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");
    /* harmony import */


    var _services_album_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! ./../../../services/album.service */
    "./src/app/services/album.service.ts");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @ionic/angular */
    "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");

    var EditPage = /*#__PURE__*/function () {
      function EditPage(albumApi, route, toastCtrl, router) {
        _classCallCheck(this, EditPage);

        this.albumApi = albumApi;
        this.route = route;
        this.toastCtrl = toastCtrl;
        this.router = router;
        this.album = {
          id: '',
          title: '',
          releaseDate: '',
          price: '',
          genre: ''
        };
        this.response = {
          entity: {},
          responseText: '',
          status: ''
        };
      }

      _createClass(EditPage, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }, {
        key: "ionViewWillEnter",
        value: function ionViewWillEnter() {
          var _this = this;

          this.album.id = this.route.snapshot.paramMap.get('albumId');
          this.albumApi.findById(this.album.id).subscribe(function (res) {
            _this.album = res;
          });
        }
      }, {
        key: "update",
        value: function update() {
          var _this2 = this;

          this.albumApi.update(this.album).subscribe(function (res) {
            _this2.response = res;

            if (_this2.response.status === 'SUCCESS') {
              _this2.successToast(_this2.response.responseText);

              _this2.router.navigateByUrl('/');
            } else {
              _this2.errorToast(_this2.response.responseText);
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

      return EditPage;
    }();

    EditPage.ctorParameters = function () {
      return [{
        type: _services_album_service__WEBPACK_IMPORTED_MODULE_2__["AlbumService"]
      }, {
        type: _angular_router__WEBPACK_IMPORTED_MODULE_1__["ActivatedRoute"]
      }, {
        type: _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["ToastController"]
      }, {
        type: _angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]
      }];
    };

    EditPage = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
      selector: 'app-edit',
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./edit.page.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/edit/edit.page.html"))["default"],
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./edit.page.scss */
      "./src/app/pages/albums/edit/edit.page.scss"))["default"]]
    }), tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_album_service__WEBPACK_IMPORTED_MODULE_2__["AlbumService"], _angular_router__WEBPACK_IMPORTED_MODULE_1__["ActivatedRoute"], _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["ToastController"], _angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])], EditPage);
    /***/
  }
}]);
//# sourceMappingURL=edit-edit-module-es5.js.map