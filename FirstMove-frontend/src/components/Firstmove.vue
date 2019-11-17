<template>
    <div id="home" >
        <nav class="navbar navbar-expand-lg navbar-light bg-light" id="pic">
            <img src="@/assets/logo_transparent.png" width="130" height="115" alt="logo">
            <div class="nav justify-content-center" id="navbarNav" >
                <div class="navbar-nav" >
                    <router-link to="/" class="nav-link" style="color: black">Home</router-link>
                    <router-link to="/show-preference" class="nav-link" style="color: black">Präferenzen</router-link>
                    <router-link to="/result" class="nav-link" style="color: black">Kontakt</router-link>
                    <router-link to="/result" class="nav-link" style="color: black">Impressum</router-link>
                </div>
            </div>
        </nav>

    </div>
</template>

<style>
#home{
    background-color: maroon;
    padding: 0;
    margin: 0;
}
    #navbarNav{
        text-align: center;
        padding-left: 310px;
    }

    #pic{
        padding: 0;
        margin: 0;
    }
    #navbarNav{
        font-variant: small-caps;
        font-size: large;
    }



</style>