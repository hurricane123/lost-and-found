package com.hurricane.app.laf.location.service;

import java.util.List;

import com.hurricane.app.laf.location.entity.Area;
/**
 * @Description: 地理位置信息的服务接口定义
 * @author Hurricane
 * @date 2018年8月21日
 * @version 1.0
 */
public interface LocationService {
	/**
	 * @Title: findChildLocation  
	 * @Description: 通过一个区域获取它的更加具体的子区域
	 * @param area
	 * @return
	 */
	List<Area> findChildLocation(Area area);
	
	
	
	
	

}
