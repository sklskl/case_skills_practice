package com.test03;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * @program: case_skills_practice
 * @ClassName: circle
 * @author: skl
 * @create: 2024-05-28 14:59
 */
public class circle {
    double radius;
    public void area(){
        System.out.println("圆的面积是："+(3.14*radius*radius));
        Array array = new Array() {
            @Override
            public String getBaseTypeName() throws SQLException {
                return null;
            }

            @Override
            public int getBaseType() throws SQLException {
                return 0;
            }

            @Override
            public Object getArray() throws SQLException {
                return null;
            }

            @Override
            public Object getArray(Map<String, Class<?>> map) throws SQLException {
                return null;
            }

            @Override
            public Object getArray(long index, int count) throws SQLException {
                return null;
            }

            @Override
            public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
                return null;
            }

            @Override
            public ResultSet getResultSet() throws SQLException {
                return null;
            }

            @Override
            public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
                return null;
            }

            @Override
            public ResultSet getResultSet(long index, int count) throws SQLException {
                return null;
            }

            @Override
            public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
                return null;
            }

            @Override
            public void free() throws SQLException {

            }
        };

    }
}
