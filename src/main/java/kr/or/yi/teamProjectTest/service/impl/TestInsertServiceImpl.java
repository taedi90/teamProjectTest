package kr.or.yi.teamProjectTest.service.impl;

import kr.or.yi.teamProjectTest.dao.TestDao;
import kr.or.yi.teamProjectTest.dto.Test;
import kr.or.yi.teamProjectTest.service.TestInsertService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestInsertServiceImpl implements TestInsertService {

    @Setter(onMethod_ = {@Autowired})
    private TestDao testDao;

    @Override
    public int insert(Test test) {
        testDao.insert(test);
        return 1;
    }
}
