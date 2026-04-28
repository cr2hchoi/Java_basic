package Day06.Collection.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardListTest {
    public static void main(String[] args) {
        List<Board> list1 = new ArrayList<Board>();
        list1.add(new Board("제목1","내용1","sym"));
        list1.add(new Board("제목2","내용2","sym2"));
        list1.add(new Board("제목3","내용3","sym3"));

        System.out.println("현재 게시판의 글의 수 : " + list1.size() + "개");

        for (Board board : list1) {
            System.out.println("책 제목 : " + board.getSubject());
            System.out.println("책 내용 : " + board.getContent());
            System.out.println("글쓴이  : " + board.getWriter());
        }

        list1.remove(2);
        for (Board board : list1) {
            System.out.println("책 제목 : " + board.getSubject());
            System.out.println("책 내용 : " + board.getContent());
            System.out.println("글쓴이  : " + board.getWriter());
        }
    }
}
