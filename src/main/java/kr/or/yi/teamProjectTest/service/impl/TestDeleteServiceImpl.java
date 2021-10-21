package kr.or.yi.teamProjectTest.service.impl;

import kr.or.yi.teamProjectTest.dao.TestDao;
import kr.or.yi.teamProjectTest.dto.Test;
import kr.or.yi.teamProjectTest.service.TestDeleteService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDeleteServiceImpl implements TestDeleteService {

    @Setter(onMethod_ = {@Autowired})
    private TestDao testDao;

    @Override
    public int delete(Test test) {
        testDao.delete(test);
        return 0;
    }
}
