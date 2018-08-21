package com.hurricane.app.laf.event.service;

import java.util.List;

import com.hurricane.app.laf.event.entity.FoundEvent;
import com.hurricane.app.laf.event.entity.LostEvent;
import com.hurricane.app.laf.user.entity.User;

/**
 * @Description: 遗失与找回事件提供的服务接口定义
 * @author Hurricane
 * @date 2018年8月21日
 * @version 1.0
 */
public interface EventService {
	
	/**
	 * @Title: findRencentLostEvent  
	 * @Description: 获取最近的遗失事件
	 * @param user
	 * @return
	 */
	List<LostEvent> findRencentLostEvent(User user);
	
	/**
	 * @Title: findRencentLostEvent  
	 * @Description: 获取最近的遗失事件
	 * @param user
	 * @return
	 */
	List<LostEvent> findRencentFoundEvent(User user);
	
	/**
	 * @Title: findAllLostEventByUser  
	 * @Description: 获取指定用户下的遗失事件
	 * @param user
	 * @return
	 */
	List<LostEvent> findAllLostEventByUser(User user);
	
	/**
	 * @Title: findAllLostEventByUser  
	 * @Description: 获取指定用户下的遗失事件
	 * @param user
	 * @return
	 */
	List<LostEvent> findAllFoundEventByUser(User user);
	
	/**
	 * @Title: saveFoundEvent  
	 * @Description: 保存找回事件
	 * @param foundEvent
	 * @return
	 */
	int saveFoundEvent(FoundEvent foundEvent);
	
	/**
	 * @Title: saveLostEvent  
	 * @Description: 保存遗失事件
	 * @param lostEvent
	 * @return
	 */
	int saveLostEvent(LostEvent lostEvent);

}
