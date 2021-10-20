package kr.or.yi.teamProjectTest.controller;

import kr.or.yi.teamProjectTest.dto.TestDto;
import kr.or.yi.teamProjectTest.service.TestSelectService;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TestController {

    @Setter(onMethod_ =  {@Autowired})
    private TestSelectService testSelectService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView test() {
        List<TestDto> select = testSelectService.selectTest();
        ModelAndView mav = new ModelAndView("board/test");
        mav.addObject("test", select);
        return mav;
    }
}
