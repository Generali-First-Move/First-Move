
<template>
    <div id="result">
        <br>
        <div class="row">
            <div class="col-md-5">
                <h1>Ihre Auswahl:</h1>
                <form action="/change" id="filter">
                    <button id="btn-filter" type="button" class="btn btn-primary px-3"><i class="fas fa-filter" aria-hidden="true"></i>Filter</button>

                </form>
            </div>
        </div>

        <div class="form-group row">

            <div class="col-md-9">
                <!--
                    <div class="google-map" ref="googleMap"></div>
                     <template v-if="Boolean(this.google) && Boolean(this.map)">
                              <slot
                                         :google="google"
                                         :map="map"
                                 />
                             </template>
                             -->

                <div class="google-maps">
                    <iframe id="map"  src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d10094.445629951531!2d6.084487735032457!3d50.76423872231622!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c09be02b9ad17f%3A0x262760fd637fdee1!2s52066%20Burtscheid!5e0!3m2!1sde!2sde!4v1573582989242!5m2!1sde!2sde" width="1400" height="600" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                </div>

            </div>

            <div class="col-md-3">
                <h3>Präferenzen-Erfüllung</h3>
                <fieldset>
                    <details>
                        <summary id="summary1"> Stadt Bereich 1: </summary>
                        <div id="green">
                            <h3 class ="Pro">Pro:</h3>
                            <i class="fas fa-check-square"> Gute Busanbindung </i>
                            <br>
                            <i class="fas fa-check-square"> sicherheit </i>
                            <br>
                            <i class="fas fa-check-square"> Ruhe/Atmosphäre </i>
                            <br>
                            <i class="fas fa-check-square"> Essensmöglichkeiten </i>
                            <br>
                            <i class="fas fa-check-square">Nähe Bahnhof</i>
                            <br>
                            <i class="fas fa-check-square"> Uni Nähe </i>
                            <br>
                            <i class="fas fa-check-square"> Park</i>
                            <br>
                            <br>
                            <h3 class ="Contra">Contra:</h3>
                            <i class="fas fa-times-circle"></i> Innenstadt
                            <br>
                        </div>
                    </details>

                    <details>
                        <summary id="summary2"> Stadt Bereich 2: </summary>
                        <div id ="orange">
                            <h3 class ="Pro">Pro:</h3>
                            <i class="fas fa-check-square"> Gute Busanbindung </i>
                            <br>
                            <i class="fas fa-check-square"> sicherheit </i>
                            <br>
                            <i class="fas fa-check-square"> Ruhe/Atmosphäre </i>
                            <br>
                            <i class="fas fa-check-square"> Essensmöglichkeiten </i>
                            <br>
                            <i class="fas fa-check-square">Nähe Bahnhof</i>
                            <br>
                            <i class="fas fa-check-square"> Uni Nähe </i>
                            <br>
                            <i class="fas fa-check-square"> Park</i>
                            <br>
                            <br>
                            <h3 class ="Contra">Contra:</h3>
                            <i class="fas fa-times-circle"></i> Innenstadt
                            <br>
                        </div>
                    </details>

                    <details>
                        <summary id="summary3"> Stadt Bereich 3: </summary>
                        <div id="red">
                            <h3 class ="Pro">Pro:</h3>
                            <i class="fas fa-check-square"> Gute Busanbindung </i>
                            <br>
                            <i class="fas fa-check-square"> sicherheit </i>
                            <br>
                            <i class="fas fa-check-square"> Ruhe/Atmosphäre </i>
                            <br>
                            <i class="fas fa-check-square"> Essensmöglichkeiten </i>
                            <br>
                            <i class="fas fa-check-square">Nähe Bahnhof</i>
                            <br>
                            <i class="fas fa-check-square"> Uni Nähe </i>
                            <br>
                            <i class="fas fa-check-square"> Park</i>
                            <br>
                            <br>
                            <h3 class ="Contra">Contra:</h3>
                            <i class="fas fa-times-circle"></i> Innenstadt
                            <br>
                        </div>
                    </details>

                </fieldset>
            </div>
        </div>

        <div id="footer">
            <hr width="100%" style="height: 3px; background-color: white">
            <footer >
                <div class="container-fluid text-center text-md-left">
                    <div class="row">
                        <div class="col-md-9">
                            <p>In Zusammenarbeit mit:</p>
                            <a href="https://www.generali.de/ueber-generali/ueber-uns/"><img src="@/assets/generali.png" alt="Bild" width="90" height="70"/></a>
                        </div>
                        <hr class="clearfix w-100 d-md-none pb-3">
                        <div class="col-md-2">
                            <h5 class="text-uppercase">Soziale Netzwerke</h5>
                            <div class="form-group row" id="link">
                                <p>...</p><i class="fab fa-instagram"></i>
                                <p>...</p><i class="fab fa-twitter-square"></i>
                                <p>...</p><i class="fab fa-facebook-square"></i>
                            </div>
                            <p> © Copyright</p>
                        </div>
                    </div>
                </div>

            </footer>
        </div>
    </div>
</template>


<!--
<script>

import GoogleMapsApiLoader from 'google-maps-api-loader'

export default {
    props: {
        mapConfig: Object,
        apiKey: String,
    },

    data() {
        return {
            google: null,
            map: null
        }
    },

    async mounted() {
        const googleMapApi = await GoogleMapsApiLoader({
            apiKey: this.apiKey
        })
        this.google = googleMapApi
        this.initializeMap()
    },

    methods: {
        initializeMap() {
            const mapContainer = this.$refs.googleMap
            this.map = new this.google.maps.Map(
                mapContainer, this.mapConfig
            )
        }
    }
}

</script>
-->

<style>
    .fas
    {
        padding-right: 5px;
    }


    #filter
    {
        width: 75px;
        padding-rigt: 1000px;
    }

    #btn-filter
    {
        width:100px;
    }

    .form-group
    {
        margin-bottom: -1rem;

    }
    #result{
        background-color: #C5281C;
        height: 730px;
        color: white;
        padding-left: 10px;

    }
    #result fieldset{
        background-color: white;
        border-radius: 4px;
        color: black;
        width: 250px;

    }

    #result .Pro{
        color:green;
        text-decoration: underline;
        text-decoration-color: black;
    }
    #result .Contra
    {
        color:red;
        text-decoration: underline;
        text-decoration-color: black;
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

    #result h1
    {
        text-align: left;
    }
    #link p{
        color: black;
    }
    .col-md-1
    {
        text-align: left;
    }

    .col-md-3{
        left:5px;
        text-align: left;
        bottom: 43px;
    }

    .col-md-5
    {
        text-align: center;
        padding-bottom: 5px;
    }

    .col-md-2
    {
        text-align: left;
        left:15px;
    }


    {
        left: 201px;
    }
    .google-maps
    {
        text-align: left;
    }

    #result row{
        text-align: center;
    }


    * {
        box-sizing: border-box;
    }

    img {
        max-width: 100%;
    }

    .details-wrapper {
        width: 75vw;
        margin: 0 auto;
        background-color: #BFBFBF;
        box-shadow:0 -1px 1px 5px #BFBFBF;
    }
    details {
        padding: .5rem;
        font: 1.25rem/1.2 sans-serif;


    }

    #summary1 {
        padding: .25rem 1rem;

        background-color: limegreen;
        font: bold 1.25rem/2 sans-serif;
        color:floralwhite;
        border: none;
        border-radius: 4px;
        box-shadow: 0 -1px 1px 1px rgba(0,0,0,0.5);
        cursor: pointer;
        list-style: none; /* Triangle not shown */
    }

    #summary2 {
        padding: .25rem 1rem;

        background-color: darkorange;
        font: bold 1.25rem/2 sans-serif;
        color:floralwhite;
        border: none;
        border-radius: 4px;
        box-shadow: 0 -1px 1px 1px rgba(0,0,0,0.5);
        cursor: pointer;
        list-style: none; /* Triangle not shown */
    }

    #summary3 {
        padding: .25rem 1rem;

        background-color: red;
        font: bold 1.25rem/2 sans-serif;
        color:floralwhite;
        border: none;
        border-radius: 4px;
        box-shadow: 0 -1px 1px 1px rgba(0,0,0,0.5);
        cursor: pointer;
        list-style: none; /* Triangle not shown */
    }

    #green
    {
        background-color: rgba(136, 243, 147, 1);
        opacity: 0.8;
    }
    #red
    {
        background: rgba(255, 66, 96, 1);
        opacity: 0.75;

    }
    #orange
    {
        background: rgba(255,100,20,0.8);
        opacity: 0.85;
        height: auto;
    }
    /* Triangle not shown - Style for Webkit-Browser */
    summary::-webkit-details-marker {
        display: none;
    }
    summary::before {
        padding-right: .25rem;
        content: '+ ';  /* Instead of Triangle closed */
    }
    details[open] summary::before {
        padding-right: .25rem;
        font-style: italic;
        content: '- '; /* Instead of Triangle open */
    }

    /* Styling the summary in case of open 'details' */
    details[open] summary {
        background-color: orange;
        font-style: italic;
        border-radius: 3px 3px 0 0;
    }

    .details-content {
        margin: 0;
        padding: .25rem 1rem;
        background-color: floralwhite;
        border-radius: 0 0 3px 3px;
        box-shadow: 0 1px 1px 1px rgba(0,0,0,0.5);
        color: red;
    }



</style>