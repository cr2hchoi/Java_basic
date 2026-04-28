package Day07.Comparable;

import java.util.Arrays;
import java.util.Comparator;

//comparable - > comparator로 바꾸는 클래스
public class Main2 {
    public static void main(String[] args) {
        class User {
            String name;
            Integer age;

            public User(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            public int compareTo(User o) {
                if (this.age < o.age) {
                    return -1; //this.age가 작으면 앞으로(인덱스 -1)
                } else if (this.age == o.age) {
                    return 0; //같으면 그대로
                } else {
                    return 1; // 더 크면 뒤(인덱스 1)로 ? 오른쪽으로?
                }
            }
        }
        User[] users = {
                new User("홍길동", 30),
                new User("최다래", 22),
                new User("김태형", 33),
        };

        //새로운 정렬 기준 만들기 : comparator의 compar 메소드 오버라이딩으로 만든다!
        Arrays.sort(
                users, new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return Integer.compare(o1.age, o2.age);
                    }
                }
        );

        //Java8 람다식 추가 기능 제공
        Arrays.sort(users, (u1,u2)-> Integer.compare(u1.age,u2.age));
        for (User user : users){
            System.out.println(user.name + " : " + user.age);
        }
    }
}