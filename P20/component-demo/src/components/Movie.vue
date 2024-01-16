<template>
    <div>
        <h1>{{title}}</h1>
        <span>{{rating}}</span>
        <button @click="fun">🔮</button>
    </div>
</template>

<script>
export default {
    name:"Movie",
    props:["title","rating"],
    data:function(){
        return{

        }
    },
    methods:{
        fun(){
            alert("收藏成功")
        }
    }
}
</script>