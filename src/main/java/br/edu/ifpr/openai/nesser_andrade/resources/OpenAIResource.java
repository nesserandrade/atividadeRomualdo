package br.edu.ifpr.openai.nesser_andrade.resources;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("openai")
@Produces(MediaType.APPLICATION_JSON)
public class OpenAIResource {
   @POST
   public String getJSON() {
      return "Maria tinha um carneiro";
   }
}