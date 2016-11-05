package sk.fei.books.spark;

import static spark.Spark.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Library {

	public static void main(String[] args) {
		get("/", (req, res) -> "Hello from Spark");
		get("/books", (req, res) -> "Hitchhiker's guide to the galaxy, Witcher");
		post("/books", (req, res) -> {
			return "Your new book: " + req.body();
		});
		
		put("/books/:id", (req, res) -> {
			return "Modifying book: " +req.params("id") +" to contain " + req.body();
		});
		
		delete("/books/:id", (req, res) -> {
			return "Scrapping book " +req.params("id");
		});
	}

}
