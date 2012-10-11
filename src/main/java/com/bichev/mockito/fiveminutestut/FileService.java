package com.bichev.mockito.fiveminutestut;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/10/12
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 * http://java.dzone.com/articles/5-minute-mockito-tutorial-howto
 */
public interface FileService {
    File createFile (String name);
    File getFile (String name);

    boolean fileExist (String filename);
    boolean fileExist (File file);
}
