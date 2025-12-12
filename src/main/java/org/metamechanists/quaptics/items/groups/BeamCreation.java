package org.metamechanists.quaptics.items.groups;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.metamechanists.quaptics.Quaptics;
import org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator;
import org.metamechanists.quaptics.implementation.blocks.concentrators.SolarConcentrator;
import org.metamechanists.quaptics.implementation.multiblocks.reactor.ReactorController;
import org.metamechanists.quaptics.implementation.multiblocks.reactor.ReactorRing;
import org.metamechanists.quaptics.items.Groups;

import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.*;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator.ENERGY_CONCENTRATOR_1;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator.ENERGY_CONCENTRATOR_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator.ENERGY_CONCENTRATOR_2;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator.ENERGY_CONCENTRATOR_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator.ENERGY_CONCENTRATOR_3;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator.ENERGY_CONCENTRATOR_3_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator.ENERGY_CONCENTRATOR_4;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.EnergyConcentrator.ENERGY_CONCENTRATOR_4_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.SolarConcentrator.SOLAR_CONCENTRATOR_1;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.SolarConcentrator.SOLAR_CONCENTRATOR_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.SolarConcentrator.SOLAR_CONCENTRATOR_2;
import static org.metamechanists.quaptics.implementation.blocks.concentrators.SolarConcentrator.SOLAR_CONCENTRATOR_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.beacons.components.BeaconMatrix.BEACON_MATRIX;
import static org.metamechanists.quaptics.implementation.multiblocks.reactor.ReactorController.REACTOR_CONTROLLER;
import static org.metamechanists.quaptics.implementation.multiblocks.reactor.ReactorController.REACTOR_CONTROLLER_SETTINGS;
import static org.metamechanists.quaptics.implementation.multiblocks.reactor.ReactorRing.REACTOR_RING;
import static org.metamechanists.quaptics.implementation.multiblocks.reactor.ReactorRing.REACTOR_RING_SETTINGS;
import static org.metamechanists.quaptics.items.groups.CraftingComponents.*;


@UtilityClass
public class BeamCreation {
    public void initialize() {
        final SlimefunAddon addon = Quaptics.getInstance();

        new SolarConcentrator(Groups.BEAM_CREATION, SOLAR_CONCENTRATOR_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_1.item(), TRANSMITTER_1.item(),
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS)
        }, SOLAR_CONCENTRATOR_1_SETTINGS).register(addon);

        new SolarConcentrator(Groups.BEAM_CREATION, SOLAR_CONCENTRATOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                ENERGY_CONCENTRATION_ELEMENT_1.item(), SOLAR_CONCENTRATOR_1.item(), TRANSMITTER_1.item(),
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS)
        }, SOLAR_CONCENTRATOR_2_SETTINGS).register(addon);



        new EnergyConcentrator(Groups.BEAM_CREATION, ENERGY_CONCENTRATOR_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_2.item(), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), SOLAR_CONCENTRATOR_2.item(), TRANSMITTER_2.item(),
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_2.item(), new ItemStack(Material.GLASS)
        }, ENERGY_CONCENTRATOR_1_SETTINGS).register(addon);

        new EnergyConcentrator(Groups.BEAM_CREATION, ENERGY_CONCENTRATOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_2.item(), new ItemStack(Material.GLASS),
                ENERGY_CONCENTRATION_ELEMENT_2.item(), ENERGY_CONCENTRATOR_1.item(), TRANSMITTER_2.item(),
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_2.item(), new ItemStack(Material.GLASS)
        }, ENERGY_CONCENTRATOR_2_SETTINGS).register(addon);

        new EnergyConcentrator(Groups.BEAM_CREATION, ENERGY_CONCENTRATOR_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_3.item(), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATOR_2.item(), TRANSMITTER_3.item(),
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_3.item(), new ItemStack(Material.GLASS)
        }, ENERGY_CONCENTRATOR_3_SETTINGS).register(addon);

        new EnergyConcentrator(Groups.BEAM_CREATION, ENERGY_CONCENTRATOR_4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_3.item(), new ItemStack(Material.GLASS),
                ENERGY_CONCENTRATION_ELEMENT_3.item(), ENERGY_CONCENTRATOR_3.item(), TRANSMITTER_3.item(),
                new ItemStack(Material.GLASS), ENERGY_CONCENTRATION_ELEMENT_3.item(), new ItemStack(Material.GLASS)
        }, ENERGY_CONCENTRATOR_4_SETTINGS).register(addon);



        new ReactorRing(Groups.BEAM_CREATION, REACTOR_RING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ELECTRO_MAGNET.item(), DIELECTRIC_4.item(), ELECTRO_MAGNET.item(),
                ELECTRO_MAGNET.item(), TRANSFORMER_COIL_3.item(), ELECTRO_MAGNET.item(),
                ELECTRO_MAGNET.item(), DIELECTRIC_4.item(), ELECTRO_MAGNET.item()
        }, REACTOR_RING_SETTINGS).register(addon);

        new ReactorController(Groups.BEAM_CREATION, REACTOR_CONTROLLER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, BEACON_MATRIX.item(), null,
                BEACON_MATRIX.item(), NETHER_STAR_REACTOR.item(), BEACON_MATRIX.item(),
                null, BEACON_MATRIX.item(), null
        }, REACTOR_CONTROLLER_SETTINGS).register(addon);
    }
}
