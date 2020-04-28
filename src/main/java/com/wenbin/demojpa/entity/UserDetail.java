package com.wenbin.demojpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户实体类
 */
@Setter
@Getter
//关于表注释，字段注释，columnDefinition = "varchar(100) comment '用户名'"
//@Entity 是一个必选的注解，声明这个类对应了一个数据库表。
@Entity
//@Table 可选的注解。声明了数据库实体对应的表信息。包括表名称、索引信息等。
// 这里声明这个实体类对应的表名是 user_detail。如果没有指定，则表名和实体的名称保持一致。
// private String userId 变量名还要和数据库字段一直，不然会传不过去
@Table(name = "user_detail")

//@Entity(name = "tb_student")
public class UserDetail {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    //@GeneraterValue 指定主键的生成策略 这个不是自增，是唯一ID
    //@GeneratedValue(strategy = GenerationType.IDENTITY)定义主键自增
    @Column(name = "id",columnDefinition="varchar(100) COMMENT '主键ID,UUID,登录用户唯一标识'")
    private String id;

    @Column(name = "userId", nullable = false, columnDefinition = "varchar(50) comment '用户ID'")
    private String userId;

    @Column(name = "userName", nullable = false, columnDefinition = "varchar(100) comment '用户名'")
    private String userName;

    @Column(name = "userSex", columnDefinition = "varchar(100) comment '用户性别'")
    private String userSex;

    @Column(name = "userBirthday",columnDefinition = "varchar(100) comment '用户生日'")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userBirthday;

}
