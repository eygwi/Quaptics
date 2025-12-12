package org.metamechanists.quaptics.items.groups;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.metamechanists.quaptics.Quaptics;
import org.metamechanists.quaptics.implementation.blocks.consumers.Charger;
import org.metamechanists.quaptics.implementation.blocks.consumers.CrystalRefiner;
import org.metamechanists.quaptics.implementation.blocks.consumers.DataStripper;
import org.metamechanists.quaptics.implementation.blocks.consumers.IndustrialCrystalRefiner;
import org.metamechanists.quaptics.implementation.blocks.consumers.ItemProjector;
import org.metamechanists.quaptics.implementation.blocks.consumers.MultiblockClicker;
import org.metamechanists.quaptics.implementation.blocks.consumers.launchpad.Launchpad;
import org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret;
import org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret;
import org.metamechanists.quaptics.implementation.multiblocks.entangler.EntanglementContainer;
import org.metamechanists.quaptics.implementation.multiblocks.entangler.EntanglementMagnet;
import org.metamechanists.quaptics.implementation.multiblocks.entangler.IndustrialEntanglementContainer;
import org.metamechanists.quaptics.implementation.multiblocks.entangler.IndustrialEntanglementMagnet;
import org.metamechanists.quaptics.implementation.multiblocks.infuser.IndustrialInfusionContainer;
import org.metamechanists.quaptics.implementation.multiblocks.infuser.InfusionContainer;
import org.metamechanists.quaptics.implementation.multiblocks.infuser.InfusionPillar;
import org.metamechanists.quaptics.items.Groups;

import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.ANDROID_MEMORY_CORE;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.BIG_CAPACITOR;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.CARBONADO_EDGED_CAPACITOR;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.DURALUMIN_INGOT;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.ELECTRIC_MOTOR;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.ELECTRO_MAGNET;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.FERROSILICON;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.HARDENED_METAL_INGOT;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.HOLOGRAM_PROJECTOR;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.POWER_CRYSTAL;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.REDSTONE_ALLOY;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.REINFORCED_ALLOY_INGOT;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.SMALL_CAPACITOR;
import static org.metamechanists.quaptics.implementation.blocks.consumers.Charger.CHARGER_1;
import static org.metamechanists.quaptics.implementation.blocks.consumers.Charger.CHARGER_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.Charger.CHARGER_2;
import static org.metamechanists.quaptics.implementation.blocks.consumers.Charger.CHARGER_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.Charger.CHARGER_3;
import static org.metamechanists.quaptics.implementation.blocks.consumers.Charger.CHARGER_3_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.Charger.CHARGER_4;
import static org.metamechanists.quaptics.implementation.blocks.consumers.Charger.CHARGER_4_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.CrystalRefiner.CRYSTAL_REFINER;
import static org.metamechanists.quaptics.implementation.blocks.consumers.CrystalRefiner.CRYSTAL_REFINER_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.DataStripper.DATA_STRIPPER_1;
import static org.metamechanists.quaptics.implementation.blocks.consumers.DataStripper.DATA_STRIPPER_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.DataStripper.DATA_STRIPPER_2;
import static org.metamechanists.quaptics.implementation.blocks.consumers.DataStripper.DATA_STRIPPER_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.IndustrialCrystalRefiner.INDUSTRIAL_CRYSTAL_REFINER;
import static org.metamechanists.quaptics.implementation.blocks.consumers.ItemProjector.ITEM_PROJECTOR;
import static org.metamechanists.quaptics.implementation.blocks.consumers.ItemProjector.ITEM_PROJECTOR_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.MultiblockClicker.MULTIBLOCK_CLICKER_1;
import static org.metamechanists.quaptics.implementation.blocks.consumers.MultiblockClicker.MULTIBLOCK_CLICKER_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.MultiblockClicker.MULTIBLOCK_CLICKER_2;
import static org.metamechanists.quaptics.implementation.blocks.consumers.MultiblockClicker.MULTIBLOCK_CLICKER_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.MultiblockClicker.MULTIBLOCK_CLICKER_3;
import static org.metamechanists.quaptics.implementation.blocks.consumers.MultiblockClicker.MULTIBLOCK_CLICKER_3_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.launchpad.Launchpad.LAUNCHPAD;
import static org.metamechanists.quaptics.implementation.blocks.consumers.launchpad.Launchpad.LAUNCHPAD_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret.TURRET_3_HOSTILE;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret.TURRET_3_HOSTILE_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret.TURRET_3_PASSIVE;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret.TURRET_3_PASSIVE_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret.TURRET_4_HOSTILE;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret.TURRET_4_HOSTILE_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret.TURRET_4_PASSIVE;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.DirectTurret.TURRET_4_PASSIVE_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret.TURRET_1_HOSTILE;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret.TURRET_1_HOSTILE_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret.TURRET_1_PASSIVE;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret.TURRET_1_PASSIVE_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret.TURRET_2_HOSTILE;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret.TURRET_2_HOSTILE_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret.TURRET_2_PASSIVE;
import static org.metamechanists.quaptics.implementation.blocks.consumers.turrets.ModulatedTurret.TURRET_2_PASSIVE_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.entangler.EntanglementContainer.ENTANGLEMENT_CONTAINER;
import static org.metamechanists.quaptics.implementation.multiblocks.entangler.EntanglementContainer.ENTANGLEMENT_CONTAINER_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.entangler.EntanglementMagnet.ENTANGLEMENT_MAGNET;
import static org.metamechanists.quaptics.implementation.multiblocks.entangler.EntanglementMagnet.ENTANGLEMENT_MAGNET_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.entangler.IndustrialEntanglementContainer.INDUSTRIAL_ENTANGLEMENT_CONTAINER;
import static org.metamechanists.quaptics.implementation.multiblocks.entangler.IndustrialEntanglementContainer.INDUSTRIAL_ENTANGLEMENT_CONTAINER_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.entangler.IndustrialEntanglementMagnet.INDUSTRIAL_ENTANGLEMENT_MAGNET;
import static org.metamechanists.quaptics.implementation.multiblocks.entangler.IndustrialEntanglementMagnet.INDUSTRIAL_ENTANGLEMENT_MAGNET_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.infuser.IndustrialInfusionContainer.INDUSTRIAL_INFUSION_CONTAINER;
import static org.metamechanists.quaptics.implementation.multiblocks.infuser.IndustrialInfusionContainer.INDUSTRIAL_INFUSION_CONTAINER_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.infuser.IndustrialInfusionPillar.INDUSTRIAL_INFUSION_PILLAR;
import static org.metamechanists.quaptics.implementation.multiblocks.infuser.IndustrialInfusionPillar.INDUSTRIAL_INFUSION_PILLAR_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.infuser.InfusionContainer.INFUSION_CONTAINER;
import static org.metamechanists.quaptics.implementation.multiblocks.infuser.InfusionContainer.INFUSION_CONTAINER_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.infuser.InfusionPillar.INFUSION_PILLAR;
import static org.metamechanists.quaptics.implementation.multiblocks.infuser.InfusionPillar.INFUSION_PILLAR_SETTINGS;
import static org.metamechanists.quaptics.implementation.tools.raygun.DirectRayGun.RAY_GUN_3;
import static org.metamechanists.quaptics.implementation.tools.raygun.DirectRayGun.RAY_GUN_4;
import static org.metamechanists.quaptics.implementation.tools.raygun.ModulatedRayGun.RAY_GUN_1;
import static org.metamechanists.quaptics.implementation.tools.raygun.ModulatedRayGun.RAY_GUN_2;
import static org.metamechanists.quaptics.items.groups.CraftingComponents.*;


@UtilityClass
public class Machines {
    public void initialize() {
        final SlimefunAddon addon = Quaptics.getInstance();

        // --- TURRETS (HOSTILE & PASSIVE) ---
        new ModulatedTurret(Groups.MACHINES, TURRET_1_HOSTILE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.GUNPOWDER), null,
                RECEIVER_1.item(), RAY_GUN_1.item(), TURRET_BARREL.item(),
                TURRET_BASE.item(), TURRET_TARGETING_MECHANISM.item(), TURRET_BASE.item()
        }, TURRET_1_HOSTILE_SETTINGS).register(addon);

        new ModulatedTurret(Groups.MACHINES, TURRET_1_PASSIVE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.WHEAT), null,
                RECEIVER_1.item(), RAY_GUN_1.item(), TURRET_BARREL.item(),
                TURRET_BASE.item(), TURRET_TARGETING_MECHANISM.item(), TURRET_BASE.item()
        }, TURRET_1_PASSIVE_SETTINGS).register(addon);

        new ModulatedTurret(Groups.MACHINES, TURRET_2_HOSTILE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.GUNPOWDER), null,
                RECEIVER_2.item(), RAY_GUN_2.item(), TURRET_BARREL.item(),
                TURRET_BASE.item(), TURRET_TARGETING_MECHANISM.item(), TURRET_BASE.item()
        }, TURRET_2_HOSTILE_SETTINGS).register(addon);

        new ModulatedTurret(Groups.MACHINES, TURRET_2_PASSIVE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.WHEAT), null,
                RECEIVER_2.item(), RAY_GUN_2.item(), TURRET_BARREL.item(),
                TURRET_BASE.item(), TURRET_TARGETING_MECHANISM.item(), TURRET_BASE.item()
        }, TURRET_2_PASSIVE_SETTINGS).register(addon);

        new DirectTurret(Groups.MACHINES, TURRET_3_HOSTILE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.GUNPOWDER), null,
                RECEIVER_3.item(), RAY_GUN_3.item(), TURRET_BARREL.item(),
                TURRET_BASE.item(), TURRET_TARGETING_MECHANISM.item(), TURRET_BASE.item()
        }, TURRET_3_HOSTILE_SETTINGS).register(addon);

        new DirectTurret(Groups.MACHINES, TURRET_3_PASSIVE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.WHEAT), null,
                RECEIVER_3.item(), RAY_GUN_3.item(), TURRET_BARREL.item(),
                TURRET_BASE.item(), TURRET_TARGETING_MECHANISM.item(), TURRET_BASE.item()
        }, TURRET_3_PASSIVE_SETTINGS).register(addon);

        new DirectTurret(Groups.MACHINES, TURRET_4_HOSTILE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.GUNPOWDER), null,
                RECEIVER_4.item(), RAY_GUN_4.item(), TURRET_BARREL.item(),
                TURRET_BASE.item(), TURRET_TARGETING_MECHANISM.item(), TURRET_BASE.item()
        }, TURRET_4_HOSTILE_SETTINGS).register(addon);

        new DirectTurret(Groups.MACHINES, TURRET_4_PASSIVE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.WHEAT), null,
                RECEIVER_4.item(), RAY_GUN_4.item(), TURRET_BARREL.item(),
                TURRET_BASE.item(), TURRET_TARGETING_MECHANISM.item(), TURRET_BASE.item()
        }, TURRET_4_PASSIVE_SETTINGS).register(addon);


        // --- CHARGERS ---
        new Charger(Groups.MACHINES, CHARGER_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), TRANSCEIVER_1.item(), new ItemStack(Material.IRON_INGOT),
                RECEIVER_1.item(), null, DIELECTRIC_1.item(),
                new ItemStack(Material.IRON_INGOT), TRANSCEIVER_1.item(), new ItemStack(Material.IRON_INGOT)
        }, CHARGER_1_SETTINGS).register(addon);

        new Charger(Groups.MACHINES, CHARGER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                DURALUMIN_INGOT.item(), TRANSCEIVER_2.item(), DURALUMIN_INGOT.item(),
                RECEIVER_2.item(), null, SMALL_CAPACITOR.item(),
                DURALUMIN_INGOT.item(), TRANSCEIVER_2.item(), DURALUMIN_INGOT.item()
        }, CHARGER_2_SETTINGS).register(addon);

        new Charger(Groups.MACHINES, CHARGER_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                REDSTONE_ALLOY.item(), TRANSCEIVER_3.item(), REDSTONE_ALLOY.item(),
                RECEIVER_3.item(), null, BIG_CAPACITOR.item(),
                REDSTONE_ALLOY.item(), TRANSCEIVER_3.item(), REDSTONE_ALLOY.item()
        }, CHARGER_3_SETTINGS).register(addon);

        new Charger(Groups.MACHINES, CHARGER_4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                REINFORCED_ALLOY_INGOT.item(), TRANSCEIVER_4.item(), REINFORCED_ALLOY_INGOT.item(),
                RECEIVER_4.item(), null, CARBONADO_EDGED_CAPACITOR.item(),
                REINFORCED_ALLOY_INGOT.item(), TRANSCEIVER_4.item(), REINFORCED_ALLOY_INGOT.item()
        }, CHARGER_4_SETTINGS).register(addon);


        // --- MULTIBLOCK CLICKERS ---
        new MultiblockClicker(Groups.MACHINES, MULTIBLOCK_CLICKER_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK),
                RECEIVER_2.item(), ELECTRIC_MOTOR.item(), new ItemStack(Material.DISPENSER),
                new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK)
        }, MULTIBLOCK_CLICKER_1_SETTINGS).register(addon);

        new MultiblockClicker(Groups.MACHINES, MULTIBLOCK_CLICKER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK),
                RECEIVER_2.item(), ELECTRIC_MOTOR.item(), MULTIBLOCK_CLICKER_1.item(),
                new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK)
        }, MULTIBLOCK_CLICKER_2_SETTINGS).register(addon);

        new MultiblockClicker(Groups.MACHINES, MULTIBLOCK_CLICKER_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                HARDENED_METAL_INGOT.item(), new ItemStack(Material.COPPER_BLOCK), HARDENED_METAL_INGOT.item(),
                RECEIVER_3.item(), ELECTRIC_MOTOR.item(), MULTIBLOCK_CLICKER_2.item(),
                HARDENED_METAL_INGOT.item(), new ItemStack(Material.COPPER_BLOCK), HARDENED_METAL_INGOT.item()
        }, MULTIBLOCK_CLICKER_3_SETTINGS).register(addon);


        // --- DATA STRIPPERS ---
        new DataStripper(Groups.MACHINES, DATA_STRIPPER_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_BLOCK), ELECTRIC_MOTOR.item(), new ItemStack(Material.IRON_BLOCK),
                RECEIVER_2.item(), null, new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.IRON_BLOCK), ELECTRIC_MOTOR.item(), new ItemStack(Material.IRON_BLOCK)
        }, DATA_STRIPPER_1_SETTINGS).register(addon);

        new DataStripper(Groups.MACHINES, DATA_STRIPPER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_BLOCK), ELECTRIC_MOTOR.item(), new ItemStack(Material.IRON_BLOCK),
                RECEIVER_3.item(), DATA_STRIPPER_1.item(), DIELECTRIC_3.item(),
                new ItemStack(Material.IRON_BLOCK), ELECTRIC_MOTOR.item(), new ItemStack(Material.IRON_BLOCK)
        }, DATA_STRIPPER_2_SETTINGS).register(addon);


        // --- LAUNCHPAD ---
        new Launchpad(Groups.MACHINES, LAUNCHPAD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ELECTRO_MAGNET.item(), ELECTRO_MAGNET.item(), ELECTRO_MAGNET.item(),
                RECEIVER_2.item(), new ItemStack(Material.HEAVY_WEIGHTED_PRESSURE_PLATE), TRANSFORMER_COIL_1.item(),
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT)
        }, LAUNCHPAD_SETTINGS).register(addon);



        new ItemProjector(Groups.MACHINES, ITEM_PROJECTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, HOLOGRAM_PROJECTOR.item(), null,
                RECEIVER_3.item(), POWER_CRYSTAL.item(), TRANSCEIVER_3.item(),
                FERROSILICON.item(), FERROSILICON.item(), FERROSILICON.item()
        }, ITEM_PROJECTOR_SETTINGS).register(addon);



        new CrystalRefiner(Groups.MACHINES, CRYSTAL_REFINER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, ELECTRO_MAGNET.item(), null,
                RECEIVER_2.item(), new ItemStack(Material.WATER_BUCKET), TRANSCEIVER_2.item(),
                REINFORCED_ALLOY_INGOT.item(), new ItemStack(Material.CAULDRON), REINFORCED_ALLOY_INGOT.item()
        }, CRYSTAL_REFINER_SETTINGS).register(addon);

        new IndustrialCrystalRefiner(Groups.MACHINES, INDUSTRIAL_CRYSTAL_REFINER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, ELECTRO_MAGNET.item(), null,
                CRYSTAL_REFINER.item(), new ItemStack(Material.WATER_BUCKET), CRYSTAL_REFINER.item(),
                DIELECTRIC_3.item(), new ItemStack(Material.CAULDRON), DIELECTRIC_3.item()
        }, IndustrialCrystalRefiner.INDUSTRIAL_CRYSTAL_REFINER_SETTINGS).register(addon);


        new InfusionPillar(Groups.MACHINES, INFUSION_PILLAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, TRANSCEIVER_2.item(), null,
                RECEIVER_2.item(), ELECTRIC_MOTOR.item(), null,
                null, CARBON_STRUCTURE.item(), null
        }, INFUSION_PILLAR_SETTINGS).register(addon);

        new InfusionPillar(Groups.MACHINES, INDUSTRIAL_INFUSION_PILLAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                INFUSED_FREQUENCY_CRYSTAL.item(), INFUSION_PILLAR.item(), INFUSED_FREQUENCY_CRYSTAL.item(),
                RECEIVER_3.item(), ELECTRIC_MOTOR.item(), null,
                INFUSED_FREQUENCY_CRYSTAL.item(), INFUSION_PILLAR.item(), INFUSED_FREQUENCY_CRYSTAL.item()
        }, INDUSTRIAL_INFUSION_PILLAR_SETTINGS).register(addon);

        new InfusionContainer(Groups.MACHINES, INFUSION_CONTAINER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, null,
                CARBON_STRUCTURE.item(), null, CARBON_STRUCTURE.item(),
                CARBON_STRUCTURE.item(), POWER_CRYSTAL.item(), CARBON_STRUCTURE.item()
        }, INFUSION_CONTAINER_SETTINGS).register(addon);

        new IndustrialInfusionContainer(Groups.MACHINES, INDUSTRIAL_INFUSION_CONTAINER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                CARBON_STRUCTURE.item(), INFUSION_CONTAINER.item(), CARBON_STRUCTURE.item(),
                CARBON_STRUCTURE.item(), ANDROID_MEMORY_CORE.item(), CARBON_STRUCTURE.item(),
                CARBON_STRUCTURE.item(), INFUSION_CONTAINER.item(), CARBON_STRUCTURE.item()
        }, INDUSTRIAL_INFUSION_CONTAINER_SETTINGS).register(addon);



        new EntanglementMagnet(Groups.MACHINES, ENTANGLEMENT_MAGNET, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, ELECTRO_MAGNET.item(), null,
                RECEIVER_3.item(), CARBON_STRUCTURE.item(), null,
                null, ELECTRO_MAGNET.item(), null
        }, ENTANGLEMENT_MAGNET_SETTINGS).register(addon);

        new IndustrialEntanglementMagnet(Groups.MACHINES, INDUSTRIAL_ENTANGLEMENT_MAGNET, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ELECTRO_MAGNET.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(), ELECTRO_MAGNET.item(),
                RECEIVER_3.item(), ENTANGLEMENT_MAGNET.item(), null,
                ELECTRO_MAGNET.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(), ELECTRO_MAGNET.item()
        }, INDUSTRIAL_ENTANGLEMENT_MAGNET_SETTINGS).register(addon);

        new EntanglementContainer(Groups.MACHINES, ENTANGLEMENT_CONTAINER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                CARBON_STRUCTURE.item(), DIELECTRIC_3.item(), CARBON_STRUCTURE.item(),
                DIELECTRIC_3.item(), INFUSED_FREQUENCY_CRYSTAL.item(), DIELECTRIC_3.item(),
                CARBON_STRUCTURE.item(), DIELECTRIC_3.item(), CARBON_STRUCTURE.item()
        }, ENTANGLEMENT_CONTAINER_SETTINGS).register(addon);

        new IndustrialEntanglementContainer(Groups.MACHINES, INDUSTRIAL_ENTANGLEMENT_CONTAINER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                CARBON_STRUCTURE.item(), ENTANGLEMENT_CONTAINER.item(), CARBON_STRUCTURE.item(),
                DIELECTRIC_4.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(), DIELECTRIC_4.item(),
                CARBON_STRUCTURE.item(), ENTANGLEMENT_CONTAINER.item(), CARBON_STRUCTURE.item()
        }, INDUSTRIAL_ENTANGLEMENT_CONTAINER_SETTINGS).register(addon);


    }
}
