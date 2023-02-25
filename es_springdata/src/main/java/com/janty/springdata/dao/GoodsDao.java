package com.janty.springdata.dao;

import com.janty.springdata.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Janty
 * @projectName: ElasticSearch_demo
 * @date: 2023/2/25 21:06
 * @description:
 */
@Repository
public interface GoodsDao extends ElasticsearchRepository<Goods, String> {
}
