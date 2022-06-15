package com.ex20.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.ex20.common.utils.PageUtils;
import com.ex20.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ex20.gulimall.product.entity.CategoryEntity;
import com.ex20.gulimall.product.service.CategoryService;


/**
 * 商品三级分类
 *
 * @author 高诚政
 * @email 15272888596@163.com
 * @date 2022-06-14 15:05:17
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查询出所有分类以及子分类,以树形结构组装
     */
    @RequestMapping("/list/tree")
    // @RequiresPermissions("product:category:list")
    public R list(){
        List<CategoryEntity> entities = categoryService.listWithTree();
        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    // @RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){

        /* 1. 检查当前删除的菜单 是否被别的地方引用 */
		/* categoryService.removeByIds(Arrays.asList(catIds)); // 批量删除 */

        categoryService.removeMenuByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
