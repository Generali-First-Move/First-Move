<template v-else>
    <div>
        <br>
        <h2><b>Bitte geben Sie ihre persönlichen Daten und Präferenzen an:</b></h2>
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
                    <label class="col-sm-2 col-form-label">Anzahl Ergebnisse</label>
                    <div class="col">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                            <label class="form-check-label" for="inlineCheckbox1">1</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                            <label class="form-check-label" for="inlineCheckbox1">2</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                            <label class="form-check-label" for="inlineCheckbox1">3</label>
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
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange2">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Ruhe/Atmosphäre</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange2">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Uni Nähe*</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange2">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Lage</label>
                    <div class="col">
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                        <label class="form-check-label" for="inlineCheckbox1">Innenstadt</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                        <label class="form-check-label" for="inlineCheckbox1">weiter außerhalb</label>
                    </div>
                    </div>
                </div>
                <br>
                <h5 class="text-uppercase">Freizeit</h5><br>
                <div class="form-group row">
                    <label for="inputplace1" class="col-sm-2 col-form-label">Sportaktivitäten</label>
                    <div class="col">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                            <label class="form-check-label" for="inlineCheckbox1">Fitnessstudio</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                            <label class="form-check-label" for="inlineCheckbox1">Schwimmbäder</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                            <label class="form-check-label" for="inlineCheckbox1">Kletterhalle</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                            <label class="form-check-label" for="inlineCheckbox1">Schwimmbäder</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                            <label class="form-check-label" for="inlineCheckbox1">Fußball</label>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Park</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange2">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Nightlife</label>
                    <div class="col">
                        <input type="range" min="1" max="10" value="1" class="slider" id="myRange2">
                    </div>
                </div>
                <button type="submit" class="btn btn-dark">Submit</button>
                <br>
                <p>*Felder dei mit Stern makiert sindm sind optional </p>
            </form>
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
    #box{
        border: 2px solid maroon;
        text-align: left;
        padding-top: 10px;
        padding-bottom: 10px;
        padding-left: 15px;
        padding-right: 20px;
    }


#rating{

    padding-right: 350px;
    padding-left: 15px;
}
#box h5{
    font-weight: bold;
    color: maroon;
}

    /*Slider*/
    .slider {
        -webkit-appearance: none;
        width: 50%;
        height: 25px;
        background: #d3d3d3;
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
        background: maroon;
        cursor: pointer;
    }

    .slider::-moz-range-thumb {
        width: 25px;
        height: 25px;
        background: #4CAF50;
        cursor: pointer;
    }
</style>