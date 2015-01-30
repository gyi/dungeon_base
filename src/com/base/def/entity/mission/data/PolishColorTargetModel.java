package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 洗练颜色目标模型
 */
public class PolishColorTargetModel extends TargetModel {

	private static final long serialVersionUID = 2418262276742931404L;
	private int color;// 颜色

	private PolishColorTargetModel() {
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.POLISH_COLOR_TARGET_VALUE;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public static PolishColorTargetModel build(String[] targetDefs, int missionId) {
		if (targetDefs.length != 1)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		PolishColorTargetModel polishColorTargetModel = new PolishColorTargetModel();
		int itemColor = Integer.valueOf(targetDefs[0]);
		polishColorTargetModel.setColor(itemColor);
		return polishColorTargetModel;
	}

}
