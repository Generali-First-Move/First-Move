<template v-else>
    <div id="show">
        <br>
        <h4><b>Hier hast du nun die Möglichkeit deine persönlichen Daten und Präferenzen anzugeben.
        Anschließend wirst du auf eine Seite mit einer Auflistung der Wohnorte, angepasst an deine individuellen Eingaben weitergeleitet.</b></h4>
        <br>
        <div class="container" id="box">
            <form>

                <h5 class="text-uppercase">Umgebung und Lage</h5><br>

                <h1>Skills</h1>
                <draggable v-model="myArray" ghost-class="ghost" @end="onEnd">
                    <transition-group type="transition" name="flip-list">
                        <div class="sortable" :id="element.id" v-for="element in myArray" :key="element.id">
                            <strong>{{element.name}}</strong>
                        </div>
                    </transition-group>
                </draggable>

                <p><strong>Alter Index: </strong> {{oldIndex}}</p>
                <p><strong>Neuer Index: </strong> {{newIndex}}</p>





                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Gute Busanbindung</label>
                    <div class="vue">
                        <!-- default props -->
                        <vue-slider
                                ref="slider"
                                v-model="value1"

                        ></vue-slider>
                        <h4>{{ value1 }}</h4>
                    </div>


                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Nähe Bahnhof</label>
                    <div class="vue">
                        <!-- default props -->
                        <vue-slider
                                ref="slider"
                                v-model="value2"

                        ></vue-slider>
                        <h4>{{ value2 }}</h4>
                    </div>

                </div>

                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Einkaufsmöglichkeiten</label>

                    <div class="vue">
                        <!-- default props -->
                        <vue-slider
                                ref="slider"
                                v-model="value3"

                        ></vue-slider>
                        <h4>{{ value3 }}</h4>
                    </div>

                </div>

                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Essensmöglichkeiten</label>
                    <!--<div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange3">
                    </div>-->
                    <div class="vue">
                        <!-- default props -->
                        <vue-slider
                                ref="slider"
                                v-model="value4"

                        ></vue-slider>
                        <h4>{{ value4 }}</h4>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Ruhe/Atmosphäre</label>
                    <div class="vue">
                        <!-- default props -->
                        <vue-slider
                                ref="slider"
                                v-model="value5"

                        ></vue-slider>
                        <h4>{{ value5 }}</h4>
                    </div>
                   <!-- <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange4">
                    </div>-->

                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Sicherheit</label>
                    <div class="vue">
                        <!-- default props -->
                        <vue-slider
                                ref="slider"
                                v-model="value6"

                        ></vue-slider>
                        <h4>{{ value6 }}</h4>
                    </div>
                    <!--<div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange5">
                    </div>-->
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Uni Nähe*</label>
                    <div class="vue">
                        <!-- default props -->
                        <vue-slider
                                ref="slider"
                                v-model="value7"

                        ></vue-slider>
                        <h4>{{ value7 }}</h4>
                    </div>
                    <!--<div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange10">
                    </div>-->
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label"></label>
                    <div class="col">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox11" value="option1">
                    <label class="form-check-label" for="inlineCheckbox11">FH Aachen</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox12" value="option1">
                    <label class="form-check-label" for="inlineCheckbox12">RWTH Aachen</label>
                </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Lage</label>
                    <div class="col">
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" id="inlineCheckbox4" value="option1">
                        <label class="form-check-label" for="inlineCheckbox4">Innenstadt</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" id="inlineCheckbox5" value="option1">
                        <label class="form-check-label" for="inlineCheckbox5">weiter außerhalb</label>
                    </div>
                    </div>
                </div>

                <br>
                <h5 class="text-uppercase">Freizeit</h5><br>
                <div class="form-group row">
                    <label class="col-sm-2">Sportaktivitäten</label>
                    <div class="col">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox6" value="option1">
                            <label class="form-check-label" for="inlineCheckbox6">Fitnessstudio</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox7" value="option1">
                            <label class="form-check-label" for="inlineCheckbox7">Schwimmbäder</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox8" value="option1">
                            <label class="form-check-label" for="inlineCheckbox8">Kletterhalle</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox9" value="option1">
                            <label class="form-check-label" for="inlineCheckbox9">Schwimmbäder</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox10" value="option1">
                            <label class="form-check-label" for="inlineCheckbox10">Fußball</label>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2">Park</label>
                    <div class="col-md-10">
                        <div class="vue">
                            <!-- default props -->
                            <vue-slider
                                    ref="slider"
                                    v-model="value8"

                            ></vue-slider>
                            <h4>{{ value8 }}</h4>
                        </div>
                       <!-- <input type="range" min="1" max="10" value="1" class="slider" id="myRange6">-->
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 ">Nightlife</label>
                    <div class="col-md-10">
                        <div class="vue">
                            <!-- default props -->
                            <vue-slider
                                    ref="slider"
                                    v-model="value9"

                            ></vue-slider>
                            <h4>{{ value9 }}</h4>
                        </div>
                       <!-- <input type="range" min="1" max="10" value="1" class="slider" id="myRange7">-->
                    </div>
                </div>
                <div>
                    <router-link to="/result" class="nav-link"><button type="button" name="action" class="btn btn-secondary btn-lg">Abschicken</button></router-link>
                </div>

                <br>
                <p>*Felder die mit Stern markiert sind sind optional </p>
            </form>
        </div>
    </div>
</template>

<script>

    import VueSlider from 'vue-slider-component'
    import 'vue-slider-component/theme/antd.css'
    import draggable from 'vuedraggable'


    export default
    {
        name: 'DragClass',

        components: {draggable, VueSlider},

        methods: {
            onEnd: function(evt){
                // eslint-disable-next-line no-console
                console.log(evt)
                this.oldIndex = evt.oldIndex;
                this.newIndex = evt.newIndex;
            }
        },



        data ()
        {
            return{
                value1: 0,
                value2: 0,
                value3: 0,
                value4: 0,
                value5: 0,
                value6: 0,
                value7: 0,
                value8: 0,
                value9: 0,

                //Hier auf die Datenbank zugreifen
                myArray:[
                    {name:"Philipp", id:0},
                    {name:"Tamara", id:1},
                    {name:"Mario", id:2},
                    {name:"Tobi", id:3},
                    {name:"Daniel", id:4},
                    {name:"Jil-Christ", id:5},
                    {name:"Adrian", id:6},
                ],
                oldIndex:'',
                newIndex:''
            }
        }

    }

</script>

<style>
    .vue {
        padding-left:15px;
        margin: 10px;
        bottom:10px;
        width: 40%;
    }
    .vue h4
    {
        margin-left: 39px;
    }
    #custom-handle {
        width: 2em;
        height: 1.6em;
        top: 50%;
        margin-top: -.8em;
        text-align: center;
        line-height: 1.6em;
    }

    .col-md-10
    {
        margin-left:160px;

    }

    .col-form-label
    {
        bottom:0px;
    }

    .col-sm-2
    {
        top:0px;
    }

    #show
    {
        background-color: #c55b4e;

    }

    #show textarea{
        border: 1px solid #C5281C;
        border-radius: 6px;
    }

    #box
    {
        border: 1px solid white;
        text-align: left;
        padding-top: 10px;
        padding-bottom: 10px;
        padding-left: 15px;
        padding-right: 20px;
        color: white;
        background-color: #C5281C;

    }

    #box label
    {
    font-variant: small-caps;
    }

    #box input
    {
    border: 1px solid #C5281C;
    }

    #rating
    {
    padding-right: 350px;
    padding-left: 15px;
    }

    #box h5
    {
    font-weight: bold;
    color: white;
    }

    #show h4
    {
    color: white;
    padding-left: 80px;
    padding-right: 80px;
    }

    #box button
    {
    background-color: white;
    color: black;
    border-color: white;
    }

    #link p
    {
        color: white;
    }

    /*Slider Hintergrund */

    .slider
    {
        -webkit-appearance: none;
        width: 40%;
        top:5px;
        left:15px;
        height: 25px;
        background: white;
        outline: none;
        opacity: 0.7;
        -webkit-transition: .2s;
        transition: opacity .2s;
    }

    .slider:hover
    {
        opacity: 1;
    }

    .slider::-webkit-slider-thumb
    {
        -webkit-appearance: none;
        appearance: none;
        width: 25px;
        height: 25px;
        background: #000000;
        cursor: pointer;
    }

    .slider::-moz-range-thumb
    {
        width: 25px;
        height: 25px;
        background: #000000;
        cursor: pointer;
    }

    /*Draggable*/

    strong
    {
        display: flow;
    }

    .sortable
    {
        width: 50%;
        background: white;
        padding: 1em;
        cursor: move;
        margin-bottom: 2px;
        color: #C5281C;
    }

    .flip-list
    {
        transition: transform 0.5s;
    }

    .ghost
    {
       border-left: 6px solid rgb(0, 0, 0);
        box-shadow: 10px 10px 5px -1px rgb(0, 0, 0);
        opacity: .7;
    }



</style>