package in.suryaumapathy.netlifytracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.suryaumapathy.netlifytracker.service.SiteService;

@RestController
@RequestMapping("api/v1/sites")
public class SiteController {

    @Autowired
    SiteService siteService;

    @GetMapping
    public Object getAllSites() {
        Object response = siteService.list();
        return response;
    }

    @GetMapping("{id}")
    public Object getSite(@PathVariable("id") String id) {
        Object response = siteService.details(id);
        return response;
    }

    @PostMapping
    public Object createSite(@RequestBody Object body) {
        System.out.println(body);
        Object response = siteService.create(body);
        return response;
    }

}
