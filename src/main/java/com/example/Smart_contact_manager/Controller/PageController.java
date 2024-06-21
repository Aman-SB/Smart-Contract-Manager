    package com.example.Smart_contact_manager.Controller;


    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    public class PageController {

        @RequestMapping("/home")    
        public String home(Model model){
            System.out.println("Home Page Handller");

            //sending data to view
            model.addAttribute("name", "Compitive programming" );
            model.addAttribute("Github_repo" , "https://github.com/Aman-SB");
            model.addAttribute("Description", " Descripiton fkmdkpogmkekrnfo;tror");

            return "home";
        }


    }
