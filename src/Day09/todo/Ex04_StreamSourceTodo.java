package Day09.todo;
import java.nio.file.Files; import java.nio.file.Path; import java.util.Arrays; import java.util.List; import java.util.stream.Stream; import java.util.stream.IntStream;
public class Ex04_StreamSourceTodo {
    public static void main(String[] args) throws Exception {
        List<String> categories = List.of("PC", "LIFE", "FOOD");
        String[] keywords = {"keyboard", "mouse", "monitor"};
        Path path = Path.of("src/day11/stream2/student/todo/resources/products.csv");
        // TODO 1: categories 컬렉션 스트림을 출력하세요.
        // TODO 2: keywords 배열 스트림을 출력하세요.
        // TODO 3: IntStream.rangeClosed(1, 7)로 1일부터 7일까지 출력하세요.
        // TODO 4: Files.lines(path)를 try-with-resources로 열고 CSV 내용을 출력하세요.
    }
}
