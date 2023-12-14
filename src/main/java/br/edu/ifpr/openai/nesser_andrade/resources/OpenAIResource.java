package br.edu.ifpr.openai.nesser_andrade.resources;

import br.edu.ifpr.openai.gpt.Chatgpt;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("openai")
@Produces(MediaType.APPLICATION_JSON)
public class OpenAIResource {
   @GET
   public String getJSON() {
      String prompt = "Quem é Taylor Swift?";
      String response = Chatgpt.chat(prompt);
      return response;
   }
}
