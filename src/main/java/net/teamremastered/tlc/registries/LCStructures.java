package net.teamremastered.tlc.registries;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.structure.StructureType;
import net.teamremastered.tlc.TheLostCastle;
import net.teamremastered.tlc.structures.LostCastle;

public class LCStructures {

    public static StructureType<LostCastle> LOST_CASTLE;

    /**
     * Registers the structure itself and sets what its path is. In this case, the
     * structure will have the Identifier of structure_tutorial:sky_structures.
     *
     * It is always a good idea to register your Structures so that other mods and datapacks can
     * use them too directly from the registries. It's great for mod/datapacks compatibility.
     */
    public static void init() {
        LOST_CASTLE = Registry.register(Registry.STRUCTURE_TYPE, new Identifier(TheLostCastle.MODID, "lost_castle"), () -> LostCastle.CODEC);
    }

}
