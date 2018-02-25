package com.yutong.debug.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author liutao
 * @create 2018-01-22-21:30
 */
public interface TkMapper<T>  extends Mapper<T>, MySqlMapper<T> {
}
