import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import 'font-awesome/css/font-awesome.min.css'

Vue.config.productionTip = false
// 注册Element
Vue.use(ElementUI);

new Vue({
  render: h => h(App),
}).$mount('#app')
