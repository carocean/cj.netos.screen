package cj.netos.screen.mapper;

import cj.netos.screen.model.CurrentScreen;
import cj.netos.screen.model.CurrentScreenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrentScreenMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(CurrentScreenExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(CurrentScreenExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(CurrentScreen record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(CurrentScreen record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<CurrentScreen> selectByExample(CurrentScreenExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    CurrentScreen selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") CurrentScreen record, @Param("example") CurrentScreenExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") CurrentScreen record, @Param("example") CurrentScreenExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(CurrentScreen record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(CurrentScreen record);
}