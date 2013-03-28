/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exceltemplater;

import java.io.File;

/**
 *
 * @author iwai
 */
public class Util {

    /**
     * 先頭を大文字にした文字列を返す
     * @param s
     * @return
     */
    public static String capitalize(String s){
        if(s == null || s.length() == 0){
            return "";
        }
        StringBuffer stb = new StringBuffer(s);
        char c = stb.charAt(0);
        stb.setCharAt(0, Character.toUpperCase(c));
        
        return stb.toString();
    }
    
    /**
     * underLineText to under_line_text
     * @param s
     * @return
     */
    public static String underLineSeparate(String s){
        if(s == null || s.length() == 0){
            return "";
        }

        StringBuffer stb = new StringBuffer();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                stb.append("_");
            }
            stb.append(c);
        }
        return stb.toString().toLowerCase();
    }

    /**
     * ファイル名分割
     * @param file
     * @return
     */
    public static String getFileNameWithoutExt(File file) {
        String[] split = file.getName().split("\\.");
        String className = split[0];
        return className;
    }



}
