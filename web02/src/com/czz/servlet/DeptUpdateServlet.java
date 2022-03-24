package com.czz.servlet;

import com.czz.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeptUpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String deptno = req.getParameter("deptno");
        String deptname = req.getParameter("deptname");
        String deptloc = req.getParameter("deptloc");
        Connection connection = DBUtil.getConnection();
        String sql = "update t_dept set deptname=?,deptloc=? where deptno=?";
        PreparedStatement preparedStatement = DBUtil.getStatement(connection,sql);
        DBUtil.setString(preparedStatement,1,deptname);
        DBUtil.setString(preparedStatement,2,deptloc);
        DBUtil.setString(preparedStatement,3,deptno);
        int executeUpdate = DBUtil.getExecuteUpdate(preparedStatement);
        if (executeUpdate==0){
            req.getRequestDispatcher("/updateError.html").forward(req,resp);
        }else {
            req.getRequestDispatcher("/dept/list").forward(req,resp);
        }
    }
}
