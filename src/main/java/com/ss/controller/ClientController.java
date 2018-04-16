package com.ss.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ss.entity.Admin;
import com.ss.entity.Institute;
import com.ss.entity.Job_Application;
import com.ss.entity.Jobs;
import com.ss.entity.Research;
import com.ss.entity.User;
import com.ss.entity.User_Proffesional_Detail;
import com.ss.service.AdminService;
import com.ss.service.InstituteService;
import com.ss.service.JobsApplicationService;
import com.ss.service.JobsService;
import com.ss.service.ResearchService;
import com.ss.service.UserPService;
import com.ss.service.UserService;

@Controller
public class ClientController {

	@Autowired
	JobsService jobsService;

	@Autowired
	AdminService adminService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserPService userPService;
	
	@Autowired
	ResearchService researchService;
	
	@Autowired
	InstituteService instituteService;

	@Autowired
	JobsApplicationService jobsApplicationService;
	
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
			httpSession.setAttribute("instituteid", existingInstitute.getIdinstitute());
			httpSession.setAttribute("institutename", existingInstitute.getInstitutename());
			httpSession.setAttribute("instituteemail", existingInstitute.getEmail());
			httpSession.setAttribute("instituteSessionValid", "true");
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
			httpSession.setAttribute("candidate_id", user.getIduserinfo());
			httpSession.setAttribute("fullname", user.getFullname());
			httpSession.setAttribute("email", user.getEmailid());
			httpSession.setAttribute("SessionValid", "true");
			httpSession.setAttribute("usertype", "candidate");

			return "redirect:index";
		} else {
			return "redirect:login";
		}
	}

	@GetMapping("/post_job")
	public String getPostJob(HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("instituteSessionValid") != null 
				&& httpSession.getAttribute("instituteSessionValid").equals("true"))
			return "post_job";
		else
			return "redirect:index";
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
		String postedby = (String) httpSession.getAttribute("institutename");
		int postedbyid = (Integer) httpSession.getAttribute("instituteid");
		
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
		newjob.setPostedby(postedby);
		newjob.setPostedbyid(postedbyid);
		
		if(httpSession.getAttribute("instituteSessionValid").equals("true")) {
			Institute institute = instituteService.findByInstituteId(postedbyid);
			if(institute!=null && institute.getActive().equals("active"))
				jobsService.saveJob(newjob);
			else
				model.addAttribute("error", "Your account is not Verified yet");
		}
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
			userService.saveUser(newUser);
			return "redirect:login";	
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
		Institute existingInstitute = instituteService.findById(email);
		if(existingInstitute!=null && !existingInstitute.getEmail().equals(email)) {
			instituteService.saveInstitute(institute);
			return "redirect:institute_login";
		}
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

	@GetMapping("/profile")
	public String getProfile(HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("SessionValid") != null 
				&& httpSession.getAttribute("SessionValid").equals("true")) {
			int userID = (Integer) httpSession.getAttribute("candidate_id");
			User user = userService.findByUserId(userID);
			model.addAttribute("user", user);
			return "user_personal_details";
		}
		else
			return "redirect:index";
	}

	@GetMapping("/proffesional_details")
	public String getProffesional_Details(HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("SessionValid") != null 
				&& httpSession.getAttribute("SessionValid").equals("true")) {
			int id = (Integer)httpSession.getAttribute("candidate_id");
			User_Proffesional_Detail userDetail = userPService.findByUserId(id);
			Research research = researchService.findByUserId(id);
			User user = userService.findByUserId(id);
			model.addAttribute("user", user);
			model.addAttribute("userDetail", userDetail);
			model.addAttribute("research", research);
			return "user_proffessional_details";
		}
		else
			return "redirect:index";
	}
	
	@GetMapping("/shortlist")
	public String getShortlist(HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("instituteSessionValid") != null 
				&& httpSession.getAttribute("instituteSessionValid").equals("true")) {
			int postedByid = (Integer)httpSession.getAttribute("instituteid");
			List<Jobs> joblist = jobsService.findByPostedByID(postedByid);
			model.addAttribute("joblist", joblist);
			
			return "shortlist";
		}
		else
			return "redirect:index";
	}
	
	@GetMapping("/doshortlist")
	public String getDoShortlist(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("instituteSessionValid") != null 
				&& httpSession.getAttribute("instituteSessionValid").equals("true")) {
			int postedByid = (Integer)httpSession.getAttribute("instituteid");
			List<Jobs> joblist = jobsService.findByPostedByID(postedByid);
			model.addAttribute("joblist", joblist);
			int job_id = Integer.parseInt(request.getParameter("job_id"));
			List<Job_Application> job_Application = jobsApplicationService.findByJobID(job_id);
			int i =0;
			List<User> userList = new ArrayList<User>();
			List<Float> perfScore = new ArrayList<Float>();
			
			while(!job_Application.isEmpty()) {
				Job_Application myJob = job_Application.remove(i);
				User candidate = userService.findByUserId(myJob.getCandidate_id());
				System.out.println(candidate);
				
				User_Proffesional_Detail candidate_p = userPService.findByUserId(myJob.getCandidate_id());
				float p0=0,p1=0,p2=0,p3=0,p4=0,p5=0;
				if(candidate_p!=null) {
					System.out.println(candidate_p);
					p0 = Float.parseFloat(candidate_p.getTenth());
					p1 = Float.parseFloat(candidate_p.getTwelve());
					p2 = Float.parseFloat(candidate_p.getGrad_cpi());
					p3 = Float.parseFloat(candidate_p.getPg_cpi());
				}
				Research r = researchService.findByUserId(myJob.getCandidate_id());
				if(r!=null) {
					System.out.println(r);
					p4 = Float.parseFloat(r.getImpact_factor());
					p5 = (float)(r.getNo_research());
				}
				if(candidate_p==null && r==null) {
					perfScore.add(0.0f);
				}else {
					perfScore.add(p0+p1+p2+p3+p4+p5);
				}
				userList.add(candidate);
			}
			model.addAttribute("userlist", userList);
			model.addAttribute("perfScore", perfScore);
			return "shortlist";
		}
		else
			return "redirect:index";
	}
	
	@GetMapping("/viewpostedjobs")
	public String getViewPostedJobs(HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("instituteSessionValid") != null 
				&& httpSession.getAttribute("instituteSessionValid").equals("true")) {
			int postedByid = (Integer)httpSession.getAttribute("instituteid");
			List<Jobs> myJobs = jobsService.findByPostedByID(postedByid);
			model.addAttribute("joblist", myJobs);
			return "viewpostedjobs";
		}
		else
			return "redirect:index";
	}
	
	@GetMapping("/preferredjob")
	public String getPreferredJob(Model model) {
		return "preferredjob";
	}

	@PostMapping("/doapply")
	public String getApply(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("SessionValid") != null 
				&& httpSession.getAttribute("SessionValid").equals("true")) {
			int candidate_id = (Integer)httpSession.getAttribute("candidate_id");
			int job_id = Integer.parseInt(request.getParameter("job_id"));
			User user = userService.findByUserId(candidate_id);
			User_Proffesional_Detail userp = userPService.findByUserId(candidate_id);
			if(user==null) {
				model.addAttribute("error", "Please Complete the profile before applying for this job");
				return "user_personal_details";
			}
			if(userp==null) {
				model.addAttribute("error", "Please Complete the profile before applying for this job");
				return "user_proffessional_details";
			}
			if(user!=null && userp!=null) {
				if(user.getDob()!=null && !user.getDob().isEmpty() 
						&& user.getEmailid()!=null && !user.getEmailid().isEmpty()
						&& user.getExperience()!=null && !user.getExperience().isEmpty() 
						&& user.getFullname()!=null && !user.getFullname().isEmpty()
						&& user.getLocation()!=null && !user.getLocation().isEmpty() 
						&& user.getMobileno()!=null && !user.getMobileno().isEmpty()
						&& user.getTagline()!=null && !user.getTagline().isEmpty()) {
					
				}else {
					model.addAttribute("error", "Please Complete the profile before applying for this job");
					return "user_personal_details";
				}
				if(userp.getGrad_branch()!=null && !userp.getGrad_branch().isEmpty() 
						&& userp.getGrad_cpi()!=null && !userp.getGrad_cpi().isEmpty()
						&& userp.getPg_cpi()!=null && !userp.getPg_cpi().isEmpty() 
						&& userp.getPhd_subject()!=null && !userp.getPhd_subject().isEmpty()
						&& userp.getPostgrad_branch()!=null && !userp.getPostgrad_branch().isEmpty() 
						&& userp.getTenth()!=null && !userp.getTenth().isEmpty()
						&& userp.getTwelve()!=null && !userp.getTwelve().isEmpty()) {
					
				}else {
					model.addAttribute("error", "Please Complete the profile before applying for this job");
					return "user_proffessional_details";
				}
			}
			
			Job_Application jobApplication = new Job_Application();
			jobApplication.setCandidate_id(candidate_id);
			jobApplication.setJob_id(job_id);
			Job_Application existingJobApplication = jobsApplicationService.findByJobIDCandidateID(job_id, candidate_id);
			if(existingJobApplication!=null && existingJobApplication.getCandidate_id()==candidate_id 
					&& existingJobApplication.getJob_id()==job_id) {
				
				return "redirect:view_applied";
			}else {
				jobsApplicationService.saveApplication(jobApplication);
				return "redirect:view_applied";
			}
		}
		else
			return "redirect:index";
	}

	@GetMapping("/index")
	public String getIndex(Model model) {
		List<Jobs> joblist = jobsService.findAllJobs();
		if (joblist != null) {
			model.addAttribute("joblist", joblist);
		} 
		return "index";
	}

	@GetMapping("/dologout")
	public String getDoLogout(HttpSession httpSession) {
		httpSession.invalidate();
		return "redirect:index";
	}
	
	@GetMapping("/view_applied")
	public String getViewApplied(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("SessionValid") != null 
				&& httpSession.getAttribute("SessionValid").equals("true")) {
			int candidate_id = (Integer)httpSession.getAttribute("candidate_id");
			List<Job_Application> myJobs = jobsApplicationService.findByCandidateId(candidate_id);
			int i = 0;
			List<Jobs> jobList= new ArrayList<Jobs>();
			while(!myJobs.isEmpty()) {
				Job_Application job = myJobs.remove(i);
				jobList.add(jobsService.findById(job.job_id));
			}
			model.addAttribute("joblist", jobList);
			return "view_applied";
		}
		else
			return "redirect:index";
	}
	
	@PostMapping("doupdatepersonaldetails")
	public String getUpdatePersonalDetails(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("SessionValid") != null 
				&& httpSession.getAttribute("SessionValid").equals("true")) {
			String fullname=(String) request.getParameter("name");
			String location=(String) request.getParameter("city");
			String dob=(String) request.getParameter("dob");
			String mobileno=(String) request.getParameter("mobile");
			String experience = (String) request.getParameter("experience");

			int candidate_id = (Integer)httpSession.getAttribute("candidate_id");
			User user = userService.findByUserId(candidate_id);
			
			user.setFullname(fullname);
			user.setLocation(location);
			user.setDob(dob);
			user.setMobileno(mobileno);
			user.setExperience(experience);
			
			userService.updateUser(user);
			return "redirect:profile";
		}else {
			return "redirect:index";
		}
	}
	
	@PostMapping("doupdateproffesionaldetails")
	public String getUpdateProffesionalDetails(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("SessionValid") != null 
				&& httpSession.getAttribute("SessionValid").equals("true")) {
			String phd_subject=(String) request.getParameter("phd_subject");
			String postgrad_branch=(String) request.getParameter("postgrad_branch");
			String pg_cpi=(String) request.getParameter("pg_cpi");
			String grad_branch=(String) request.getParameter("grad_branch");
			String grad_cpi=(String) request.getParameter("grad_cpi");
			String twelve=(String) request.getParameter("twelve");
			String tenth=(String) request.getParameter("tenth");
			
			int no_research=Integer.parseInt(request.getParameter("no_research"));
			String paper_title=(String) request.getParameter("paper_title");
			String paper_type=(String) request.getParameter("paper_type");
			int issn_no=0;
			if (!request.getParameter("issn_no").isEmpty())
			 issn_no= Integer.parseInt(request.getParameter("issn_no"));
			String impact_factor=(String) request.getParameter("impact_factor");
			int year_publication=0;
			if (!request.getParameter("year_publication").isEmpty())
			 year_publication=Integer.parseInt(request.getParameter("year_publication"));
			String tagline=(String) request.getParameter("tagline");
			
			int candidate_id = (Integer)httpSession.getAttribute("candidate_id");
			User user = userService.findByUserId(candidate_id);
			user.setTagline(tagline);
			userService.updateUser(user);
			Research research = researchService.findByUserId(candidate_id);
			if(research!=null && research.getUser_id()==candidate_id) {
				research.setImpact_factor(impact_factor);
				research.setIssn(issn_no);
				research.setNo_research(no_research);
				//research.setPageno(pageno);
				research.setPaper_type(paper_type);
				research.setTitle(paper_title);
				//research.setVolume(volume);
				research.setYear(year_publication);
				researchService.updateResearch(research);
			}else {
				Research newresearch = new Research();
				newresearch.setUser_id(candidate_id);
				newresearch.setImpact_factor(impact_factor);
				newresearch.setIssn(issn_no);
				newresearch.setNo_research(no_research);
				//research.setPageno(pageno);
				newresearch.setPaper_type(paper_type);
				newresearch.setTitle(paper_title);
				//research.setVolume(volume);
				newresearch.setYear(year_publication);
				researchService.saveResearch(newresearch);
			}
			User_Proffesional_Detail userpdetail = userPService.findByUserId(candidate_id);
			if(userpdetail!=null && userpdetail.getUser_id()==candidate_id) {
				
				userpdetail.setPhd_subject(phd_subject);
				userpdetail.setPostgrad_branch(postgrad_branch);
				userpdetail.setPg_cpi(pg_cpi);
				userpdetail.setGrad_branch(grad_branch);
				userpdetail.setGrad_cpi(grad_cpi);
				userpdetail.setTwelve(twelve);
				userpdetail.setTenth(tenth);
				userPService.updateUser(userpdetail);	

			}else {
				User_Proffesional_Detail newuserpdetail = new User_Proffesional_Detail();
				newuserpdetail.setUser_id(candidate_id);
				newuserpdetail.setPhd_subject(phd_subject);
				newuserpdetail.setPostgrad_branch(postgrad_branch);
				newuserpdetail.setPg_cpi(pg_cpi);
				newuserpdetail.setGrad_branch(grad_branch);
				newuserpdetail.setGrad_cpi(grad_cpi);
				newuserpdetail.setTwelve(twelve);
				userPService.saveUser(newuserpdetail);
			}
			return "redirect:proffesional_details";
		}else {
			return "redirect:index";
		}
	}
	
	@GetMapping("/about")
	public String getAbout(Model model) {
		return "about";
	}
	
	@GetMapping("/contact")
	public String getContact(Model model) {
		return "contact";
	}
	
	@GetMapping("/admin_login")
	public String getAdmin_login(HttpServletRequest request, HttpSession httpSession, Model model) {
			return "admin_login";
	}
	
	@PostMapping("doadminlogin")
	public String postDoAdminLogin(HttpServletRequest request, HttpSession httpSession, Model model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Admin admin = adminService.findAdmin(username);
		System.out.println(admin);
		if(admin!=null && admin.getUsername().equals(username)
				&& admin.getPassword().equals(password)) {
			httpSession.setAttribute("adminSessionValid", "true");
			httpSession.setAttribute("usertype", "admin");
			return "redirect:admin_dashboard";
		}else {
			model.addAttribute("error", "Invalid Username and Password");
			return "admin_login";
		}
	}
	
	@GetMapping("/admin_dashboard")
	public String getAdmin_Dashboard(HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("usertype").equals("admin")
				&& httpSession.getAttribute("adminSessionValid").equals("true"))
		return "admin_dashboard";
		else
			return "redirect:admin_login";
	}

	@GetMapping("/approve_institute_admin")
	public String getApprove_institute_admin(HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("usertype").equals("admin")
				&& httpSession.getAttribute("adminSessionValid").equals("true")) {
			List<Institute> instituteList = instituteService.findInactiveInstitute();
			model.addAttribute("instituteList", instituteList);
			return "approve_institute_admin";
		}
		else
			return "redirect:admin_login";
	}

	@PostMapping("/doapproveinstitute")
	public String postApprove_institute_admin(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("usertype").equals("admin")
				&& httpSession.getAttribute("adminSessionValid").equals("true")) {
			int instituteid = 0;
			if(!request.getParameter("idinstitute").isEmpty())
				instituteid = Integer.parseInt(request.getParameter("idinstitute"));
			Institute institute = instituteService.findByInstituteId(instituteid);
			if(institute!=null) {
				institute.setActive("active");
				instituteService.updateInstitute(institute);
			}
			return "redirect:approve_institute_admin";
			
		}
		else
			return "redirect:admin_login";
	}
	
	@PostMapping("/dorejectinstitute")
	public String postReject_institute_admin(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("usertype").equals("admin")
				&& httpSession.getAttribute("adminSessionValid").equals("true")) {
			int instituteid = 0;
			if(!request.getParameter("idinstitute").isEmpty())
				instituteid = Integer.parseInt(request.getParameter("idinstitute"));
			Institute institute = instituteService.findByInstituteId(instituteid);
			if(institute!=null) {
				instituteService.deleteInstituteById(instituteid);
			}
			return "redirect:approve_institute_admin";
			
		}
		else
			return "redirect:admin_login";
	}
	
	@GetMapping("/approve_job_admin")
	public String getApprove_job_admin(HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("usertype").equals("admin")
				&& httpSession.getAttribute("adminSessionValid").equals("true")) {
			List<Jobs> jobList = jobsService.findInactiveJobs();
			if(jobList!=null) {
				model.addAttribute("jobList", jobList);
			}
			return "approve_job_admin";
		}
		else
			return "redirect:admin_login";
	}
	
	@PostMapping("/doapprovejob")
	public String postApprove_job_admin(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("usertype").equals("admin")
				&& httpSession.getAttribute("adminSessionValid").equals("true")) {
			int jobid = 0;
			if(!request.getParameter("idjob").isEmpty())
				jobid = Integer.parseInt(request.getParameter("idjob"));
			Jobs job = jobsService.findById(jobid);
			if(job!=null) {
				job.setActive("active");
				jobsService.updateJob(job);
			}
			return "redirect:approve_job_admin";
			
		}
		else
			return "redirect:admin_login";
	}
	
	@PostMapping("/dorejectjob")
	public String postReject_job_admin(HttpServletRequest request, HttpSession httpSession, Model model) {
		if(httpSession.getAttribute("usertype").equals("admin")
				&& httpSession.getAttribute("adminSessionValid").equals("true")) {
			int jobid = 0;
			if(!request.getParameter("idjob").isEmpty())
				jobid = Integer.parseInt(request.getParameter("idjob"));
			Jobs job = jobsService.findById(jobid);
			if(job!=null&& job.getIdjobs()==jobid) {
				job.setActive("active");
				jobsService.deleteJobById(jobid);
			}
			return "redirect:approve_job_admin";
			
		}
		else
			return "redirect:admin_login";

	}
	
	
	@GetMapping("/")
	public String getHome(Model model) {
		return "redirect:index";
	}
	
}
