package org.example.separator;

public interface ICanSeparate<T> {
    boolean isMatch(String txt);
    T getValue(String txt);
}