import { createMemoryHistory, createRouter } from 'vue-router'

import AboutView from './components/AboutView.vue'
import RegisterComponent from './components/RegisterComponent.vue'
import LoginComponent from './components/LoginComponent.vue'

const routes = [
  { path: '/login', component: LoginComponent },
  { path: '/about', component: AboutView },
  { path: '/register', component: RegisterComponent },
]

const router = createRouter({
  history: createMemoryHistory(),
  routes,
})

export default router