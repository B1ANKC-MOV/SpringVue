<template>
    <div>
        <h1>发现音乐</h1>
        <!-- 子路由链接 -->
        <router-link to="/discover/toplist">推荐</router-link>
        <router-link to="/discover/playlist">歌单</router-link>
        <hr>
        <router-view></router-view>
    </div>
</template>