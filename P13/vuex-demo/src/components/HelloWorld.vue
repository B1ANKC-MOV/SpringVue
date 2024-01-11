<template>
  <div class="hello">
    <!-- {{this.$store.state.count}} -->
    {{count}}      
    <button @click="add">+1</button>

    <ul>
      <!-- <li v-for="todo in todos" :key="todo.id">{{todo.text}}</li> -->
      <li v-for="todo in doneTodos" :key="todo.id">{{todo.text}}</li>
    </ul>
  </div>
</template>

<script>
import { mapState,mapGetters } from 'vuex'
export default {
  name: 'HelloWorld',
  // computed:{
  //   count(){
  //     return this.$store.state.count
  //   }
  // },
  computed: {
    ...mapState([
    'count','todos'
    ]),
    ...mapGetters([
      'doneTodos'
    ])
  },
  methods:{
    add(){
      // this.$store.state.count = this.$store.state.count+1
      this.$store.commit("increment",2)
    }
  },
  getters: {
    doneTodos: state => {
      return state.todos.filter(todo => todo.done)
    }
  }
}
</script>

<style scoped>

</style>
