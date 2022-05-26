package androidx.work;

import androidx.work.C1236e;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends C1402j {
    /* renamed from: c */
    private Object m6831c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    /* renamed from: d */
    private Object m6832d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    /* renamed from: e */
    private Object m6833e(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    /* renamed from: f */
    private Object m6834f(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }

    /* renamed from: b */
    public C1236e mo6410b(List<C1236e> list) {
        C1236e.C1237a aVar = new C1236e.C1237a();
        HashMap hashMap = new HashMap();
        loop0:
        for (C1236e h : list) {
            Iterator<Map.Entry<String, Object>> it = h.mo6504h().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    Class<?> cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                value = m6832d(obj, value);
                            } else {
                                value = m6833e(obj, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = m6831c(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = m6831c(value, obj);
                        }
                    } else if (!cls.isArray()) {
                        value = m6834f(value);
                    }
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.mo6512d(hashMap);
        return aVar.mo6509a();
    }
}
