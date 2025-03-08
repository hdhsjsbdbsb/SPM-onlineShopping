import { createMemoryHistory, createRouter } from 'vue-router'

import HelloWorld from './components/HelloWorld.vue'
import AboutView from './components/AboutView.vue'
import RegisterComponent from './components/RegisterComponent.vue'

const routes = [
  { path: '/login', component: HelloWorld },
  { path: '/about', component: AboutView },
  { path: '/register', component: RegisterComponent },
]

const router = createRouter({
  history: createMemoryHistory(),
  routes,
})

export default router