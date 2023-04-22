package me.neznamy.tab.shared.permission;

import lombok.Getter;
import me.neznamy.tab.shared.platform.TabPlayer;
import me.neznamy.tab.shared.TabConstants;

/**
 * An instance of PermissionPlugin to be used when nothing is found
 */
public class None extends PermissionPlugin {

    @Getter private final String name = "Unknown/None";

    @Override
    public String getPrimaryGroup(TabPlayer p) {
        return TabConstants.NO_GROUP;
    }
}