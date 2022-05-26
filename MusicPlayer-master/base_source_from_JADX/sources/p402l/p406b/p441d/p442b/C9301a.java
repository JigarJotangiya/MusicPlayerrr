package p402l.p406b.p441d.p442b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.Vector;

/* renamed from: l.b.d.b.a */
/* compiled from: DefaultMutableTreeNode */
public class C9301a implements Cloneable, C9311d, Serializable {
    public static final Enumeration<C9314g> EMPTY_ENUMERATION = new C9302a();
    protected boolean allowsChildren;
    protected Vector children;
    protected C9311d parent;
    protected transient Object userObject;

    /* renamed from: l.b.d.b.a$a */
    /* compiled from: DefaultMutableTreeNode */
    static class C9302a implements Enumeration<C9314g> {
        C9302a() {
        }

        /* renamed from: a */
        public C9314g mo32199a() {
            throw new NoSuchElementException("No more elements");
        }

        public boolean hasMoreElements() {
            return false;
        }

        public /* bridge */ /* synthetic */ Object nextElement() {
            mo32199a();
            throw null;
        }
    }

    /* renamed from: l.b.d.b.a$b */
    /* compiled from: DefaultMutableTreeNode */
    final class C9303b implements Enumeration<C9314g> {

        /* renamed from: a */
        protected C9304a f36014a;

        /* renamed from: l.b.d.b.a$b$a */
        /* compiled from: DefaultMutableTreeNode */
        final class C9304a {

            /* renamed from: a */
            C9305a f36015a;

            /* renamed from: b */
            C9305a f36016b;

            /* renamed from: l.b.d.b.a$b$a$a */
            /* compiled from: DefaultMutableTreeNode */
            final class C9305a {

                /* renamed from: a */
                public Object f36017a;

                /* renamed from: b */
                public C9305a f36018b;

                public C9305a(C9304a aVar, Object obj, C9305a aVar2) {
                    this.f36017a = obj;
                    this.f36018b = aVar2;
                }
            }

            C9304a(C9303b bVar) {
            }

            /* renamed from: a */
            public Object mo32205a() {
                C9305a aVar = this.f36015a;
                if (aVar != null) {
                    Object obj = aVar.f36017a;
                    C9305a aVar2 = aVar.f36018b;
                    this.f36015a = aVar2;
                    if (aVar2 == null) {
                        this.f36016b = null;
                    } else {
                        aVar.f36018b = null;
                    }
                    return obj;
                }
                throw new NoSuchElementException("No more elements");
            }

            /* renamed from: b */
            public void mo32206b(Object obj) {
                if (this.f36015a == null) {
                    C9305a aVar = new C9305a(this, obj, (C9305a) null);
                    this.f36016b = aVar;
                    this.f36015a = aVar;
                    return;
                }
                C9305a aVar2 = this.f36016b;
                C9305a aVar3 = new C9305a(this, obj, (C9305a) null);
                aVar2.f36018b = aVar3;
                this.f36016b = aVar3;
            }

            /* renamed from: c */
            public Object mo32207c() {
                C9305a aVar = this.f36015a;
                if (aVar != null) {
                    return aVar.f36017a;
                }
                throw new NoSuchElementException("No more elements");
            }

            /* renamed from: d */
            public boolean mo32208d() {
                return this.f36015a == null;
            }
        }

        public C9303b(C9301a aVar, C9314g gVar) {
            Vector vector = new Vector(1);
            vector.addElement(gVar);
            C9304a aVar2 = new C9304a(this);
            this.f36014a = aVar2;
            aVar2.mo32206b(vector.elements());
        }

        /* renamed from: a */
        public C9314g nextElement() {
            Enumeration enumeration = (Enumeration) this.f36014a.mo32207c();
            C9314g gVar = (C9314g) enumeration.nextElement();
            Enumeration children = gVar.children();
            if (!enumeration.hasMoreElements()) {
                this.f36014a.mo32205a();
            }
            if (children.hasMoreElements()) {
                this.f36014a.mo32206b(children);
            }
            return gVar;
        }

        public boolean hasMoreElements() {
            return !this.f36014a.mo32208d() && ((Enumeration) this.f36014a.mo32207c()).hasMoreElements();
        }
    }

    /* renamed from: l.b.d.b.a$c */
    /* compiled from: DefaultMutableTreeNode */
    final class C9306c implements Enumeration<C9314g> {

        /* renamed from: a */
        protected Stack<C9314g> f36019a;

        public C9306c(C9301a aVar, C9314g gVar, C9314g gVar2) {
            if (gVar == null || gVar2 == null) {
                throw new IllegalArgumentException("argument is null");
            }
            Stack<C9314g> stack = new Stack<>();
            this.f36019a = stack;
            stack.push(gVar2);
            C9314g gVar3 = gVar2;
            while (gVar3 != gVar) {
                gVar3 = gVar3.getParent();
                if (gVar3 != null || gVar2 == gVar) {
                    this.f36019a.push(gVar3);
                } else {
                    throw new IllegalArgumentException("node " + gVar + " is not an ancestor of " + gVar2);
                }
            }
        }

        /* renamed from: a */
        public C9314g nextElement() {
            try {
                return this.f36019a.pop();
            } catch (EmptyStackException unused) {
                throw new NoSuchElementException("No more elements");
            }
        }

        public boolean hasMoreElements() {
            return this.f36019a.size() > 0;
        }
    }

    /* renamed from: l.b.d.b.a$d */
    /* compiled from: DefaultMutableTreeNode */
    final class C9307d implements Enumeration<C9314g> {

        /* renamed from: a */
        protected C9314g f36020a;

        /* renamed from: b */
        protected Enumeration<C9314g> f36021b;

        /* renamed from: c */
        protected Enumeration<C9314g> f36022c = C9301a.EMPTY_ENUMERATION;

        public C9307d(C9314g gVar) {
            this.f36020a = gVar;
            this.f36021b = gVar.children();
        }

        /* renamed from: a */
        public C9314g nextElement() {
            if (this.f36022c.hasMoreElements()) {
                return this.f36022c.nextElement();
            }
            if (this.f36021b.hasMoreElements()) {
                C9307d dVar = new C9307d(this.f36021b.nextElement());
                this.f36022c = dVar;
                return (C9314g) dVar.nextElement();
            }
            C9314g gVar = this.f36020a;
            this.f36020a = null;
            return gVar;
        }

        public boolean hasMoreElements() {
            return this.f36020a != null;
        }
    }

    /* renamed from: l.b.d.b.a$e */
    /* compiled from: DefaultMutableTreeNode */
    final class C9308e implements Enumeration<C9314g> {

        /* renamed from: a */
        protected Stack f36024a;

        public C9308e(C9301a aVar, C9314g gVar) {
            Vector vector = new Vector(1);
            vector.addElement(gVar);
            Stack stack = new Stack();
            this.f36024a = stack;
            stack.push(vector.elements());
        }

        /* renamed from: a */
        public C9314g nextElement() {
            Enumeration enumeration = (Enumeration) this.f36024a.peek();
            C9314g gVar = (C9314g) enumeration.nextElement();
            Enumeration children = gVar.children();
            if (!enumeration.hasMoreElements()) {
                this.f36024a.pop();
            }
            if (children.hasMoreElements()) {
                this.f36024a.push(children);
            }
            return gVar;
        }

        public boolean hasMoreElements() {
            return !this.f36024a.empty() && ((Enumeration) this.f36024a.peek()).hasMoreElements();
        }
    }

    public C9301a() {
        this((Object) null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object[] objArr = (Object[]) objectInputStream.readObject();
        if (objArr.length > 0 && objArr[0].equals("userObject")) {
            this.userObject = objArr[1];
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object obj = this.userObject;
        objectOutputStream.writeObject((obj == null || !(obj instanceof Serializable)) ? new Object[0] : new Object[]{"userObject", obj});
    }

    public void add(C9311d dVar) {
        if (dVar == null || dVar.getParent() != this) {
            insert(dVar, getChildCount());
        } else {
            insert(dVar, getChildCount() - 1);
        }
    }

    public Enumeration breadthFirstEnumeration() {
        return new C9303b(this, this);
    }

    public Enumeration children() {
        Vector vector = this.children;
        if (vector == null) {
            return EMPTY_ENUMERATION;
        }
        return vector.elements();
    }

    public Object clone() {
        try {
            C9301a aVar = (C9301a) super.clone();
            aVar.children = null;
            aVar.parent = null;
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new Error(e.toString());
        }
    }

    public Enumeration depthFirstEnumeration() {
        return postorderEnumeration();
    }

    public boolean getAllowsChildren() {
        return this.allowsChildren;
    }

    public C9314g getChildAfter(C9314g gVar) {
        if (gVar != null) {
            int index = getIndex(gVar);
            if (index == -1) {
                throw new IllegalArgumentException("node is not a child");
            } else if (index < getChildCount() - 1) {
                return getChildAt(index + 1);
            } else {
                return null;
            }
        } else {
            throw new IllegalArgumentException("argument is null");
        }
    }

    public C9314g getChildAt(int i) {
        Vector vector = this.children;
        if (vector != null) {
            return (C9314g) vector.elementAt(i);
        }
        throw new ArrayIndexOutOfBoundsException("node has no children");
    }

    public C9314g getChildBefore(C9314g gVar) {
        if (gVar != null) {
            int index = getIndex(gVar);
            if (index == -1) {
                throw new IllegalArgumentException("argument is not a child");
            } else if (index > 0) {
                return getChildAt(index - 1);
            } else {
                return null;
            }
        } else {
            throw new IllegalArgumentException("argument is null");
        }
    }

    public int getChildCount() {
        Vector vector = this.children;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public int getDepth() {
        Enumeration breadthFirstEnumeration = breadthFirstEnumeration();
        Object obj = null;
        while (breadthFirstEnumeration.hasMoreElements()) {
            obj = breadthFirstEnumeration.nextElement();
        }
        if (obj != null) {
            return ((C9301a) obj).getLevel() - getLevel();
        }
        throw new Error("nodes should be null");
    }

    public C9314g getFirstChild() {
        if (getChildCount() != 0) {
            return getChildAt(0);
        }
        throw new NoSuchElementException("node has no children");
    }

    public C9301a getFirstLeaf() {
        C9301a aVar = this;
        while (!aVar.isLeaf()) {
            aVar = (C9301a) aVar.getFirstChild();
        }
        return aVar;
    }

    public int getIndex(C9314g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("argument is null");
        } else if (!isNodeChild(gVar)) {
            return -1;
        } else {
            return this.children.indexOf(gVar);
        }
    }

    public C9314g getLastChild() {
        if (getChildCount() != 0) {
            return getChildAt(getChildCount() - 1);
        }
        throw new NoSuchElementException("node has no children");
    }

    public C9301a getLastLeaf() {
        C9301a aVar = this;
        while (!aVar.isLeaf()) {
            aVar = (C9301a) aVar.getLastChild();
        }
        return aVar;
    }

    public int getLeafCount() {
        Enumeration breadthFirstEnumeration = breadthFirstEnumeration();
        int i = 0;
        while (breadthFirstEnumeration.hasMoreElements()) {
            if (((C9314g) breadthFirstEnumeration.nextElement()).isLeaf()) {
                i++;
            }
        }
        if (i >= 1) {
            return i;
        }
        throw new Error("tree has zero leaves");
    }

    public int getLevel() {
        int i = 0;
        C9314g gVar = this;
        while (true) {
            gVar = gVar.getParent();
            if (gVar == null) {
                return i;
            }
            i++;
        }
    }

    public C9301a getNextLeaf() {
        C9301a aVar = (C9301a) getParent();
        if (aVar == null) {
            return null;
        }
        C9301a nextSibling = getNextSibling();
        if (nextSibling != null) {
            return nextSibling.getFirstLeaf();
        }
        return aVar.getNextLeaf();
    }

    public C9301a getNextNode() {
        if (getChildCount() != 0) {
            return (C9301a) getChildAt(0);
        }
        C9301a nextSibling = getNextSibling();
        if (nextSibling != null) {
            return nextSibling;
        }
        for (C9301a aVar = (C9301a) getParent(); aVar != null; aVar = (C9301a) aVar.getParent()) {
            C9301a nextSibling2 = aVar.getNextSibling();
            if (nextSibling2 != null) {
                return nextSibling2;
            }
        }
        return null;
    }

    public C9301a getNextSibling() {
        C9301a aVar;
        C9301a aVar2 = (C9301a) getParent();
        if (aVar2 == null) {
            aVar = null;
        } else {
            aVar = (C9301a) aVar2.getChildAfter(this);
        }
        if (aVar == null || isNodeSibling(aVar)) {
            return aVar;
        }
        throw new Error("child of parent is not a sibling");
    }

    public C9314g getParent() {
        return this.parent;
    }

    public C9314g[] getPath() {
        return getPathToRoot(this, 0);
    }

    /* access modifiers changed from: protected */
    public C9314g[] getPathToRoot(C9314g gVar, int i) {
        if (gVar != null) {
            int i2 = i + 1;
            C9314g[] pathToRoot = getPathToRoot(gVar.getParent(), i2);
            pathToRoot[pathToRoot.length - i2] = gVar;
            return pathToRoot;
        } else if (i == 0) {
            return null;
        } else {
            return new C9314g[i];
        }
    }

    public C9301a getPreviousLeaf() {
        C9301a aVar = (C9301a) getParent();
        if (aVar == null) {
            return null;
        }
        C9301a previousSibling = getPreviousSibling();
        if (previousSibling != null) {
            return previousSibling.getLastLeaf();
        }
        return aVar.getPreviousLeaf();
    }

    public C9301a getPreviousNode() {
        C9301a aVar = (C9301a) getParent();
        if (aVar == null) {
            return null;
        }
        C9301a previousSibling = getPreviousSibling();
        if (previousSibling == null) {
            return aVar;
        }
        if (previousSibling.getChildCount() == 0) {
            return previousSibling;
        }
        return previousSibling.getLastLeaf();
    }

    public C9301a getPreviousSibling() {
        C9301a aVar;
        C9301a aVar2 = (C9301a) getParent();
        if (aVar2 == null) {
            aVar = null;
        } else {
            aVar = (C9301a) aVar2.getChildBefore(this);
        }
        if (aVar == null || isNodeSibling(aVar)) {
            return aVar;
        }
        throw new Error("child of parent is not a sibling");
    }

    public C9314g getRoot() {
        C9314g gVar = this;
        while (true) {
            C9314g parent2 = gVar.getParent();
            if (parent2 == null) {
                return gVar;
            }
            gVar = parent2;
        }
    }

    public C9314g getSharedAncestor(C9301a aVar) {
        int i;
        C9314g gVar;
        if (aVar == this) {
            return this;
        }
        if (aVar == null) {
            return null;
        }
        int level = getLevel();
        int level2 = aVar.getLevel();
        if (level2 > level) {
            i = level2 - level;
            gVar = this;
        } else {
            i = level - level2;
            gVar = aVar;
            aVar = this;
        }
        C9314g gVar2 = aVar;
        while (i > 0) {
            i--;
            gVar2 = gVar2.getParent();
        }
        C9314g gVar3 = gVar2;
        while (gVar3 != gVar) {
            C9314g parent2 = gVar3.getParent();
            gVar = gVar.getParent();
            gVar3 = parent2;
            if (parent2 == null) {
                if (parent2 == null && gVar == null) {
                    return null;
                }
                throw new Error("nodes should be null");
            }
        }
        return gVar3;
    }

    public int getSiblingCount() {
        C9314g parent2 = getParent();
        if (parent2 == null) {
            return 1;
        }
        return parent2.getChildCount();
    }

    public Object getUserObject() {
        return this.userObject;
    }

    public Object[] getUserObjectPath() {
        C9314g[] path = getPath();
        Object[] objArr = new Object[path.length];
        for (int i = 0; i < path.length; i++) {
            objArr[i] = ((C9301a) path[i]).getUserObject();
        }
        return objArr;
    }

    public void insert(C9311d dVar, int i) {
        if (!this.allowsChildren) {
            throw new IllegalStateException("node does not allow children");
        } else if (dVar == null) {
            throw new IllegalArgumentException("new child is null");
        } else if (!isNodeAncestor(dVar)) {
            C9311d dVar2 = (C9311d) dVar.getParent();
            if (dVar2 != null) {
                dVar2.remove(dVar);
            }
            dVar.setParent(this);
            if (this.children == null) {
                this.children = new Vector();
            }
            this.children.insertElementAt(dVar, i);
        } else {
            throw new IllegalArgumentException("new child is an ancestor");
        }
    }

    public boolean isLeaf() {
        return getChildCount() == 0;
    }

    public boolean isNodeAncestor(C9314g gVar) {
        if (gVar == null) {
            return false;
        }
        C9314g gVar2 = this;
        while (gVar2 != gVar) {
            gVar2 = gVar2.getParent();
            if (gVar2 == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isNodeChild(C9314g gVar) {
        if (gVar == null || getChildCount() == 0 || gVar.getParent() != this) {
            return false;
        }
        return true;
    }

    public boolean isNodeDescendant(C9301a aVar) {
        if (aVar == null) {
            return false;
        }
        return aVar.isNodeAncestor(this);
    }

    public boolean isNodeRelated(C9301a aVar) {
        return aVar != null && getRoot() == aVar.getRoot();
    }

    public boolean isNodeSibling(C9314g gVar) {
        boolean z = true;
        if (gVar == null) {
            return false;
        }
        if (gVar == this) {
            return true;
        }
        C9314g parent2 = getParent();
        if (parent2 == null || parent2 != gVar.getParent()) {
            z = false;
        }
        if (!z || ((C9301a) getParent()).isNodeChild(gVar)) {
            return z;
        }
        throw new Error("sibling has different parent");
    }

    public boolean isRoot() {
        return getParent() == null;
    }

    public Enumeration pathFromAncestorEnumeration(C9314g gVar) {
        return new C9306c(this, gVar, this);
    }

    public Enumeration postorderEnumeration() {
        return new C9307d(this);
    }

    public Enumeration preorderEnumeration() {
        return new C9308e(this, this);
    }

    public void remove(int i) {
        this.children.removeElementAt(i);
        ((C9311d) getChildAt(i)).setParent((C9311d) null);
    }

    public void removeAllChildren() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            remove(childCount);
        }
    }

    public void removeFromParent() {
        C9311d dVar = (C9311d) getParent();
        if (dVar != null) {
            dVar.remove((C9311d) this);
        }
    }

    public void setAllowsChildren(boolean z) {
        if (z != this.allowsChildren) {
            this.allowsChildren = z;
            if (!z) {
                removeAllChildren();
            }
        }
    }

    public void setParent(C9311d dVar) {
        this.parent = dVar;
    }

    public void setUserObject(Object obj) {
        this.userObject = obj;
    }

    public String toString() {
        Object obj = this.userObject;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public C9301a(Object obj) {
        this(obj, true);
    }

    public C9301a(Object obj, boolean z) {
        this.parent = null;
        this.allowsChildren = z;
        this.userObject = obj;
    }

    public void remove(C9311d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("argument is null");
        } else if (isNodeChild(dVar)) {
            remove(getIndex(dVar));
        } else {
            throw new IllegalArgumentException("argument is not a child");
        }
    }
}
