package com.algorithmlx.liquid.base.data;

import net.minecraft.sounds.SoundEvent;

public record DynamicContainerData(String name, int rowWidth, int rowHeight, boolean fireResistant, SoundEvent soundEvent) {

    public String getName() {
        return this.name;
    }

    public int getRowWidth() {
        return this.rowWidth;
    }

    public int getRowHeight() {
        return this.rowHeight;
    }

    public boolean getFireResistant() {
        return this.fireResistant;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public static DynamicContainerData create(String name, int rowWidth, int rowHeight, boolean fireResistant, SoundEvent soundEvent) {
        return new DynamicContainerData(name, rowWidth, rowHeight, fireResistant, soundEvent);
    }
}
