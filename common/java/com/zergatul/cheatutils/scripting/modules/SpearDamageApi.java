package com.zergatul.cheatutils.scripting.modules;


import com.zergatul.cheatutils.configs.ConfigStore;
import com.zergatul.cheatutils.configs.SpearDamageConfig;

public class SpearDamageApi extends ModuleApi<SpearDamageConfig> {


    @Override
    protected SpearDamageConfig getConfig() {
        return ConfigStore.instance.getConfig().spearDamageConfig;
    }
}