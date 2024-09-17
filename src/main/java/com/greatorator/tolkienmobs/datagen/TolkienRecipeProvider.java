package com.greatorator.tolkienmobs.datagen;

import com.greatorator.tolkienmobs.datagen.helpers.TolkienRecipeHelper;
import com.greatorator.tolkienmobs.init.TolkienBlocks;
import com.greatorator.tolkienmobs.init.TolkienItems;
import com.greatorator.tolkienmobs.init.TolkienTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TolkienRecipeProvider extends TolkienRecipeHelper {
    public TolkienRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
            //Smelting & Blasting
        List<ItemLike> MITHRIL_SMELTABLES = List.of(TolkienItems.RAW_MITHRIL,
                TolkienBlocks.ORE_MITHRIL, TolkienBlocks.ORE_END_MITHRIL, TolkienBlocks.ORE_NETHER_MITHRIL, TolkienBlocks.ORE_DEEPSLATE_MITHRIL);
        List<ItemLike> MORGULIRON_SMELTABLES = List.of(TolkienItems.RAW_MORGULIRON,
                TolkienBlocks.ORE_MORGULIRON, TolkienBlocks.ORE_END_MORGULIRON, TolkienBlocks.ORE_NETHER_MORGULIRON, TolkienBlocks.ORE_DEEPSLATE_MORGULIRON);
        List<ItemLike> AMMOLITE_SMELTABLES = List.of(TolkienItems.GEM_AMMOLITE,
                TolkienBlocks.ORE_AMMOLITE, TolkienBlocks.ORE_END_AMMOLITE, TolkienBlocks.ORE_NETHER_AMMOLITE, TolkienBlocks.ORE_DEEPSLATE_AMMOLITE);

        oreSmelting(pRecipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, TolkienItems.INGOT_MITHRIL.get(), 0.25f, 200, "ingot_mithril");
        oreSmelting(pRecipeOutput, MORGULIRON_SMELTABLES, RecipeCategory.MISC, TolkienItems.INGOT_MORGULIRON.get(), 0.25f, 200, "ingot_morguliron");
        oreSmelting(pRecipeOutput, AMMOLITE_SMELTABLES, RecipeCategory.MISC, TolkienItems.GEM_AMMOLITE.get(), 0.25f, 200, "gem_ammolite");

        oreBlasting(pRecipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, TolkienItems.INGOT_MITHRIL.get(), 0.25f, 100, "ingot_mithril");
        oreBlasting(pRecipeOutput, MORGULIRON_SMELTABLES, RecipeCategory.MISC, TolkienItems.INGOT_MORGULIRON.get(), 0.25f, 100, "ingot_morguliron");
        oreBlasting(pRecipeOutput, AMMOLITE_SMELTABLES, RecipeCategory.MISC, TolkienItems.GEM_AMMOLITE.get(), 0.25f, 100, "gem_ammolite");

        smeltingList(TolkienBlocks.COBBLED_DARK_STONE, pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, TolkienBlocks.DARK_STONE, 0.25F, 200);
        smeltingList(TolkienBlocks.COBBLED_DWARVEN_STONE, pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, TolkienBlocks.DWARVEN_STONE, 0.25F, 200);
        smeltingList(TolkienBlocks.DARK_STONE, pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, TolkienBlocks.SMOOTH_DARK_STONE, 0.25F, 200);
        smeltingList(TolkienBlocks.DWARVEN_STONE, pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, TolkienBlocks.SMOOTH_DWARVEN_STONE, 0.25F, 200);

        blastingList(TolkienBlocks.COBBLED_DARK_STONE, pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, TolkienBlocks.DARK_STONE, 0.25F, 100);
        blastingList(TolkienBlocks.COBBLED_DWARVEN_STONE, pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, TolkienBlocks.DWARVEN_STONE, 0.25F, 100);
        blastingList(TolkienBlocks.DARK_STONE, pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, TolkienBlocks.SMOOTH_DARK_STONE, 0.25F, 100);
        blastingList(TolkienBlocks.DWARVEN_STONE, pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, TolkienBlocks.SMOOTH_DWARVEN_STONE, 0.25F, 100);

        //Everything Else
        woodListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "mallorn", TolkienBlocks.PLANKS_MALLORN.get(), TolkienBlocks.LOG_MALLORN.get(), TolkienBlocks.WOOD_MALLORN.get(), TolkienBlocks.STAIRS_MALLORN.get(), TolkienBlocks.SLAB_MALLORN.get(), TolkienBlocks.PRESSURE_PLATE_MALLORN.get(), TolkienBlocks.MALLORN_BUTTON.get(), TolkienBlocks.DOOR_MALLORN.get(), TolkienBlocks.TRAPDOOR_MALLORN.get(), TolkienBlocks.FENCE_MALLORN.get(), TolkienBlocks.FENCE_GATE_MALLORN.get(), TolkienBlocks.MALLORN_SIGN.get(), TolkienBlocks.MALLORN_HANGING_SIGN.get(), TolkienBlocks.LADDER_MALLORN.get(), TolkienBlocks.TORCH_MALLORN, TolkienBlocks.BARREL_MALLORN, TolkienBlocks.LEAFPILE_MALLORN, TolkienBlocks.LEAVES_MALLORN);
        woodListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "mirkwood", TolkienBlocks.PLANKS_MIRKWOOD.get(), TolkienBlocks.LOG_MIRKWOOD.get(), TolkienBlocks.WOOD_MIRKWOOD.get(), TolkienBlocks.STAIRS_MIRKWOOD.get(), TolkienBlocks.SLAB_MIRKWOOD.get(), TolkienBlocks.PRESSURE_PLATE_MIRKWOOD.get(), TolkienBlocks.MIRKWOOD_BUTTON.get(), TolkienBlocks.DOOR_MIRKWOOD.get(), TolkienBlocks.TRAPDOOR_MIRKWOOD.get(), TolkienBlocks.FENCE_MIRKWOOD.get(), TolkienBlocks.FENCE_GATE_MIRKWOOD.get(), TolkienBlocks.MIRKWOOD_SIGN.get(), TolkienBlocks.MIRKWOOD_HANGING_SIGN.get(), TolkienBlocks.LADDER_MIRKWOOD.get(), TolkienBlocks.TORCH_MIRKWOOD, TolkienBlocks.BARREL_MIRKWOOD, TolkienBlocks.LEAFPILE_MIRKWOOD, TolkienBlocks.LEAVES_MIRKWOOD);
        woodListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "culumalda", TolkienBlocks.PLANKS_CULUMALDA.get(), TolkienBlocks.LOG_CULUMALDA.get(), TolkienBlocks.WOOD_CULUMALDA.get(), TolkienBlocks.STAIRS_CULUMALDA.get(), TolkienBlocks.SLAB_CULUMALDA.get(), TolkienBlocks.PRESSURE_PLATE_CULUMALDA.get(), TolkienBlocks.CULUMALDA_BUTTON.get(), TolkienBlocks.DOOR_CULUMALDA.get(), TolkienBlocks.TRAPDOOR_CULUMALDA.get(), TolkienBlocks.FENCE_CULUMALDA.get(), TolkienBlocks.FENCE_GATE_CULUMALDA.get(), TolkienBlocks.CULUMALDA_SIGN.get(), TolkienBlocks.CULUMALDA_HANGING_SIGN.get(), TolkienBlocks.LADDER_CULUMALDA.get(), TolkienBlocks.TORCH_CULUMALDA, TolkienBlocks.BARREL_CULUMALDA, TolkienBlocks.LEAFPILE_CULUMALDA, TolkienBlocks.LEAVES_CULUMALDA);
        woodListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "lebethron", TolkienBlocks.PLANKS_LEBETHRON.get(), TolkienBlocks.LOG_LEBETHRON.get(), TolkienBlocks.WOOD_LEBETHRON.get(), TolkienBlocks.STAIRS_LEBETHRON.get(), TolkienBlocks.SLAB_LEBETHRON.get(), TolkienBlocks.PRESSURE_PLATE_LEBETHRON.get(), TolkienBlocks.LEBETHRON_BUTTON.get(), TolkienBlocks.DOOR_LEBETHRON.get(), TolkienBlocks.TRAPDOOR_LEBETHRON.get(), TolkienBlocks.FENCE_LEBETHRON.get(), TolkienBlocks.FENCE_GATE_LEBETHRON.get(), TolkienBlocks.LEBETHRON_SIGN.get(), TolkienBlocks.LEBETHRON_HANGING_SIGN.get(), TolkienBlocks.LADDER_LEBETHRON.get(), TolkienBlocks.TORCH_LEBETHRON, TolkienBlocks.BARREL_LEBETHRON, TolkienBlocks.LEAFPILE_LEBETHRON, TolkienBlocks.LEAVES_LEBETHRON);
        woodListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "fangornoak", TolkienBlocks.PLANKS_FANGORNOAK.get(), TolkienBlocks.LOG_FANGORNOAK.get(), TolkienBlocks.WOOD_FANGORNOAK.get(), TolkienBlocks.STAIRS_FANGORNOAK.get(), TolkienBlocks.SLAB_FANGORNOAK.get(), TolkienBlocks.PRESSURE_PLATE_FANGORNOAK.get(), TolkienBlocks.FANGORNOAK_BUTTON.get(), TolkienBlocks.DOOR_FANGORNOAK.get(), TolkienBlocks.TRAPDOOR_FANGORNOAK.get(), TolkienBlocks.FENCE_FANGORNOAK.get(), TolkienBlocks.FENCE_GATE_FANGORNOAK.get(), TolkienBlocks.FANGORNOAK_SIGN.get(), TolkienBlocks.FANGORNOAK_HANGING_SIGN.get(), TolkienBlocks.LADDER_FANGORNOAK.get(), TolkienBlocks.TORCH_FANGORNOAK, TolkienBlocks.BARREL_FANGORNOAK, TolkienBlocks.LEAFPILE_FANGORNOAK, TolkienBlocks.LEAVES_FANGORNOAK);
        woodListRecipeNoLeaves(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "deadwood", TolkienBlocks.PLANKS_DEADWOOD.get(), TolkienBlocks.LOG_DEADWOOD.get(), TolkienBlocks.WOOD_DEADWOOD.get(), TolkienBlocks.STAIRS_DEADWOOD.get(), TolkienBlocks.SLAB_DEADWOOD.get(), TolkienBlocks.PRESSURE_PLATE_DEADWOOD.get(), TolkienBlocks.DEADWOOD_BUTTON.get(), TolkienBlocks.DOOR_DEADWOOD.get(), TolkienBlocks.TRAPDOOR_DEADWOOD.get(), TolkienBlocks.FENCE_DEADWOOD.get(), TolkienBlocks.FENCE_GATE_DEADWOOD.get(), TolkienBlocks.DEADWOOD_SIGN.get(), TolkienBlocks.DEADWOOD_HANGING_SIGN.get(), TolkienBlocks.LADDER_DEADWOOD.get(), TolkienBlocks.TORCH_DEADWOOD, TolkienBlocks.BARREL_DEADWOOD);
        woodListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "dwarven_maple", TolkienBlocks.PLANKS_DWARVEN_MAPLE.get(), TolkienBlocks.LOG_DWARVEN_MAPLE.get(), TolkienBlocks.WOOD_DWARVEN_MAPLE.get(), TolkienBlocks.STAIRS_DWARVEN_MAPLE.get(), TolkienBlocks.SLAB_DWARVEN_MAPLE.get(), TolkienBlocks.PRESSURE_PLATE_DWARVEN_MAPLE.get(), TolkienBlocks.DWARVEN_MAPLE_BUTTON.get(), TolkienBlocks.DOOR_DWARVEN_MAPLE.get(), TolkienBlocks.TRAPDOOR_DWARVEN_MAPLE.get(), TolkienBlocks.FENCE_DWARVEN_MAPLE.get(), TolkienBlocks.FENCE_GATE_DWARVEN_MAPLE.get(), TolkienBlocks.DWARVEN_MAPLE_SIGN.get(), TolkienBlocks.DWARVEN_MAPLE_HANGING_SIGN.get(), TolkienBlocks.LADDER_DWARVEN_MAPLE.get(), TolkienBlocks.TORCH_DWARVEN_MAPLE, TolkienBlocks.BARREL_DWARVEN_MAPLE, TolkienBlocks.LEAFPILE_DWARVEN_MAPLE, TolkienBlocks.LEAVES_DWARVEN_MAPLE);

        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "dark_stone", TolkienBlocks.WALL_DARK_STONE.get(), TolkienBlocks.DARK_STONE_BUTTON.get(), TolkienBlocks.STAIRS_DARK_STONE.get(), TolkienBlocks.DARK_STONE.get(), TolkienBlocks.SLAB_DARK_STONE.get(), TolkienBlocks.PRESSURE_PLATE_DARK_STONE.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "chiseled_dark_stone_bricks", TolkienBlocks.WALL_CHISELED_DARK_STONE_BRICKS.get(), TolkienBlocks.CHISELED_DARK_STONE_BRICKS_BUTTON.get(), TolkienBlocks.STAIRS_CHISELED_DARK_STONE_BRICKS.get(), TolkienBlocks.CHISELED_DARK_STONE_BRICKS.get(), TolkienBlocks.SLAB_CHISELED_DARK_STONE_BRICKS.get(), TolkienBlocks.PRESSURE_PLATE_CHISELED_DARK_STONE_BRICKS.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "dark_stone_bricks", TolkienBlocks.WALL_DARK_STONE_BRICKS.get(), TolkienBlocks.DARK_STONE_BRICKS_BUTTON.get(), TolkienBlocks.STAIRS_DARK_STONE_BRICKS.get(), TolkienBlocks.DARK_STONE_BRICKS.get(), TolkienBlocks.SLAB_DARK_STONE_BRICKS.get(), TolkienBlocks.PRESSURE_PLATE_DARK_STONE_BRICKS.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "cracked_dark_stone_bricks", TolkienBlocks.WALL_CRACKED_DARK_STONE_BRICKS.get(), TolkienBlocks.CRACKED_DARK_STONE_BRICKS_BUTTON.get(), TolkienBlocks.STAIRS_CRACKED_DARK_STONE_BRICKS.get(), TolkienBlocks.CRACKED_DARK_STONE_BRICKS.get(), TolkienBlocks.SLAB_CRACKED_DARK_STONE_BRICKS.get(), TolkienBlocks.PRESSURE_PLATE_CRACKED_DARK_STONE_BRICKS.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "cobbled_dark_stone", TolkienBlocks.WALL_COBBLED_DARK_STONE.get(), TolkienBlocks.COBBLED_DARK_STONE_BUTTON.get(), TolkienBlocks.STAIRS_COBBLED_DARK_STONE.get(), TolkienBlocks.COBBLED_DARK_STONE.get(), TolkienBlocks.SLAB_COBBLED_DARK_STONE.get(), TolkienBlocks.PRESSURE_PLATE_COBBLED_DARK_STONE.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "smooth_dark_stone", TolkienBlocks.WALL_SMOOTH_DARK_STONE.get(), TolkienBlocks.SMOOTH_DARK_STONE_BUTTON.get(), TolkienBlocks.STAIRS_SMOOTH_DARK_STONE.get(), TolkienBlocks.SMOOTH_DARK_STONE.get(), TolkienBlocks.SLAB_SMOOTH_DARK_STONE.get(), TolkienBlocks.PRESSURE_PLATE_SMOOTH_DARK_STONE.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "dwarven_stone", TolkienBlocks.WALL_DWARVEN_STONE.get(), TolkienBlocks.DWARVEN_STONE_BUTTON.get(), TolkienBlocks.STAIRS_DWARVEN_STONE.get(), TolkienBlocks.DWARVEN_STONE.get(), TolkienBlocks.SLAB_DWARVEN_STONE.get(), TolkienBlocks.PRESSURE_PLATE_DWARVEN_STONE.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "cobbled_dwarven_stone", TolkienBlocks.WALL_COBBLED_DWARVEN_STONE.get(), TolkienBlocks.COBBLED_DWARVEN_STONE_BUTTON.get(), TolkienBlocks.STAIRS_COBBLED_DWARVEN_STONE.get(), TolkienBlocks.COBBLED_DWARVEN_STONE.get(), TolkienBlocks.SLAB_COBBLED_DWARVEN_STONE.get(), TolkienBlocks.PRESSURE_PLATE_COBBLED_DWARVEN_STONE.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "smooth_dwarven_stone", TolkienBlocks.WALL_SMOOTH_DWARVEN_STONE.get(), TolkienBlocks.SMOOTH_DWARVEN_STONE_BUTTON.get(), TolkienBlocks.STAIRS_SMOOTH_DWARVEN_STONE.get(), TolkienBlocks.SMOOTH_DWARVEN_STONE.get(), TolkienBlocks.SLAB_SMOOTH_DWARVEN_STONE.get(), TolkienBlocks.PRESSURE_PLATE_SMOOTH_DWARVEN_STONE.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "chiseled_dwarven_stone_bricks", TolkienBlocks.WALL_CHISELED_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.CHISELED_DWARVEN_STONE_BRICKS_BUTTON.get(), TolkienBlocks.STAIRS_CHISELED_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.CHISELED_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.SLAB_CHISELED_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.PRESSURE_PLATE_CHISELED_DWARVEN_STONE_BRICKS.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "dwarven_stone_bricks", TolkienBlocks.WALL_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.DWARVEN_STONE_BRICKS_BUTTON.get(), TolkienBlocks.STAIRS_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.DWARVEN_STONE_BRICKS.get(), TolkienBlocks.SLAB_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.PRESSURE_PLATE_DWARVEN_STONE_BRICKS.get());
        stoneListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "cracked_dwarven_stone_bricks", TolkienBlocks.WALL_CRACKED_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.CRACKED_DWARVEN_STONE_BRICKS_BUTTON.get(), TolkienBlocks.STAIRS_CRACKED_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.CRACKED_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.SLAB_CRACKED_DWARVEN_STONE_BRICKS.get(), TolkienBlocks.PRESSURE_PLATE_CRACKED_DWARVEN_STONE_BRICKS.get());

        metalListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "mithril", TolkienBlocks.WALL_MITHRIL.get(), TolkienBlocks.DOOR_MITHRIL.get(), TolkienBlocks.TRAPDOOR_MITHRIL.get(), TolkienBlocks.BARREL_MITHRIL, TolkienBlocks.MITHRIL_BUTTON.get(), TolkienBlocks.STAIRS_MITHRIL.get(), TolkienBlocks.BLOCK_MITHRIL.get(), TolkienBlocks.SLAB_MITHRIL.get(), TolkienBlocks.PRESSURE_PLATE_MITHRIL.get(), TolkienBlocks.MITHRIL_BARS, TolkienBlocks.ELVEN_LANTERN, TolkienBlocks.TORCH_MALLORN, TolkienItems.INGOT_MITHRIL.get(), TolkienItems.NUGGET_MITHRIL.get());
        metalListRecipe(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, "morguliron", TolkienBlocks.WALL_MORGULIRON.get(), TolkienBlocks.DOOR_MORGULIRON.get(), TolkienBlocks.TRAPDOOR_MORGULIRON.get(), TolkienBlocks.BARREL_MORGULIRON, TolkienBlocks.MORGULIRON_BUTTON.get(), TolkienBlocks.STAIRS_MORGULIRON.get(), TolkienBlocks.BLOCK_MORGULIRON.get(), TolkienBlocks.SLAB_MORGULIRON.get(), TolkienBlocks.PRESSURE_PLATE_MORGULIRON.get(), TolkienBlocks.MORGULIRON_BARS, TolkienBlocks.MORGUL_LANTERN, TolkienBlocks.TORCH_MIRKWOOD, TolkienItems.INGOT_MORGULIRON.get(), TolkienItems.NUGGET_MORGULIRON.get());

        gemListRecipe(pRecipeOutput, TolkienItems.GEM_AMMOLITE.get(), TolkienBlocks.BLOCK_AMMOLITE.get(), TolkienBlocks.PANE_AMMOLITE);

        toolListRecipe(pRecipeOutput, RecipeCategory.TOOLS, "mithril", TolkienItems.PICKAXE_MITHRIL.get(), TolkienItems.AXE_MITHRIL.get(), TolkienItems.SHOVEL_MITHRIL.get(), TolkienItems.HOE_MITHRIL.get(), TolkienItems.SWORD_MITHRIL.get(), TolkienItems.SHEARS_MITHRIL.get(), TolkienItems.INGOT_MITHRIL.get());
        toolListRecipe(pRecipeOutput, RecipeCategory.TOOLS, "morguliron", TolkienItems.PICKAXE_MORGULIRON.get(), TolkienItems.AXE_MORGULIRON.get(), TolkienItems.SHOVEL_MORGULIRON.get(), TolkienItems.HOE_MORGULIRON.get(), TolkienItems.SWORD_MORGULIRON.get(), TolkienItems.SHEARS_MORGULIRON.get(), TolkienItems.INGOT_MORGULIRON.get());
        toolListRecipe(pRecipeOutput, RecipeCategory.TOOLS, "ammolite", TolkienItems.PICKAXE_AMMOLITE.get(), TolkienItems.AXE_AMMOLITE.get(), TolkienItems.SHOVEL_AMMOLITE.get(), TolkienItems.HOE_AMMOLITE.get(), TolkienItems.SWORD_AMMOLITE.get(), TolkienItems.SHEARS_AMMOLITE.get(), TolkienItems.GEM_AMMOLITE.get());

        paneRecipe(pRecipeOutput, TolkienBlocks.WALL_DECAY_BLOOM.get(), TolkienBlocks.MUSHROOM_DECAY_BLOOM);
        paneRecipe(pRecipeOutput, TolkienBlocks.WALL_MUSHROOM_RED.get(), Blocks.RED_MUSHROOM);
        paneRecipe(pRecipeOutput, TolkienBlocks.WALL_MUSHROOM_BROWN.get(), Blocks.BROWN_MUSHROOM);
        paneRecipe(pRecipeOutput, TolkienBlocks.ROCKPILE.get(), Blocks.COBBLESTONE_SLAB);

        containerRecipe(pRecipeOutput, RecipeCategory.TOOLS, "ammolite", TolkienItems.COIN_POUCH, TolkienItems.MUMAKIL_LEATHER, Blocks.CHEST, TolkienItems.GEM_AMMOLITE);
        containerRecipe(pRecipeOutput, RecipeCategory.TOOLS, "ammolite", TolkienItems.KEY_RING, TolkienItems.INGOT_MITHRIL, Blocks.CHEST, TolkienItems.GEM_AMMOLITE);

        doorBuilder(TolkienBlocks.DOOR_DURIN.get(), Ingredient.of(TolkienBlocks.BLOCK_AMMOLITE.get())).group("ammolite")
                .unlockedBy("has_ammolite", has(TolkienBlocks.BLOCK_AMMOLITE.get())).save(pRecipeOutput);

        addLampRecipe(pRecipeOutput,TolkienBlocks.SILMARIL_LANTERN, TolkienBlocks.TORCH_LEBETHRON, TolkienItems.GEM_AMMOLITE);

        placardRecipe(pRecipeOutput, TolkienBlocks.PLACARD, TolkienBlocks.PLANKS_MALLORN, TolkienItems.INGOT_MITHRIL);

        oneToOneConversionRecipe(pRecipeOutput, Items.LIGHT_GRAY_DYE, TolkienBlocks.FLOWER_SIMBELMYNE.get(), "light_gray_dye", 2);
        oneToOneConversionRecipe(pRecipeOutput, Items.RED_DYE, TolkienBlocks.FLOWER_MIRKWOOD.get(), "red_dye", 2);
        oneToOneConversionRecipe(pRecipeOutput, Items.ORANGE_DYE, TolkienBlocks.FLOWER_ALFIRIN.get(), "orange_dye", 2);
        oneToOneConversionRecipe(pRecipeOutput, Items.GREEN_DYE, TolkienBlocks.FLOWER_ATHELAS.get(), "green_dye", 2);
        oneToOneConversionRecipe(pRecipeOutput, Items.WHITE_DYE, TolkienBlocks.FLOWER_NIPHREDIL.get(), "white_dye", 2);
        oneToOneConversionRecipe(pRecipeOutput, Items.CYAN_DYE, TolkienBlocks.FLOWER_SWAMPMILKWEED.get(), "cyan_dye", 2);
        oneToOneConversionRecipe(pRecipeOutput, Items.PINK_DYE, TolkienBlocks.FLOWER_LILLYOFTHEVALLEY.get(), "pink_dye", 2);
        oneToOneConversionRecipe(pRecipeOutput, Items.YELLOW_DYE, TolkienBlocks.FLOWER_ELANOR.get(), "yellow_dye", 2);

        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_RED, Blocks.RED_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_BLUE, Blocks.BLUE_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_BLACK, Blocks.BLACK_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_BROWN, Blocks.BROWN_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_CYAN, Blocks.CYAN_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_GRAY, Blocks.GRAY_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_GREEN, Blocks.GREEN_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_LIGHT_BLUE, Blocks.LIGHT_BLUE_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_LIGHT_GRAY, Blocks.LIGHT_GRAY_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_LIME, Blocks.LIME_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_MAGENTA, Blocks.MAGENTA_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_ORANGE, Blocks.ORANGE_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_PINK, Blocks.PINK_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_PURPLE, Blocks.PURPLE_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_WHITE, Blocks.WHITE_CARPET);
        sleepingRecipe(pRecipeOutput, TolkienBlocks.SLEEPING_BAG_YELLOW, Blocks.YELLOW_CARPET);

        upgradeRecipe(pRecipeOutput, TolkienItems.ITEM_BACKPACK_UPGRADE_SIZE, TolkienItems.ITEM_BACKPACK_UPGRADE_BASE, TolkienItems.GEM_AMMOLITE);
        upgradeRecipe(pRecipeOutput, TolkienItems.ITEM_BACKPACK_UPGRADE_FLUID, TolkienItems.ITEM_BACKPACK_UPGRADE_BASE, TolkienItems.BOTTLE_FANCY);
        upgradeRecipe(pRecipeOutput, TolkienItems.ITEM_BACKPACK_UPGRADE_CRAFTING, TolkienItems.ITEM_BACKPACK_UPGRADE_BASE, Blocks.CRAFTING_TABLE);
        upgradeRecipe2(pRecipeOutput, TolkienItems.ITEM_BACKPACK_UPGRADE_SLEEPING, TolkienItems.ITEM_BACKPACK_UPGRADE_BASE, TolkienTags.Items.SLEEPING_BAG);
        upgradeRecipe(pRecipeOutput, TolkienItems.ITEM_BACKPACK_UPGRADE_CAMPFIRE, TolkienItems.ITEM_BACKPACK_UPGRADE_BASE, Blocks.CAMPFIRE);

        conversionRecipe(pRecipeOutput, TolkienBlocks.BLOCK_HALLOWED, Blocks.GRASS_BLOCK, TolkienItems.GEM_AMMOLITE);
        conversionRecipe(pRecipeOutput, TolkienBlocks.STONE_PATH, Blocks.MOSSY_COBBLESTONE, Items.IRON_PICKAXE);
    }
}