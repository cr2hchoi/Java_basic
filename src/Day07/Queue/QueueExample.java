package Day07.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();

        //메시지 넣기
        messageQueue.offer(new Message("sendMail","홍길동"));
        messageQueue.offer(new Message("sendSNS","신용권"));
        messageQueue.offer(new Message("sendKaKaotalk","김자바"));

        //메시지를 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            //단, 이 코드는 OCP위배 ! : 메일,sms,카카오톡 외에 다른 걸 보내고 싶으면 ?
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;

                case "sendSNS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;

                case "sendKaKaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
