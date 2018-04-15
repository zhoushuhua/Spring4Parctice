package site.zhoush.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import site.zhoush.dao.SpittleRepository;
import site.zhoush.domain.Spittle;

/**
 * Created by zhoush on 2018/4/15.
 */
@Controller
@RequestMapping("/spittle")
public class SpittleController {

    private static final String MAX_VALUE_AS_STR = Long.toString(Long.MAX_VALUE);

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(
            @RequestParam(value = "max", defaultValue = "0") Integer max,
            @RequestParam("count") Integer count,
            Model model) {
        model.addAttribute(spittleRepository.findSpittles(max, count));
        return "spittles";
    }

    @RequestMapping(value = "/{spittle_id}", method = RequestMethod.GET)
    public String showSpittle(
            @PathVariable("spittle_id") long spittleId,
            Model model) {
        model.addAttribute(this.spittleRepository.findOne(spittleId));
        return "spittle";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "registerForm";
    }


}