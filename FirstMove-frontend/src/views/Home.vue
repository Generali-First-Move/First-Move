<template>
   <div id="start">
    <div id="text">
        <br>
        <h1>Willkommen zu FirstMove!</h1>
        <p>FirstMove ist eine Plattform, die dir dabei helfen soll den besten Wohnort für dich zu finden. Vielleicht bist du gerade dabei dein Leben etwas umzukrempeln,
            du wurdest an einer Hochschule in einer anderen Stadt angenommen, eine
            neue Arbeitstelle gefunden oder möchtest du einfach einen Neuanfang beginnen, dann bist du hier genau richtig!
            Durch deine individuellen Eingaben und Präferenzen versuchen wir den bestmöglichen Wohnort an deinem Zielstandort zu finden.</p>
        <div>
            <br>
            <p>In welche Stadt möchtest du gerne ziehen?</p>
            <form action="Showpreference.vue">
                <input type="text" placeholder="Stadt/PLZ" name="search" list="search" size="40">
                <datalist id="search">
                    <option value="Aachen/52066 Burtscheid" />
                    <option value="Aachen/52078 Brand" />
                    <option value="Aachen/52078 Forst" />
                </datalist>
                <router-link to="/show-preference" class="nav-link"><button type="button" name="action" class="btn btn-dark btn-lg"><i class="fa fa-search"></i></button></router-link>
            </form>
        </div>
        <img src="@/assets/linkedin_banner_image_2.png" alt="banner" width="1000" height="400">
    </div>

       <div id="footer">
           <hr width="100%" style="height: 3px; background-color: white">
           <footer >
               <div class="container-fluid text-center text-md-left">
                   <div class="row">
                       <div class="col-md-8">
                           <h5>GeneraliAG</h5>
                           <p>Gerne könnt ihr uns in den Sozialen Netzwerken weiter verfolgen.</p>
                       </div>
                   <hr class="clearfix w-100 d-md-none pb-3">
                       <div class="col-md-3">
                           <h5 class="text-uppercase">Soziale Netzwerke</h5>
                           <div class="form-group row" id="link">
                               <p>...</p><i class="fab fa-instagram"></i>
                               <p>...</p><i class="fab fa-twitter-square"></i>
                               <p>...</p><i class="fab fa-facebook-square"></i>
                           </div>
                       </div>
                   </div>
               </div>
           </footer>
       </div>
   </div>

</template>

<script>
    export default {
        name: "Home"
    }
</script>


<style>
#start{
    background-color: #C5281C;
    color: white;
}

#text{
    padding-left: 80px;
    padding-right: 80px;
}

    #start image{
        padding: 0px 0px;
    }
    #link{
        color: black;
    }
    #link p{
        color: white;
    }
    #start input{
        border-radius: 6px;
    }

    #footer{
        background-color: white;
        font-variant: small-caps;
    }

    #footer h5{
        color: black;
    }

</style>