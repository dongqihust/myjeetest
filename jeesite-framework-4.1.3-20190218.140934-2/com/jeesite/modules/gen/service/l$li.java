package com.jeesite.modules.gen.service;	
	
import com.jeesite.common.entity.Extend;	
import java.util.HashMap;	
import java.util.Iterator;	
import java.util.Map;	
import java.util.Map.Entry;	
import org.hyperic.sigar.cmd.Tail;	
	
public final class l$li extends HashMap {	
   private static boolean isLoaded = false;	
	
   public void putAll(Map m) {	
      if (m != null) {	
         Iterator var2;	
         for(Iterator var10000 = var2 = m.entrySet().iterator(); var10000.hasNext(); var10000 = var2) {	
            Entry a = (Entry)var2.next();	
            this.put((String)a.getKey(), (String)a.getValue());	
         }	
	
      }	
   }	
	
   public String put(String key, String value) {	
      if (isLoaded && !"message".equals(key) && !"title".equals(key) && (!"type".equals(key) || !"0".equals(value)) && !"loadMessage".equals(key)) {	
         return null;	
      } else {	
         if ("loadMessage".equals(key)) {	
            isLoaded = true;	
         }	
	
         return (String)super.put(key, value);	
      }	
   }	
	
   public boolean isLoaded() {	
      return isLoaded;	
   }	
}	
