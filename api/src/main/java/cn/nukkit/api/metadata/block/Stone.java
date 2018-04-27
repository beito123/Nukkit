package cn.nukkit.api.metadata.block;

import cn.nukkit.api.metadata.Metadata;

public enum Stone implements Metadata {
    REGULAR,
    GRANITE,
    POLISHED_GRANITE,
    DIORITE,
    POLISHED_DIORITE,
    ANDESITE,
    POLISHED_ANDESITE;

    @Override
    public String toString() {
        return "Stone(" +
                "type=" + name() +
                ')';
    }
}
