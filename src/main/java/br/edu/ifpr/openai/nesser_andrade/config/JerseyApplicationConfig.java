package br.edu.ifpr.openai.nesser_andrade.config;

import java.util.Set;

import jakarta.ws.rs.core.Application;

@jakarta.ws.rs.ApplicationPath("webapi")
public class JerseyApplicationConfig extends Application {
   @Override
   public Set<Class<?>> getClasses() {
      Set<Class<?>> resources = new java.util.HashSet<>();

      addRestResourceClasses(resources);

      return resources;
   }

   private void addRestResourceClasses(Set<Class<?>> resources) {
      resources.add(null);
   }
}
