package p402l.p406b.p441d.p442b;

import java.util.EventObject;

/* renamed from: l.b.d.b.e */
/* compiled from: TreeModelEvent */
public class C9312e extends EventObject {
    protected int[] childIndices;
    protected Object[] children;
    protected C9315h path;

    public C9312e(Object obj, Object[] objArr, int[] iArr, Object[] objArr2) {
        this(obj, new C9315h(objArr), iArr, objArr2);
    }

    public int[] getChildIndices() {
        int[] iArr = this.childIndices;
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public Object[] getChildren() {
        Object[] objArr = this.children;
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    public Object[] getPath() {
        C9315h hVar = this.path;
        if (hVar != null) {
            return hVar.getPath();
        }
        return null;
    }

    public C9315h getTreePath() {
        return this.path;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName() + " " + Integer.toString(hashCode()));
        if (this.path != null) {
            stringBuffer.append(" path " + this.path);
        }
        if (this.childIndices != null) {
            stringBuffer.append(" indices [ ");
            for (int i = 0; i < this.childIndices.length; i++) {
                stringBuffer.append(Integer.toString(this.childIndices[i]) + " ");
            }
            stringBuffer.append("]");
        }
        if (this.children != null) {
            stringBuffer.append(" children [ ");
            for (int i2 = 0; i2 < this.children.length; i2++) {
                stringBuffer.append(this.children[i2] + " ");
            }
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }

    public C9312e(Object obj, C9315h hVar, int[] iArr, Object[] objArr) {
        super(obj);
        this.path = hVar;
        this.childIndices = iArr;
        this.children = objArr;
    }

    public C9312e(Object obj, Object[] objArr) {
        this(obj, new C9315h(objArr));
    }

    public C9312e(Object obj, C9315h hVar) {
        super(obj);
        this.path = hVar;
        this.childIndices = new int[0];
    }
}
