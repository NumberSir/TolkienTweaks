package com.greatorator.tolkienmobs.world.components.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class StoneSpikeFeature extends Feature<NoneFeatureConfiguration> {
   public StoneSpikeFeature(Codec<NoneFeatureConfiguration> configIn) {
      super(configIn);
   }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        BlockPos blockpos = context.origin();
        RandomSource random = context.random();

        WorldGenLevel worldgenlevel;
        for(worldgenlevel = context.level(); worldgenlevel.isEmptyBlock(blockpos) && blockpos.getY() > worldgenlevel.getMinBuildHeight() + 2; blockpos = blockpos.below()) {
        }

        if (!worldgenlevel.getBlockState(blockpos).is(Blocks.GRASS_BLOCK)) {
            return false;
        } else {
            blockpos = blockpos.above(random.nextInt(4));
            int i = random.nextInt(4) + 7;
            int j = i / 4 + random.nextInt(2);
            if (j > 1 && random.nextInt(60) == 0) {
                blockpos = blockpos.above(10 + random.nextInt(30));
            }

            for(int k = 0; k < i; ++k) {
                float f = (1.0F - (float)k / (float)i) * (float)j;
                int l = Mth.ceil(f);

                for(int i1 = -l; i1 <= l; ++i1) {
                    float f1 = (float)Mth.abs(i1) - 0.25F;

                    for(int j1 = -l; j1 <= l; ++j1) {
                        float f2 = (float)Mth.abs(j1) - 0.25F;
                        if ((i1 == 0 && j1 == 0 || !(f1 * f1 + f2 * f2 > f * f)) && (i1 != -l && i1 != l && j1 != -l && j1 != l || !(random.nextFloat() > 0.75F))) {
                            BlockState blockstate = worldgenlevel.getBlockState(blockpos.offset(i1, k, j1));
                            if (blockstate.isAir() || isDirt(blockstate) || blockstate.is(Blocks.GRASS_BLOCK)) {
                                this.setBlock(worldgenlevel, blockpos.offset(i1, k, j1), Blocks.STONE.defaultBlockState());
                            }

                            if (k != 0 && l > 1) {
                                blockstate = worldgenlevel.getBlockState(blockpos.offset(i1, -k, j1));
                                if (blockstate.isAir() || isDirt(blockstate) || blockstate.is(Blocks.GRASS_BLOCK)) {
                                    this.setBlock(worldgenlevel, blockpos.offset(i1, -k, j1), Blocks.STONE.defaultBlockState());
                                }
                            }
                        }
                    }
                }
            }

            int k1 = j - 1;
            if (k1 < 0) {
                k1 = 0;
            } else if (k1 > 1) {
                k1 = 1;
            }

            for(int l1 = -k1; l1 <= k1; ++l1) {
                for(int i2 = -k1; i2 <= k1; ++i2) {
                    BlockPos blockpos1 = blockpos.offset(l1, -1, i2);
                    int j2 = 50;
                    if (Math.abs(l1) == 1 && Math.abs(i2) == 1) {
                        j2 = random.nextInt(5);
                    }

                    while(blockpos1.getY() > 50) {
                        BlockState blockstate1 = worldgenlevel.getBlockState(blockpos1);
                        if (!blockstate1.isAir() && !isDirt(blockstate1) && !blockstate1.is(Blocks.GRASS_BLOCK)) {
                            break;
                        }

                        this.setBlock(worldgenlevel, blockpos1, Blocks.STONE.defaultBlockState());
                        blockpos1 = blockpos1.below();
                        --j2;
                        if (j2 <= 0) {
                            blockpos1 = blockpos1.below(random.nextInt(5) + 1);
                            j2 = random.nextInt(5);
                        }
                    }
                }
            }
            return true;
        }
    }
}