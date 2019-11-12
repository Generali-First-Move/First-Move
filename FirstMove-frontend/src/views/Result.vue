<template>
    <div id="addcat">
<fieldset>
    <legend><b>Neue Katze erstellen</b></legend>
            <form @submit="addCat()">
            <div class="form-group">
                <label><b>Katzenname</b></label>
                <input type="text" v-model="name" class="form-control" placeholder="Name">
            </div>
          <div class="form-group">
              <label><b>Farbe</b></label>
              <input type="color" v-model="color" class="form-control" placeholder="Farbe">

          </div>
            <button type="submit" class="btn btn-outline-info  btn-lg" ><i class="fa fa-cat"></i> Submit</button>
        </form>
</fieldset>
    </div>
</template>

<script>
    import axios from 'axios'


    export default {
        data: function () {
            return{
                name: "",
                color: "#0000000"
            }
        },

        methods: {
            addCat() {
                axios
                    .post('/api/cats', {
                        name: this.name,
                        color: this.color
                    })
                    .then(function () {
                        alert("Katze wurde erfolgreich angelegt!");
                    })
                    .catch(e => alert(e));
            }
        }
    }
</script>