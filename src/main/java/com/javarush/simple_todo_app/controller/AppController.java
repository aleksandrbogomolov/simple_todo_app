package com.javarush.simple_todo_app.controller;

import com.javarush.simple_todo_app.model.ToDo;
import com.javarush.simple_todo_app.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    ToDoService toDoService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String listToDo(ModelMap modelMap) {

        List<ToDo> list = toDoService.findAllToDo();
        modelMap.addAttribute("list", list);
        return "index";
    }

    @RequestMapping(value = {"/new"}, method = RequestMethod.GET)
    public String newToDo(ModelMap modelMap) {

        ToDo toDo = new ToDo();
        modelMap.addAttribute("ToDo", toDo);
        return "new";
    }

    @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String saveToDo(@Valid ToDo toDo, BindingResult result, ModelMap modelMap) {

        if (result.hasErrors()) return "new";
        toDoService.saveToDo(toDo);
        modelMap.addAttribute("ToDo", toDo);
        return "redirect:/";
    }

    @RequestMapping(value = {"/edit-{id}-ToDo"}, method = RequestMethod.GET)
    public String editToDo(@PathVariable int id, ModelMap modelMap) {

        ToDo toDo = toDoService.findById(id);
        modelMap.addAttribute("ToDo", toDo);
        return "new";
    }

    @RequestMapping(value = {"/edit-{id}-ToDo"}, method = RequestMethod.POST)
    public String updateToDo(@PathVariable int id, ModelMap modelMap) {

        ToDo toDo = toDoService.findById(id);
        toDoService.updateToDo(toDo);
        modelMap.addAttribute("ToDo", toDo);
        return "redirect:/";
    }

    @RequestMapping(value = {"/done-{id}-ToDo"}, method = RequestMethod.GET)
    public String setDone(@PathVariable int id, ModelMap modelMap) {

        ToDo toDo = toDoService.findById(id);
        toDo.setDone(true);
        toDoService.setDone(toDo);
        modelMap.addAttribute("ToDo", toDo);
        return "redirect:/";
    }

    @RequestMapping(value = {"/delete-{id}-ToDo"}, method = RequestMethod.GET)
    public String deleteToDo(@PathVariable int id) {

        toDoService.deleteToDo(toDoService.findById(id));
        return "redirect:/";
    }

    @RequestMapping(value = {"/done"}, method = RequestMethod.GET)
    public String showDoneToDo(ModelMap modelMap) {

        List<ToDo> list = toDoService.showDoneToDo();
        modelMap.addAttribute("list", list);
        return "index";
    }

    @RequestMapping(value = {"/notDone"}, method = RequestMethod.GET)
    public String showNotDoneToDo(ModelMap modelMap) {

        List<ToDo> list = toDoService.showNotDoneToDo();
        modelMap.addAttribute("list", list);
        return "index";
    }
}
