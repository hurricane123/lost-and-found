package com.hurricane.app.laf.event.entity;

import java.util.Date;
import java.util.List;

public class LostEvent {
	private String id;
	private ThingType mainType;
	private String desc;
	private Date startTime;
	private Date endTime;
	private List<ThingCapture> content;	//可能引用一个上传到服务器的图片，可能是一段文本，可能同时存在，甚至 有其他信息
	private List<Reward> afford;
	
}
