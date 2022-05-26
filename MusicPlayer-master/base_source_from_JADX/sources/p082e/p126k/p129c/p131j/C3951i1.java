package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p082e.p126k.p129c.p131j.C3934i;

/* renamed from: e.k.c.j.i1 */
/* compiled from: RopeByteString */
final class C3951i1 extends C3934i {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */
    public final C3934i left;
    private final int leftLength;
    /* access modifiers changed from: private */
    public final C3934i right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: e.k.c.j.i1$a */
    /* compiled from: RopeByteString */
    class C3952a extends C3934i.C3937c {

        /* renamed from: g */
        final C3954c f12036g;

        /* renamed from: h */
        C3934i.C3941g f12037h = m16868b();

        C3952a() {
            this.f12036g = new C3954c(C3951i1.this, (C3952a) null);
        }

        /* renamed from: b */
        private C3934i.C3941g m16868b() {
            if (this.f12036g.hasNext()) {
                return this.f12036g.next().iterator();
            }
            return null;
        }

        /* renamed from: c */
        public byte mo13607c() {
            C3934i.C3941g gVar = this.f12037h;
            if (gVar != null) {
                byte c = gVar.mo13607c();
                if (!this.f12037h.hasNext()) {
                    this.f12037h = m16868b();
                }
                return c;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f12037h != null;
        }
    }

    /* renamed from: e.k.c.j.i1$c */
    /* compiled from: RopeByteString */
    private static final class C3954c implements Iterator<C3934i.C3943i> {

        /* renamed from: g */
        private final ArrayDeque<C3951i1> f12040g;

        /* renamed from: h */
        private C3934i.C3943i f12041h;

        /* synthetic */ C3954c(C3934i iVar, C3952a aVar) {
            this(iVar);
        }

        /* renamed from: a */
        private C3934i.C3943i m16875a(C3934i iVar) {
            while (iVar instanceof C3951i1) {
                C3951i1 i1Var = (C3951i1) iVar;
                this.f12040g.push(i1Var);
                iVar = i1Var.left;
            }
            return (C3934i.C3943i) iVar;
        }

        /* renamed from: b */
        private C3934i.C3943i m16876b() {
            C3934i.C3943i a;
            do {
                ArrayDeque<C3951i1> arrayDeque = this.f12040g;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a = m16875a(this.f12040g.pop().right);
            } while (a.isEmpty());
            return a;
        }

        /* renamed from: d */
        public C3934i.C3943i next() {
            C3934i.C3943i iVar = this.f12041h;
            if (iVar != null) {
                this.f12041h = m16876b();
                return iVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f12041h != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C3954c(C3934i iVar) {
            if (iVar instanceof C3951i1) {
                C3951i1 i1Var = (C3951i1) iVar;
                ArrayDeque<C3951i1> arrayDeque = new ArrayDeque<>(i1Var.getTreeDepth());
                this.f12040g = arrayDeque;
                arrayDeque.push(i1Var);
                this.f12041h = m16875a(i1Var.left);
                return;
            }
            this.f12040g = null;
            this.f12041h = (C3934i.C3943i) iVar;
        }
    }

    /* synthetic */ C3951i1(C3934i iVar, C3934i iVar2, C3952a aVar) {
        this(iVar, iVar2);
    }

    static C3934i concatenate(C3934i iVar, C3934i iVar2) {
        if (iVar2.size() == 0) {
            return iVar;
        }
        if (iVar.size() == 0) {
            return iVar2;
        }
        int size = iVar.size() + iVar2.size();
        if (size < 128) {
            return m16866t(iVar, iVar2);
        }
        if (iVar instanceof C3951i1) {
            C3951i1 i1Var = (C3951i1) iVar;
            if (i1Var.right.size() + iVar2.size() < 128) {
                return new C3951i1(i1Var.left, m16866t(i1Var.right, iVar2));
            } else if (i1Var.left.getTreeDepth() > i1Var.right.getTreeDepth() && i1Var.getTreeDepth() > iVar2.getTreeDepth()) {
                return new C3951i1(i1Var.left, new C3951i1(i1Var.right, iVar2));
            }
        }
        if (size >= minLengthByDepth[Math.max(iVar.getTreeDepth(), iVar2.getTreeDepth()) + 1]) {
            return new C3951i1(iVar, iVar2);
        }
        return new C3953b((C3952a) null).m16871b(iVar, iVar2);
    }

    static C3951i1 newInstanceForTest(C3934i iVar, C3934i iVar2) {
        return new C3951i1(iVar, iVar2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* renamed from: t */
    private static C3934i m16866t(C3934i iVar, C3934i iVar2) {
        int size = iVar.size();
        int size2 = iVar2.size();
        byte[] bArr = new byte[(size + size2)];
        iVar.copyTo(bArr, 0, 0, size);
        iVar2.copyTo(bArr, 0, size, size2);
        return C3934i.wrap(bArr);
    }

    /* renamed from: u */
    private boolean m16867u(C3934i iVar) {
        boolean z;
        C3954c cVar = new C3954c(this, (C3952a) null);
        C3934i.C3943i iVar2 = (C3934i.C3943i) cVar.next();
        C3954c cVar2 = new C3954c(iVar, (C3952a) null);
        C3934i.C3943i iVar3 = (C3934i.C3943i) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = iVar2.size() - i;
            int size2 = iVar3.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = iVar2.equalsRange(iVar3, i2, min);
            } else {
                z = iVar3.equalsRange(iVar2, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 < i4) {
                if (min == size) {
                    iVar2 = (C3934i.C3943i) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    iVar3 = (C3934i.C3943i) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C3954c cVar = new C3954c(this, (C3952a) null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    public byte byteAt(int i) {
        C3934i.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3934i)) {
            return false;
        }
        C3934i iVar = (C3934i) obj;
        if (this.totalLength != iVar.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = iVar.peekCachedHashCode();
        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
            return m16867u(iVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int getTreeDepth() {
        return this.treeDepth;
    }

    /* access modifiers changed from: package-private */
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.internalByteAt(i);
        }
        return this.right.internalByteAt(i - i2);
    }

    /* access modifiers changed from: protected */
    public boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        C3934i iVar = this.right;
        if (iVar.partialIsValidUtf8(partialIsValidUtf8, 0, iVar.size()) == 0) {
            return true;
        }
        return false;
    }

    public C3956j newCodedInput() {
        return C3956j.m16883f(new C3955d());
    }

    public InputStream newInput() {
        return new C3955d();
    }

    /* access modifiers changed from: protected */
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    public int size() {
        return this.totalLength;
    }

    public C3934i substring(int i, int i2) {
        int checkRange = C3934i.checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return C3934i.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        if (i >= i3) {
            return this.right.substring(i - i3, i2 - i3);
        }
        return new C3951i1(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    /* access modifiers changed from: protected */
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return C3934i.wrap(toByteArray());
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    /* access modifiers changed from: package-private */
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= i4) {
            this.right.writeToInternal(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    /* access modifiers changed from: package-private */
    public void writeToReverse(C3931h hVar) throws IOException {
        this.right.writeToReverse(hVar);
        this.left.writeToReverse(hVar);
    }

    /* renamed from: e.k.c.j.i1$b */
    /* compiled from: RopeByteString */
    private static class C3953b {

        /* renamed from: a */
        private final ArrayDeque<C3934i> f12039a;

        private C3953b() {
            this.f12039a = new ArrayDeque<>();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C3934i m16871b(C3934i iVar, C3934i iVar2) {
            m16872c(iVar);
            m16872c(iVar2);
            C3934i pop = this.f12039a.pop();
            while (!this.f12039a.isEmpty()) {
                pop = new C3951i1(this.f12039a.pop(), pop, (C3952a) null);
            }
            return pop;
        }

        /* renamed from: c */
        private void m16872c(C3934i iVar) {
            if (iVar.isBalanced()) {
                m16874e(iVar);
            } else if (iVar instanceof C3951i1) {
                C3951i1 i1Var = (C3951i1) iVar;
                m16872c(i1Var.left);
                m16872c(i1Var.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + iVar.getClass());
            }
        }

        /* renamed from: d */
        private int m16873d(int i) {
            int binarySearch = Arrays.binarySearch(C3951i1.minLengthByDepth, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        private void m16874e(C3934i iVar) {
            int d = m16873d(iVar.size());
            int[] iArr = C3951i1.minLengthByDepth;
            int i = iArr[d + 1];
            if (this.f12039a.isEmpty() || this.f12039a.peek().size() >= i) {
                this.f12039a.push(iVar);
                return;
            }
            int i2 = iArr[d];
            C3934i pop = this.f12039a.pop();
            while (!this.f12039a.isEmpty() && this.f12039a.peek().size() < i2) {
                pop = new C3951i1(this.f12039a.pop(), pop, (C3952a) null);
            }
            C3951i1 i1Var = new C3951i1(pop, iVar, (C3952a) null);
            while (!this.f12039a.isEmpty()) {
                if (this.f12039a.peek().size() >= C3951i1.minLengthByDepth[m16873d(i1Var.size()) + 1]) {
                    break;
                }
                i1Var = new C3951i1(this.f12039a.pop(), i1Var, (C3952a) null);
            }
            this.f12039a.push(i1Var);
        }

        /* synthetic */ C3953b(C3952a aVar) {
            this();
        }
    }

    private C3951i1(C3934i iVar, C3934i iVar2) {
        this.left = iVar;
        this.right = iVar2;
        int size = iVar.size();
        this.leftLength = size;
        this.totalLength = size + iVar2.size();
        this.treeDepth = Math.max(iVar.getTreeDepth(), iVar2.getTreeDepth()) + 1;
    }

    public C3934i.C3941g iterator() {
        return new C3952a();
    }

    /* access modifiers changed from: package-private */
    public void writeTo(C3931h hVar) throws IOException {
        this.left.writeTo(hVar);
        this.right.writeTo(hVar);
    }

    /* renamed from: e.k.c.j.i1$d */
    /* compiled from: RopeByteString */
    private class C3955d extends InputStream {

        /* renamed from: g */
        private C3954c f12042g;

        /* renamed from: h */
        private C3934i.C3943i f12043h;

        /* renamed from: i */
        private int f12044i;

        /* renamed from: j */
        private int f12045j;

        /* renamed from: k */
        private int f12046k;

        /* renamed from: l */
        private int f12047l;

        public C3955d() {
            m16879d();
        }

        /* renamed from: c */
        private void m16878c() {
            int i;
            if (this.f12043h != null && this.f12045j == (i = this.f12044i)) {
                this.f12046k += i;
                this.f12045j = 0;
                if (this.f12042g.hasNext()) {
                    C3934i.C3943i d = this.f12042g.next();
                    this.f12043h = d;
                    this.f12044i = d.size();
                    return;
                }
                this.f12043h = null;
                this.f12044i = 0;
            }
        }

        /* renamed from: d */
        private void m16879d() {
            C3954c cVar = new C3954c(C3951i1.this, (C3952a) null);
            this.f12042g = cVar;
            C3934i.C3943i d = cVar.next();
            this.f12043h = d;
            this.f12044i = d.size();
            this.f12045j = 0;
            this.f12046k = 0;
        }

        /* renamed from: p */
        private int m16880p(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m16878c();
                if (this.f12043h != null) {
                    int min = Math.min(this.f12044i - this.f12045j, i3);
                    if (bArr != null) {
                        this.f12043h.copyTo(bArr, this.f12045j, i, min);
                        i += min;
                    }
                    this.f12045j += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        public int available() throws IOException {
            return C3951i1.this.size() - (this.f12046k + this.f12045j);
        }

        public void mark(int i) {
            this.f12047l = this.f12046k + this.f12045j;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr);
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m16880p(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        public synchronized void reset() {
            m16879d();
            m16880p((byte[]) null, 0, this.f12047l);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) m16880p((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            m16878c();
            C3934i.C3943i iVar = this.f12043h;
            if (iVar == null) {
                return -1;
            }
            int i = this.f12045j;
            this.f12045j = i + 1;
            return iVar.byteAt(i) & 255;
        }
    }
}
