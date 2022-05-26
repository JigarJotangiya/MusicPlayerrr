package p082e.p126k.p129c.p131j;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import p082e.p126k.p129c.p131j.C4012s0;

/* renamed from: e.k.c.j.b0 */
/* compiled from: Internal */
public final class C3899b0 {

    /* renamed from: a */
    static final Charset f11982a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f11983b;

    /* renamed from: e.k.c.j.b0$a */
    /* compiled from: Internal */
    public interface C3900a extends C3908i<Boolean> {
    }

    /* renamed from: e.k.c.j.b0$b */
    /* compiled from: Internal */
    public interface C3901b extends C3908i<Double> {
    }

    /* renamed from: e.k.c.j.b0$c */
    /* compiled from: Internal */
    public interface C3902c {
        int getNumber();
    }

    /* renamed from: e.k.c.j.b0$d */
    /* compiled from: Internal */
    public interface C3903d<T extends C3902c> {
        /* renamed from: a */
        T mo13461a(int i);
    }

    /* renamed from: e.k.c.j.b0$e */
    /* compiled from: Internal */
    public interface C3904e {
        /* renamed from: a */
        boolean mo13462a(int i);
    }

    /* renamed from: e.k.c.j.b0$f */
    /* compiled from: Internal */
    public interface C3905f extends C3908i<Float> {
    }

    /* renamed from: e.k.c.j.b0$g */
    /* compiled from: Internal */
    public interface C3906g extends C3908i<Integer> {
    }

    /* renamed from: e.k.c.j.b0$h */
    /* compiled from: Internal */
    public interface C3907h extends C3908i<Long> {
    }

    /* renamed from: e.k.c.j.b0$i */
    /* compiled from: Internal */
    public interface C3908i<E> extends List<E>, RandomAccess {
        /* renamed from: g */
        void mo13463g();

        /* renamed from: i */
        C3908i<E> mo13421i(int i);

        /* renamed from: r */
        boolean mo13464r();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f11983b = bArr;
        ByteBuffer.wrap(bArr);
        C3956j.m16886i(bArr);
    }

    /* renamed from: a */
    static <T> T m16645a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    static <T> T m16646b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static int m16647c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m16648d(byte[] bArr) {
        return m16649e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m16649e(byte[] bArr, int i, int i2) {
        int i3 = m16653i(i2, bArr, i, i2);
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m16650f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m16651g(byte[] bArr) {
        return C4032v1.m17831s(bArr);
    }

    /* renamed from: h */
    static Object m16652h(Object obj, Object obj2) {
        C4012s0.C4013a b = ((C4012s0) obj).mo13952b();
        b.mo13410p((C4012s0) obj2);
        return b.mo13958x();
    }

    /* renamed from: i */
    static int m16653i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m16654j(byte[] bArr) {
        return new String(bArr, f11982a);
    }
}
