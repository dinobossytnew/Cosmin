package com.github.sachin.cosmin.nbtapi;

import com.github.sachin.cosmin.nbtapi.nms.NMSHelper;
import com.github.sachin.cosmin.nbtapi.nms.NBTItem_1_12_R1;
import com.github.sachin.cosmin.nbtapi.nms.NBTItem_1_14_R1;
import com.github.sachin.cosmin.nbtapi.nms.NBTItem_1_15_R1;
import com.github.sachin.cosmin.nbtapi.nms.NBTItem_1_16_R1;
import com.github.sachin.cosmin.nbtapi.nms.NBTItem_1_16_R2;
import com.github.sachin.cosmin.nbtapi.nms.NBTItem_1_16_R3;
import com.github.sachin.cosmin.nbtapi.nms.NBTItem_1_17_R1;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class NBTAPI {

    private String version;
    public static NMSHelper NMSHelper;

    public boolean loadVersions(@NotNull JavaPlugin plugin){
        this.version = plugin.getServer().getClass().getPackage().getName().split("\\.")[3];
        if(version.equals("v1_12_R1")){
            NMSHelper = new NBTItem_1_12_R1(null);
            return true;
        }
        else if(version.equals("v1_14_R1")){
            NMSHelper = new NBTItem_1_14_R1(null);
            return true;
        }
        else if(version.equals("v1_15_R1")){
            NMSHelper = new NBTItem_1_15_R1(null);
            return true;
        }
        else if(version.equals("v1_16_R1")){
            NMSHelper = new NBTItem_1_16_R1(null);
            return true;
        }
        else if(version.equals("v1_16_R2")){
            NMSHelper = new NBTItem_1_16_R2(null);
            return true;
        }
        else if(version.equals("v1_16_R3")){
            NMSHelper = new NBTItem_1_16_R3(null);
            return true;
        }
        else if(version.equals("v1_17_R1")){
            NMSHelper = new NBTItem_1_17_R1(null);
            return true;
        }
        return false;
        
    }
    
}
