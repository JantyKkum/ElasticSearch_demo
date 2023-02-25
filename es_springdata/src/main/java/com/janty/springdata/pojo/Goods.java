package com.janty.springdata.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @author: Janty
 * @projectName: ElasticSearch_demo
 * @date: 2023/2/25 21:05
 * @description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(indexName = "goods")
public class Goods implements Serializable {

     @Field(type = FieldType.Keyword)
     private String id;
     @Field(type = FieldType.Text)
     private String goodsName;
     @Field(type = FieldType.Integer)
     private Integer store;
     @Field(type = FieldType.Double)
     private double price;

}
