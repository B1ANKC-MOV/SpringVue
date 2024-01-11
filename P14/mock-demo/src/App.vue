<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <img alt="Mock logo" :src="img">
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'App',
  data:function(){
    return {
      img:""
    }
  },
  mounted:function(){
    axios.get("/product/search?id=10").then(res => {
      // console.log(res)
      console.log(res.data.data.img)
      this.img = res.data.data.img
    })
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
