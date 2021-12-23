package net.mcreator.crops.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.Property;
import net.minecraft.state.IntegerProperty;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.crops.CropsMod;

import java.util.Map;

public class AlienRootGrowthScoreConditionProcedure {
	public static double executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CropsMod.LOGGER.warn("Failed to load dependency x for procedure AlienRootGrowthScoreCondition!");
			return 0;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CropsMod.LOGGER.warn("Failed to load dependency y for procedure AlienRootGrowthScoreCondition!");
			return 0;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CropsMod.LOGGER.warn("Failed to load dependency z for procedure AlienRootGrowthScoreCondition!");
			return 0;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CropsMod.LOGGER.warn("Failed to load dependency world for procedure AlienRootGrowthScoreCondition!");
			return 0;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		BlockState blockFarmland = Blocks.AIR.getDefaultState();
		String textNamespace = "";
		String textTag = "";
		double numberScore = 0;
		textNamespace = (String) "crops";
		textTag = (String) "alien_root";
		blockFarmland = Blocks.FARMLAND.getDefaultState();
		numberScore = (double) 0;
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == (blockFarmland).getBlock()) && ((new Object() {
			public int get(BlockState _bs, String property) {
				Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
				return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
			}
		}.get((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == (blockFarmland).getBlock()) && ((new Object() {
			public int get(BlockState _bs, String property) {
				Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
				return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
			}
		}.get((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == (blockFarmland).getBlock()) && ((new Object() {
			public int get(BlockState _bs, String property) {
				Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
				return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
			}
		}.get((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == (blockFarmland).getBlock()) && ((new Object() {
			public int get(BlockState _bs, String property) {
				Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
				return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
			}
		}.get((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == (blockFarmland).getBlock()) && ((new Object() {
			public int get(BlockState _bs, String property) {
				Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
				return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
			}
		}.get((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == (blockFarmland).getBlock())
				&& ((new Object() {
					public int get(BlockState _bs, String property) {
						Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
						return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
					}
				}.get((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == (blockFarmland).getBlock())
				&& ((new Object() {
					public int get(BlockState _bs, String property) {
						Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
						return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
					}
				}.get((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == (blockFarmland).getBlock())
				&& ((new Object() {
					public int get(BlockState _bs, String property) {
						Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
						return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
					}
				}.get((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == (blockFarmland).getBlock())
				&& ((new Object() {
					public int get(BlockState _bs, String property) {
						Property<?> _prop = _bs.getBlock().getStateContainer().getProperty(property);
						return _prop instanceof IntegerProperty ? _bs.get((IntegerProperty) _prop) : -1;
					}
				}.get((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))), "moisture")) == 7))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((BlockTags.getCollection()
				.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				|| (BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())))
				&& ((!(BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock())))
						&& (!(BlockTags.getCollection()
								.getTagByID(
										new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())))))) {
			numberScore = (double) (numberScore + 1);
		} else if ((((!(BlockTags.getCollection()
				.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock())))
				&& (!(BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock()))))
				&& ((BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
						|| (BlockTags.getCollection()
								.getTagByID(
										new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock()))))) {
			numberScore = (double) (numberScore + 1);
		}
		if ((((BlockTags.getCollection()
				.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				&& (BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())))
				&& ((BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
						&& (BlockTags.getCollection()
								.getTagByID(
										new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock()))))) {
			numberScore = (double) (numberScore - 3);
		} else if ((((BlockTags.getCollection()
				.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				|| (BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())))
				&& ((BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
						&& (BlockTags.getCollection()
								.getTagByID(
										new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock()))))) {
			numberScore = (double) (numberScore - 2);
		} else if ((((BlockTags.getCollection()
				.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				&& (BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())))
				&& ((BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
						|| (BlockTags.getCollection()
								.getTagByID(
										new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock()))))) {
			numberScore = (double) (numberScore - 2);
		} else if ((((BlockTags.getCollection()
				.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				|| (BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())))
				&& ((BlockTags.getCollection()
						.getTagByID(new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
						|| (BlockTags.getCollection()
								.getTagByID(
										new ResourceLocation((((textNamespace) + "" + (":") + "" + (textTag))).toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock()))))) {
			numberScore = (double) (numberScore - 1);
		}
		return numberScore;
	}
}
