package com.amuzil.mahtaran.nattynal;

import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.*;

public class NattyNal {

	public static void main(String[] args) {
		port(12345);
		get("/hello", (request, response) -> "Hello World!");
		get("/", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("message", "Hello World!");
			model.put("greeting", "General Kenobi");
			Configuration config = new Configuration(Configuration.VERSION_2_3_26);
			config.setClassForTemplateLoading(NattyNal.class, "/");
			return new FreeMarkerEngine(config).render(new ModelAndView(model, "index.ftl"));
		});
	}
}
