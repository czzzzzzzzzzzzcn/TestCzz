package com.czz.servlet;

import com.czz.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeptDelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("utf-8");
       String deptno = req.getParameter("deptno");
       int count=0;

       Connection conn= DBUtil.getConnection();
       String sql = "delete from t_dept where deptno=?";

       PreparedStatement preparedStatement = DBUtil.getStatement(conn,sql);
       DBUtil.setString(preparedStatement,1,deptno);
       count = DBUtil.getExecuteUpdate(preparedStatement);

       if (count==0){
           req.getRequestDispatcher("/deleteError.html").forward(req,resp);
       }else {
           req.getRequestDispatcher("/dept/list").forward(req,resp);
       }
    }
}
