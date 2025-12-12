package org.metamechanists.quaptics.items.groups;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.metamechanists.quaptics.Quaptics;
import org.metamechanists.quaptics.implementation.blocks.upgraders.DiffractionGrating;
import org.metamechanists.quaptics.implementation.blocks.upgraders.Interferometer;
import org.metamechanists.quaptics.implementation.blocks.upgraders.Polariser;
import org.metamechanists.quaptics.implementation.blocks.upgraders.Repeater;
import org.metamechanists.quaptics.implementation.blocks.upgraders.Scatterer;
import org.metamechanists.quaptics.items.Groups;

import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.FERROSILICON;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.HARDENED_METAL_INGOT;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.REINFORCED_ALLOY_INGOT;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.URANIUM;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.DiffractionGrating.DIFFRACTION_GRATING_1;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.DiffractionGrating.DIFFRACTION_GRATING_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.DiffractionGrating.DIFFRACTION_GRATING_2;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.DiffractionGrating.DIFFRACTION_GRATING_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Interferometer.INTERFEROMETER;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Interferometer.INTERFEROMETER_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Polariser.POLARISER;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Polariser.POLARISER_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Repeater.REPEATER_1;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Repeater.REPEATER_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Repeater.REPEATER_2;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Repeater.REPEATER_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Repeater.REPEATER_3;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Repeater.REPEATER_3_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Scatterer.SCATTERER_1;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Scatterer.SCATTERER_1_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Scatterer.SCATTERER_2;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Scatterer.SCATTERER_2_SETTINGS;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Scatterer.SCATTERER_3;
import static org.metamechanists.quaptics.implementation.blocks.upgraders.Scatterer.SCATTERER_3_SETTINGS;
import static org.metamechanists.quaptics.items.groups.CraftingComponents.*;


@UtilityClass
public class FrequencyAndPhase {
    public void initialize() {
        final SlimefunAddon addon = Quaptics.getInstance();

        new Repeater(Groups.FREQUENCY_AND_PHASE, REPEATER_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                RECEIVER_2.item(), new ItemStack(Material.REPEATER), TRANSMITTER_2.item(),
                FERROSILICON.item(), new ItemStack(Material.REDSTONE_BLOCK), FERROSILICON.item()
        }, REPEATER_1_SETTINGS).register(addon);

        new Repeater(Groups.FREQUENCY_AND_PHASE, REPEATER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                RECEIVER_3.item(), REPEATER_1.item(), TRANSMITTER_3.item(),
                HARDENED_METAL_INGOT.item(), INFUSED_FREQUENCY_CRYSTAL.item(), HARDENED_METAL_INGOT.item()
        }, REPEATER_2_SETTINGS).register(addon);

        new Repeater(Groups.FREQUENCY_AND_PHASE, REPEATER_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                RECEIVER_4.item(), REPEATER_2.item(), TRANSMITTER_4.item(),
                URANIUM.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(), URANIUM.item()
        }, REPEATER_3_SETTINGS).register(addon);



        new Scatterer(Groups.FREQUENCY_AND_PHASE, SCATTERER_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                RECEIVER_2.item(), new ItemStack(Material.COMPARATOR), TRANSMITTER_2.item(),
                FERROSILICON.item(), new ItemStack(Material.REDSTONE_BLOCK), FERROSILICON.item()
        }, SCATTERER_1_SETTINGS).register(addon);

        new Scatterer(Groups.FREQUENCY_AND_PHASE, SCATTERER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                RECEIVER_3.item(), SCATTERER_1.item(), TRANSMITTER_3.item(),
                HARDENED_METAL_INGOT.item(), INFUSED_FREQUENCY_CRYSTAL.item(), HARDENED_METAL_INGOT.item()
        }, SCATTERER_2_SETTINGS).register(addon);

        new Scatterer(Groups.FREQUENCY_AND_PHASE, SCATTERER_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                RECEIVER_4.item(), SCATTERER_2.item(), TRANSMITTER_4.item(),
                URANIUM.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(), URANIUM.item()
        }, SCATTERER_3_SETTINGS).register(addon);



        new Polariser(Groups.FREQUENCY_AND_PHASE, POLARISER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                REINFORCED_ALLOY_INGOT.item(), TRANSCEIVER_3.item(), REINFORCED_ALLOY_INGOT.item(),
                RECEIVER_3.item(), null, TRANSMITTER_3.item(),
                REINFORCED_ALLOY_INGOT.item(), TRANSCEIVER_3.item(), REINFORCED_ALLOY_INGOT.item()
        }, POLARISER_SETTINGS).register(addon);



        new Interferometer(Groups.FREQUENCY_AND_PHASE, INTERFEROMETER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                REINFORCED_ALLOY_INGOT.item(), POLARISER.item(), REINFORCED_ALLOY_INGOT.item(),
                RECEIVER_3.item(), POLARISER.item(), TRANSMITTER_3.item(),
                REINFORCED_ALLOY_INGOT.item(), POLARISER.item(), REINFORCED_ALLOY_INGOT.item()
        }, INTERFEROMETER_SETTINGS).register(addon);



        new DiffractionGrating(Groups.FREQUENCY_AND_PHASE, DIFFRACTION_GRATING_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                DIELECTRIC_3.item(), PHASE_CRYSTAL_180.item(), DIELECTRIC_3.item(),
                RECEIVER_3.item(), POLARISER.item(), TRANSMITTER_3.item(),
                DIELECTRIC_3.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(), DIELECTRIC_3.item()
        }, DIFFRACTION_GRATING_1_SETTINGS).register(addon);

        new DiffractionGrating(Groups.FREQUENCY_AND_PHASE, DIFFRACTION_GRATING_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                DIELECTRIC_4.item(), PHASE_CRYSTAL_180.item(), DIELECTRIC_4.item(),
                RECEIVER_4.item(), DIFFRACTION_GRATING_1.item(), TRANSMITTER_4.item(),
                DIELECTRIC_4.item(), ENTANGLED_FREQUENCY_CRYSTAL.item(), DIELECTRIC_4.item()
        }, DIFFRACTION_GRATING_2_SETTINGS).register(addon);
    }
}