package net.mcreator.crops.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.Property;
import net.minecraft.state.IntegerProperty;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.crops.block.AlienRoot7Block;
import net.mcreator.crops.block.AlienRoot6Block;
import net.mcreator.crops.block.AlienRoot5Block;
import net.mcreator.crops.block.AlienRoot4Block;
import net.mcreator.crops.block.AlienRoot3Block;
import net.mcreator.crops.block.AlienRoot2Block;
import net.mcreator.crops.block.AlienRoot1Block;
import net.mcreator.crops.block.AlienRoot0Block;
import net.mcreator.crops.CropsMod;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableMap;

public class AlienRootUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CropsMod.LOGGER.warn("Failed to load dependency x for procedure AlienRootUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CropsMod.LOGGER.warn("Failed to load dependency y for procedure AlienRootUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CropsMod.LOGGER.warn("Failed to load dependency z for procedure AlienRootUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CropsMod.LOGGER.warn("Failed to load dependency world for procedure AlienRootUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		BlockState blockFarmland = Blocks.AIR.getDefaultState();
		BlockState blockSoulSand = Blocks.AIR.getDefaultState();
		BlockState blockStage0 = Blocks.AIR.getDefaultState();
		BlockState blockStage1 = Blocks.AIR.getDefaultState();
		BlockState blockStage2 = Blocks.AIR.getDefaultState();
		BlockState blockStage3 = Blocks.AIR.getDefaultState();
		BlockState blockStage4 = Blocks.AIR.getDefaultState();
		BlockState blockStage5 = Blocks.AIR.getDefaultState();
		BlockState blockStage6 = Blocks.AIR.getDefaultState();
		BlockState blockStage7 = Blocks.AIR.getDefaultState();
		double randomNumber = 0;
		double numberGrowthCondition = 0;
		boolean logicLightGrowthCondition = false;
		boolean logicDropType = false;
		boolean canDrop = false;
		logicLightGrowthCondition = (boolean) AlienRootLightGrowthConditionProcedure
				.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world));
		numberGrowthCondition = (double) AlienRootGrowthScoreConditionProcedure
				.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world));
		blockSoulSand = Blocks.SOUL_SAND.getDefaultState();
		blockFarmland = Blocks.FARMLAND.getDefaultState();
		blockStage0 = AlienRoot0Block.block.getDefaultState();
		blockStage1 = AlienRoot1Block.block.getDefaultState();
		blockStage2 = AlienRoot2Block.block.getDefaultState();
		blockStage3 = AlienRoot3Block.block.getDefaultState();
		blockStage4 = AlienRoot4Block.block.getDefaultState();
		blockStage5 = AlienRoot5Block.block.getDefaultState();
		blockStage6 = AlienRoot6Block.block.getDefaultState();
		blockStage7 = AlienRoot7Block.block.getDefaultState();
		if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == (blockSoulSand).getBlock()))
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getMaterial() == net.minecraft.block.material.Material.SAND))) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
						new BlockPos((int) (x + 0.5), (int) (y + 0.5), (int) (z + 0.5)));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			}
		}
		if (((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == (blockFarmland).getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getMaterial() == net.minecraft.block.material.Material.WATER) && ((((new Object() {
							public int get(BlockState _bs, String property) {
								Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
								return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
							}
						}.get((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))), "level")) >= 1) && ((new Object() {
							public int get(BlockState _bs, String property) {
								Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
								return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
							}
						}.get((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))), "level")) <= 7)) || (((new Object() {
							public int get(BlockState _bs, String property) {
								Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
								return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
							}
						}.get((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))), "level")) == 14) || (((new Object() {
							public int get(BlockState _bs, String property) {
								Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
								return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
							}
						}.get((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))), "level")) == 14) || (((new Object() {
							public int get(BlockState _bs, String property) {
								Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
								return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
							}
						}.get((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))), "level")) == 14) || ((new Object() {
							public int get(BlockState _bs, String property) {
								Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
								return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
							}
						}.get((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))), "level")) == 14)))))))) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			if ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage7).getBlock()))) {
				logicDropType = (boolean) (true);
				canDrop = (boolean) (true);
			} else {
				logicDropType = (boolean) (false);
				canDrop = (boolean) (true);
			}
		}
		if ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage7).getBlock()))) {
			if ((logicLightGrowthCondition == (true))) {
				if (((new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "GrowthTime")) > 0)) {
					randomNumber = (double) Math.random();
					if ((randomNumber > (1 / numberGrowthCondition))) {
						randomNumber = (double) Math.random();
						if ((randomNumber >= 0.4)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("GrowthTime", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "GrowthTime")) - 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else {
							if (((new Object() {
								public double getValue(IWorld world, BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "GrowthTime")) < (new Object() {
								public double getValue(IWorld world, BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "TotalGrowthTime")))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("GrowthTime", ((new Object() {
											public double getValue(IWorld world, BlockPos pos, String tag) {
												TileEntity tileEntity = world.getTileEntity(pos);
												if (tileEntity != null)
													return tileEntity.getTileData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "GrowthTime")) + 1));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				} else {
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("GrowthTime", (new Object() {
								public double getValue(IWorld world, BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "TotalGrowthTime")));
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				if (((new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "GrowthTime")) == 0)) {
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage0).getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = (blockStage1);
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							TileEntity _te = world.getTileEntity(_bp);
							CompoundNBT _bnbt = null;
							if (_te != null) {
								_bnbt = _te.write(new CompoundNBT());
								_te.remove();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.read(_bso, _bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage1).getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = (blockStage2);
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							TileEntity _te = world.getTileEntity(_bp);
							CompoundNBT _bnbt = null;
							if (_te != null) {
								_bnbt = _te.write(new CompoundNBT());
								_te.remove();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.read(_bso, _bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage2).getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = (blockStage3);
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							TileEntity _te = world.getTileEntity(_bp);
							CompoundNBT _bnbt = null;
							if (_te != null) {
								_bnbt = _te.write(new CompoundNBT());
								_te.remove();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.read(_bso, _bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage3).getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = (blockStage4);
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							TileEntity _te = world.getTileEntity(_bp);
							CompoundNBT _bnbt = null;
							if (_te != null) {
								_bnbt = _te.write(new CompoundNBT());
								_te.remove();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.read(_bso, _bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage4).getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = (blockStage5);
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							TileEntity _te = world.getTileEntity(_bp);
							CompoundNBT _bnbt = null;
							if (_te != null) {
								_bnbt = _te.write(new CompoundNBT());
								_te.remove();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.read(_bso, _bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage5).getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = (blockStage6);
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							TileEntity _te = world.getTileEntity(_bp);
							CompoundNBT _bnbt = null;
							if (_te != null) {
								_bnbt = _te.write(new CompoundNBT());
								_te.remove();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.read(_bso, _bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockStage6).getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = (blockStage7);
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							TileEntity _te = world.getTileEntity(_bp);
							CompoundNBT _bnbt = null;
							if (_te != null) {
								_bnbt = _te.write(new CompoundNBT());
								_te.remove();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.read(_bso, _bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					}
				}
			}
		}
		if ((canDrop == (true))) {
			if ((logicDropType == (true))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					AlienRootNotFullyGrownDropsProcedure.executeProcedure($_dependencies);
				}
			} else {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					AlienRootFullyGrownExplosionDropsProcedure.executeProcedure($_dependencies);
				}
			}
		}
	}
}
