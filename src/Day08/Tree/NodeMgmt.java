package Day08.Tree;

public class NodeMgmt {
    Node head = null;
    public class Node{
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }

    }

    // 새로운 숫자 트리에 넣는 메서드 정의
    public boolean insertNode(int data){
        //CASE 1: Node 하나도 없을때
        if(this.head == null){
            this.head = new Node(data); // 비어있다면, 노드에서 가르키는 숫자가 루트가 됨
        } else {

            //CAE 2: Node가 하나 이상 들어가 있을때 (루트 노드부터 비교)
            Node findNode = this.head; //findNoe (탐색중인 노드 = head)
            while(true){

                //CASE 2-1: 현재 Node의 왼쪽에 Node가 들어가야 할때(작은 값)
                if(data < findNode.value){ // 삽입해야 할 값이 현재 노드보다 작다면 //findeNode의 left에 값 대입
                    if(findNode.left != null){ //만약 findNode의 left값에 이미 값이 있다면?
                        findNode = findNode.left; // findNode의 left로 head를 옮김
                    }else{  //만약 findNode의 left값에 아무것도 없다면
                        findNode.left = new Node(data); // 가르키고 있는 findNode(=head)에 새로운 data 객체 생성
                        break;
                    }
                }else{  //CASE 2-2 : 현재 Node의 오른쪽에 Node가 들어가야 할때(큰 값)

                    if(findNode.right !=null){
                        findNode = findNode.right;
                    }else{
                        findNode.right = new Node(data);
                        break;
                    }

                }


            }
        }

        return true;
    }

    public static void main(String[] args) {

        NodeMgmt myTree = new NodeMgmt();
        boolean result =  myTree.insertNode(2);
        System.out.println(result);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(6);
        System.out.println("HEAD: " + myTree.head.value);
        System.out.println("HEAD LEFT: " + myTree.head.left.value);
        System.out.println("HEAD LEFT LEFT: " + myTree.head.left.left.value);
        System.out.println("HEAD LEFT RIGHT: " + myTree.head.left.right.value);

        System.out.println("HEAD RIGHT: " + myTree.head.right.value);
        System.out.println("HEAD RIGHT LEFT: " + myTree.head.right.left.value);
        System.out.println("HEAD RIGHT RIGHT: " + myTree.head.right.right.value);

        System.out.println("HEAD RIGHT RIGHT LEFT: " + myTree.head.right.right.left.value);
        System.out.println("HEAD RIGHT RIGHT RIGHT: " + myTree.head.right.right.right.value);

    }

}