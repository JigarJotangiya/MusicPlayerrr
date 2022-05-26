package p369i.p377u;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.g */
/* compiled from: _ArraysJvm.kt */
class C8475g extends C8473f {
    /* renamed from: b */
    public static <T> List<T> m46615b(T[] tArr) {
        C8594l.m46771e(tArr, "$this$asList");
        List<T> a = C8479i.m46638a(tArr);
        C8594l.m46770d(a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    /* renamed from: c */
    public static byte[] m46616c(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C8594l.m46771e(bArr, "$this$copyInto");
        C8594l.m46771e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: d */
    public static final <T> T[] m46617d(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C8594l.m46771e(tArr, "$this$copyInto");
        C8594l.m46771e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: e */
    public static /* synthetic */ byte[] m46618e(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        byte[] unused = m46616c(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    /* renamed from: f */
    public static /* synthetic */ Object[] m46619f(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m46617d(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    /* renamed from: g */
    public static byte[] m46620g(byte[] bArr, int i, int i2) {
        C8594l.m46771e(bArr, "$this$copyOfRangeImpl");
        C8471e.m46612a(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C8594l.m46770d(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: h */
    public static <T> T[] m46621h(T[] tArr, int i, int i2) {
        C8594l.m46771e(tArr, "$this$copyOfRangeImpl");
        C8471e.m46612a(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        C8594l.m46770d(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: i */
    public static <T> void m46622i(T[] tArr, T t, int i, int i2) {
        C8594l.m46771e(tArr, "$this$fill");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: j */
    public static /* synthetic */ void m46623j(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m46622i(objArr, obj, i, i2);
    }

    /* renamed from: k */
    public static final <T> void m46624k(T[] tArr, Comparator<? super T> comparator) {
        C8594l.m46771e(tArr, "$this$sortWith");
        C8594l.m46771e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
