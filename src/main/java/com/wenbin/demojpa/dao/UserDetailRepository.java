package com.wenbin.demojpa.dao;

import com.wenbin.demojpa.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//DAO层 数据访问
//T 是数据表实体类，ID 是数据库实体类的主键类型。
//@Repository、@Service、@Controller 和 @Component 将类标识为Bean
//用于将数据访问层 (DAO 层 ) 的类标识为 Spring Bean
//@Query注解用来自定义SQL语句，name是方法名，nativeQuery = true时，可以执行原生sql语句
//value是自定义的SQL语句。 @Param用来参数绑定
@Repository
public interface UserDetailRepository extends JpaRepository <UserDetail, String>{

}