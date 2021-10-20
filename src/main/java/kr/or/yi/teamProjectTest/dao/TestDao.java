package kr.or.yi.teamProjectTest.dao;

import kr.or.yi.teamProjectTest.dto.TestDto;

import java.util.List;

public interface TestDao {
    public List<TestDto> selectTest();
}
