/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pigx.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pig4cloud.pigx.admin.entity.AtcdAgentmodeUser;
import com.pig4cloud.pigx.admin.entity.Etemployee;

/**
 * 考勤管理员
 *
 * @author GXS
 * @date 2020-05-22 16:57:40
 */
public interface AtcdAgentmodeUserService extends IService<AtcdAgentmodeUser> {
	/**
	 * 考勤管理员-查询列表 转换成中文
	 *
	 * @return IPage
	 */
	public IPage getAtcdAgentmodeUserList(Page page, AtcdAgentmodeUser atcdAgentmodeUser);
}
