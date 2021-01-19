package de.paul.EnergyToCreate.blocks;

import com.simibubi.create.content.contraptions.base.KineticBlock;

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
import net.minecraft.world.IWorldReader;

public class EnergyGenerator extends KineticBlock {

	public EnergyGenerator() {
		super(AbstractBlock.Properties.create(Material.PISTON));
		setRegistryName("rotation_generator");
		
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
	public boolean hasShaftTowards(IWorldReader world, BlockPos pos, BlockState state, Direction face) {
		return state.get(BlockStateProperties.FACING).equals(face);
	}

	@Override
	public Axis getRotationAxis(BlockState state) {
		return state.get(BlockStateProperties.FACING).getAxis();
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader reader) {
		return ModTileEntitys.ROTATION_GENERATOR.create();
	}
}
