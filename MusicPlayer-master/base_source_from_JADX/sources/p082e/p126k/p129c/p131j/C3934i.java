package p082e.p126k.p129c.p131j;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.k.c.j.i */
/* compiled from: ByteString */
public abstract class C3934i implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final C3934i EMPTY = new C3944j(C3899b0.f11983b);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;

    /* renamed from: g */
    private static final C3940f f12021g = (C3914d.m16667c() ? new C3946l((C3935a) null) : new C3938d((C3935a) null));

    /* renamed from: h */
    private static final Comparator<C3934i> f12022h = new C3936b();
    private int hash = 0;

    /* renamed from: e.k.c.j.i$a */
    /* compiled from: ByteString */
    class C3935a extends C3937c {

        /* renamed from: g */
        private int f12023g = 0;

        /* renamed from: h */
        private final int f12024h;

        C3935a() {
            this.f12024h = C3934i.this.size();
        }

        /* renamed from: c */
        public byte mo13607c() {
            int i = this.f12023g;
            if (i < this.f12024h) {
                this.f12023g = i + 1;
                return C3934i.this.internalByteAt(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f12023g < this.f12024h;
        }
    }

    /* renamed from: e.k.c.j.i$b */
    /* compiled from: ByteString */
    static class C3936b implements Comparator<C3934i> {
        C3936b() {
        }

        /* renamed from: a */
        public int compare(C3934i iVar, C3934i iVar2) {
            C3941g it = iVar.iterator();
            C3941g it2 = iVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(C3934i.m16840s(it.mo13607c()), C3934i.m16840s(it2.mo13607c()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(iVar.size(), iVar2.size());
        }
    }

    /* renamed from: e.k.c.j.i$c */
    /* compiled from: ByteString */
    static abstract class C3937c implements C3941g {
        C3937c() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(mo13607c());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e.k.c.j.i$d */
    /* compiled from: ByteString */
    private static final class C3938d implements C3940f {
        private C3938d() {
        }

        /* renamed from: a */
        public byte[] mo13614a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        /* synthetic */ C3938d(C3935a aVar) {
            this();
        }
    }

    /* renamed from: e.k.c.j.i$e */
    /* compiled from: ByteString */
    private static final class C3939e extends C3944j {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        C3939e(byte[] bArr, int i, int i2) {
            super(bArr);
            C3934i.checkRange(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        public byte byteAt(int i) {
            C3934i.checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        /* access modifiers changed from: protected */
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
        }

        /* access modifiers changed from: protected */
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        /* access modifiers changed from: package-private */
        public byte internalByteAt(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        public int size() {
            return this.bytesLength;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return C3934i.wrap(toByteArray());
        }
    }

    /* renamed from: e.k.c.j.i$f */
    /* compiled from: ByteString */
    private interface C3940f {
        /* renamed from: a */
        byte[] mo13614a(byte[] bArr, int i, int i2);
    }

    /* renamed from: e.k.c.j.i$g */
    /* compiled from: ByteString */
    public interface C3941g extends Iterator<Byte> {
        /* renamed from: c */
        byte mo13607c();
    }

    /* renamed from: e.k.c.j.i$h */
    /* compiled from: ByteString */
    static final class C3942h {

        /* renamed from: a */
        private final C3970l f12026a;

        /* renamed from: b */
        private final byte[] f12027b;

        /* synthetic */ C3942h(int i, C3935a aVar) {
            this(i);
        }

        /* renamed from: a */
        public C3934i mo13617a() {
            this.f12026a.mo13745d();
            return new C3944j(this.f12027b);
        }

        /* renamed from: b */
        public C3970l mo13618b() {
            return this.f12026a;
        }

        private C3942h(int i) {
            byte[] bArr = new byte[i];
            this.f12027b = bArr;
            this.f12026a = C3970l.m17152h0(bArr);
        }
    }

    /* renamed from: e.k.c.j.i$i */
    /* compiled from: ByteString */
    static abstract class C3943i extends C3934i {
        C3943i() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean equalsRange(C3934i iVar, int i, int i2);

        /* access modifiers changed from: protected */
        public final int getTreeDepth() {
            return 0;
        }

        /* access modifiers changed from: protected */
        public final boolean isBalanced() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C3934i.super.iterator();
        }

        /* access modifiers changed from: package-private */
        public void writeToReverse(C3931h hVar) throws IOException {
            writeTo(hVar);
        }
    }

    /* renamed from: e.k.c.j.i$j */
    /* compiled from: ByteString */
    private static class C3944j extends C3943i {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        C3944j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.bytes = bArr;
        }

        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        public byte byteAt(int i) {
            return this.bytes[i];
        }

        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        /* access modifiers changed from: protected */
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3934i) || size() != ((C3934i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C3944j)) {
                return obj.equals(this);
            }
            C3944j jVar = (C3944j) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = jVar.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return equalsRange(jVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean equalsRange(C3934i iVar, int i, int i2) {
            if (i2 <= iVar.size()) {
                int i3 = i + i2;
                if (i3 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + iVar.size());
                } else if (!(iVar instanceof C3944j)) {
                    return iVar.substring(i, i3).equals(substring(0, i2));
                } else {
                    C3944j jVar = (C3944j) iVar;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = jVar.bytes;
                    int offsetIntoBytes = getOffsetIntoBytes() + i2;
                    int offsetIntoBytes2 = getOffsetIntoBytes();
                    int offsetIntoBytes3 = jVar.getOffsetIntoBytes() + i;
                    while (offsetIntoBytes2 < offsetIntoBytes) {
                        if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                            return false;
                        }
                        offsetIntoBytes2++;
                        offsetIntoBytes3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int getOffsetIntoBytes() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return C4032v1.m17832t(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        public final C3956j newCodedInput() {
            return C3956j.m16888k(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        /* access modifiers changed from: protected */
        public final int partialHash(int i, int i2, int i3) {
            return C3899b0.m16653i(i, this.bytes, getOffsetIntoBytes() + i2, i3);
        }

        /* access modifiers changed from: protected */
        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            return C4032v1.m17834v(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
        }

        public int size() {
            return this.bytes.length;
        }

        public final C3934i substring(int i, int i2) {
            int checkRange = C3934i.checkRange(i, i2, size());
            if (checkRange == 0) {
                return C3934i.EMPTY;
            }
            return new C3939e(this.bytes, getOffsetIntoBytes() + i, checkRange);
        }

        /* access modifiers changed from: protected */
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        /* access modifiers changed from: package-private */
        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
        }

        /* access modifiers changed from: package-private */
        public final void writeTo(C3931h hVar) throws IOException {
            hVar.mo13587b(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    /* renamed from: e.k.c.j.i$l */
    /* compiled from: ByteString */
    private static final class C3946l implements C3940f {
        private C3946l() {
        }

        /* renamed from: a */
        public byte[] mo13614a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* synthetic */ C3946l(C3935a aVar) {
            this();
        }
    }

    C3934i() {
    }

    static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static C3934i copyFrom(byte[] bArr, int i, int i2) {
        checkRange(i, i + i2, bArr.length);
        return new C3944j(f12021g.mo13614a(bArr, i, i2));
    }

    public static C3934i copyFromUtf8(String str) {
        return new C3944j(str.getBytes(C3899b0.f11982a));
    }

    /* renamed from: d */
    private static C3934i m16838d(Iterator<C3934i> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return m16838d(it, i2).concat(m16838d(it, i - i2));
        }
    }

    static C3942h newCodedBuilder(int i) {
        return new C3942h(i, (C3935a) null);
    }

    public static C3945k newOutput(int i) {
        return new C3945k(i);
    }

    /* renamed from: p */
    private static C3934i m16839p(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public static C3934i readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static int m16840s(byte b) {
        return b & 255;
    }

    public static Comparator<C3934i> unsignedLexicographicalComparator() {
        return f12022h;
    }

    static C3934i wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C3896a1(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final C3934i concat(C3934i iVar) {
        if (Integer.MAX_VALUE - size() >= iVar.size()) {
            return C3951i1.concatenate(this, iVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + iVar.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    /* access modifiers changed from: protected */
    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(C3934i iVar) {
        return size() >= iVar.size() && substring(size() - iVar.size()).equals(iVar);
    }

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    public abstract int getTreeDepth();

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public abstract byte internalByteAt(int i);

    /* access modifiers changed from: protected */
    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract C3956j newCodedInput();

    public abstract InputStream newInput();

    /* access modifiers changed from: protected */
    public abstract int partialHash(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(C3934i iVar) {
        return size() >= iVar.size() && substring(0, iVar.size()).equals(iVar);
    }

    public final C3934i substring(int i) {
        return substring(i, size());
    }

    public abstract C3934i substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C3899b0.f11983b;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(C3899b0.f11982a);
    }

    /* access modifiers changed from: package-private */
    public abstract void writeTo(C3931h hVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    /* access modifiers changed from: package-private */
    public final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void writeToReverse(C3931h hVar) throws IOException;

    public static C3945k newOutput() {
        return new C3945k(128);
    }

    public static C3934i readFrom(InputStream inputStream, int i) throws IOException {
        return readFrom(inputStream, i, i);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public C3941g iterator() {
        return new C3935a();
    }

    public static C3934i copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static C3934i readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C3934i p = m16839p(inputStream, i);
            if (p == null) {
                return copyFrom((Iterable<C3934i>) arrayList);
            }
            arrayList.add(p);
            i = Math.min(i * 2, i2);
        }
    }

    /* renamed from: e.k.c.j.i$k */
    /* compiled from: ByteString */
    public static final class C3945k extends OutputStream {

        /* renamed from: g */
        private final int f12028g;

        /* renamed from: h */
        private final ArrayList<C3934i> f12029h;

        /* renamed from: i */
        private int f12030i;

        /* renamed from: j */
        private byte[] f12031j;

        /* renamed from: k */
        private int f12032k;

        C3945k(int i) {
            if (i >= 0) {
                this.f12028g = i;
                this.f12029h = new ArrayList<>();
                this.f12031j = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: c */
        private void m16849c(int i) {
            this.f12029h.add(new C3944j(this.f12031j));
            int length = this.f12030i + this.f12031j.length;
            this.f12030i = length;
            this.f12031j = new byte[Math.max(this.f12028g, Math.max(i, length >>> 1))];
            this.f12032k = 0;
        }

        /* renamed from: d */
        public synchronized int mo13619d() {
            return this.f12030i + this.f12032k;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo13619d())});
        }

        public synchronized void write(int i) {
            if (this.f12032k == this.f12031j.length) {
                m16849c(1);
            }
            byte[] bArr = this.f12031j;
            int i2 = this.f12032k;
            this.f12032k = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f12031j;
            int length = bArr2.length;
            int i3 = this.f12032k;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f12032k += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m16849c(i4);
                System.arraycopy(bArr, i + length2, this.f12031j, 0, i4);
                this.f12032k = i4;
            }
        }
    }

    public static C3934i copyFrom(ByteBuffer byteBuffer, int i) {
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C3944j(bArr);
    }

    static C3934i wrap(byte[] bArr) {
        return new C3944j(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? BuildConfig.FLAVOR : toStringInternal(charset);
    }

    static C3934i wrap(byte[] bArr, int i, int i2) {
        return new C3939e(bArr, i, i2);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public static C3934i copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static C3934i copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new C3944j(str.getBytes(str2));
    }

    public static C3934i copyFrom(String str, Charset charset) {
        return new C3944j(str.getBytes(charset));
    }

    public static C3934i copyFrom(Iterable<C3934i> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<C3934i> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return EMPTY;
        }
        return m16838d(iterable.iterator(), i);
    }
}
