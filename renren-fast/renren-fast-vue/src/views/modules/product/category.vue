<template>
  <el-tree
    :data="menus"
    :props="defaultProps"
    :expand-on-click-node="false"
    show-checkbox
    node-key="catId"
    :default-expanded-keys="expandedKey">
    <span class="custom-tree-node" slot-scope="{ node, data }">
        <span>{{ node.label }}</span>
        <span>
          <el-button
            v-if="node.level <= 2"
            type="text"
            size="mini"
            @click="() => append(data)">
            添加
          </el-button>
          <el-button
            v-if="node.childNodes.length===0"
            type="text"
            size="mini"
            @click="() => remove(node, data)">
            删除
          </el-button>
        </span>
      </span>
  </el-tree>
</template>

<script>
export default {
  name: "category",
  data() {
    return {
      menus: [],
      expandedKey: [  ],
      defaultProps: {
        children: 'children',
        label: 'name'
      }
    };
  },
  methods: {
    getMenus() {
      this.$http({
        url: this.$http.adornUrl('/product/category/list/tree'),
        method: 'get'
      }).then(({data}) => {
        // console.log("成功获取到菜单数据...",data.data)
        this.menus = data.data;
      })
    },
    append(data) {
    },
    remove(node, data) {
      let ids = [data.catId];
      this.$confirm(`是否删除[${data.name}]菜单?`, '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$http({
          url: this.$http.adornUrl('/product/category/delete'),
          method: 'post',
          data: this.$http.adornData(ids, false)
        }).then(({data}) => {
          this.$message({
            type: 'success',
            message: '菜单删除成功!'
          });
          /* 刷新出新的菜单 */
          this.getMenus();
          /* 设置默认要展开的菜单 */
          this.expandedKey = [node.parent.data.catId];
        });
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });

      console.log("remove",node,data)
    },
  },
  created() {
    this.getMenus();
  }
}

</script>

<style scoped>

</style>
