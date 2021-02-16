package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String programmingLanguagesList() {
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                    "<h2>Here's some coding languages</h2>" +
                        "<ol>" +
                            "<li>C#</li>" +
                            "<li>Java</li>" +
                            "<li>C++</li>" +
                        "</ol>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String listOfLanguages(@RequestParam String name, @RequestParam favoriteLanguage) {
        if ()
    }

    // lives at /form
    @GetMapping("form")
    @ResponseBody
    public String codingLanguageForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + // submit a request to /hello
                    "<label>Name: </label>" +
                    "<input type='text' name='name'>" +
                        "<p>My favorite language: </p>" +
                        "<select id='firstFavoriteLanguage' name='firstFavoriteLanguage'>" +
                            "<option value='c#'>C#</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='c++'>C++</option>" +
                        "</select>" +
                        "<p>My second favorite language: </p>" +
                        "<select id='secondFavoriteLanguage' name='secondFavoriteLanguage'>" +
                            "<option value='c#'>C#</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='c++'>C++</option>" +
                        "</select>" +
                        "<p>My third favorite language: </p>" +
                        "<select id='thirdFavoriteLanguage' name='thirdFavoriteLanguage'>" +
                            "<option value='c#'>C#</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='c++'>C++</option>" +
                        "</select>" +
                    "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    // create a handler that handles requests of the form /hello?name=LaunchCode
    //@RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value = "hello")
    //public String helloWithQueryParam(@RequestParam String name, String language) {
        //return language + name + "!";
    //}

    //@GetMapping("{name}")
    //public String helloWithPathParam(@PathVariable String name){
        //return "Hello, " + name + "!";
    //}

}
