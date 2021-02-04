package org.elliotnash.bungeealiases

import net.md_5.bungee.api.plugin.Plugin;

class BungeeAliases: Plugin(){
    override fun onEnable(){
        println("Plugin enabled")
    }
    override fun onDisable(){
        println("Plugin disabled")
    }
}