package northness.mouse;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class MouseBlock {
    public static Block MOUSE = register(
           MouseBlockItemIds.MOUSE,
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.WOOL)
    );

    public static void initialize() {}
    
        private static Block register(BlockItemId id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {

            Block block = Registry.register(
                    BuiltInRegistries.BLOCK,
                    id.block(),
                    blockFactory.apply(properties.setId(id.block()))
            );

            BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(id.item()));
            Registry.register(BuiltInRegistries.ITEM, id.item(), blockItem);

            return block;
        }

}
