package net.phazoganon.mcprogressionupdate.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phazoganon.mcprogressionupdate.item.ModItems;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;
import net.phazoganon.mcprogressionupdate.block.custom.SulfurFireBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, minecraft_progression_update.MOD_ID);
    public static final RegistryObject<Block> FROSTBITTEN_BRICKS = registerBlock("frostbitten_bricks",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.STONE_BRICKS)
                    .instrument(NoteBlockInstrument.HAT)
                    .friction(0.8f)
                    .sound(SoundType.GLASS)
                    .mapColor(MapColor.ICE)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 6.0f)
            )
    );
    public static final RegistryObject<Block> FROSTBITTEN_BRICK_STAIRS = registerBlock("frostbitten_brick_stairs",
            () -> new StairBlock(() -> FROSTBITTEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(FROSTBITTEN_BRICKS.get()))
    );
    public static final RegistryObject<Block> FROSTBITTEN_BRICK_SLAB = registerBlock("frostbitten_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(FROSTBITTEN_BRICKS.get()))
    );
    public static final RegistryObject<Block> CHISELED_FROSTBITTEN_BRICKS = registerBlock("chiseled_frostbitten_bricks",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.CHISELED_STONE_BRICKS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .friction(0.8f)
                    .sound(SoundType.GLASS)
                    .mapColor(MapColor.ICE)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 6.0f)
            )
    );
    public static final RegistryObject<SulfurFireBlock> SULFUR_FIRE = registerBlock("sulfur_fire",
            () -> new SulfurFireBlock(BlockBehaviour.Properties
                    .copy(Blocks.FIRE)
                    .mapColor(MapColor.COLOR_PURPLE)
                    .replaceable()
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_152605_) -> {return 15;})
                    .pushReaction(PushReaction.DESTROY)
                    .noLootTable()
                    .noTerrainParticles()
            )
    );
    public static final RegistryObject<Block> SOULBOUNDED_FIRE = registerBlock("soulbounded_fire",
            () -> new SulfurFireBlock(BlockBehaviour.Properties
                    .copy(Blocks.SOUL_FIRE)
                    .mapColor(MapColor.COLOR_GREEN)
                    .replaceable()
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_152603_) -> {return 15;})
                    .pushReaction(PushReaction.DESTROY)
                    .noLootTable()
                    .noTerrainParticles()
            )
    );
    public static final RegistryObject<Block> LIGHTNING_RAIL = registerBlock("lightning_rail",
            () -> new RailBlock(BlockBehaviour.Properties
                    .copy(Blocks.POWERED_RAIL)
                    .noCollission()
                    .strength(0.7f)
                    .sound(SoundType.METAL)
            )
    );
    public static final RegistryObject<Block> FIRESTONE_ORE = registerBlock("firestone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0f, 3.0f),
                    UniformInt.of(2, 5)
            )
    );
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
