package kr.or.yi.teamProjectTest.controller;

import kr.or.yi.teamProjectTest.dto.Test;
import kr.or.yi.teamProjectTest.service.TestDeleteService;
import kr.or.yi.teamProjectTest.service.TestInsertService;
import kr.or.yi.teamProjectTest.service.TestSelectService;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TestController {

    @Setter(onMethod_ =  {@Autowired})
    private TestSelectService testSelectService;

    @Setter(onMethod_ =  {@Autowired})
    private TestInsertService testInsertService;

    @Setter(onMethod_ =  {@Autowired})
    private TestDeleteService testDeleteService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView test() {
        List<Test> select = testSelectService.selectList();
        ModelAndView mav = new ModelAndView("example/test");
        mav.addObject("test", select);
        return mav;
    }

    @RequestMapping(value = "/insert-test", method = RequestMethod.POST)
    public ModelAndView insertTest(@RequestParam("data_test") String dataTest) {
        Test test = Test.builder().dataTest(dataTest).build();

        int res = testInsertService.insert(test);


        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/");
        return mav;
    }

    @RequestMapping(value = "/delete-test", method = RequestMethod.POST)
    public ModelAndView deleteTest(@RequestParam("no") long no) {
        Test test = Test.builder().no(no).dataTest("none").build();

        int res = testDeleteService.delete(test);


        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/");
        return mav;
    }

}
