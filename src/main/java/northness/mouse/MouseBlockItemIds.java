package northness.mouse;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class MouseBlockItemIds {
    public static BlockItemId MOUSE = create("Mouse");

    private static BlockItemId create(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(Mouse.MOD_ID, name);
        return BlockItemId.create(id, id);
    }
}
