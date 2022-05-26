package p402l.p406b.p441d.p442b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EventListener;
import java.util.Vector;

/* renamed from: l.b.d.b.b */
/* compiled from: DefaultTreeModel */
public class C9309b implements Serializable {
    protected boolean asksAllowsChildren;
    protected C9310c listenerList;
    protected C9314g root;

    public C9309b(C9314g gVar) {
        this(gVar, false);
    }

    /* renamed from: a */
    private void m49310a(Object obj, C9315h hVar) {
        Object[] listenerList2 = this.listenerList.getListenerList();
        C9312e eVar = null;
        for (int length = listenerList2.length - 2; length >= 0; length -= 2) {
            if (listenerList2[length] == C9313f.class) {
                if (eVar == null) {
                    eVar = new C9312e(obj, hVar);
                }
                ((C9313f) listenerList2[length + 1]).mo32260c(eVar);
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Vector vector = (Vector) objectInputStream.readObject();
        if (vector.size() > 0 && vector.elementAt(0).equals("root")) {
            this.root = (C9314g) vector.elementAt(1);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Vector vector = new Vector();
        objectOutputStream.defaultWriteObject();
        C9314g gVar = this.root;
        if (gVar != null && (gVar instanceof Serializable)) {
            vector.addElement("root");
            vector.addElement(this.root);
        }
        objectOutputStream.writeObject(vector);
    }

    public void addTreeModelListener(C9313f fVar) {
        this.listenerList.add(C9313f.class, fVar);
    }

    public boolean asksAllowsChildren() {
        return this.asksAllowsChildren;
    }

    /* access modifiers changed from: protected */
    public void fireTreeNodesChanged(Object obj, Object[] objArr, int[] iArr, Object[] objArr2) {
        Object[] listenerList2 = this.listenerList.getListenerList();
        C9312e eVar = null;
        for (int length = listenerList2.length - 2; length >= 0; length -= 2) {
            if (listenerList2[length] == C9313f.class) {
                if (eVar == null) {
                    eVar = new C9312e(obj, objArr, iArr, objArr2);
                }
                ((C9313f) listenerList2[length + 1]).mo32261d(eVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void fireTreeNodesInserted(Object obj, Object[] objArr, int[] iArr, Object[] objArr2) {
        Object[] listenerList2 = this.listenerList.getListenerList();
        C9312e eVar = null;
        for (int length = listenerList2.length - 2; length >= 0; length -= 2) {
            if (listenerList2[length] == C9313f.class) {
                if (eVar == null) {
                    eVar = new C9312e(obj, objArr, iArr, objArr2);
                }
                ((C9313f) listenerList2[length + 1]).mo32259b(eVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void fireTreeNodesRemoved(Object obj, Object[] objArr, int[] iArr, Object[] objArr2) {
        Object[] listenerList2 = this.listenerList.getListenerList();
        C9312e eVar = null;
        for (int length = listenerList2.length - 2; length >= 0; length -= 2) {
            if (listenerList2[length] == C9313f.class) {
                if (eVar == null) {
                    eVar = new C9312e(obj, objArr, iArr, objArr2);
                }
                ((C9313f) listenerList2[length + 1]).mo32258a(eVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void fireTreeStructureChanged(Object obj, Object[] objArr, int[] iArr, Object[] objArr2) {
        Object[] listenerList2 = this.listenerList.getListenerList();
        C9312e eVar = null;
        for (int length = listenerList2.length - 2; length >= 0; length -= 2) {
            if (listenerList2[length] == C9313f.class) {
                if (eVar == null) {
                    eVar = new C9312e(obj, objArr, iArr, objArr2);
                }
                ((C9313f) listenerList2[length + 1]).mo32260c(eVar);
            }
        }
    }

    public Object getChild(Object obj, int i) {
        return ((C9314g) obj).getChildAt(i);
    }

    public int getChildCount(Object obj) {
        return ((C9314g) obj).getChildCount();
    }

    public int getIndexOfChild(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return -1;
        }
        return ((C9314g) obj).getIndex((C9314g) obj2);
    }

    public <T extends EventListener> T[] getListeners(Class<T> cls) {
        return this.listenerList.getListeners(cls);
    }

    public C9314g[] getPathToRoot(C9314g gVar) {
        return getPathToRoot(gVar, 0);
    }

    public Object getRoot() {
        return this.root;
    }

    public C9313f[] getTreeModelListeners() {
        return (C9313f[]) this.listenerList.getListeners(C9313f.class);
    }

    public void insertNodeInto(C9311d dVar, C9311d dVar2, int i) {
        dVar2.insert(dVar, i);
        nodesWereInserted(dVar2, new int[]{i});
    }

    public boolean isLeaf(Object obj) {
        if (this.asksAllowsChildren) {
            return !((C9314g) obj).getAllowsChildren();
        }
        return ((C9314g) obj).isLeaf();
    }

    public void nodeChanged(C9314g gVar) {
        if (this.listenerList != null && gVar != null) {
            C9314g parent = gVar.getParent();
            if (parent != null) {
                int index = parent.getIndex(gVar);
                if (index != -1) {
                    nodesChanged(parent, new int[]{index});
                }
            } else if (gVar == getRoot()) {
                nodesChanged(gVar, (int[]) null);
            }
        }
    }

    public void nodeStructureChanged(C9314g gVar) {
        if (gVar != null) {
            fireTreeStructureChanged(this, getPathToRoot(gVar), (int[]) null, (Object[]) null);
        }
    }

    public void nodesChanged(C9314g gVar, int[] iArr) {
        if (gVar == null) {
            return;
        }
        if (iArr != null) {
            int length = iArr.length;
            if (length > 0) {
                Object[] objArr = new Object[length];
                for (int i = 0; i < length; i++) {
                    objArr[i] = gVar.getChildAt(iArr[i]);
                }
                fireTreeNodesChanged(this, getPathToRoot(gVar), iArr, objArr);
            }
        } else if (gVar == getRoot()) {
            fireTreeNodesChanged(this, getPathToRoot(gVar), (int[]) null, (Object[]) null);
        }
    }

    public void nodesWereInserted(C9314g gVar, int[] iArr) {
        if (this.listenerList != null && gVar != null && iArr != null && iArr.length > 0) {
            int length = iArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                objArr[i] = gVar.getChildAt(iArr[i]);
            }
            fireTreeNodesInserted(this, getPathToRoot(gVar), iArr, objArr);
        }
    }

    public void nodesWereRemoved(C9314g gVar, int[] iArr, Object[] objArr) {
        if (gVar != null && iArr != null) {
            fireTreeNodesRemoved(this, getPathToRoot(gVar), iArr, objArr);
        }
    }

    public void reload() {
        reload(this.root);
    }

    public void removeNodeFromParent(C9311d dVar) {
        C9311d dVar2 = (C9311d) dVar.getParent();
        if (dVar2 != null) {
            int[] iArr = {dVar2.getIndex(dVar)};
            dVar2.remove(iArr[0]);
            nodesWereRemoved(dVar2, iArr, new Object[]{dVar});
            return;
        }
        throw new IllegalArgumentException("node does not have a parent.");
    }

    public void removeTreeModelListener(C9313f fVar) {
        this.listenerList.remove(C9313f.class, fVar);
    }

    public void setAsksAllowsChildren(boolean z) {
        this.asksAllowsChildren = z;
    }

    public void setRoot(C9314g gVar) {
        C9314g gVar2 = this.root;
        this.root = gVar;
        if (gVar != null || gVar2 == null) {
            nodeStructureChanged(gVar);
        } else {
            m49310a(this, (C9315h) null);
        }
    }

    public void valueForPathChanged(C9315h hVar, Object obj) {
        C9311d dVar = (C9311d) hVar.getLastPathComponent();
        dVar.setUserObject(obj);
        nodeChanged(dVar);
    }

    public C9309b(C9314g gVar, boolean z) {
        this.listenerList = new C9310c();
        this.root = gVar;
        this.asksAllowsChildren = z;
    }

    /* access modifiers changed from: protected */
    public C9314g[] getPathToRoot(C9314g gVar, int i) {
        C9314g[] gVarArr;
        if (gVar != null) {
            int i2 = i + 1;
            if (gVar == this.root) {
                gVarArr = new C9314g[i2];
            } else {
                gVarArr = getPathToRoot(gVar.getParent(), i2);
            }
            gVarArr[gVarArr.length - i2] = gVar;
            return gVarArr;
        } else if (i == 0) {
            return null;
        } else {
            return new C9314g[i];
        }
    }

    public void reload(C9314g gVar) {
        if (gVar != null) {
            fireTreeStructureChanged(this, getPathToRoot(gVar), (int[]) null, (Object[]) null);
        }
    }
}
