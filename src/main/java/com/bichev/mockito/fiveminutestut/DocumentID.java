package com.bichev.mockito.fiveminutestut;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/10/12
 * Time: 12:20 PM
 * http://java.dzone.com/articles/5-minute-mockito-tutorial-howto
 */
public class DocumentID {
    private int id;

    public DocumentID (int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
