package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import user.User;

/**
 *
 * @author 734972
 */
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = request.getParameter("message");
        
        if (message != null && message.equals("Logged out.")){
            request.setAttribute("message", message);
        }
        request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        boolean nameCheck = false;
        boolean passCheck = false;

        if (username != null && !username.equals("")) {
            nameCheck = true;
        }

        if (password != null && !password.equals("")) {
            passCheck = true;
        }

        if (nameCheck == true && passCheck == true) {

            UserService userService = new UserService();

            if (userService.login(user.getUsername(), user.getPassword())) {
                request.setAttribute("user", user);
                request.getRequestDispatcher("/MainPageServlet").forward(request, response);
                return;
            } else {
                request.setAttribute("message", "WRONG!");
            }
        } else {
            request.setAttribute("message", "You gotta type in something, dude");
        }
        
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}
