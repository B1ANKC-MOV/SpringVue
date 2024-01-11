<template>
    <!-- <h3>商品{{$route.params.id}}</h3> -->
    <h3>商品{{id}}</h3>
</template>

<script>
export default {
    name:'Product',
    props:["id"]
}
</script>