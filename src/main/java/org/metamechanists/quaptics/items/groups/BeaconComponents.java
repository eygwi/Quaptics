package org.metamechanists.quaptics.items.groups;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.metamechanists.quaptics.Quaptics;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconBattery;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconComputer;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconMatrix;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconPanel;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconPowerSupply;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconRod;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconTransmitter;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController1;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController2;
import org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController3;
import org.metamechanists.quaptics.items.Groups;

import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.*;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconBattery.*;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconBeam.BEACON_BEAM;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconBeam.BEACON_BEAM_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconComputer.BEACON_COMPUTER;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconComputer.BEACON_COMPUTER_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconMatrix.BEACON_MATRIX;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconMatrix.BEACON_MATRIX_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconPanel.BEACON_PANEL;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconPanel.BEACON_PANEL_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconPowerSupply.*;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconRod.BEACON_ROD;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconRod.BEACON_ROD_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconTransmitter.BEACON_TRANSMITTER;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconTransmitter.BEACON_TRANSMITTER_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController1.BEACON_CONTROLLER_1;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController1.BEACON_CONTROLLER_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController2.BEACON_CONTROLLER_2;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController2.BEACON_CONTROLLER_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController3.BEACON_CONTROLLER_3;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.controllers.BeaconController3.BEACON_CONTROLLER_3_SETTINGS;
import static org.metamechanists.quaptics.items.groups.CraftingComponents.*;


@UtilityClass
public class BeaconComponents {
    public void initialize() {
        final SlimefunAddon addon = Quaptics.getInstance();

        new BeaconController1(Groups.BEACON_COMPONENTS, BEACON_CONTROLLER_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                HARDENED_METAL_INGOT.item(), BLANK_MODULE_CARD.item(), HARDENED_METAL_INGOT.item(),
                HARDENED_METAL_INGOT.item(), BEACON_COMPUTER.item(), HARDENED_METAL_INGOT.item(),
                HARDENED_METAL_INGOT.item(), BLANK_MODULE_CARD.item(), HARDENED_METAL_INGOT.item()
        }, BEACON_CONTROLLER_1_SETTINGS).register(addon);

        new BeaconController2(Groups.BEACON_COMPONENTS, BEACON_CONTROLLER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                CARBONADO.item(), BLANK_MODULE_CARD.item(), CARBONADO.item(),
                INFUSED_FREQUENCY_CRYSTAL.item(), BEACON_CONTROLLER_1.item(), INFUSED_FREQUENCY_CRYSTAL.item(),
                CARBONADO.item(), BLANK_MODULE_CARD.item(), CARBONADO.item()
        }, BEACON_CONTROLLER_2_SETTINGS).register(addon);

        new BeaconController3(Groups.BEACON_COMPONENTS, BEACON_CONTROLLER_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                BLISTERING_INGOT_3.item(), BLANK_MODULE_CARD.item(), BLISTERING_INGOT_3.item(),
                ENTANGLED_FREQUENCY_CRYSTAL.item(), BEACON_CONTROLLER_2.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(),
                BLISTERING_INGOT_3.item(), BLANK_MODULE_CARD.item(), BLISTERING_INGOT_3.item()
        }, BEACON_CONTROLLER_3_SETTINGS).register(addon);



        new BeaconPowerSupply(Groups.BEACON_COMPONENTS, BEACON_POWER_SUPPLY_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK),
                RECEIVER_3.item(), TRANSCEIVER_3.item(), TRANSCEIVER_3.item(),
                new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK)
        }, BEACON_POWER_SUPPLY_1_SETTINGS).register(addon);

        new BeaconPowerSupply(Groups.BEACON_COMPONENTS, BEACON_POWER_SUPPLY_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK),
                RECEIVER_4.item(), BEACON_POWER_SUPPLY_1.item(), BEACON_POWER_SUPPLY_1.item(),
                new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.COPPER_BLOCK)
        }, BEACON_POWER_SUPPLY_2_SETTINGS).register(addon);



        new BeaconBattery(Groups.BEACON_COMPONENTS, BEACON_BATTERY_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                POWER_CRYSTAL.item(), TRANSFORMER_COIL_2.item(), POWER_CRYSTAL.item(),
                CARBON_STRUCTURE.item(), CARBON_STRUCTURE.item(), CARBON_STRUCTURE.item(),
                POWER_CRYSTAL.item(), TRANSFORMER_COIL_2.item(), POWER_CRYSTAL.item(),
        }, BEACON_BATTERY_1_SETTINGS).register(addon);

        new BeaconBattery(Groups.BEACON_COMPONENTS, BEACON_BATTERY_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                CARBON_STRUCTURE.item(), TRANSFORMER_COIL_3.item(), CARBON_STRUCTURE.item(),
                BEACON_BATTERY_1.item(), CARBON_STRUCTURE.item(), BEACON_BATTERY_1.item(),
                CARBON_STRUCTURE.item(), TRANSFORMER_COIL_3.item(), CARBON_STRUCTURE.item(),
        }, BEACON_BATTERY_2_SETTINGS).register(addon);



        new BeaconComputer(Groups.BEACON_COMPONENTS, BEACON_COMPUTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                FERROSILICON.item(), FERROSILICON.item(), FERROSILICON.item(),
                INFUSED_FREQUENCY_CRYSTAL.item(), ADVANCED_CIRCUIT_BOARD.item(), INFUSED_FREQUENCY_CRYSTAL.item(),
                FERROSILICON.item(), FERROSILICON.item(), FERROSILICON.item()
        }, BEACON_COMPUTER_SETTINGS).register(addon);



        new BeaconMatrix(Groups.BEACON_COMPONENTS, BEACON_MATRIX, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                HARDENED_METAL_INGOT.item(), HARDENED_METAL_INGOT.item(), HARDENED_METAL_INGOT.item(),
                ENTANGLED_FREQUENCY_CRYSTAL.item(), BEACON_COMPUTER.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(),
                HARDENED_METAL_INGOT.item(), FERROSILICON.item(), HARDENED_METAL_INGOT.item()
        }, BEACON_MATRIX_SETTINGS).register(addon);



        new BeaconRod(Groups.BEACON_COMPONENTS, BEACON_BEAM, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, CARBON_STRUCTURE.item(), null,
                null, CARBON_STRUCTURE.item(), null,
                null, CARBON_STRUCTURE.item(), null
        }, BEACON_BEAM_SETTINGS).register(addon);



        new BeaconRod(Groups.BEACON_COMPONENTS, BEACON_ROD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, null,
                CARBON_STRUCTURE.item(), CARBON_STRUCTURE.item(), CARBON_STRUCTURE.item(),
                null, null, null
        }, BEACON_ROD_SETTINGS).register(addon);



        new BeaconPanel(Groups.BEACON_COMPONENTS, BEACON_PANEL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, null,
                CARBON_STRUCTURE.item(), CARBON_STRUCTURE.item(), null,
                CARBON_STRUCTURE.item(), CARBON_STRUCTURE.item(), null,
        }, BEACON_PANEL_SETTINGS).register(addon);



        new BeaconTransmitter(Groups.BEACON_COMPONENTS, BEACON_TRANSMITTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, null,
                null, TRANSCEIVER_3.item(), null,
                null, CARBON_STRUCTURE.item(), null,
        }, BEACON_TRANSMITTER_SETTINGS).register(addon);
    }
}