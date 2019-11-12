<template>
   <div>
    <div>
        <br>
        <h1>Willkommen zu FirstMove!</h1>
        <p>FirstMove ist eine Plattform, die dir dabei helfen soll den besten Wohnort für dich zu finden.
            <br>Durch deine individuellen Eingaben und Präferenzen versuchen wir den bestmöglichen Wohnort an deinem Zielstandort zu finden</p>
    </div>
    <div>
        <form action="Showpreference.vue">
        <input type="text" placeholder="Search.." name="search">
        <button type="button"><i class="fa fa-search"></i></button>
        </form>
    </div>
   </div>
</template>

<script>
    export default {
        name: "Home"
    }
</script>

<style scoped>

</style>