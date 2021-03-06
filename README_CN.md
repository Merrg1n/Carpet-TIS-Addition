Carpet TIS Addition
-----------

[>>> English <<<](https://github.com/TISUnion/Carpet-TIS-Addition)

这是一个 [Carpet mod](https://github.com/gnembon/fabric-carpet) (fabric-carpet) 的扩展 mod，包含了不少~~NotVanilla的~~有意思的功能以及特性

跟同 Minecraft 版本的 carpet mod 一起使用即可。尽可能地使用较新的 carpet mod

CurseForge 主页[传送门](https://www.curseforge.com/minecraft/mc-mods/carpet-tis-addition)


-----------

# 特性列表

## 方块事件广播范围 (blockEventPacketRange)

设置会在方块事件成功执行后收到数据包的玩家范围 
 
对于活塞而言，这一个数据包是用于显示活塞移动的话。把这个值调小以减小客户端卡顿

- 类型: `double`  
- 默认值: `64`  
- 参考选项: `0`, `16`, `64`, `128`
- 分类: `TIS`, `OPTIMIZATION` 


## 结构方块范围限制 (structureBlockLimit)

覆写结构方块的范围限制

当相对位置的值大于32时客户端里结构的位置可能会错误地显示
 
- 类型: `int`  
- 默认值: `32`  
- 参考选项: `32`, `64`, `96`, `127`
- 分类: `TIS`, `CREATIVE` 


## 经验球追踪距离 (xpTrackingDistance)

修改经验球检测并追踪玩家的距离

将其调至0以禁用追踪"
 
- 类型: `double`  
- 默认值: `8`
- 参考选项: `0`, `1`, `8`, `32`
- 分类: `TIS`, `CREATIVE` 


## TNT复制修复 (tntDupingFix)

禁用TNT、地毯以及部分铁轨的复制机

基于依附性方块的复制机会无法复制，基于红石原件更新的复制机会无法保留被复制的方块

~~Dupe bad dig good~~
 
- 类型: `boolean`  
- 默认值: `false`  
- 参考选项: `false`, `true`
- 分类: `TIS`, `BUGFIX`, `EXPERIMENTAL` 


## 假人名称前缀 (fakePlayerNamePrefix)

为 `/player` 指令召唤出来的假人名称添加指定前缀

将其设置为 `#none` 以阻止添加前缀
 
这可阻止玩家召唤奇怪名字的假人，还能让玩家列表变得更整洁

- 类型: `String`  
- 默认值: `#none`  
- 参考选项: `#none`, `bot_`
- 分类: `TIS`, `CARPET_MOD`


## 假人名称后缀 (fakePlayerNameSuffix)

为 `/player` 指令召唤出来的假人名称添加指定后缀

将其设置为 `#none` 以阻止添加后缀

- 类型: `String`  
- 默认值: `#none`  
- 参考选项: `#none`, `_fake`
- 分类: `TIS`, `CARPET_MOD`


## 可再生龙蛋 (renewableDragonEgg)

让龙蛋变得可再生

当龙蛋处于龙息效果云内时，龙蛋有一定概率吸收龙息并“召唤”出一个新的龙蛋

可与选项 [dispenserFireDragonBreath](https://github.com/TISUnion/Carpet-TIS-Addition/blob/1.15.2/README_CN.md#发射器发射龙息-dispensersfiredragonbreath) 联动
 
- 类型: `boolean`  
- 默认值: `false`  
- 参考选项: `false`, `true`
- 分类: `TIS`, `FEATURE`


## 发射器发射龙息 (dispensersFireDragonBreath)

发射器可使用龙息瓶创造出龙息效果云

- 类型: `boolean`  
- 默认值: `false`  
- 参考选项: `false`, `true`
- 分类: `TIS`, `FEATURE`, `DISPENSER`

## 可再生龙首 (renewableDragonHead)

被高压爬行者杀死的末影龙将会掉落一个龙首

- 类型: `boolean`  
- 默认值: `false`  
- 参考选项: `false`, `true`
- 分类: `TIS`, `FEATURE`


## HUD监视器更新间隔 (HUDLoggerUpdateInterval)

覆写Carpet Mod HUD监视器的更新间隔，单位为gametick
 
- 类型: `int`  
- 默认值: `20`
- 参考选项: `1`, `5`, `20`, `100`
- 分类: `TIS`, `CARPET_MOD`


## 漏斗计数器无限速度 (hopperCountersUnlimitedSpeed)

当漏斗指向羊毛方块时，漏斗将拥有无限的物品吸取以及传输速度

仅当Carpet Mod中的hopperCounters开启时有效

- 类型: `boolean`  
- 默认值: `false`  
- 参考选项: `false`, `true`
- 分类: `TIS`, `CREATIVE`, `CARPET_MOD`


## 可再生鞘翅 (renewableElytra)

当幻翼被潜影贝杀死时有给定概率掉落鞘翅

设置为0以禁用

- 类型: `double`  
- 默认值: `0`  
- 参考选项: `0`, `0.2`, `1`
- 分类: `TIS`, `FEATURE`


## 刷沙机修复 (sandDupingFix)

禁用使用末地门的刷沙机以及刷重力方块机

重力方块包括沙子、铁砧、龙蛋等

在开启后刷沙机的沙子将会仅被传送至另一个纬度

- 类型: `boolean`  
- 默认值: `false`  
- 参考选项: `false`, `true`
- 分类: `TIS`, `BUGFIX`


## 刷铁轨机修复 (railDupingFix)

禁用老式的移动点亮的充能或激活铁轨的刷铁轨机

- 类型: `boolean`  
- 默认值: `false`  
- 参考选项: `false`, `true`
- 分类: `TIS`, `BUGFIX`


## 袭击追踪器 (commandRaid)

启用 `/raid` 命令用于追踪袭击信息

- 类型: `boolean`  
- 默认值: `true`  
- 参考选项: `false`, `true`
- 分类: `TIS`, `COMMAND`


## 保持弱加载区块的怪物 (keepMobInLazyChunks)

弱加载区块的怪物不再会被刷新掉，就像 1.15 之前版本似的

- 类型: `boolean`  
- 默认值: `false`  
- 参考选项: `false`, `true`
- 分类: `FEATURE`, `EXPERIMENTAL` 

-----------

# 监视器

**在 1.14.4 版本中不可用，因为 Carpet 未给出相关接口支持**

## 加载票 (ticket)

`/log ticket <监视类型>`

记录加载票的添加以及移除

用 csv 格式，例如 `portal,dragon` 来监视多种类型的加载票

**警告:** 监视 `unknown` 加载票的话可能会导致你被刷屏

- 默认值: `portal`
- 参考选项: `portal,dragon`, `start`, `dragon`, `player`, `forced`, `light`, `portal`, `post_teleport`, `unknown`


## 内存 (memory)

`/log memory`

于 tab 栏中显示服务端当前消耗的内存以及占用的最大内存


## 掉落物 (item)

`/log item <事件>`

记录某些事件在掉落物实体身上的发生，如物品闲置五分钟后自然消失

可用的事件类型:
- `die`: 当物品死亡
- `despawn`: 当物品自然消失

用 csv 格式，例如 `despawn,die` 来监视多种事件

- 默认值: `despawn`
- 参考选项: `despawn`, `die`, `despawn,die`


## 经验球 (xporb)

`/log xporb <events>`

基本上与 [掉落物监视器](https://github.com/TISUnion/Carpet-TIS-Addition/blob/1.15.2/README_CN.md#掉落物-item) 相同，只不过监视的是经验球实体


## 袭击 (raid)

`/log raid`

记录以下袭击相关的事件：

- 袭击被创建
- 袭击被移除
- 袭击的不祥之兆等级被提升
- 袭击的中心点被移动


# 指令

## 袭击 (raid)

### 列表 (list)

`/raid list [<full>]`

列出目前所有袭击的信息

### 追踪 (tracking)

`raid tracking [<start|stop|restart|realtime>]`

开启一个袭击追踪器以收集并统计进行中的袭击的状态信息

-----------

# 统计信息

自定义统计信息功能已被移除。如果你想继续使用，可使用 [more-statistics](https://github.com/Fallen-Breath/more-statistics) mod

-----------
# 其他

- 将假人的名字长度限制调整为 16 以防止真实玩家被踢出
- 将 tick warp 最大时长限制调整为 `Integer.MAX_VALUE`
