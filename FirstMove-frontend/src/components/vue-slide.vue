<template>

</template>

<script>
    export default {
        name: "vue-slide"
    }
    new Vue( {
        el: '.vue',
        data () {
            return {
                value: 0,
                options: {
                    dotSize: 20,
                    width: '100%',
                    height: 4,
                    contained: false,
                    direction: 'ltr',
                    data: null,
                    min: 0,
                    max: 100,
                    interval: 1,
                    disabled: false,
                    clickable: true,
                    duration: 0.5,
                    adsorb: false,
                    lazy: false,
                    tooltip: 'focus',
                    tooltipPlacement: 'top',
                    tooltipFormatter: void 0,
                    useKeyboard: false,
                    enableCross: true,
                    fixed: false,
                    minRange: void 0,
                    maxRange: void 0,
                    order: true,
                    marks: false,
                    dotOptions: void 0,
                    process: true,
                    dotStyle: void 0,
                    railStyle: void 0,
                    processStyle: void 0,
                    tooltipStyle: void 0,
                    stepStyle: void 0,
                    stepActiveStyle: void 0,
                    labelStyle: void 0,
                    labelActiveStyle: void 0,
                }
            }
        },
        methods: {
        },
        mounted () {
        },
        components: {
            'vue-slide': window[ 'vue-slider-component' ],
        }
    })
</script>

<style scoped>

</style>