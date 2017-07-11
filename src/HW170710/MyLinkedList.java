package HW170710;

/**
 * Created by Yurbly on 11.07.2017.
 */
public class MyLinkedList {

    private String first;
    private String last;
    private int size = 0;


    public MyLinkedList() {

    }


    public void add(String value) {

        String[] node = new String[] {value, null};
        if(first == null){

            first = node[0];
            last = first;
        }
        else{

            last = node[0];

        }



    }
}

