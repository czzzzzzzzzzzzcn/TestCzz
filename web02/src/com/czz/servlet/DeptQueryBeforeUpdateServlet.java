package com.czz.servlet;

import com.czz.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeptQueryBeforeUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String deptno = req.getParameter("deptno");
        Connection connection = DBUtil.getConnection();

        String sql = "select * from t_dept where deptno=?";
        PreparedStatement preparedStatement  = DBUtil.getStatement(connection,sql);

        DBUtil.setString(preparedStatement,1,deptno);
        ResultSet resultSet = DBUtil.getResultSet(preparedStatement);

        PrintWriter writer = resp.getWriter();
        writer.print("        <!DOCTYPE html>");
        writer.print("<html lang='en'>");
        writer.print("<head>");
        writer.print("   <meta charset='UTF-8'>");
        writer.print("   <title>修改</title>");
        writer.print("</head>");
        writer.print("<body>");
        writer.print("<H1>修改页面</H1>");
        writer.print("<hr>");
        if (DBUtil.resIsNext(resultSet)){
        writer.print("           <form action='/web02/dept/update' method='post'>");
        writer.print("   <table border='1px' align='center'>");
        writer.print("       <tr>");
        writer.print("           <td>部门编号</td>");
        writer.print("           <td><input type='text' name='deptno' value='"+DBUtil.getString(resultSet,1)+"'readonly disabled></td>");
        writer.print("       </tr>");
        writer.print("       <tr>");
        writer.print("           <td>部门名称</td>");
        writer.print("           <td><input type='text' name='deptname' value='"+DBUtil.getString(resultSet,2)+"'></td>");
        writer.print("       </tr>");
        writer.print("       <tr>");
        writer.print("           <td>部门位置</td>");
        writer.print("           <td><input type='text' name='deptloc' value='"+DBUtil.getString(resultSet,3)+"'></td>");
        writer.print("       </tr>");
        writer.print("       <tr>");
        writer.print("           <td colspan='2'><input type='submit' value='提交'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='reset' value='重置'></td>");
        writer.print("    </table>");
        writer.print("<input type='hidden' name='deptno' value='"+deptno+"'>");
        writer.print("</form>");
                }

        writer.print("     <a href='javascript:history.back(-1);'>返回</a>");
        writer.print("</body>");
        writer.print("</html>");

    }
}
