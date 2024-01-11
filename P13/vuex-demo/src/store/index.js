import Vue from "vue";
import Vuex from 'vuex'
Vue.use(Vuex)

const store = new Vuex.Store({
  state: {
    count: 0,
    todos: [
      { id: 1, text: 'eat', done: true },
      { id: 2, text: 'sleep', done: false }
    ]
  },
  mutations: {
    increment (state,n) {
      state.count += n
    }
  },
  getters: {
    doneTodos: state => {
      return state.todos.filter(todo => todo.done)
    }
  }
})

export default store