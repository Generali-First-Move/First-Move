<template>
    <div id="result">
        <div><br></div>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-5">
                <h3>Burtscheid</h3>
                <p>Mit seinen zwei Kur- und Rehakliniken ist Burtscheid zurecht Aachens Kurviertel. Aber Burtscheid ist auch ein hübscher Stadtteil, in dem sich selbst Aachener wie im Urlaub fühlen. Mit seinen vielen tollen Cafés, dem Wochenmarkt & Parks ist Burtscheid ein Ort mit Aufenthaltsqualität. Im Frühling veranstalten die Burtscheider ein eigenes Weinfest,
                    im Winter einen kleinen Weihnachtsmarkt und am Fettdonnerstag stehen die Zeichen auf Karneval.</p>
                <div class="google-maps">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d10094.445629951531!2d6.084487735032457!3d50.76423872231622!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c09be02b9ad17f%3A0x262760fd637fdee1!2s52066%20Burtscheid!5e0!3m2!1sde!2sde!4v1573582989242!5m2!1sde!2sde" width="400" height="300" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                   </div>
            </div>
            <div class="col-md-5">
                <h3>Präferenzen-Erfüllung</h3>
                <fieldset>
                    <i class="fas fa-check-square"></i> Gute Busanbindung
                    <br>
                    <i class="fas fa-check-square"></i> Nähe Bahnhof
                    <br>
                    <i class="fas fa-times-circle"></i> Innenstadt
                    <br>
                    <i class="fas fa-check-square"></i> Park
                    <br>
                    <i class="fas fa-times-circle"></i> Nigthlife
                    <br>
                </fieldset>
            </div>
        </div>
        <br><br>
        <div class="form-group row">
            <div class="col-md-1"></div>
            <div class="col-md-5">
                <h3>Frankenberger Viertel</h3>
                <p>Das Frankenberger Viertel oder einfach Frankenberg war ein Ortsteil der Stadt Burtscheid und kam 1897 durch die Eingemeindung von Burtscheid zu Aachen.[1] Das Viertel liegt nördlich der Bahnstrecke Aachen–Köln zwischen dem eigentlichen Ortskern Burtscheids und Forst in Aachen,
                    Nordrhein-Westfalen. Es ist bekannt für die Burg Frankenberg (oder Frankenburg).</p>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d24007.69074133733!2d6.086294437620337!3d50.76634904279107!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c09be265148c8b%3A0x8bd6ae4730c43098!2sFrankenberger%20Viertel!5e0!3m2!1sde!2sde!4v1573583228966!5m2!1sde!2sde" width="400" height="300" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
            </div>
            <br>
            <div class="col-md-5">
                <h3>Präferenzen-Erfüllung</h3>
                <fieldset>

                    <i class="fas fa-check-square"></i> Gute Busanbindung
                    <br>
                    <i class="fas fa-check-square"></i> Nähe Bahnhof
                    <br>
                    <i class="fas fa-times-circle"></i> Innenstadt
                    <br>
                    <i class="fas fa-check-square"></i> Park
                    <br>
                </fieldset>
            </div>
        </div>
        <div id="footer">
            <hr width="100%" style="height: 3px; background-color: white">
            <footer >
                <div class="container-fluid text-center text-md-left">
                    <div class="row" >
                        <div class="col-md-8" >
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

</script>

<style>
#result{
    background-color: #C5281C;
    color: white;
}
    #result fieldset{
        background-color: lightgrey;
        border-radius: 6px;
        color: black;
    }
    #footer{
        background-color: white;
        font-variant: small-caps;
    }

    #footer p{
        color: black;
    }
    #result h3{
        font-variant: small-caps;
    }

    #result h5{
        color: black;
    }

#link p{
    color: black;
}

#result row{
text-align: center;
    }

</style>