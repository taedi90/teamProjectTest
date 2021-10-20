package kr.or.yi.teamProjectTest.service.impl;

import kr.or.yi.teamProjectTest.dao.TestDao;
import kr.or.yi.teamProjectTest.dto.TestDto;
import kr.or.yi.teamProjectTest.service.TestSelectService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestSelectServiceImpl implements TestSelectService {

    @Setter(onMethod_ = {@Autowired})
    private TestDao testDao;

    @Override
    public List<TestDto> selectTest() {
        return testDao.selectTest();
    }
}
