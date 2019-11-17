<template v-else>
    <div id="show">
        <br>
        <h4><b>Hier hast du nun die Möglichkeit deine persönlichen Daten und Präferenzen anzugeben.
        Anschließend wirst du auf eine Seite mit einer Auflistung der Wohnorte, angepasst an deine individuellen Eingaben weitergeleitet.</b></h4>
        <br>
        <div class="container" id="box">
            <form>
                <h5 class="text-uppercase">Persönliche Daten</h5><br>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Name</label>
                    <div class="col">
                        <input type="text" class="form-control" placeholder="First name">
                    </div>
                    <div class="col">
                        <input type="text" class="form-control" placeholder="Last name">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputage1" class="col-sm-2 col-form-label">Alter</label>
                    <div class="col-sm-10">
                        <input type="number" class="form-control" id="inputage1" placeholder="Age">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputplace1" class="col-sm-2 col-form-label">Wohnort</label>
                    <div class="col">
                        <input type="text" class="form-control" id="inputplace1" placeholder="City">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Allergien</label>
                    <div class="col">
                        <textarea rows="4" cols="50"></textarea>
                    </div>
                    <div class="col">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox" value="option1">
                            <label class="form-check-label" for="inlineCheckbox">Keine Allergien bekannt</label>
                        </div>
                    </div>

                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Anzahl Ergebnisse</label>
                    <div class="col">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox0" value="option1">
                            <label class="form-check-label" for="inlineCheckbox0">1</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option1">
                            <label class="form-check-label" for="inlineCheckbox2">2</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="option1">
                            <label class="form-check-label" for="inlineCheckbox3">3</label>
                        </div>
                    </div>
                </div>
<br>
                <h5 class="text-uppercase">Umgebung und Lage</h5><br>
                <div class="form-group row" >
                    <label class="col-sm-2 col-form-label">Rating</label>
                    <div class="col" id="rating">
                        <table style="width:90%" id="table">
                            <tr>
                               <td>1</td>
                                <td>2</td>
                                <td>3</td>
                                <td>4</td>
                                <td>5</td>
                                <td>6</td>
                                <td>7</td>
                                <td>8</td>
                                <td>9</td>
                                <td>10</td>
                            </tr>
                        </table>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Gute Busanbindung</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Nähe Bahnhof</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange1">

                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Einkaufsmöglichkeiten</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange2">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Essensmöglichkeiten</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange3">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Ruhe/Atmosphäre</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange4">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Kriminalitätsrate</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange5">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Uni Nähe*</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange10">
                    </div>
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
                    <label for="inputplace1" class="col-sm-2 col-form-label">Sportaktivitäten</label>
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
                    <label class="col-sm-2 col-form-label">Park</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange6">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Nightlife</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange7">
                    </div>
                </div>
                <div>
                    <router-link to="/result" class="nav-link"><button type="button" name="action" class="btn btn-secondary btn-lg">Abschicken</button></router-link>
                </div>

                <br>
                <p>*Felder dei mit Stern makiert sind sind optional </p>
            </form>
        </div>
        <div id="footer">
            <hr width="100%" style="height: 3px; background-color: white">
            <footer >
                <div class="container-fluid text-center text-md-left">
                    <div class="row">
                        <div class="col-md-6">
                            <p>In Zusammenarbeit mit:</p>
                            <a href="https://www.generali.de/ueber-generali/ueber-uns/"><img src="@/assets/generali.png" alt="Bild" width="90" height="70"/></a>
                        </div>
                        <hr class="clearfix w-100 d-md-none pb-3">
                        <div class="col-md-4">
                            <h5 class="text-uppercase">Soziale Netzwerke</h5>
                            <div class="form-group row" id="link">
                                <p>...</p><i class="fab fa-instagram"></i>
                                <p>...</p><i class="fab fa-twitter-square"></i>
                                <p>...</p><i class="fab fa-facebook-square"></i>
                            </div>
                        </div>
                    </div>
                </div>
                <p> © Copyright</p>
            </footer>
        </div>
    </div>
</template>


<script>
  /*  import axios from 'axios'

    export default {
        data: function () {
            return {
                cats: []
            }
        },
        mounted() {
            axios
                .get('api/cats')
                .then(response => {
                    this.cats = response.data;
                })
                .catch(e => alert(e));
        }
    }*/


</script>

<style>
    #show{
        background-color: #c55b4e;

    }

    #show textarea{
        border: 1px solid #C5281C;
        border-radius: 6px;
    }
    #box{
        border: 1px solid white;
        text-align: left;
        padding-top: 10px;
        padding-bottom: 10px;
        padding-left: 15px;
        padding-right: 20px;
        color: white;
        background-color: #C5281C;

    }
#box label{
    font-variant: small-caps;
}
#box input{
    border: 1px solid #C5281C;
}
#rating{

    padding-right: 350px;
    padding-left: 15px;
}
#box h5{
    font-weight: bold;
    color: white;
}
#show h4{
    color: white;
    padding-left: 80px;
    padding-right: 80px;
}

#box button{
    background-color: white;
    color: black;
    border-color: white;
}

    #link p{
        color: white;
    }

    #footer{
        background-color: white;
        color: black;
        font-variant: small-caps;
    }

    /*Slider*/
    .slider {
        -webkit-appearance: none;
        width: 50%;
        height: 25px;
        background: white;
        outline: none;
        opacity: 0.7;
        -webkit-transition: .2s;
        transition: opacity .2s;
    }

    .slider:hover {
        opacity: 1;
    }

    .slider::-webkit-slider-thumb {
        -webkit-appearance: none;
        appearance: none;
        width: 25px;
        height: 25px;
        background: #000000;
        cursor: pointer;
    }

    .slider::-moz-range-thumb {
        width: 25px;
        height: 25px;
        background: #000000;
        cursor: pointer;
    }
</style>