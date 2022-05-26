package p159f.p243f.p327d.p329b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import p159f.p243f.p327d.p328a.C7656e;

/* renamed from: f.f.d.b.z */
/* compiled from: HashMultimap */
public final class C7737z<K, V> extends C7658a0<K, V> {
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    private C7737z() {
        this(12, 2);
    }

    public static <K, V> C7737z<K, V> create() {
        return new C7737z<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int b = C7692k0.m42545b(objectInputStream);
        setMap(C7690j0.m42542a(12));
        C7692k0.m42544a(this, objectInputStream, b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C7692k0.m42546c(this, objectOutputStream);
    }

    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ void forEach(BiConsumer biConsumer) {
        super.forEach(biConsumer);
    }

    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ C7683h0 keys() {
        return super.keys();
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean putAll(C7673e0 e0Var) {
        return super.putAll(e0Var);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private C7737z(int i, int i2) {
        super(C7690j0.m42542a(i));
        this.expectedValuesPerKey = 2;
        C7656e.m42490a(i2 >= 0);
        this.expectedValuesPerKey = i2;
    }

    public static <K, V> C7737z<K, V> create(int i, int i2) {
        return new C7737z<>(i, i2);
    }

    /* access modifiers changed from: package-private */
    public Set<V> createCollection() {
        return C7690j0.m42543b(this.expectedValuesPerKey);
    }

    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K, V> C7737z<K, V> create(C7673e0<? extends K, ? extends V> e0Var) {
        return new C7737z<>(e0Var);
    }

    private C7737z(C7673e0<? extends K, ? extends V> e0Var) {
        super(C7690j0.m42542a(e0Var.keySet().size()));
        this.expectedValuesPerKey = 2;
        putAll(e0Var);
    }
}
