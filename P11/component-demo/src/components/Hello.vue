<template>
<div>
    <el-table
    :data="tableData"
    style="width: 100%"
    :row-class-name="tableRowClassName">
    <el-table-column
      prop="id"
      label="ID"
      width="180">
    </el-table-column>
    <el-table-column
      prop="username"
      label="姓名"
      width="180">
    </el-table-column>
    <el-table-column
      prop="birthday"
      label="生日">
    </el-table-column>
    </el-table>
    <i class="fa fa-camera-retro fa-lg"></i>
    <el-date-picker
      v-model="value1"
      type="date"
      placeholder="选择日期">
    </el-date-picker>
</div>
</template>
<style>
  .el-table .warning-row {
    background: oldlace;
  }

  .el-table .success-row {
    background: #f0f9eb;
  }
</style>
<script>
// import axios from 'axios'

export default {
    methods: {
      tableRowClassName({row, rowIndex}) {
        if (rowIndex === 1) {
          return 'warning-row';
        } else if (rowIndex === 3) {
          return 'success-row';
        }
        return '';
      }
    },
    created:function(){
      // axios.get("http://localhost:8088/user/findAll").then((response)=>{
      this.$http.get("/user/findAll").then((response)=>{
        this.tableData = response.data
      })
    },
    data() {
      return {
        tableData: []
      }
    }
}
</script>