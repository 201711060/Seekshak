package com.ss.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.taglibs.standard.lang.jstl.ExpressionString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ss.entity.User;
import com.ss.entity.Institute;
import com.ss.entity.Jobs;
import com.ss.service.UserService;
import com.ss.service.InstituteService;
import com.ss.service.JobsService;

@Controller
public class ClientController {

	@Autowired
	JobsService jobsService;

	@Autowired
	UserService userService;

	@Autowired
	InstituteService instituteService;

	@GetMapping("/institute_login")
	public String getInstituteLogin(Model model) {
		return "institute_login";
	}

	@PostMapping("doInstitutelogin")
	public String doInstituteLogin(HttpServletRequest request, HttpSession httpSession, Model model) {

		boolean sessionValid = false;
		String email = request.getParameter("emailid");
		String password = request.getParameter("password");
		Institute newInstitute= new Institute();
		Institute existingInstitute = new Institute();
		
		try {
			existingInstitute = instituteService.findById(email);
			System.out.println(existingInstitute.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
		if (existingInstitute==null ||  existingInstitute.getPassword() == null) {
			return "redirect:institute_login";
		} else if (existingInstitute.getPassword().equals(password)) {
			sessionValid = true;
		} else {
			sessionValid = false;
		}
		if (sessionValid) {
			httpSession.setAttribute("institutename", existingInstitute.getInstitutename());
			httpSession.setAttribute("instituteemail", existingInstitute.getEmail());
			httpSession.setAttribute("SessionValid", "true");
			httpSession.setAttribute("usertype", "Institute");

			return "redirect:index";
		} else {
			return "redirect:institute_login";
		}
	}

	@GetMapping("/login")
	public String getLogin(Model model) {
		return "login";
	}

	@PostMapping("dologin")
	public String doLogin(HttpServletRequest request, HttpSession httpSession, Model model) {

		boolean sessionValid = false;
		String email = request.getParameter("emailid");
		String password = request.getParameter("password");
		User user = new User();

		try {
			user = userService.findById(email);
		} catch (Exception e) {
			System.out.println(e);
		}
		if (user==null || user.getPassword() == null) {
			return "redirect:login";
		} else if (user.getPassword().equals(password)) {
			sessionValid = true;
		} else {
			sessionValid = false;
		}
		if (sessionValid) {
			httpSession.setAttribute("fullname", user.getFullname());
			httpSession.setAttribute("email", user.getEmailid());
			httpSession.setAttribute("SessionValid", "true");
			httpSession.setAttribute("usertype", "candidate");

			return "redirect:index";
		} else {
			return "redirect:login";
		}
	}

	@GetMapping("/postjob")
	public String getPostJob(Model model) {
		return "post_job";
	}

	@PostMapping("/dopostjob")
	public String doPostJob(HttpServletRequest request, HttpSession httpSession, Model model) {
		String jobtitle = request.getParameter("jobtitle");
		String jobdescription = request.getParameter("jobdescription");
		String requiredqualification = request.getParameter("requiredqualification");
		String joblocation = request.getParameter("joblocation");
		String salary = request.getParameter("salary");
		String experience = request.getParameter("experience");
		String lastdate = request.getParameter("lastdate");
		String specialization = request.getParameter("specialization");
		String jobcategory = request.getParameter("jobcategory");

		Jobs newjob = new Jobs();
		newjob.setJobtitle(jobtitle);
		newjob.setJobdescription(jobdescription);
		newjob.setRequiredqualification(requiredqualification);
		newjob.setJoblocation(joblocation);
		newjob.setSalary(salary);
		newjob.setExperience(experience);
		newjob.setLastdate(lastdate);
		newjob.setSpecialization(specialization);
		newjob.setJobcategory(jobcategory);

		jobsService.saveJob(newjob);
		return "redirect:index";
	}

	// Completed
	@GetMapping("/register_user")
	public String getRegisterUser(Model model) {
		return "register_user";
	}

	// Completed
	@PostMapping("/doregisteruser")
	public String doregisteruser(HttpServletRequest request, HttpSession httpSession, Model model) {
		String emailid = request.getParameter("email");
		String password = request.getParameter("password");
		String fullname = request.getParameter("fullname");
		String mobile = request.getParameter("mobile");
		
		User newUser = new User();
		newUser.setEmailid(emailid);
		newUser.setPassword(password);
		newUser.setFullname(fullname);
		newUser.setMobileno(mobile);
		
		User existinguser = userService.findById(emailid);
		if(existinguser!=null && newUser.getEmailid().equals(existinguser.getEmailid())){
			return "redirect:register_user";
		}else{
			System.out.println(newUser.toString());
			userService.saveUser(newUser);
			return "redirect:index";	
		}
		
	}

	@GetMapping("/register_institute")
	public String getRegisterInstitute(Model model) {
		return "register_institute";
	}

	@PostMapping("/doregisterinstitute")
	public String doregisterinstitute(HttpServletRequest request, HttpSession httpSession, Model model) {
		String institutename = request.getParameter("institutename");
		String institutecategory = request.getParameter("institutecategory");
		String institutewebsite = request.getParameter("institutewebsite");
		String affiliateduniversity = request.getParameter("affiliateduniversity");
		String ranking = request.getParameter("ranking");
		String institutetype = request.getParameter("institutetype");
		String city_name = request.getParameter("city_name");
		String state = request.getParameter("state");
		String address = request.getParameter("address");
		String contactno = request.getParameter("contactno");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		Institute institute = new Institute();
		institute.setInstitutename(institutename);
		institute.setInstitutecategory(institutecategory);
		institute.setInstitutewebsite(institutewebsite);
		institute.setAffiliateduniversity(affiliateduniversity);
		institute.setRanking(ranking);
		institute.setInstitutetype(institutetype);
		institute.setCity(city_name);
		institute.setState(state);
		institute.setAddress(address);
		institute.setContactno(contactno);
		institute.setEmail(email);
		institute.setPassword(pwd);
		
		instituteService.saveInstitute(institute);
		return "redirect:index";
	}

	@GetMapping("/user")
	public String getUser(Model model) {
		return "user_personal_details";
	}

	@GetMapping("/userdetails")
	public String getUserDetails(Model model) {
		return "user_professional_details";
	}

	@GetMapping("/viewjobs")
	public String getJob(HttpServletRequest request, HttpSession httpSession, Model model) {

		String category = request.getParameter("jobcategory");
		System.out.println(category + "\n");
		List<Jobs> joblist = jobsService.findByCategory(category);

		if (joblist != null) {
			for (int i = 0; i < joblist.size(); i++)
				System.out.println(joblist.get(i));
		} else
			System.out.println("No Jobs");
		model.addAttribute("joblist", joblist);

		return "viewjobs";
	}

	@GetMapping("/dashboard")
	public String getDashboard(Model model) {
		List<Jobs> joblist = jobsService.findAllJobs();
		if (joblist != null) {
			for (int i = 0; i < joblist.size(); i++)
				System.out.println(joblist.get(i));
		} else
			System.out.println("No Jobs");
		model.addAttribute("joblist", joblist);
		return "dashboard";
	}

	@GetMapping("/profile")
	public String getProfile(Model model) {
		return "profile";
	}

	@GetMapping("/preferredjob")
	public String getPreferredJob(Model model) {
		return "preferredjob";
	}

	@GetMapping("/alljobs")
	public String getAllJobs(Model model) {
		return "alljobs";
	}

	@GetMapping("/apply")
	public String getApply(Model model) {
		return "apply";
	}

	@GetMapping("/index")
	public String getIndex(Model model) {
		List<Jobs> joblist = jobsService.findAllJobs();
		if (joblist != null) {
			for (int i = 0; i < joblist.size(); i++)
				System.out.println(joblist.get(i));
		} else
			System.out.println("No Jobs");
		model.addAttribute("joblist", joblist);
		return "index";
	}

	@GetMapping("/")
	public String getHome(Model model) {
		return "index";
	}
	
}
