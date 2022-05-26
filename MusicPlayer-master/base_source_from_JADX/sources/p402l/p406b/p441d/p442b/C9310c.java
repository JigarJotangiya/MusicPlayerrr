package p402l.p406b.p441d.p442b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.EventListener;

/* renamed from: l.b.d.b.c */
/* compiled from: EventListenerList */
public class C9310c implements Serializable {

    /* renamed from: g */
    private static final Object[] f36025g = new Object[0];
    protected transient Object[] listenerList = f36025g;

    /* renamed from: a */
    private int m49311a(Object[] objArr, Class cls) {
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2 += 2) {
            if (cls == objArr[i2]) {
                i++;
            }
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.listenerList = f36025g;
        objectInputStream.defaultReadObject();
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                add(Class.forName((String) readObject, true, Thread.currentThread().getContextClassLoader()), (EventListener) objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.listenerList;
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < objArr.length; i += 2) {
            Class cls = (Class) objArr[i];
            EventListener eventListener = (EventListener) objArr[i + 1];
            if (eventListener != null && (eventListener instanceof Serializable)) {
                objectOutputStream.writeObject(cls.getName());
                objectOutputStream.writeObject(eventListener);
            }
        }
        objectOutputStream.writeObject((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T extends java.util.EventListener> void add(java.lang.Class<T> r6, T r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r7 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            boolean r0 = r6.isInstance(r7)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x002e
            java.lang.Object[] r0 = r5.listenerList     // Catch:{ all -> 0x004d }
            java.lang.Object[] r1 = f36025g     // Catch:{ all -> 0x004d }
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x001d
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x004d }
            r0[r3] = r6     // Catch:{ all -> 0x004d }
            r0[r2] = r7     // Catch:{ all -> 0x004d }
            r5.listenerList = r0     // Catch:{ all -> 0x004d }
            goto L_0x002c
        L_0x001d:
            int r1 = r0.length     // Catch:{ all -> 0x004d }
            int r4 = r1 + 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x004d }
            java.lang.System.arraycopy(r0, r3, r4, r3, r1)     // Catch:{ all -> 0x004d }
            r4[r1] = r6     // Catch:{ all -> 0x004d }
            int r1 = r1 + r2
            r4[r1] = r7     // Catch:{ all -> 0x004d }
            r5.listenerList = r4     // Catch:{ all -> 0x004d }
        L_0x002c:
            monitor-exit(r5)
            return
        L_0x002e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "Listener "
            r1.append(r2)     // Catch:{ all -> 0x004d }
            r1.append(r7)     // Catch:{ all -> 0x004d }
            java.lang.String r7 = " is not of type "
            r1.append(r7)     // Catch:{ all -> 0x004d }
            r1.append(r6)     // Catch:{ all -> 0x004d }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x004d }
            r0.<init>(r6)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p441d.p442b.C9310c.add(java.lang.Class, java.util.EventListener):void");
    }

    public int getListenerCount() {
        return this.listenerList.length / 2;
    }

    public Object[] getListenerList() {
        return this.listenerList;
    }

    public <T extends EventListener> T[] getListeners(Class<T> cls) {
        T[] tArr = this.listenerList;
        T[] tArr2 = (EventListener[]) Array.newInstance(cls, m49311a(tArr, cls));
        int i = 0;
        for (int length = tArr.length - 2; length >= 0; length -= 2) {
            if (tArr[length] == cls) {
                tArr2[i] = (EventListener) tArr[length + 1];
                i++;
            }
        }
        return tArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T extends java.util.EventListener> void remove(java.lang.Class<T> r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            boolean r0 = r5.isInstance(r6)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object[] r0 = r4.listenerList     // Catch:{ all -> 0x0068 }
            int r0 = r0.length     // Catch:{ all -> 0x0068 }
            int r0 = r0 + -2
        L_0x0010:
            r1 = -1
            if (r0 < 0) goto L_0x0028
            java.lang.Object[] r2 = r4.listenerList     // Catch:{ all -> 0x0068 }
            r3 = r2[r0]     // Catch:{ all -> 0x0068 }
            if (r3 != r5) goto L_0x0025
            int r3 = r0 + 1
            r2 = r2[r3]     // Catch:{ all -> 0x0068 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0068 }
            r3 = 1
            if (r2 != r3) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            int r0 = r0 + -2
            goto L_0x0010
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == r1) goto L_0x0047
            java.lang.Object[] r5 = r4.listenerList     // Catch:{ all -> 0x0068 }
            int r6 = r5.length     // Catch:{ all -> 0x0068 }
            int r6 = r6 + -2
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0068 }
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r1, r2, r0)     // Catch:{ all -> 0x0068 }
            if (r0 >= r6) goto L_0x0041
            java.lang.Object[] r5 = r4.listenerList     // Catch:{ all -> 0x0068 }
            int r2 = r0 + 2
            int r3 = r6 - r0
            java.lang.System.arraycopy(r5, r2, r1, r0, r3)     // Catch:{ all -> 0x0068 }
        L_0x0041:
            if (r6 != 0) goto L_0x0045
            java.lang.Object[] r1 = f36025g     // Catch:{ all -> 0x0068 }
        L_0x0045:
            r4.listenerList = r1     // Catch:{ all -> 0x0068 }
        L_0x0047:
            monitor-exit(r4)
            return
        L_0x0049:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r1.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "Listener "
            r1.append(r2)     // Catch:{ all -> 0x0068 }
            r1.append(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = " is not of type "
            r1.append(r6)     // Catch:{ all -> 0x0068 }
            r1.append(r5)     // Catch:{ all -> 0x0068 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0068 }
            r0.<init>(r5)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p441d.p442b.C9310c.remove(java.lang.Class, java.util.EventListener):void");
    }

    public String toString() {
        Object[] objArr = this.listenerList;
        String str = "EventListenerList: " + (objArr.length / 2) + " listeners: ";
        for (int i = 0; i <= objArr.length - 2; i += 2) {
            str = (str + " type " + ((Class) objArr[i]).getName()) + " listener " + objArr[i + 1];
        }
        return str;
    }

    public int getListenerCount(Class<?> cls) {
        return m49311a(this.listenerList, cls);
    }
}
