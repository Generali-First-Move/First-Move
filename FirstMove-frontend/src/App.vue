

<template>
  <div id="app" >
    <Firstmove />
    <router-view/>
    <Firstmovefooter />

  </div>
</template>

<script>

  import Firstmove from '@/components/Firstmove.vue';
  import Firstmovefooter from "./components/Firstmovefooter";

  export default {
    components:{
      Firstmovefooter,
      Firstmove,
    }
  }

</script>


<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
  color: white;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

#home.navbar-text{
  color: white;
}

</style>
