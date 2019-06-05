package com.qianfeng.springboot.dao;


import com.qianfeng.springboot.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @User WuWenNong
 * @Date 2019/6/3
 */
@Component
public interface  UserRepository  extends JpaRepository<TUser,Integer> {

}
