package HW170710;

/**
 * Created by Yurbly on 11.07.2017.
 */
public class StringLinkedListTest {

    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList();
//        list.push("Хмерчь");
        StringLinkedList list = new StringLinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.remove(2));
        System.out.println(list.toString());
        System.out.println(list.remove(2));
        System.out.println(list.toString());
        System.out.println(list.remove(0));
        System.out.println(list.toString());
        System.out.println(list.remove(2));
        System.out.println(list.toString());


    }
}
