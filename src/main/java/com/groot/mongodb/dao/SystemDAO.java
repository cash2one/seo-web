package com.groot.mongodb.dao;

import com.groot.commons.dto.SystemUserDTO;

/**
 * Created by XiaoWei on 2015/2/13.
 */
public interface SystemDAO {
    SystemUserDTO findByUserName(String u);
}
