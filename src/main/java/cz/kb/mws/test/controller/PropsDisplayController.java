package cz.kb.mws.test.controller;

import cz.kb.mws.test.Utils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyjack on 18.01.17.
 */
@Controller
public class PropsDisplayController {

    @Value("${props.path}")
    private String path;


    @RequestMapping("/")
    public String printProps(Model model) {


        Map map = new HashMap();

        if (path == null || path.isEmpty()) {
            System.out.println("!!! PATH to property file not set !!!");
        } else {
            map = Utils.loadProps(path);
            System.out.println("Property file loaded from path " + path);

        }
        model.addAttribute("map", map);
        model.addAttribute("path", path);

        return "index";
    }

}
