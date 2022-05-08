<template>
    <div>
        <h1>
            <ul> 
                <li v-for="(m , i) in menus" v-bind:key="m" > <div v-if="m == 'board'" >{{i+1}}번째 메뉴 =  {{m}} </div> </li>

            </ul>
            
        </h1>
    </div>
</template>

<script>

export default {
    name : "MyApp2" , 
    data() {
        return {
            menus : ["home" , "boardlist" , "board"]
        }//리턴 객체내부변수들
    }//함수

}

</script>
<style>
h1  {color : green;}
</style>
