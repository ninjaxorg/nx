/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package nxmd.app;

import nxmd.list.LinkedList;

import static nxmd.utilities.StringUtils.join;
import static nxmd.utilities.StringUtils.split;
import static nxmd.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
