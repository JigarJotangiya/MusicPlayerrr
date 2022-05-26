package p402l.p406b.p441d.p442b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.Vector;

/* renamed from: l.b.d.b.h */
/* compiled from: TreePath */
public class C9315h implements Serializable {

    /* renamed from: g */
    private transient Object f36026g;
    private C9315h parentPath;

    public C9315h(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("path in TreePath must be non null and not empty.");
        }
        this.f36026g = objArr[objArr.length - 1];
        if (objArr.length > 1) {
            this.parentPath = new C9315h(objArr, objArr.length - 1);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Vector vector = (Vector) objectInputStream.readObject();
        if (vector.size() > 0 && vector.elementAt(0).equals("lastPathComponent")) {
            this.f36026g = vector.elementAt(1);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Vector vector = new Vector();
        Object obj = this.f36026g;
        if (obj != null && (obj instanceof Serializable)) {
            vector.addElement("lastPathComponent");
            vector.addElement(this.f36026g);
        }
        objectOutputStream.writeObject(vector);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9315h)) {
            return false;
        }
        C9315h hVar = (C9315h) obj;
        if (getPathCount() != hVar.getPathCount()) {
            return false;
        }
        for (C9315h hVar2 = this; hVar2 != null; hVar2 = hVar2.parentPath) {
            if (!hVar2.f36026g.equals(hVar.f36026g)) {
                return false;
            }
            hVar = hVar.parentPath;
        }
        return true;
    }

    public Object getLastPathComponent() {
        return this.f36026g;
    }

    public C9315h getParentPath() {
        return this.parentPath;
    }

    public Object[] getPath() {
        int pathCount = getPathCount();
        int i = pathCount - 1;
        Object[] objArr = new Object[pathCount];
        C9315h hVar = this;
        while (hVar != null) {
            objArr[i] = hVar.f36026g;
            hVar = hVar.parentPath;
            i--;
        }
        return objArr;
    }

    public Object getPathComponent(int i) {
        int pathCount = getPathCount();
        if (i < 0 || i >= pathCount) {
            throw new IllegalArgumentException("Index " + i + " is out of the specified range");
        }
        C9315h hVar = this;
        for (int i2 = pathCount - 1; i2 != i; i2--) {
            hVar = hVar.parentPath;
        }
        return hVar.f36026g;
    }

    public int getPathCount() {
        int i = 0;
        for (C9315h hVar = this; hVar != null; hVar = hVar.parentPath) {
            i++;
        }
        return i;
    }

    public int hashCode() {
        return this.f36026g.hashCode();
    }

    public boolean isDescendant(C9315h hVar) {
        int pathCount;
        int pathCount2;
        if (hVar == this) {
            return true;
        }
        if (hVar == null || (pathCount2 = hVar.getPathCount()) < (pathCount = getPathCount())) {
            return false;
        }
        while (true) {
            int i = pathCount2 - 1;
            if (pathCount2 <= pathCount) {
                return equals(hVar);
            }
            hVar = hVar.getParentPath();
            pathCount2 = i;
        }
    }

    public C9315h pathByAddingChild(Object obj) {
        Objects.requireNonNull(obj, "Null child not allowed");
        return new C9315h(this, obj);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        int pathCount = getPathCount();
        for (int i = 0; i < pathCount; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(getPathComponent(i));
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public C9315h(Object obj) {
        if (obj != null) {
            this.f36026g = obj;
            this.parentPath = null;
            return;
        }
        throw new IllegalArgumentException("path in TreePath must be non null.");
    }

    protected C9315h(C9315h hVar, Object obj) {
        if (obj != null) {
            this.parentPath = hVar;
            this.f36026g = obj;
            return;
        }
        throw new IllegalArgumentException("path in TreePath must be non null.");
    }

    protected C9315h(Object[] objArr, int i) {
        int i2 = i - 1;
        this.f36026g = objArr[i2];
        if (i > 1) {
            this.parentPath = new C9315h(objArr, i2);
        }
    }

    protected C9315h() {
    }
}
