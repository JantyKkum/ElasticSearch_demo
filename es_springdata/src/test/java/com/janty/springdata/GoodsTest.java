package com.janty.springdata;

import com.janty.springdata.dao.GoodsDao;
import com.janty.springdata.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Janty
 * @projectName: ElasticSearch_demo
 * @date: 2023/2/25 21:08
 * @description:
 */
@SpringBootTest
public class GoodsTest {

    @Autowired
    private GoodsDao goodsDao;

    /**
     * 添加文档
     * */
    @Test
    public void saveTest(){
        Goods goods = new Goods();
        goods.setId("1");
        goods.setGoodsName("华为手机");
        goods.setStore(100);
        goods.setPrice(5000);
        Goods goods2 = new Goods("1002", "iPhone14", 10, 6000);
        goodsDao.save(goods);
//        goodsDao.save(goods2);
        System.out.println("添加成功...");
    }

    /**
     * 根据ID查询文档
     * */
    @Test
    public void findById(){
        Goods goods = goodsDao.findById("1002").get();
        System.out.println(goods);
    }
}
