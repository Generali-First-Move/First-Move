import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/css/bootstrap.css'
import '@fortawesome/fontawesome-free/css/all.css'
import '@fortawesome/fontawesome-free/sprites/solid.svg'
import Vue from 'vue'
import App from './App.vue'
import router from './router'

import VueSlider from 'vue-slider-component'
import 'vue-slider-component/theme/default.css'

Vue.component('VueSlider', VueSlider)

require("dotenv").config();

import * as VueGoogleMaps from "vue2-google-maps";
Vue.use(VueGoogleMaps, {
  load: { key: "AIzaSyCiPLPCrNjnpaHnIOqCnTV9v4RY0MAqTwc",
    libraries:"places" // necessary for places input
  }
});

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')

