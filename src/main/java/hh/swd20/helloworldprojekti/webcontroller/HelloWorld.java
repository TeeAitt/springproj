package hh.swd20.helloworldprojekti.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWorld {
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello!";
	}

}
