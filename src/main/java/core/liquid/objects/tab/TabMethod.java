package core.liquid.objects.tab;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class TabMethod {
    public static CreativeModeTab of(String name, ItemStack icon) {
        return new CreativeModeTab(name) {
            @Override
            public ItemStack makeIcon() {
                return icon;
            }
        };
    }

    public static CreativeModeTab of(String name, ItemStack icon, ResourceLocation bgTexture) {
        return TabMethod.of(name, icon).setBackgroundImage(bgTexture);
    }

    public static CreativeModeTab of(String name, ItemLike icon) {
        return TabMethod.of(name, new ItemStack(icon));
    }

    public static CreativeModeTab of(String name, ItemLike icon, ResourceLocation bgTexture) {
        return TabMethod.of(name, new ItemStack(icon), bgTexture);
    }
}
