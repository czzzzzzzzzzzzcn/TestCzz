package com.czz;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args)  {
        Map map = loginUI();
        boolean login = login(map);
        System.out.println(login?(String) map.get("username")+"  登录成功":"登录失败！");
    }

    private static boolean login(Map map)  {
        boolean flag=false;
        String username =(String) map.get("username");
        String password =(String) map.get("password");
        Connection connection = DBUtil.getConnection();
        ResultSet rs = null;
        String sql= "select * from t_user1 where username=? and password=?";
        PreparedStatement preparedStatement = DBUtil.getStatement(connection,sql);
        DBUtil.setString(preparedStatement,1, username);
        DBUtil.setString(preparedStatement,2,password );
        rs=DBUtil.getResultSet(preparedStatement);
        if (DBUtil.resIsNext(rs)){
            String usernameRes=DBUtil.getString(rs,2);
            String passwordRes=DBUtil.getString(rs,3);
            if (usernameRes.equals(username)&&passwordRes.equals(password)){
                flag=true;
            }
        }
        DBUtil.closeRes(connection,preparedStatement,rs);
        return flag;
    }
    private static Map loginUI() {
        Map<String,String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = scanner.nextLine();
        System.out.print("请输入密码：");
        String password = scanner.nextLine();
        map.put("username",username);
        map.put("password",password);
        return map;
    }
}
