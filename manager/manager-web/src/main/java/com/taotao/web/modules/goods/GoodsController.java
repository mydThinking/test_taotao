package com.taotao.web.modules.goods;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.modules.sys.entity.Goods;
import com.taotao.service.modules.goods.GoodsService;
import com.taotao.web.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 商品管理Controller
 *
 * @author myd
 */
@RequestMapping(value = "/goods")
@Controller
public class GoodsController extends BaseController {

    @Reference(check = true,actives = 100, timeout = 3000, version = "1.0.0",loadbalance = "random")
    private GoodsService goodsService;

    /**
     * 商品列表页
     */
    @RequestMapping(value = "/goodslist")
    public String goodsList() {
        List<Goods> list = goodsService.findList();
        return "modules/goods/goodsList";
    }


}
