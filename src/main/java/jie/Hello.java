package jie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Hello {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/api/{p:option1/|}hello")
  public String withParam(@PathParam("p") String p) {
    return "hello " + p;
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/api/{p:option1/|}world")
  public String withoutParam() {
    return "world";
  }
}
