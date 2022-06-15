package com.ex20.gulimall.member.dao;

import com.ex20.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author 高诚政
 * @email 15272888596@163.com
 * @date 2022-06-14 16:07:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
