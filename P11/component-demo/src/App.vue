<template>
  <div id="app">
    <!-- <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/> -->
    <movie v-for="movie in movies" :key="movie.id" :title="movie.title" :rating="movie.rating"></movie>
    <hello></hello>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import Movie from './components/Movie.vue'
import Hello from './components/Hello.vue'
// import axios from 'axios'


export default {
  name: 'App',
  data:function(){
    return{
      movies:[
        {id:1,title:"Transformers1",rating:5.2},
        {id:2,title:"Transformers3",rating:4.5},
        {id:3,title:"Transformers1",rating:4.4},
        {id:4,title:"Bumblebee",rating:4.6},
      ]
    }
  },
  created:function(){
    // console.log("App组件被创建了")
    axios.get("http://localhost:8088/user/findAll").then(function(response){
      console.log(response)
    })
  },
  mounted:function(){
    console.log("App被挂载完毕")
  },
  components: {
    // HelloWorld
    Movie,
    Hello
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
