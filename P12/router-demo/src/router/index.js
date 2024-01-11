import VueRouter from "vue-router";
import Vue from "vue";
import Discover from '../components/Discover.vue'
import Friends from '../components/Friends.vue'
import My from '../components/My.vue'
import TopList from '../components/TopList'
import PlayList from '../components/PlayList'
import Product from '../components/Product'

// 将VueRouter设置为Vue的插件
Vue.use(VueRouter)

const router = new VueRouter({
    // 指定hash属性与组件的对应关系
    routes:[
        // 当用户访问 / 时，跳转到/discover
        {path:'/',redirect:'/discover'},
        {
            path:'/discover',
            component:Discover,
            // 通过children属性，嵌套声明子路由
            children:[
                {path:'toplist',component:TopList},
                {path:'playlist',component:PlayList},
            ]
        },
        {path:'/friends',component:Friends},
        {
            path:'/my',
            component:My,
            children:[
                {path:":id",component:Product,props:true},
            ]
        },
    ]
})

export default router