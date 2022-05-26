package p402l.p406b.p407a.p409f.p410c;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.logging.Logger;
import p402l.p406b.p407a.p409f.p412e.C9014c;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9134n;

/* renamed from: l.b.a.f.c.q */
/* compiled from: MetadataDescriptor */
public class C8984q implements Comparable<C8984q>, Cloneable {

    /* renamed from: m */
    public static final long f35422m = new BigInteger("FFFFFFFF", 16).longValue();

    /* renamed from: n */
    private static final Logger f35423n = Logger.getLogger("org.jaudiotagger.audio.asf.data");

    /* renamed from: o */
    public static final BigInteger f35424o = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    /* renamed from: g */
    private final C8972f f35425g;

    /* renamed from: h */
    private byte[] f35426h;

    /* renamed from: i */
    private int f35427i;

    /* renamed from: j */
    private int f35428j;

    /* renamed from: k */
    private final String f35429k;

    /* renamed from: l */
    private int f35430l;

    static {
        Class<C8984q> cls = C8984q.class;
    }

    public C8984q(C8972f fVar, String str, int i) {
        this(fVar, str, i, 0, 0);
    }

    /* renamed from: A */
    public void mo31402A(byte[] bArr) throws IllegalArgumentException {
        this.f35425g.assertConstraints(this.f35429k, bArr, this.f35427i, this.f35430l, this.f35428j);
        this.f35426h = (byte[]) bArr.clone();
        this.f35427i = 1;
    }

    /* renamed from: B */
    public void mo31403B(boolean z) {
        this.f35426h = new byte[]{z ? (byte) 1 : 0};
        this.f35427i = 2;
    }

    /* renamed from: C */
    public void mo31404C(long j) {
        if (j < 0 || j > f35422m) {
            throw new IllegalArgumentException("value out of range (0-" + f35422m + ")");
        }
        this.f35426h = C9014c.m48169c(j, 4);
        this.f35427i = 3;
    }

    /* renamed from: D */
    public void mo31405D(C8978l lVar) {
        this.f35425g.assertConstraints(this.f35429k, lVar.mo31375b(), 6, this.f35430l, this.f35428j);
        this.f35426h = lVar.mo31375b();
        this.f35427i = 6;
    }

    /* renamed from: E */
    public void mo31406E(long j) {
        if (j >= 0) {
            this.f35426h = C9014c.m48169c(j, 8);
            this.f35427i = 4;
            return;
        }
        throw new IllegalArgumentException("value out of range (0-" + f35424o.toString() + ")");
    }

    /* renamed from: F */
    public void mo31407F(BigInteger bigInteger) throws IllegalArgumentException {
        if (bigInteger == null) {
            throw new NumberFormatException("null");
        } else if (BigInteger.ZERO.compareTo(bigInteger) > 0) {
            throw new IllegalArgumentException("Only unsigned values allowed (no negative)");
        } else if (f35424o.compareTo(bigInteger) >= 0) {
            this.f35426h = new byte[8];
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray.length <= 8) {
                for (int length = byteArray.length - 1; length >= 0; length--) {
                    this.f35426h[byteArray.length - (length + 1)] = byteArray[length];
                }
            } else {
                Arrays.fill(this.f35426h, (byte) -1);
            }
            this.f35427i = 4;
        } else {
            throw new IllegalArgumentException("Value exceeds QWORD (64 bit unsigned)");
        }
    }

    /* renamed from: G */
    public void mo31408G(String str) throws IllegalArgumentException {
        try {
            switch (mo31430y()) {
                case 0:
                    mo31409H(str);
                    return;
                case 1:
                    throw new IllegalArgumentException("Cannot interpret binary as string.");
                case 2:
                    mo31403B(Boolean.parseBoolean(str));
                    return;
                case 3:
                    mo31404C(Long.parseLong(str));
                    return;
                case 4:
                    mo31407F(new BigInteger(str, 10));
                    return;
                case 5:
                    mo31410I(Integer.parseInt(str));
                    return;
                case 6:
                    mo31405D(C8978l.m48017h(str));
                    return;
                default:
                    throw new IllegalStateException();
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Value cannot be parsed as Number or is out of range (\"" + str + "\")", e);
        }
    }

    /* renamed from: H */
    public void mo31409H(String str) throws IllegalArgumentException {
        if (str == null) {
            this.f35426h = new byte[0];
        } else {
            byte[] d = C9014c.m48170d(str, C8968b.f35366g);
            if (mo31419k().isWithinValueRange((long) d.length)) {
                this.f35426h = d;
            } else if (C9134n.m48562h().mo31727B()) {
                int longValue = (int) mo31419k().getMaximumDataLength().longValue();
                if (longValue % 2 != 0) {
                    longValue--;
                }
                byte[] bArr = new byte[longValue];
                this.f35426h = bArr;
                System.arraycopy(d, 0, bArr, 0, bArr.length);
            } else {
                throw new IllegalArgumentException(C9118b.WMA_LENGTH_OF_DATA_IS_TOO_LARGE.getMsg(Integer.valueOf(d.length), mo31419k().getMaximumDataLength(), mo31419k().getContainerGUID().mo31376d()));
            }
        }
        this.f35427i = 0;
    }

    /* renamed from: I */
    public void mo31410I(int i) throws IllegalArgumentException {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("value out of range (0-65535)");
        }
        this.f35426h = C9014c.m48169c((long) i, 2);
        this.f35427i = 5;
    }

    /* renamed from: J */
    public int mo31411J(OutputStream outputStream, C8972f fVar) throws IOException {
        byte[] bArr;
        int l = mo31420l(fVar);
        if (this.f35427i == 2) {
            bArr = new byte[(fVar == C8972f.EXTENDED_CONTENT ? 4 : 2)];
            bArr[0] = mo31418j() ? (byte) 1 : 0;
        } else {
            bArr = this.f35426h;
        }
        C8972f fVar2 = C8972f.EXTENDED_CONTENT;
        if (fVar != fVar2) {
            C9014c.m48182p(mo31422q(), outputStream);
            C9014c.m48182p(mo31428v(), outputStream);
        }
        C9014c.m48182p((mo31423r().length() * 2) + 2, outputStream);
        if (fVar == fVar2) {
            outputStream.write(C9014c.m48170d(mo31423r(), C8968b.f35366g));
            outputStream.write(C8968b.f35367h);
        }
        int y = mo31430y();
        C9014c.m48182p(y, outputStream);
        int length = bArr.length;
        if (y == 0) {
            length += 2;
        }
        if (fVar == fVar2) {
            C9014c.m48182p(length, outputStream);
        } else {
            C9014c.m48183q((long) length, outputStream);
        }
        if (fVar != fVar2) {
            outputStream.write(C9014c.m48170d(mo31423r(), C8968b.f35366g));
            outputStream.write(C8968b.f35367h);
        }
        outputStream.write(bArr);
        if (y == 0) {
            outputStream.write(C8968b.f35367h);
        }
        return l;
    }

    /* renamed from: c */
    public int compareTo(C8984q qVar) {
        return mo31423r().compareTo(qVar.mo31423r());
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8984q) {
            if (obj == this) {
                return true;
            }
            C8984q qVar = (C8984q) obj;
            if (qVar.mo31423r().equals(mo31423r()) && qVar.f35427i == this.f35427i && qVar.f35428j == this.f35428j && qVar.f35430l == this.f35430l && Arrays.equals(this.f35426h, qVar.f35426h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public C8984q mo31416h() {
        C8984q qVar = new C8984q(this.f35425g, this.f35429k, this.f35427i, this.f35430l, this.f35428j);
        qVar.f35426h = mo31425t();
        return qVar;
    }

    public int hashCode() {
        return this.f35429k.hashCode();
    }

    /* renamed from: j */
    public boolean mo31418j() {
        byte[] bArr = this.f35426h;
        return bArr.length > 0 && bArr[0] != 0;
    }

    /* renamed from: k */
    public C8972f mo31419k() {
        return this.f35425g;
    }

    /* renamed from: l */
    public int mo31420l(C8972f fVar) {
        int i;
        C8972f fVar2 = C8972f.EXTENDED_CONTENT;
        int length = (fVar != fVar2 ? 14 : 8) + (mo31423r().length() * 2);
        if (mo31430y() == 2) {
            i = length + 2;
            if (fVar != fVar2) {
                return i;
            }
        } else {
            i = length + this.f35426h.length;
            if (mo31430y() != 0) {
                return i;
            }
        }
        return i + 2;
    }

    /* renamed from: o */
    public C8978l mo31421o() {
        if (mo31430y() == 6 && this.f35426h.length == 16) {
            return new C8978l(this.f35426h);
        }
        return null;
    }

    /* renamed from: q */
    public int mo31422q() {
        return this.f35428j;
    }

    /* renamed from: r */
    public String mo31423r() {
        return this.f35429k;
    }

    /* renamed from: s */
    public long mo31424s() {
        int y = mo31430y();
        int i = 4;
        if (y == 2) {
            i = 1;
        } else if (y != 3) {
            if (y == 4) {
                i = 8;
            } else if (y == 5) {
                i = 2;
            } else {
                throw new UnsupportedOperationException("The current type doesn't allow an interpretation as a number. (" + mo31430y() + ")");
            }
        }
        if (i <= this.f35426h.length) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j |= (((long) this.f35426h[i2]) & 255) << (i2 * 8);
            }
            return j;
        }
        throw new IllegalStateException("The stored data cannot represent the type of current object.");
    }

    /* renamed from: t */
    public byte[] mo31425t() {
        byte[] bArr = this.f35426h;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public String toString() {
        return mo31423r() + " : " + new String[]{"String: ", "Binary: ", "Boolean: ", "DWORD: ", "QWORD:", "WORD:", "GUID:"}[this.f35427i] + mo31429w() + " (language: " + this.f35428j + " / stream: " + this.f35430l + ")";
    }

    /* renamed from: u */
    public int mo31427u() {
        return this.f35426h.length;
    }

    /* renamed from: v */
    public int mo31428v() {
        return this.f35430l;
    }

    /* renamed from: w */
    public String mo31429w() {
        switch (mo31430y()) {
            case 0:
                try {
                    return new String(this.f35426h, "UTF-16LE");
                } catch (UnsupportedEncodingException e) {
                    f35423n.warning(e.getMessage());
                    return null;
                }
            case 1:
                return "binary data";
            case 2:
                return String.valueOf(mo31418j());
            case 3:
            case 4:
            case 5:
                return String.valueOf(mo31424s());
            case 6:
                return mo31421o() == null ? "Invalid GUID" : mo31421o().toString();
            default:
                throw new IllegalStateException("Current type is not known.");
        }
    }

    /* renamed from: y */
    public int mo31430y() {
        return this.f35427i;
    }

    /* renamed from: z */
    public boolean mo31431z() {
        return this.f35426h.length == 0;
    }

    public C8984q(C8972f fVar, String str, int i, int i2, int i3) {
        this.f35426h = new byte[0];
        this.f35428j = 0;
        this.f35430l = 0;
        fVar.assertConstraints(str, new byte[0], i, i2, i3);
        this.f35425g = fVar;
        this.f35429k = str;
        this.f35427i = i;
        this.f35430l = i2;
        this.f35428j = i3;
    }

    public C8984q(String str) {
        this(str, 0);
    }

    public C8984q(String str, int i) {
        this(C8972f.METADATA_LIBRARY_OBJECT, str, i, 0, 0);
    }
}
