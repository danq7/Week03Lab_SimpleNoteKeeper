package servlets;

import domain.Note;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        BufferedReader br;
        br = new BufferedReader(new FileReader(new File(path)));

        Note note = new Note();

        note.setLine1(br.readLine());
        note.setLine2(br.readLine());
        br.close();

        String display1 = note.getLine1();
        String display2 = note.getLine2();

        request.setAttribute("displayTitle", display1);
        request.setAttribute("displayContents", display2);

        String editURL = request.getParameter("edit");

        if (editURL == null) {

            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

        } else {
            request.setAttribute("inputTitle", "This is the title");
            request.setAttribute("textAreaContents", "Contents go here");
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw;
        pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        Note note = new Note();

        String save1 = request.getParameter("line_one");
        String save2 = request.getParameter("line_two");

        request.setAttribute("newTitle", save1);
        request.setAttribute("newContents", save2);

        note.setLine1(save1);
        note.setLine2(save2);

        pw.println(note.getLine1());
        pw.println(note.getLine2());
        pw.close();

        request.setAttribute("displayTitle", save1);
        request.setAttribute("displayContents", save2);

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

    }

}