import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import 'font-awesome/css/font-awesome.min.css'
import axios from 'axios'

//配置请求根路径
axios.defaults.baseURL = 'http://localhost:8088'
//将axios 作为全局的自定义属性，每个组件可以在内部直接访问(Vue3)
// app.config.globalProperties.$http = axios
//将axios 作为全局的自定义属性，每个组件可以在内部直接访间(Vue2)
Vue.prototype.$http = axios

Vue.config.productionTip = false
// 注册Element
Vue.use(ElementUI);

new Vue({
  render: h => h(App),
}).$mount('#app')
