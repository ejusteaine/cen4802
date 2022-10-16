package Controller;
import Model.TodoList;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns = {"/TodoList", "/todoitems/*"})
public class TodoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String url = "/index.html";
        String action = request.getParameter("action");
        if(action == null){
            action = "join";
        }if(action.equals("join")){
            url = "/index.html";
        }else if(action.equals("add")){
            String newItems = request.getParameter("itemName");
            TodoList listItems = new TodoList();
            listItems.setItem(newItems);
            request.setAttribute("listItems",listItems);
            url = "/TodoItems.jsp";
        }
        getServletContext().getRequestDispatcher(url).forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        doPost(request,response);
    }
}
