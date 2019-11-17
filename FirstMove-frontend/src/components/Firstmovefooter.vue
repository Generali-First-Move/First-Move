<template>
    <div id="footer">
        <hr width="100%" style="height: 3px; background-color: white">
        <footer>
            <div class="container-fluid text-center text-md-left">
                <div class="row">
                    <div class="col-md-6">
                        <p>In Zusammenarbeit mit:</p>
                        <a href="https://www.generali.de/ueber-generali/ueber-uns/"><img src="@/assets/generali.png" alt="Bild" width="90" height="70"/></a>
                    </div>
                    <hr class="clearfix w-100 d-md-none pb-3">
                    <div class="col-md-6">
                        <h5 class="text-uppercase">Soziale Netzwerke</h5>
                        <div class="form-group row" id="link">
                            <p>...</p><i class="fab fa-instagram"></i>
                            <p>...</p><i class="fab fa-twitter-square"></i>
                            <p>...</p><i class="fab fa-facebook-square"></i>
                            <p>...</p><i id="copy"> © Copyright</i>

                        </div>

                    </div>
                </div>

            </div>
        </footer>
    </div>

</template>

<script>
    export default {
        name: "Firstmovefooter"
    }
</script>

<style scoped>

    #link{
        color: black;
    }
    #footer{
        background-color: white;
        margin-top:10px;
        font-variant: small-caps;

    }

    #footer h5{
        color: black;
    }

    col-md-4
    {
        padding-right: 40px;
    }
    #copy
    {
        margin-right:3px;
        margin-top: 20px;
        text-align: left;
        right:250px

    }
</style>