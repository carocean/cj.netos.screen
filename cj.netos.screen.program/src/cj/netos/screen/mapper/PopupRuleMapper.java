package cj.netos.screen.mapper;

import cj.netos.screen.model.PopupRule;
import cj.netos.screen.model.PopupRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PopupRuleMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(PopupRuleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(PopupRuleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String code);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(PopupRule record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(PopupRule record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<PopupRule> selectByExample(PopupRuleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    PopupRule selectByPrimaryKey(String code);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") PopupRule record, @Param("example") PopupRuleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") PopupRule record, @Param("example") PopupRuleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(PopupRule record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(PopupRule record);
}