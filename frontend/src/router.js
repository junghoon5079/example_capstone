
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import UiView from "./components/UiView"
import UiViewDetail from "./components/UiViewDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import StoreManager from "./components/listers/StoreCards"
import StoreDetail from "./components/listers/StoreDetail"

import OrderListView from "./components/OrderListView"
import OrderListViewDetail from "./components/OrderListViewDetail"

import OrderInfoView from "./components/OrderInfoView"
import OrderInfoViewDetail from "./components/OrderInfoViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/uis',
                name: 'UiView',
                component: UiView
            },
            {
                path: '/uis/:id',
                name: 'UiViewDetail',
                component: UiViewDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/stores',
                name: 'StoreManager',
                component: StoreManager
            },
            {
                path: '/stores/:id',
                name: 'StoreDetail',
                component: StoreDetail
            },

            {
                path: '/orderLists',
                name: 'OrderListView',
                component: OrderListView
            },
            {
                path: '/orderLists/:id',
                name: 'OrderListViewDetail',
                component: OrderListViewDetail
            },

            {
                path: '/orderInfos',
                name: 'OrderInfoView',
                component: OrderInfoView
            },
            {
                path: '/orderInfos/:id',
                name: 'OrderInfoViewDetail',
                component: OrderInfoViewDetail
            },


    ]
})
