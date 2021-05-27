package com.laoblogs.myblogs.mapper;

import com.laoblogs.myblogs.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: ljh
 * @Date: 2021/5/2 22:38
 * @Description: com.laoblogs.myblogs.mapper
 * @version: 1.0
 */
public interface AdminUserMapper {
    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    /**
     * 登陆方法
     *
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    AdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}
