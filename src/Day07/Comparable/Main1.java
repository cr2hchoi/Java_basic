package Day07.Comparable;

import java.util.Arrays;
import java.util.Collections;

//Comparable 인터페이스로 사용자 객체를 나이순으로 정렬하는 예제
public class Main1 {
    public static void main(String[] args) {
        class User implements Comparable<User> {
            private String name;
            private Integer age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }

            public User(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            @Override
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
        //나이순으로 Users를 정렬하여 출력하세요 .
        System.out.println("sorting 전 ===========");
        for (User user : users) {
            System.out.println(user.name + " => " + user.age);
        }
        System.out.println();
        System.out.println("sorting 후 ===========");
        Arrays.sort(users);
        for (User user1 : users) {
            System.out.println(user1.name + " => " + user1.age);
        }
        System.out.println();

        System.out.println("역순 sorting ===========");
        Arrays.sort(users, Collections.reverseOrder());

        for (User user2 : users) {
            System.out.println(user2.name + " => " + user2.age);
        }

    }

}

