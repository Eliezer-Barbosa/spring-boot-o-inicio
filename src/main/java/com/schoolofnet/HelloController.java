package com.schoolofnet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//controller e responseBody andam juntos
// aqui, a classe HelloController é uma rota
// nomenclatura: HelloController: Hello:endpoint, ou controlador
// cada método dessa classe será um endpoint especifico

@Controller // sem essa annotation dá erro 404 (Whitelabel Error Page)
@RequestMapping("/hello") // sem essa anotation o acesso era via localhost:8080. now: localhost:8080/hello
public class HelloController {
	
	// como não tem nada anotado nesse metodo, esse será o entry point
	//localhost:8080/hello/
	@RequestMapping // sem essa annotation dá erro 404 (Whitelabel Error Page)
	@ResponseBody // sem essa annotation dá erro 500 (Whitelabel Error Page)
	public String Hello() {
		return "Hello World by school of net! Laurinha";
	}
	
	@GetMapping(path = "/say/{name}")
	@ResponseBody
	public String say(@PathVariable String name) {
		return "Ola " + name + ". This is my new method";
	}
	
	@PostMapping(path = "/say")
	@ResponseBody
	public String sayPost(@RequestParam String name) {
		return "This is my result: " + name;
	}

}
