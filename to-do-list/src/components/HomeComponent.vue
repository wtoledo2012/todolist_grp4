<!-- src/components/Home.vue -->
<template>
    <div>
      <h1>Home</h1>
      <p>Bienvenido a la página principal.</p>
      <router-link to="/login">Login</router-link>
    </div>
  </template>
  
  <script>
  export default {
    name: 'HomeComponent',
  };
  </script>