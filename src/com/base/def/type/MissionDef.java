package com.base.def.type;

import org.apache.commons.lang3.StringUtils;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.base.def.entity.mission.TargetModel;
import com.base.def.entity.mission.data.DungeonTargetModel;
import com.base.def.entity.mission.data.EffectValueUpTargetModel;
import com.base.def.entity.mission.data.GemInlayLevelTargetModel;
import com.base.def.entity.mission.data.ItemUseTargetModel;
import com.base.def.entity.mission.data.KillTargetModel;
import com.base.def.entity.mission.data.LevelUpTargetModel;
import com.base.def.entity.mission.data.PolishColorTargetModel;
import com.base.def.entity.mission.data.PolishTargetModel;
import com.base.def.entity.mission.data.RunawayTargetModel;
import com.base.def.entity.mission.data.StrengThenTargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;
import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2015-1-9
 * @author : zhaowei
 * @Description : TODO 任务配置
 */
@Describle("任务配置")
public class MissionDef implements BaseDef<Integer> {

	private static final long serialVersionUID = 1653648767286217089L;
	@Describle("任务id")
	private int missonId;
	@Describle("任务类型")
	private int missionType;
	@Describle("任务名称")
	private String missionName;
	@Describle("领取等级")
	private int level;
	@Describle("前置任务")
	private int preMissionId;
	@Describle("领取NPC")
	private int startNpc;
	@Describle("交付NPC")
	private int endNpc;
	@Describle("任务目标")
	private TargetModel[] missionTargets;
	@Describle("任务奖励id")
	private int rewardId;

	@Override
	public Integer getId() {
		return missonId;
	}

	@Override
	public DefType getDefType() {
		return DefType.MISSION;
	}

	public int getMissonId() {
		return missonId;
	}

	public void setMissonId(int missonId) {
		this.missonId = missonId;
	}

	public int getMissionType() {
		return missionType;
	}

	public void setMissionType(int missionType) {
		this.missionType = missionType;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPreMissionId() {
		return preMissionId;
	}

	public void setPreMissionId(int preMissionId) {
		this.preMissionId = preMissionId;
	}

	public int getStartNpc() {
		return startNpc;
	}

	public void setStartNpc(int startNpc) {
		this.startNpc = startNpc;
	}

	public int getEndNpc() {
		return endNpc;
	}

	public void setEndNpc(int endNpc) {
		this.endNpc = endNpc;
	}

	public int getRewardId() {
		return rewardId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	public TargetModel[] getMissionTargets() {
		return missionTargets;
	}

	public void setMissionTargets(String missionTargets) {
		// 判断配置字符串是否为空
		if (StringUtils.isBlank(missionTargets))
			throw new RuntimeException("target def is empty, missionId=" + missonId);
		String[] targets = missionTargets.split(StringHelper.leve2split);
		TargetModel[] targetModels = new TargetModel[targets.length];
		for (int i = 0; i < targets.length; i++) {
			String target = targets[i];
			String[] models = target.split(StringHelper.leve5split);
			MissionTargetType tarType = MissionTargetType.valueOf(Integer.valueOf(models[0]));
			// 判断配置字符串格式是否正确
			if (models == null || (models.length != 2 && models.length != 1))
				throw new RuntimeException("target def is wrong, missionId=" + missonId);
			String[] details = models[1].split(StringHelper.leve1split);
			TargetModel targetModel = null;
			switch (tarType) {
			case DUNGEON_TARGET:
				DungeonTargetModel dungeonTargetModel = DungeonTargetModel.build(details, missonId);
				targetModel = dungeonTargetModel;
				break;
			case EFFECT_UP_TARGET:
				EffectValueUpTargetModel effectValueUpTargetModel = EffectValueUpTargetModel.build(details, missonId);
				targetModel = effectValueUpTargetModel;
				break;
			case GEM_INLAY_TARGET:
				GemInlayLevelTargetModel gemInlayLevelTargetModel = GemInlayLevelTargetModel.build();
				targetModel = gemInlayLevelTargetModel;
				break;
			case ITEM_USE_TARGET:
				ItemUseTargetModel itemUseTargetModel = ItemUseTargetModel.build(details, missonId);
				targetModel = itemUseTargetModel;
				break;
			case KILL_MONSTER_TARGET:
				KillTargetModel killTargetModel = KillTargetModel.build(details, missonId);
				targetModel = killTargetModel;
				break;
			case LEVEL_UP_TARGET:
				LevelUpTargetModel levelUpTargetModel = LevelUpTargetModel.build(details, missonId);
				targetModel = levelUpTargetModel;
				break;
			case POLISH_COLOR_TARGET:
				PolishColorTargetModel polishColorTargetModel = PolishColorTargetModel.build(details, missonId);
				targetModel = polishColorTargetModel;
				break;
			case POLISH_TRAGET:
				PolishTargetModel polishTargetModel = PolishTargetModel.build(details, missonId);
				targetModel = polishTargetModel;
				break;
			case RUN_AWAY_TARGET:
				RunawayTargetModel runawayTargetModel = RunawayTargetModel.build(details, missonId);
				targetModel = runawayTargetModel;
				break;
			case STRENG_THEN_TARGET:
				StrengThenTargetModel strengThenTargetModel = StrengThenTargetModel.build(details, missonId);
				targetModel = strengThenTargetModel;
				break;
			default:
				break;
			}
			targetModels[i] = targetModel;
		}

		this.missionTargets = targetModels;
	}
}
