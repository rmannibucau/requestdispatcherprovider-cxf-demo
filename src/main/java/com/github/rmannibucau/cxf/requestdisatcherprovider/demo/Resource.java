package com.github.rmannibucau.cxf.requestdisatcherprovider.demo;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("books")
@ApplicationScoped
public class Resource {
    @GET
    @Path("{id}")
    @Produces({"text/html", "application/xml"})
    public Book getBook(@PathParam("id") final String id) {
        final Book book = new Book();
        book.setId(id);
        book.setName(id + " Best Seller");
        return book;
    }

    public static class Book {
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(final String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }
    }
}
