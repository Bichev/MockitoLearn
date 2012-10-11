package com.bichev.mockito.fiveminutestut;

import javax.swing.text.Document;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/10/12
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 * http://java.dzone.com/articles/5-minute-mockito-tutorial-howto
 */
public interface DocumentRepository {
    void addRepositiry (Document doc);

    Document getDocument(DocumentID docId);
}
