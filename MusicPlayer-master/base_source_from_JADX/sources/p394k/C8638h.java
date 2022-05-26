package p394k;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p394k.p395c0.C8626b;

/* renamed from: k.h */
/* compiled from: ByteString.kt */
public class C8638h implements Serializable, Comparable<C8638h> {
    public static final C8639a Companion = new C8639a((C8589g) null);
    public static final C8638h EMPTY = new C8638h(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;

    /* renamed from: g */
    private transient int f34975g;

    /* renamed from: h */
    private transient String f34976h;

    /* renamed from: k.h$a */
    /* compiled from: ByteString.kt */
    public static final class C8639a {
        private C8639a() {
        }

        /* renamed from: a */
        public final C8638h mo30801a(String str) {
            C8594l.m46771e(str, "$this$decodeBase64");
            byte[] a = C8619a.m46806a(str);
            if (a != null) {
                return new C8638h(a);
            }
            return null;
        }

        /* renamed from: b */
        public final C8638h mo30802b(String str) {
            C8594l.m46771e(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((C8626b.m46837e(str.charAt(i2)) << 4) + C8626b.m46837e(str.charAt(i2 + 1)));
                }
                return new C8638h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        /* renamed from: c */
        public final C8638h mo30803c(String str, Charset charset) {
            C8594l.m46771e(str, "$this$encode");
            C8594l.m46771e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C8594l.m46770d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C8638h(bytes);
        }

        /* renamed from: d */
        public final C8638h mo30804d(String str) {
            C8594l.m46771e(str, "$this$encodeUtf8");
            C8638h hVar = new C8638h(C8621b.m46811a(str));
            hVar.setUtf8$okio(str);
            return hVar;
        }

        /* renamed from: e */
        public final C8638h mo30805e(ByteBuffer byteBuffer) {
            C8594l.m46771e(byteBuffer, "$this$toByteString");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new C8638h(bArr);
        }

        /* renamed from: f */
        public final C8638h mo30806f(byte... bArr) {
            C8594l.m46771e(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new C8638h(copyOf);
        }

        /* renamed from: g */
        public final C8638h mo30807g(byte[] bArr, int i, int i2) {
            C8594l.m46771e(bArr, "$this$toByteString");
            C8624c.m46824b((long) bArr.length, (long) i, (long) i2);
            return new C8638h(C8475g.m46620g(bArr, i, i2 + i));
        }

        /* renamed from: h */
        public final C8638h mo30808h(InputStream inputStream, int i) throws IOException {
            C8594l.m46771e(inputStream, "$this$readByteString");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C8638h(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }

        public /* synthetic */ C8639a(C8589g gVar) {
            this();
        }
    }

    public C8638h(byte[] bArr) {
        C8594l.m46771e(bArr, "data");
        this.data = bArr;
    }

    public static final C8638h decodeBase64(String str) {
        return Companion.mo30801a(str);
    }

    public static final C8638h decodeHex(String str) {
        return Companion.mo30802b(str);
    }

    public static final C8638h encodeString(String str, Charset charset) {
        return Companion.mo30803c(str, charset);
    }

    public static final C8638h encodeUtf8(String str) {
        return Companion.mo30804d(str);
    }

    public static /* synthetic */ int indexOf$default(C8638h hVar, C8638h hVar2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return hVar.indexOf(hVar2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int indexOf$default(C8638h hVar, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return hVar.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(C8638h hVar, C8638h hVar2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = hVar.size();
            }
            return hVar.lastIndexOf(hVar2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(C8638h hVar, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = hVar.size();
            }
            return hVar.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    /* renamed from: of */
    public static final C8638h m46959of(ByteBuffer byteBuffer) {
        return Companion.mo30805e(byteBuffer);
    }

    /* renamed from: of */
    public static final C8638h m46960of(byte... bArr) {
        return Companion.mo30806f(bArr);
    }

    /* renamed from: of */
    public static final C8638h m46961of(byte[] bArr, int i, int i2) {
        return Companion.mo30807g(bArr, i, i2);
    }

    public static final C8638h read(InputStream inputStream, int i) throws IOException {
        return Companion.mo30808h(inputStream, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        C8638h h = Companion.mo30808h(objectInputStream, objectInputStream.readInt());
        Field declaredField = C8638h.class.getDeclaredField("data");
        C8594l.m46770d(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, h.data);
    }

    public static /* synthetic */ C8638h substring$default(C8638h hVar, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = hVar.size();
            }
            return hVar.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m50335deprecated_getByte(int i) {
        return getByte(i);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m50336deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        C8594l.m46770d(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return C8619a.m46808c(getData$okio(), (byte[]) null, 1, (Object) null);
    }

    public String base64Url() {
        return C8619a.m46807b(getData$okio(), C8619a.m46809d());
    }

    public C8638h digest$okio(String str) {
        C8594l.m46771e(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.data, 0, size());
        byte[] digest = instance.digest();
        C8594l.m46770d(digest, "digestBytes");
        return new C8638h(digest);
    }

    public final boolean endsWith(C8638h hVar) {
        C8594l.m46771e(hVar, "suffix");
        return rangeEquals(size() - hVar.size(), hVar, 0, hVar.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8638h) {
            C8638h hVar = (C8638h) obj;
            return hVar.size() == getData$okio().length && hVar.rangeEquals(0, getData$okio(), 0, getData$okio().length);
        }
    }

    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.f34975g;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.f34976h;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    public String hex() {
        char[] cArr = new char[(getData$okio().length * 2)];
        int i = 0;
        for (byte b : getData$okio()) {
            int i2 = i + 1;
            cArr[i] = C8626b.m46838f()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C8626b.m46838f()[b & 15];
        }
        return new String(cArr);
    }

    public C8638h hmac$okio(String str, C8638h hVar) {
        C8594l.m46771e(str, "algorithm");
        C8594l.m46771e(hVar, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(hVar.toByteArray(), str));
            byte[] doFinal = instance.doFinal(this.data);
            C8594l.m46770d(doFinal, "mac.doFinal(data)");
            return new C8638h(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C8638h hmacSha1(C8638h hVar) {
        C8594l.m46771e(hVar, "key");
        return hmac$okio("HmacSHA1", hVar);
    }

    public C8638h hmacSha256(C8638h hVar) {
        C8594l.m46771e(hVar, "key");
        return hmac$okio("HmacSHA256", hVar);
    }

    public C8638h hmacSha512(C8638h hVar) {
        C8594l.m46771e(hVar, "key");
        return hmac$okio("HmacSHA512", hVar);
    }

    public final int indexOf(C8638h hVar) {
        return indexOf$default(this, hVar, 0, 2, (Object) null);
    }

    public final int indexOf(C8638h hVar, int i) {
        C8594l.m46771e(hVar, "other");
        return indexOf(hVar.internalArray$okio(), i);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    public final int lastIndexOf(C8638h hVar) {
        return lastIndexOf$default(this, hVar, 0, 2, (Object) null);
    }

    public final int lastIndexOf(C8638h hVar, int i) {
        C8594l.m46771e(hVar, "other");
        return lastIndexOf(hVar.internalArray$okio(), i);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final C8638h md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i, C8638h hVar, int i2, int i3) {
        C8594l.m46771e(hVar, "other");
        return hVar.rangeEquals(i2, getData$okio(), i, i3);
    }

    public final void setHashCode$okio(int i) {
        this.f34975g = i;
    }

    public final void setUtf8$okio(String str) {
        this.f34976h = str;
    }

    public final C8638h sha1() {
        return digest$okio("SHA-1");
    }

    public final C8638h sha256() {
        return digest$okio("SHA-256");
    }

    public final C8638h sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(C8638h hVar) {
        C8594l.m46771e(hVar, "prefix");
        return rangeEquals(0, hVar, 0, hVar.size());
    }

    public String string(Charset charset) {
        C8594l.m46771e(charset, "charset");
        return new String(this.data, charset);
    }

    public final C8638h substring() {
        return substring$default(this, 0, 0, 3, (Object) null);
    }

    public final C8638h substring(int i) {
        return substring$default(this, i, 0, 2, (Object) null);
    }

    public C8638h substring(int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 <= getData$okio().length) {
                if (i2 - i < 0) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && i2 == getData$okio().length) {
                    return this;
                } else {
                    return new C8638h(C8475g.m46620g(getData$okio(), i, i2));
                }
            } else {
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    public C8638h toAsciiLowercase() {
        byte b;
        int i = 0;
        while (i < getData$okio().length) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C8638h(copyOf);
            }
        }
        return this;
    }

    public C8638h toAsciiUppercase() {
        byte b;
        int i = 0;
        while (i < getData$okio().length) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new C8638h(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String toString() {
        C8638h hVar;
        boolean z = true;
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int a = C8626b.m46835c(getData$okio(), 64);
        if (a != -1) {
            String utf8 = utf8();
            Objects.requireNonNull(utf8, "null cannot be cast to non-null type java.lang.String");
            String substring = utf8.substring(0, a);
            C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String q = C8436o.m46523q(C8436o.m46523q(C8436o.m46523q(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (a < utf8.length()) {
                return "[size=" + getData$okio().length + " text=" + q + "…]";
            }
            return "[text=" + q + ']';
        } else if (getData$okio().length <= 64) {
            return "[hex=" + hex() + ']';
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(getData$okio().length);
            sb.append(" hex=");
            if (64 > getData$okio().length) {
                z = false;
            }
            if (z) {
                if (64 == getData$okio().length) {
                    hVar = this;
                } else {
                    hVar = new C8638h(C8475g.m46620g(getData$okio(), 0, 64));
                }
                sb.append(hVar.hex());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String b = C8621b.m46812b(internalArray$okio());
        setUtf8$okio(b);
        return b;
    }

    public void write(OutputStream outputStream) throws IOException {
        C8594l.m46771e(outputStream, "out");
        outputStream.write(this.data);
    }

    public void write$okio(C8633e eVar, int i, int i2) {
        C8594l.m46771e(eVar, "buffer");
        C8626b.m46836d(this, eVar, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p394k.C8638h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            p369i.p387z.p389d.C8594l.m46771e(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p394k.C8638h.compareTo(k.h):int");
    }

    public final boolean endsWith(byte[] bArr) {
        C8594l.m46771e(bArr, "suffix");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public int indexOf(byte[] bArr, int i) {
        C8594l.m46771e(bArr, "other");
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C8624c.m46823a(getData$okio(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        C8594l.m46771e(bArr, "other");
        for (int min = Math.min(i, getData$okio().length - bArr.length); min >= 0; min--) {
            if (C8624c.m46823a(getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        C8594l.m46771e(bArr, "other");
        return i >= 0 && i <= getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C8624c.m46823a(getData$okio(), i, bArr, i2, i3);
    }

    public final boolean startsWith(byte[] bArr) {
        C8594l.m46771e(bArr, "prefix");
        return rangeEquals(0, bArr, 0, bArr.length);
    }
}
