package by.velcom.ecommerce.hybristoolkit.bundlemanager.controller;

import by.velcom.ecommerce.hybristoolkit.bundlemanager.model.Group;
import by.velcom.ecommerce.hybristoolkit.bundlemanager.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GroupController {
    private GroupService service;


    @Autowired
    public void setGroupService(GroupService service) {
        this.service = service;
    }


    @GetMapping("/new")
    public String newGroup() {
        return "operations/new";
    }

    @PostMapping("/save")
    public String updateGroup(@RequestParam String groupName) {
        service.saveGroup(new Group(groupName));
        return "redirect:/";
    }
}
