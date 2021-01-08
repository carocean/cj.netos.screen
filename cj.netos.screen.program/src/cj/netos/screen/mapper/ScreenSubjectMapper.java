package cj.netos.screen.mapper;

import cj.netos.screen.model.ScreenSubject;
import cj.netos.screen.model.ScreenSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScreenSubjectMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ScreenSubjectExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ScreenSubjectExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ScreenSubject record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ScreenSubject record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ScreenSubject> selectByExample(ScreenSubjectExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ScreenSubject selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ScreenSubject record, @Param("example") ScreenSubjectExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ScreenSubject record, @Param("example") ScreenSubjectExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ScreenSubject record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ScreenSubject record);

    long getMaxSort();

    List<ScreenSubject> page(@Param(value = "limit") int limit, @Param(value = "offset") long offset);
}