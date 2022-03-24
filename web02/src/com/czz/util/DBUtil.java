package com.czz.util;

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtil {
   static ResourceBundle resourceBundle=ResourceBundle.getBundle("com/czz/util/db");
    static{
        try {
            String className = resourceBundle.getString("className");
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        String url = resourceBundle.getString("url");
        String username=resourceBundle.getString("username");
        String password = resourceBundle.getString("password");
        Connection conn= null;
        try {
            conn=DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static PreparedStatement getStatement(Connection connection,String sql){
        PreparedStatement preparedStatement=null;
        try {
           preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    public static ResultSet getResultSet(PreparedStatement statement){
        ResultSet resultSet =null;
        try {
            resultSet=statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static int getExecuteUpdate(PreparedStatement statement){
        int res = 0;
        try {
            res  = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    public static boolean resIsNext(ResultSet set){
       boolean flag=false;
        try {
            flag=set.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public static void closeRes(Connection connection, Statement statement, ResultSet resultSet){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void setString(PreparedStatement pre,int i,String val){
        try {
            pre.setString(i,val);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static String getString(ResultSet resultSet,int index){
        String res=null;
        try {
            res=resultSet.getString(index);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
