package de.paul.EnergyToCreate.blocks;

import com.simibubi.create.content.contraptions.base.DirectionalKineticBlock;

import de.paul.EnergyToCreate.setup.ModTileEntitys;
import de.paul.EnergyToCreate.tileEntitys.RotationGeneratorTileEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Direction.Axis;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class RotationGenerator extends DirectionalKineticBlock {

	public RotationGenerator() {
		super(AbstractBlock.Properties.create(Material.PISTON));
		
		setDefaultState(stateContainer.getBaseState().with(BlockStateProperties.FACING, Direction.UP));
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(BlockStateProperties.FACING);
	}
	
	@Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(BlockStateProperties.FACING, context.getNearestLookingDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.with(BlockStateProperties.FACING, direction.rotate(state.get(BlockStateProperties.FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(BlockStateProperties.FACING)));
    }

	@Override
	public Axis getRotationAxis(BlockState state) {
		return state.get(BlockStateProperties.FACING).getAxis();
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader reader) {
		return ModTileEntitys.ROTATION_GENERATOR.get().create();
	}
}
