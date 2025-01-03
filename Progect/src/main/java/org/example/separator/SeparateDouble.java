package org.example.separator;

import java.util.regex.Pattern;

public class SeparateDouble implements ICanSeparate<Double>{
    @Override
    public boolean isMatch(String txt) {
        if(txt == null||
                txt.isEmpty()||
                txt.length() == 0){
            return false;
        }
        else{
            return Pattern.matches("^[-+]?\\d*\\.\\d+([eE][-+]?\\d+)?$",txt);
        }
    }

    @Override
    public Double getValue(String txt) {
        Double res = 0.0;
        if(txt == null||
                txt.isEmpty() ||
                !this.isMatch(txt)){
            return res;
        }
        else {
            try {
                res = Double.parseDouble(txt);
            } catch (NumberFormatException e) {
            }
            return res;
        }
    }
}
