/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saif.web.practice.shop.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.SortedMap;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

/**
 *
 * @author Saif
 */
public class Sql {
    private String sqlStatement;
    private Statement statement;
    
    Sql(String sqlStatement, Statement statement){
        this.sqlStatement = sqlStatement;
        this.statement = statement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }


    SortedMap[] executeQuery() throws SQLException{
        ResultSet rs = statement.executeQuery(sqlStatement);
        Result result = ResultSupport.toResult(rs);
        return result.getRows();
    }
    
    void executeUpdate(){
        
    }
    
    void executeInsert() throws SQLException{
        statement.executeUpdate(sqlStatement);
    }
}
