package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.Audit;
import com.dianrong.common.uniauth.server.data.entity.AuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int countByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int deleteByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int insert(Audit record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int insertSelective(Audit record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    List<Audit> selectByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    Audit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int updateByExampleSelective(@Param("record") Audit record, @Param("example") AuditExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int updateByExample(@Param("record") Audit record, @Param("example") AuditExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int updateByPrimaryKeySelective(Audit record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * audit
     *
     * @mbggenerated Mon Mar 14 10:46:20 CST 2016
     */
    int updateByPrimaryKey(Audit record);

    int insertBatch(List<Audit> auditList);
}
