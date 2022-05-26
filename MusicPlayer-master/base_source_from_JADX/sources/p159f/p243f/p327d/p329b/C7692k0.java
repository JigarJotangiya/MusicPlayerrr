package p159f.p243f.p327d.p329b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* renamed from: f.f.d.b.k0 */
/* compiled from: Serialization */
final class C7692k0 {
    /* renamed from: a */
    static <K, V> void m42544a(C7673e0<K, V> e0Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection<V> collection = e0Var.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: b */
    static int m42545b(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* renamed from: c */
    static <K, V> void m42546c(C7673e0<K, V> e0Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(e0Var.asMap().size());
        for (Map.Entry next : e0Var.asMap().entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeInt(((Collection) next.getValue()).size());
            for (Object writeObject : (Collection) next.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }
}
