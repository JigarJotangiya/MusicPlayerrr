package p369i;

import java.io.Serializable;

/* renamed from: i.d */
/* compiled from: Lazy.kt */
public final class C8393d<T> implements C8418f<T>, Serializable {
    private final T value;

    public C8393d(T t) {
        this.value = t;
    }

    public T getValue() {
        return this.value;
    }

    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
