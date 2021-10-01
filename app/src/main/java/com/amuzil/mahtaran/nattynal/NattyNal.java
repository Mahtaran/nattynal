package com.amuzil.mahtaran.nattynal;

import static spark.Spark.*;

public class NattyNal {

	public static void main(String[] args) {
		port(12345);
		get("/hello", (request, response) -> "Hello World!");
	}
}
