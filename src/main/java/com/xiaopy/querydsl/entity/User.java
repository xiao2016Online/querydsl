package com.xiaopy.querydsl.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiaopeiyu
 * @since 2020/3/2
 */
@Data
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String username;
    private String password;
    private String nickName;
    private Date birthday;
    /**排序号 */
    private BigDecimal uIndex;
    private Integer departmentId;
}
