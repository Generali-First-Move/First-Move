import Vue from 'vue'
import VueRouter from 'vue-router'
import Showpreference from '@/views/Showpreference.vue'
import Result from '@/views/Result'
import Home from '@/views/Home'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    component: Home
  },
  {
    path: '/result',
    component: Result
  },
  {
    path: '/show-preference',
    component: Showpreference
  },
]

const router = new VueRouter({
  routes
})
export default router
