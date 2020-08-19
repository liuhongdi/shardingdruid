package com.shardingdruid.demo.mapper;

import com.shardingdruid.demo.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderMapper {
    int insertOneOrder(Order orderOne);
    String selectNameById(String userId);
    List<Order> selectAllOrder();
}