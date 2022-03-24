package com.czz.servlet;

import com.czz.util.DBUtil;
import sun.security.pkcs11.Secmod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeptListServlet extends HttpServlet {
    private static final long serialVersionUID = -3396328393168651776L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String path = this.getServletContext().getContextPath();
//        System.out.println(path);
        PrintWriter writer = resp.getWriter();
        writer.print("<!DOCTYPE html>");
        writer.print("<html lang='en'>");
        writer.print("<head>");
        writer.print("    <meta charset='UTF-8'>");
        writer.print("    <title>部门列表</title>");
        writer.print( "           <script type='text/javascript'>");
        writer.print( "             function del(deptno) {");
        writer.print( "         var b = window.confirm('确定要删除！');");
        writer.print( "         if (b) {");
        writer.print( "             window.location.href='/web02/dept/del?deptno='+deptno;");
        writer.print( "         }");
        writer.print( "     }");
        writer.print( " </script>");

        writer.print("</head>");
        writer.print("<body>");
        writer.print("<h1>部门管理</h1>");
        writer.print("<br>");
        writer.print("<hr>");
        writer.print("<table border='1px' align='center'>");
        writer.print("    <tr>");
        writer.print("        <td>序号</td>");
        writer.print("        <td>部门编号</td>");
        writer.print("        <td>部门名称</td>");
        writer.print("        <td>部门位置</td>");
        writer.print("       <td>操作</td>");
        writer.print("");
        writer.print("    </tr>");
        Connection connection= DBUtil.getConnection();
        String sql ="select * from t_dept";
        PreparedStatement ps=DBUtil.getStatement(connection,sql);
        ResultSet rs=DBUtil.getResultSet(ps);
        int i=1;
        while (DBUtil.resIsNext(rs)){

            writer.print("    <tr>");
            writer.print("        <td>"+(i++)+"</td>");
            writer.print("        <td>"+DBUtil.getString(rs,1)+"</td>");
            writer.print("        <td>"+DBUtil.getString(rs,2)+"</td>");
            writer.print("        <td>"+DBUtil.getString(rs,3)+"</td>");
            writer.print("        <td>");
            writer.print("            <a href='javascript:void(0);'onclick='del("+DBUtil.getString(rs,1)+")'>删除</a>");
            writer.print("            <a href='"+path+"/dept/queryBeforeUpdate?deptno="+DBUtil.getString(rs,1)+"'>修改</a>");
            writer.print("        </td>");
            writer.print("    </tr>");

        }
        DBUtil.closeRes(connection,ps,rs);
        writer.print("</table>");
        writer.print(" <a href='/web02/insert.html'>添加部门</a>");
        writer.print("</body>");
        writer.print("</html>");
    }
}
