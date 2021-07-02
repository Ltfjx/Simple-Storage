package io.github.sefiraat.simplestorage.items;

import io.github.mooy1.infinitylib.presets.LorePreset;
import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.items.machines.DiePress;
import io.github.sefiraat.simplestorage.items.machines.Enderator;
import io.github.sefiraat.simplestorage.items.machines.MetalPressBasic;
import io.github.sefiraat.simplestorage.utils.Theme;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class SimpleStorageItemStacks {

    private SimpleStorageItemStacks() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack ANGELITE = new SlimefunItemStack(
            "MATERIAL_ANGELITE",
            Skulls.ITEM_ANGELITE,
            Theme.ITEM_CRAFTING + "天使水晶",
            "",
            Theme.PASSIVE + "天使水晶是一种稀有资源",
            Theme.PASSIVE + "用于简单的数据传输.",
            Theme.PASSIVE + "在较冷的气候更为丰富.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack PROUSTITE = new SlimefunItemStack(
            "MATERIAL_PROUSTITE",
            Skulls.ITEM_PROUSTITE,
            Theme.ITEM_CRAFTING + "普鲁斯特水晶",
            "",
            Theme.PASSIVE + "普鲁斯特水晶是一种稀有资源",
            Theme.PASSIVE + "用于更高级的数据传输.",
            Theme.PASSIVE + "只能在最热的地方找到.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack SHORTITE = new SlimefunItemStack(
            "MATERIAL_SHORTITE",
            Skulls.ITEM_SHORTITE,
            Theme.ITEM_CRAFTING + "碳钙钠石水晶",
            "",
            Theme.PASSIVE + "碳钙钠石水晶是一种稀有资源",
            Theme.PASSIVE + "用于最先进的数据传输.",
            Theme.PASSIVE + "未知地点.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CLEARQUARTZ = new SlimefunItemStack(
            "MATERIAL_QUARTZGEM",
            Skulls.ITEM_CLEAR_QUARTZ,
            Theme.ITEM_CRAFTING + "透彻石英水晶",
            "",
            Theme.PASSIVE + "这种形式的石英是非常罕见",
            Theme.PASSIVE + "并用于制作显示器.",
            Theme.PASSIVE + "未知地点.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_CHROMITE = new SlimefunItemStack(
            "CHUNK_CHROMITE",
            Skulls.ITEM_CHROMITE_CHUNK,
            Theme.ITEM_CRAFTING + "铬铁矿块",
            "",
            Theme.PASSIVE + "一种非常稀有的矿石. 可以加工",
            Theme.PASSIVE + "成铬铁矿.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_BASTNAESITE = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_CHUNK",
            Skulls.ITEM_BASTNAESITE_CHUNK,
            Theme.ITEM_CRAFTING + "氟碳铈镧矿块",
            "",
            Theme.PASSIVE + "一种非常稀有的矿石. 可以加工",
            Theme.PASSIVE + "成铈.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_ANTIMONY = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_CHUNK",
            Skulls.ITEM_ANTIMONY_CHUNK,
            Theme.ITEM_CRAFTING + "锑碎片",
            "",
            Theme.PASSIVE + "一种非常稀有的金属. 可加工",
            Theme.PASSIVE + "成锑.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack RHENIUM_CHUNK = new SlimefunItemStack(
            "MATERIAL_RHENIUM_CHUNK",
            Skulls.ITEM_RHENIUM_CHUNK,
            Theme.ITEM_CRAFTING + "铼碎片",
            "",
            Theme.PASSIVE + "一种非常稀有的金属. 可加工",
            Theme.PASSIVE + "成铼.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHROMIUM_DUST = new SlimefunItemStack(
            "MATERIAL_CHROMIUM_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "铬粉",
            "",
            Theme.PASSIVE + "一种非常稀有的金属. 需要加工",
            Theme.PASSIVE + "成锭.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack BASTNAESITE_DUST = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "氟碳铈镧矿粉",
            "",
            Theme.PASSIVE + "一种非常稀有的矿石. 需要加工",
            Theme.PASSIVE + "成锭.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ANTIMONY_DUST = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "锑粉",
            "",
            Theme.PASSIVE + "一种非常稀有的金属. 需要加工",
            Theme.PASSIVE + "成锭.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack RHENIUM_DUST = new SlimefunItemStack(
            "MATERIAL_RHENIUM_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "铼粉",
            "",
            Theme.PASSIVE + "一种非常稀有的金属. 需要加工",
            Theme.PASSIVE + "成锭.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHROMIUM_INGOT = new SlimefunItemStack(
            "MATERIAL_CHROMIUM_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "铬锭",
            "",
            Theme.PASSIVE + "一种非常稀有的金属. 用于制作",
            Theme.PASSIVE + "合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack BASTNAESITE_INGOT = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "氟碳铈镧矿锭",
            "",
            Theme.PASSIVE + "一种非常稀有的金属. 用于制作",
            Theme.PASSIVE + "强化合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ANTIMONY_INGOT = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "锑锭",
            "",
            Theme.PASSIVE + "一种非常稀有的金属. 用于制作",
            Theme.PASSIVE + "高级合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack RHENIUM_INGOT = new SlimefunItemStack(
            "MATERIAL_RHENIUM_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "铼锭",
            "",
            Theme.PASSIVE + "一种难以置信的稀有金属. 用于制作",
            Theme.PASSIVE + "非常先进的合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ELECTRUM_INGOT = new SlimefunItemStack(
            "MATERIAL_ELECTRUM",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "银金合金锭",
            "",
            Theme.PASSIVE + "基本上没什么用的",
            Theme.PASSIVE + "一种金和银的合金, 但我们或许会发现",
            Theme.PASSIVE + "它能用于甚么?",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_INGOT = new SlimefunItemStack(
            "MATERIAL_CUPRONICKEL",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "白铜合金锭",
            "",
            Theme.PASSIVE + "一种铜和镍的合金, 因其",
            Theme.PASSIVE + "强度和高承受压力",
            Theme.PASSIVE + "的能力而使用.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_INGOT = new SlimefunItemStack(
            "MATERIAL_PEWTER",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "锡铅合金锭",
            "",
            Theme.PASSIVE + "一种锡和银的合金, 用于",
            Theme.PASSIVE + "它的耐用性.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICKEL_SUPER_INGOT = new SlimefunItemStack(
            "MATERIAL_SUPER_INGOT",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "镍超级合金锭",
            "",
            Theme.PASSIVE + "一种镍和铼的合金, 因其",
            Theme.PASSIVE + "耐极端温度",
            Theme.PASSIVE + "而使用.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_1 = new SlimefunItemStack(
            "MATERIAL_ZAMAK1",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "萨马克合金-1",
            "",
            Theme.PASSIVE + "一种锌, 铝和铜的合金. 虽然",
            Theme.PASSIVE + "这个合金并不是最强的,",
            Theme.PASSIVE + "但它对机器模具",
            Theme.PASSIVE + "很有用.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_2 = new SlimefunItemStack(
            "MATERIAL_ZAMAK2",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "萨马克合金-2",
            "",
            Theme.PASSIVE + "一种锌, 铝和铜的合金.",
            Theme.PASSIVE + "萨马克合金-2 用额外的铜",
            Theme.PASSIVE + "来增强强度, 使其能够",
            Theme.PASSIVE + "用于更多的",
            Theme.PASSIVE + "金属模具",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_3 = new SlimefunItemStack(
            "MATERIAL_ZAMAK3",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "萨马克合金-3",
            "",
            Theme.PASSIVE + "一种锌, 铝和铜的合金.",
            Theme.PASSIVE + "萨马克合金-3中注入了",
            Theme.PASSIVE + "镁以保持稳定性",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NISIL = new SlimefunItemStack(
            "MATERIAL_NISIL",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "镍硅合金锭",
            "",
            Theme.PASSIVE + "一种镍和硅的合金.",
            Theme.PASSIVE + "构成热电偶的一部份.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICROSIL = new SlimefunItemStack(
            "MATERIAL_NICROSIL",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "镍硅合金锭",
            "",
            Theme.PASSIVE + "一种镍, 硅和铬的合金.",
            Theme.PASSIVE + "构成热电偶的一部份.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_REINFORCED = new SlimefunItemStack(
            "MATERIAL_REINFORCED_CUPRONICKEL",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "强化白铜合金锭",
            "",
            Theme.PASSIVE + "一种铜和镍的合金. 因其强度和",
            Theme.PASSIVE + "高承受压力的能力",
            Theme.PASSIVE + "而被使用. 这个变体",
            Theme.PASSIVE + "已使用铬铁矿进行了加强.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_REINFORCED = new SlimefunItemStack(
            "MATERIAL_REINFORCED_PEWTER",
            Material.IRON_INGOT ,
            Theme.ITEM_CRAFTING + "硬化锡铅合金锭",
            "",
            Theme.PASSIVE + "一种锡和银的合金. 因为它的耐用性.",
            Theme.PASSIVE + "这个变体已使用",
            Theme.PASSIVE + "锑进行了硬化.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ELECTRUM_PLATE = new SlimefunItemStack(
            "MATERIAL_ELECTRUM_PLATE",
            Material.YELLOW_CARPET,
            Theme.ITEM_CRAFTING + "银金合金板",
            "",
            Theme.PASSIVE + "由银金合金制成的板,",
            Theme.PASSIVE + "用作基础储存组件的外壳.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_PLATE = new SlimefunItemStack(
            "MATERIAL_CUPRONICKEL_PLATE",
            Material.ORANGE_CARPET,
            Theme.ITEM_CRAFTING + "强化白铜合金板",
            "",
            Theme.PASSIVE + "由白铜合金制成的板,",
            Theme.PASSIVE + "用作中间体储存组件的外壳.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_PLATE = new SlimefunItemStack(
            "MATERIAL_PEWTER_PLATE",
            Material.LIGHT_GRAY_CARPET,
            Theme.ITEM_CRAFTING + "硬化锡铅合金板",
            "",
            Theme.PASSIVE + "由锡铅合金制成的板,",
            Theme.PASSIVE + "用作高级储存组件的外壳.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICKEL_SUPERALLOY_PLATE = new SlimefunItemStack(
            "MATERIAL_SUPER_PLATE",
            Material.BROWN_CARPET,
            Theme.ITEM_CRAFTING + "镍超级合金板",
            "",
            Theme.PASSIVE + "由镍和铼制成的板,",
            Theme.PASSIVE + "用于先进储存组件的外壳.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack COMBINED_PLATE = new SlimefunItemStack(
            "MATERIAL_COMBINED_PLATE",
            Material.PINK_CARPET,
            Theme.ITEM_CRAFTING + "组合式板",
            "",
            Theme.PASSIVE + "由镍和铼制成的板,",
            Theme.PASSIVE + "上面覆盖着锡器合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_BASIC = new SlimefunItemStack(
            "MATERIAL_DIE_BASIC",
            Material.LIGHT_GRAY_CARPET,
            Theme.ITEM_CRAFTING + "基础模具",
            "",
            Theme.PASSIVE + "由萨马克合金-1制成的脆弱模具.",
            Theme.PASSIVE + "可用于制作基础的",
            Theme.PASSIVE + "注入外壳.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_REINFORCED = new SlimefunItemStack(
            "MATERIAL_DIE_REINFORCED",
            Material.GRAY_CARPET,
            Theme.ITEM_CRAFTING + "强化模具",
            "",
            Theme.PASSIVE + "由萨马克合金-2制成的强化模具.",
            Theme.PASSIVE + "可用于制作中间体",
            Theme.PASSIVE + "注入外壳.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_ADVANCED = new SlimefunItemStack(
            "MATERIAL_DIE_ADVANCED",
            Material.BLACK_CARPET,
            Theme.ITEM_CRAFTING + "先进模具",
            "",
            Theme.PASSIVE + "由萨马克合金-3制成的先进模具.",
            Theme.PASSIVE + "可用于制作顶级",
            Theme.PASSIVE + "注入外壳.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack THERMOCOUPLE = new SlimefunItemStack(
            "MATERIAL_THERMOCOUPLE",
            Material.REPEATER,
            Theme.ITEM_CRAFTING + "热电偶",
            "",
            Theme.PASSIVE + "用于测试热传导",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_BASIC = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_BASIC",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "基础箱核心",
            "",
            Theme.PASSIVE + "用作铁箱的核心.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_REINFORCED = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_REINFORCED",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "强化箱核心",
            "",
            Theme.PASSIVE + "用作金箱的核心.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_ADVANCED = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_ADVANCED",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "高级箱核心",
            "",
            Theme.PASSIVE + "用作钻石箱的核心.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack COMMUNICATION_BLOCK = new SlimefunItemStack(
            "BLOCK_COMMUNICATION",
            Material.BLACK_GLAZED_TERRACOTTA,
            Theme.ITEM_MACHINE + "通讯方块",
            "",
            Theme.PASSIVE + "允许将各种储物空间联机",
            Theme.PASSIVE + "至网络的主控制.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DISPLAY_PANEL = new SlimefunItemStack(
            "MATERIAL_DISPLAY",
            Material.GRAY_STAINED_GLASS_PANE,
            Theme.ITEM_CRAFTING + "显示面板",
            "",
            Theme.PASSIVE + "一个显示面板. 用于制作",
            Theme.PASSIVE + "储物箱主控.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_PRESS = new SlimefunItemStack(
            "MACHINE_DIE_PRESS",
            Material.PISTON,
            Theme.ITEM_MACHINE + "压模机",
            "",
            Theme.PASSIVE + "一种机械压模机, 可以用",
            Theme.PASSIVE + "特定金属制造模具.",
            Theme.PASSIVE + "模具用于形成其他材料.",
            "",
            LorePreset.energyPerSecond(DiePress.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack METAL_PRESS_BASIC = new SlimefunItemStack(
            "MACHINE_METAL_PRESS_BASIC",
            Material.STICKY_PISTON,
            Theme.ITEM_MACHINE + "基础金属压机",
            "",
            Theme.PASSIVE + "一种机械金属压机,",
            Theme.PASSIVE + "可以从基础模具和软合金",
            Theme.PASSIVE + "制造成形的金属板.",
            "",
            LorePreset.energyPerSecond(MetalPressBasic.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack ENDERATOR = new SlimefunItemStack(
            "MACHINE_ENDERATOR",
            Material.RESPAWN_ANCHOR,
            Theme.ITEM_MACHINE + "终界扭曲机",
            "",
            Theme.PASSIVE + "利用终界水晶和大量的",
            Theme.PASSIVE + "引导能量将物品的结构",
            Theme.PASSIVE + "扭曲成不同的物品...",
            //Theme.PASSIVE + "different...",
            "",
            LorePreset.energyPerSecond(Enderator.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack CHEST_IRON = new SlimefunItemStack(
            "BLOCK_CHEST_IRON",
            Skulls.BLOCK_CHEST_IRON,
            Theme.ITEM_MACHINE + "铁箱",
            "",
            Theme.PASSIVE + "一个有90个物品字段的储物箱.",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_GOLD = new SlimefunItemStack(
            "BLOCK_CHEST_GOLD",
            Skulls.BLOCK_CHEST_GOLD,
            Theme.ITEM_MACHINE + "金箱",
            "",
            Theme.PASSIVE + "一个有180个物品字段的储物箱.",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_DIAMOND = new SlimefunItemStack(
            "BLOCK_CHEST_DIAMOND",
            Skulls.BLOCK_CHEST_DIAMOND,
            Theme.ITEM_MACHINE + "钻石箱",
            "",
            Theme.PASSIVE + "一个有270个物品字段的储物箱.",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack INVENTORY_CELL = new SlimefunItemStack(
            "BLOCK_CELL_BASIC",
            Skulls.BLOCK_CELL_BASIC,
            Theme.ITEM_MACHINE + "储存单元",
            "",
            Theme.PASSIVE + "一个有270个物品字段的储存单元.",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_NETWORK = new SlimefunItemStack(
            "BLOCK_CHEST_NETWORK",
            Skulls.BLOCK_CHEST_MASTER,
            Theme.ITEM_MACHINE + "网络储物箱",
            "",
            Theme.PASSIVE + "这个储物箱可访问所有物品栏",
            Theme.PASSIVE + "单元在范围内.",
            "",
            Theme.PASSIVE + "单元必须在 " + Theme.ITEM_TYPEDESC + SimpleStorage.inst().getManagerConfiguration().getVals().getNetworkRange() + Theme.PASSIVE + " 格内.",
            Theme.PASSIVE + "任何方向的网络储物箱",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack UPGRADE_BARREL = new SlimefunItemStack(
            "UPGRADE_BARREL",
            Skulls.ITEM_UPGRADE_BARREL,
            Theme.ITEM_AUGMENT + "增强: 木桶",
            "",
            Theme.PASSIVE + "增强你的网络储物箱,",
            Theme.PASSIVE + "使其能够扫描附近的兼容,",
            Theme.PASSIVE + "木桶.",
            "",
            Theme.LORE_TYPE_AUGMENT
    );
}
