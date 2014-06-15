package com.UEM.Controller;
import java.util.Map;


import com.UEM.Form.Student;
import java.util.List;
import com.UEM.Service.UEMStudentService;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
public class UEMController {

	@Controller
	public class StudentController {
	 
	    @Autowired
	    UEMStudentService studentService;
	 
	    @RequestMapping("/index")
	    public String listStudents(Map<String, Object> map) {
	    	System.out.println("Length:"+studentService.getStudentList().size());
	        map.put("student", new Student());
	        map.put("studentList", studentService.getStudentList());
	 
	        return "student";
	    }
	 /*
	    @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String addContact(@ModelAttribute("contact")
	    Contact contact, BindingResult result) {
	 
	        contactService.addContact(contact);
	 
	        return "redirect:/index";
	    }
	 
	    @RequestMapping("/delete/{contactId}")
	    public String deleteContact(@PathVariable("contactId")
	    Integer contactId) {
	 
	        contactService.removeContact(contactId);
	 
	        return "redirect:/index";
	    }
	    */
	}
}
