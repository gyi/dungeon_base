package com.base.define;

/**
 * @Create 2014-1-10
 * @author wangl
 * @Description 游戏中各种操作的定义
 */
public enum OperateSource {
	/** 新建角色 */
	NEW_ROLE,
	/** 资源道具 */
	RESOURCESPROPS,
	/** 商品购买 */
	BUYITEM,
	/** 商品出售 */
	ITEMSELL,
	/** GM操作 */
	GM_OPERATE,
	/** 强化装备 */
	STRENGTH_EQUIP,
	/** 开启背包格子 */
	BACKCELLOPEN,
	/** 怪物掉落 */
	MONSTER_DROP,
	/** 创建家族 */
	CREATFAMILY,
	/** 邮件附件 */
	MAIL_ATTACHMENT,
	/** 副本进入消耗 */
	DUNGEON_ENTER_CONSUME,
	/** 副本游戏过程中消耗 */
	DUNGEON_PLAY_CONSUME,
	/** 副本奖励 */
	DUNGEON_REWARD,
	/** 副本扫荡 */
	DUNGEON_SWEEP,
	/** 合成装备 */
	COMPOUND_EQUIP,
	/** 开启孔位 */
	OPEN_HOLESITE,
	/** 定时回复 */
	TIME_ADDING,
	/** 强化装备失败返还 */
	STRENGTH_EQUIP_FAIL,
	/** 任务奖励 */
	MISSION_REWARD,
	/** 购买副本次数 */
	DUNGEON_BUY_TIMES,
	/** 洗练装备 */
	POLISH_EQUIP;
}
