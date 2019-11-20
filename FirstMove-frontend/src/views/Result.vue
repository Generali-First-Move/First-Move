
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
                <div class="vue-map-container">
                        <GmapMap :center="center" :zoom="zoom" :map-type-id="mapTypeId" ref="google-maps">
                            <GmapMarker
                                    v-for="(item, index) in markers"
                                    :key="index"
                                    :position="item.position"
                                    :clickable="true"
                                    :icon="item.icon"
                                    @click="center = item.position"
                            />
                            <GmapCircle
                                    v-for="(pin, index) in circle"
                                    :key="index"
                                    :center="pin.position"
                                    :radius="pin.radius"
                                    :visible="true"
                                    :options="{fillColor:pin.fillColor,fillOpacity:pin.fillOpacity}"
                            ></GmapCircle>
                        </GmapMap>
                </div>
            </div>
                <!--
                 <div class="vue-map-container">
                 <GmapMap :center="center" :zoom="zoom" :map-type-id="mapTypeId" ref="google-maps">
                     <GmapMarker
                             v-for="(item, index) in markers"
                             :key="index"
                             :position="item.position"
                             :clickable="true"
                             :icon="markerOptions"
                             @click="center = item.position"

                     />
                     <GmapCircle
                             v-for="(pin, index) in markers"
                             :key="index"
                             :center="pin.position"
                             :radius="10"
                             :visible="true"
                             :options="{fillColor:'red',fillOpacity:0.8}"
                     ></GmapCircle>
                 </GmapMap>

                 </div>
                     -->
                <!--
                                <div class="vue-map-container">
                                <GmapMap :center="center" :map-type-id="mapTypeId" :zoom="16">
                                    <GmapMarker
                                            v-for="(item, index) in markers"
                                            :key="index"
                                            :position="item.position"
                                            @click="center = item.position"
                                    />
                                </GmapMap>
                                </div>
                    -->
                <!--
                    <div class="google-map" ref="googleMap"></div>
                     <template v-if="Boolean(this.google) && Boolean(this.map)">
                              <slot
                                         :google="google"
                                         :map="map"
                                 />
                             </template>
                             -->
                <!--
                            <div class="google-maps">
                                <iframe id="map"  src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d10094.445629951531!2d6.084487735032457!3d50.76423872231622!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c09be02b9ad17f%3A0x262760fd637fdee1!2s52066%20Burtscheid!5e0!3m2!1sde!2sde!4v1573582989242!5m2!1sde!2sde" width="780" height="600" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                            </div>
                 -->




            <div class="col-md-3">
                <h3>Präferenzen-Erfüllung</h3>
                <fieldset>
                    <details>
                        <summary id="City1"> Stadt Bereich 1: </summary>
                        <div id="box_green">
                            <h3 class ="Pro">Pro:</h3>
                            <table style="width:100%">
                                <tr>
                                    <th><i class="fas fa-check"></i></th>
                                    <th>Gute Busanbindung</th>
                                </tr>
                                <tr>
                                    <th><i class="fas fa-check-square"></i></th>
                                    <th>Nähe Bahnhof</th>
                                </tr>
                            </table>

                            <br>
                            <h3 class ="Contra">Contra:</h3>
                            <table>
                                <tr>
                                    <th><i class="fas fa-times-circle"></i></th>
                                    <th> Innenstadt</th>
                                </tr>
                            </table>

                            <br>
                        </div>
                    </details>

                    <details>
                        <summary id="City2"> Stadt Bereich 2: </summary>
                        <div id ="box_orange">
                            <h3 class ="Pro">Pro:</h3>
                            <table style="width:100%">
                                <tr>
                                    <th><i class="fas fa-check"></i></th>
                                    <th>Gute Busanbindung</th>
                                </tr>
                                <tr>
                                    <th><i class="fas fa-check-square"></i></th>
                                    <th>Nähe Bahnhof</th>
                                </tr>
                            </table>

                            <br>
                            <h3 class ="Contra">Contra:</h3>
                            <table>
                                <tr>
                                    <th><i class="fas fa-times-circle"></i></th>
                                    <th> Innenstadt</th>
                                </tr>
                            </table>

                            <br>
                        </div>
                    </details>

                    <details>
                        <summary id="City3"> Stadt Bereich 3: </summary>
                        <div id="box_red">
                            <h3 class ="Pro">Pro:</h3>
                            <table style="width:100%">
                                <tr>
                                    <th><i class="fas fa-check"></i></th>
                                    <th>Gute Busanbindung</th>
                                </tr>
                                <tr>
                                    <th><i class="fas fa-check-square"></i></th>
                                    <th>Nähe Bahnhof</th>
                                </tr>
                            </table>

                            <br>
                            <h3 class ="Contra">Contra:</h3>
                            <table>
                                <tr>
                                    <th><i class="fas fa-times-circle"></i></th>
                                    <th> Innenstadt</th>
                                </tr>
                            </table>

                            <br>
                        </div>
                    </details>

                </fieldset>
            </div>
        </div>
    </div>
</template>

<!--Load the API from the specified URL
* The async attribute allows the browser to render the page while the API loads
* The key parameter will contain your own API key (which is not needed for this tutorial)
* The callback parameter executes the initMap() function
-->
<script>
    /*
    let map;
    let markersArray=[];


    function initMap() {
        map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: 50.775346, lng: 6.083887},
            zoom: 25
        });
    }

    function addMarker (latLng , color)
    {
        let url = "http://maps.google.com/mapfiles/ms/icons/";
        url += color + "-dot.png";
        let marker = new google.maps.Marker ({
            map:map,
            position:latLng,
            icon:{
                url:url
            }
        });
        markersArray.push(marker);
    }*/

    export default {
        data() {
            return {
                center: {lat: 50.775346, lng: 6.083887},
                zoom: 17,
                gestureHandling: 'none',
                zoomControl: true,
                mapTypeId: "terrain",

                markers: [
                    {
                        Id: "1",
                        name: "City1",
                        content: '<img class="circle_img" src="http://maps.google.com/mapfiles/ms/icons/blue-dot.png" alt="blue" style="border: 3px solid #FF3333">',
                        position: {
                            lat: 50.7753455,
                            lng: 6.0838868
                        },
                        icon:"http://maps.google.com/mapfiles/ms/icons/blue-dot.png",


                    },

                    {

                        Id: "2",
                        name: "City2",
                        content: '<img class="circle_img" src="http://maps.google.com/mapfiles/ms/icons/red-dot.png" alt="red" style="border: 3px solid #FF3333">',
                        position: {
                            lat: 50.774720, lng: 6.083920
                        },
                        icon:"http://maps.google.com/mapfiles/ms/icons/red-dot.png",
                        radius:"15",
                        fillOpacity: "0.8",
                        fillColor:"red",
                    },
                    {
                        Id: "3",
                        name: "City3",
                        content: '<img class="circle_img" src="http://maps.google.com/mapfiles/ms/icons/green-dot.png" alt="green" style="border: 3px solid #FF3333">',
                        position: {
                            lat: 50.776026, lng: 6.089590
                        },
                        icon:"http://maps.google.com/mapfiles/ms/icons/green-dot.png",
                        radius:"5",
                        fillOpacity: "0.8",
                        fillColor:"green",
                    },

                ],

                circle: [
                    {
                        id:"1",
                        position: {
                            lat: 50.7753455,
                            lng: 6.0838868,
                        },
                        radius:30,
                        fillOpacity: "0.8",
                        fillColor:"blue"
                    },
                    {
                        id:"2",
                        position: {
                            lat: 50.774720, lng: 6.083920
                        },
                        radius:20,
                        fillOpacity: "0.8",
                        fillColor:"red",
                    },
                    {
                        id:"3",
                        position: {
                            lat: 50.776026, lng: 6.089590
                        },
                        radius:10,
                        fillOpacity: "0.8",
                        fillColor:"green",
                    }

                ]
                /*
                markers: [
                    { Id: 1, name: "Oslo", position: {lat: 50.7753455, lng: 6.0838868 },},
                    { Id: 2, name: "Stockholm", position: { lat: 50.774720, lng: 6.083920} },
                    { Id: 3,  name: "Copenhagen", position: { lat: 50.776026, lng: 6.089590 }},
                    { Id: 4, name: "Berlin", position: { lat: 50.775026, lng: 6.0855908 } },
                    { Id: 5, name: "Paris", position: { lat: 50.772026, lng: 6.088590 } },

                ],
                */

                // draw Markers

            }
        },
        methods: {
        }
    }
</script>


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

    .google-map {
        width: 800px;
        height: 600px;
        margin: 0 auto;
        background: gray;
    }

    .fas {
        color: dodgerblue;
    }

    .vue-map-container {
        height: 550px;
        max-width: 2000px;
        //width: 100%;
        margin:5px;
        text-align: left;
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

        margin-top: 20px;
        right:20px;

    }
    #result{
        background-color: #C5281C;
        height: 800px;
        color: white;
        padding-left: 15px;
        margin-top: 5px;

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

    #footer p{
        color: black;
    }
    #result h3{
        font-variant: small-caps;
    }

    #result h5{
        color: black;
    }

    #result h6
    {
        top:200px;
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
        right:20px;
        text-align: left;
        bottom: 45px;
    }

    .col-md-5
    {
        text-align: center;
        padding-bottom: 5px;
    }
    .col-md-9
    {
        text-align: left;
        padding-right: 60px;
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

    #City1 {
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

    #City2 {
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

    #City3 {
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

    #box_green
    {
        background-color: rgba(136, 243, 147, 1);
        opacity: 0.8;
    }
    #box_red
    {
        background: rgba(255, 66, 96, 1);
        opacity: 0.75;

    }
    #box_orange
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