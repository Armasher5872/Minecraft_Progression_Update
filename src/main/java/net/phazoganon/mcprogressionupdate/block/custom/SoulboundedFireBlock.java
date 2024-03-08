package net.phazoganon.mcprogressionupdate.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.phazoganon.mcprogressionupdate.util.ModTags;

public class SoulboundedFireBlock extends BaseCustomFireBlock {
    public SoulboundedFireBlock(BlockBehaviour.Properties p_56653_) {
        super(p_56653_, 4.0F);
    }
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        return this.canSurvive(pState, pLevel, pCurrentPos) ? this.defaultBlockState() : Blocks.AIR.defaultBlockState();
    }
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return canSurviveOnBlock(pLevel.getBlockState(pPos.below()));
    }
    public static boolean canSurviveOnBlock(BlockState pState) {
        return pState.is(ModTags.Blocks.SOULBOUNDED_FIRE_BASE_BLOCKS);
    }
    protected boolean canBurn(BlockState pState) {
        return true;
    }
}
