package com.example.mybatis2.mappers;

import com.example.mybatis2.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("SELECT * FROM product")
    List<Product> findAll();

    @Select("SELECT * FROM product WHERE id = #{id}")
    Product findById(@Param("id") int id);

    @Delete("DELETE FROM product WHERE id = #{id}")
    int deleteById(@Param("id") int id);

    @Insert("INSERT INTO product(id, name, status) VALUES (#{id}, #{name}, #{status})")
    int save(Product item);

    @Update("UPDATE product SET name=#{name}, status=#{status} WHERE id=#{id}")
    int update(Product item);
}
