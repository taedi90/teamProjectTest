package kr.or.yi.teamProjectTest.dao;

import kr.or.yi.teamProjectTest.dto.Test;

import java.util.List;

public interface TestDao {
    List<Test> selectList();
    int insert(Test test);
    int delete(Test test);
}
