package net.torocraft.torohealth.config.loader;

import java.io.File;
import net.flintloader.loader.FlintLoader;

public class ConfigFolder {

  public static File get() {
    return FlintLoader.getConfigDirectory();
  }

}
