package ykarav.tut.Zuul_Responder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRest {

	@RequestMapping("/getPerson")
	public Person getPerson() {
		return new Person("TestUser",123456789);
	}
}
