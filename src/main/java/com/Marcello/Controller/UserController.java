package com.Marcello.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Marcello.Entity.User;

/**
 * �û�������
 */
@Controller
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("managerId") String managerId, HttpServletRequest request, HttpServletResponse response)throws Exception {
             User user=new User();
             user.setManagerId(managerId);
            ModelAndView mav = new ModelAndView();
            mav.addObject("user",user);
            mav.setViewName("index");
            return mav;
        }

}