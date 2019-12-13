package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String skillsTracker() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>" +
                            "<ol>" +
                                "<li>JavaScript</li>" +
                                "<li>Java</li>" +
                                "<li>Python</li>" +
                            "</ol>" +
                        "</h2>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsTrackerMenu() {
        return "<html>" +
                "<body>" +
                    "<form action='createList' method='post'>" +
                    "<h1>What is your name?</h1>" +
                        "<input type='text' name = 'name'>" +
                    "<h1>Rank the languages:<h1>" +
                    "<h2>Your favorite:</h2>" +
                        "<select name=first>" +
                            "<option>JavaScript</option>" +
                            "<option>Java</option>" +
                            "<option>Python</option>" +
                        "</select>" +
                    "<h2>Your 2nd favorite:</h2>" +
                        "<select name=second>" +
                             "<option>JavaScript</option>" +
                            "<option>Java</option>" +
                            "<option>Python</option>" +
                        "</select>" +
                    "<h2>Your 3rd favorite:</h2>" +
                        "<select name=third>" +
                            "<option>JavaScript</option>" +
                            "<option>Java</option>" +
                            "<option>Python</option>" +
                        "</select>" +
                    "<br><input type='submit'>" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "createList", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String createList(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third, Model model) {
        String myList = "";
        model.addAttribute("list", myList);
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                    "<ol>" +
                        "<li>" + first + "</li>" +
                        "<li>" + second + "</li>" +
                        "<li>" + third + "</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
    }

}
