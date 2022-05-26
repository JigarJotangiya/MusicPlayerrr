package p394k;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p369i.p387z.p389d.C8594l;
import p394k.p395c0.C8627c;

/* renamed from: k.x */
/* compiled from: SegmentedByteString.kt */
public final class C8658x extends C8638h {

    /* renamed from: i */
    private final transient byte[][] f35024i;

    /* renamed from: j */
    private final transient int[] f35025j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8658x(byte[][] bArr, int[] iArr) {
        super(C8638h.EMPTY.getData$okio());
        C8594l.m46771e(bArr, "segments");
        C8594l.m46771e(iArr, "directory");
        this.f35024i = bArr;
        this.f35025j = iArr;
    }

    /* renamed from: c */
    private final C8638h m47059c() {
        return new C8638h(toByteArray());
    }

    private final Object writeReplace() {
        C8638h c = m47059c();
        Objects.requireNonNull(c, "null cannot be cast to non-null type java.lang.Object");
        return c;
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        C8594l.m46770d(asReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return m47059c().base64();
    }

    public String base64Url() {
        return m47059c().base64Url();
    }

    public C8638h digest$okio(String str) {
        C8594l.m46771e(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            instance.update(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C8594l.m46770d(digest, "digestBytes");
        return new C8638h(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8638h) {
            C8638h hVar = (C8638h) obj;
            return hVar.size() == size() && rangeEquals(0, hVar, 0, size());
        }
    }

    public final int[] getDirectory$okio() {
        return this.f35025j;
    }

    public final byte[][] getSegments$okio() {
        return this.f35024i;
    }

    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            byte[] bArr = getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        setHashCode$okio(i2);
        return i2;
    }

    public String hex() {
        return m47059c().hex();
    }

    public C8638h hmac$okio(String str, C8638h hVar) {
        C8594l.m46771e(str, "algorithm");
        C8594l.m46771e(hVar, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(hVar.toByteArray(), str));
            int length = getSegments$okio().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = getDirectory$okio()[length + i];
                int i4 = getDirectory$okio()[i];
                instance.update(getSegments$okio()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = instance.doFinal();
            C8594l.m46770d(doFinal, "mac.doFinal()");
            return new C8638h(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int indexOf(byte[] bArr, int i) {
        C8594l.m46771e(bArr, "other");
        return m47059c().indexOf(bArr, i);
    }

    public byte[] internalArray$okio() {
        return toByteArray();
    }

    public byte internalGet$okio(int i) {
        int i2;
        C8624c.m46824b((long) getDirectory$okio()[getSegments$okio().length - 1], (long) i, 1);
        int b = C8627c.m46840b(this, i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = getDirectory$okio()[b - 1];
        }
        return getSegments$okio()[b][(i - i2) + getDirectory$okio()[getSegments$okio().length + b]];
    }

    public int lastIndexOf(byte[] bArr, int i) {
        C8594l.m46771e(bArr, "other");
        return m47059c().lastIndexOf(bArr, i);
    }

    public boolean rangeEquals(int i, C8638h hVar, int i2, int i3) {
        int i4;
        C8594l.m46771e(hVar, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C8627c.m46840b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = getDirectory$okio()[b - 1];
            }
            int i6 = getDirectory$okio()[getSegments$okio().length + b];
            int min = Math.min(i5, (getDirectory$okio()[b] - i4) + i4) - i;
            if (!hVar.rangeEquals(i2, getSegments$okio()[b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    public String string(Charset charset) {
        C8594l.m46771e(charset, "charset");
        return m47059c().string(charset);
    }

    public C8638h substring(int i, int i2) {
        int i3 = 0;
        if (i >= 0) {
            if (i2 <= size()) {
                int i4 = i2 - i;
                if (!(i4 >= 0)) {
                    throw new IllegalArgumentException(("endIndex=" + i2 + " < beginIndex=" + i).toString());
                } else if (i == 0 && i2 == size()) {
                    return this;
                } else {
                    if (i == i2) {
                        return C8638h.EMPTY;
                    }
                    int b = C8627c.m46840b(this, i);
                    int b2 = C8627c.m46840b(this, i2 - 1);
                    byte[][] bArr = (byte[][]) C8475g.m46621h(getSegments$okio(), b, b2 + 1);
                    int[] iArr = new int[(bArr.length * 2)];
                    if (b <= b2) {
                        int i5 = b;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(getDirectory$okio()[i5] - i, i4);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i5];
                            if (i5 == b2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (b != 0) {
                        i3 = getDirectory$okio()[b - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i3);
                    return new C8658x(bArr, iArr);
                }
            } else {
                throw new IllegalArgumentException(("endIndex=" + i2 + " > length(" + size() + ')').toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
    }

    public C8638h toAsciiLowercase() {
        return m47059c().toAsciiLowercase();
    }

    public C8638h toAsciiUppercase() {
        return m47059c().toAsciiUppercase();
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            int i6 = i5 - i2;
            byte[] unused = C8475g.m46616c(getSegments$okio()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public String toString() {
        return m47059c().toString();
    }

    public void write(OutputStream outputStream) throws IOException {
        C8594l.m46771e(outputStream, "out");
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            outputStream.write(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    public void write$okio(C8633e eVar, int i, int i2) {
        int i3;
        C8594l.m46771e(eVar, "buffer");
        int i4 = i + i2;
        int b = C8627c.m46840b(this, i);
        while (i < i4) {
            if (b == 0) {
                i3 = 0;
            } else {
                i3 = getDirectory$okio()[b - 1];
            }
            int i5 = getDirectory$okio()[getSegments$okio().length + b];
            int min = Math.min(i4, (getDirectory$okio()[b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C8656v vVar = new C8656v(getSegments$okio()[b], i6, i6 + min, true, false);
            C8656v vVar2 = eVar.f34971g;
            if (vVar2 == null) {
                vVar.f35018g = vVar;
                vVar.f35017f = vVar;
                eVar.f34971g = vVar;
            } else {
                C8594l.m46769c(vVar2);
                C8656v vVar3 = vVar2.f35018g;
                C8594l.m46769c(vVar3);
                vVar3.mo30848c(vVar);
            }
            i += min;
            b++;
        }
        eVar.mo30686T0(eVar.mo30688U0() + ((long) i2));
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C8594l.m46771e(bArr, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C8627c.m46840b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = getDirectory$okio()[b - 1];
            }
            int i6 = getDirectory$okio()[getSegments$okio().length + b];
            int min = Math.min(i5, (getDirectory$okio()[b] - i4) + i4) - i;
            if (!C8624c.m46823a(getSegments$okio()[b], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }
}
