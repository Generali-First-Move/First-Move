<template>
    <div id="home">
        <nav class="navbar navbar-light" style="background-color: maroon">
            <h3 style="color: white">FirstMove</h3>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation" style="background-color: white">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup" >
                <div class="navbar-nav" >
                    <router-link to="/" class="nav-link" style="color: white">Home</router-link>
                    <router-link to="/show-preference" class="nav-link" style="color: white">Präferenzen</router-link>
                    <router-link to="/result" class="nav-link" style="color: white">Kontakt</router-link>
                    <router-link to="/result" class="nav-link" style="color: white">Impressum</router-link>
                </div>
            </div>
        </nav>

    </div>
</template>