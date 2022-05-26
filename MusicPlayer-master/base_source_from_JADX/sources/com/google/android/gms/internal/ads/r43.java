package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class r43<E> extends b43<E> implements Set<E> {

    /* renamed from: h */
    private transient g43<E> f22734h;

    r43() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <E> r43<E> m29863d(int i, Object... objArr) {
        if (i == 0) {
            return b63.zza;
        }
        if (i != 1) {
            int zzh = zzh(i);
            Object[] objArr2 = new Object[zzh];
            int i2 = zzh - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                t53.m31104a(obj, i5);
                int hashCode = obj.hashCode();
                int a = y33.m34009a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new g63(obj3);
            } else if (zzh(i4) < zzh / 2) {
                return m29863d(i4, objArr);
            } else {
                if (m29864p(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new b63(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new g63(obj4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static boolean m29864p(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        }
        s13.m30502e(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> q43<E> zzj(int i) {
        return new q43<>(i);
    }

    public static <E> r43<E> zzl() {
        return b63.zza;
    }

    @SafeVarargs
    public static <E> r43<E> zzm(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Object[] objArr = new Object[11];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, 5);
        return m29863d(11, objArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r43) && zzo() && ((r43) obj).zzo() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return f63.m23502a(this);
    }

    public g43<E> zzd() {
        g43<E> g43 = this.f22734h;
        if (g43 != null) {
            return g43;
        }
        g43<E> zzi = zzi();
        this.f22734h = zzi;
        return zzi;
    }

    /* renamed from: zze */
    public abstract j63<E> iterator();

    /* access modifiers changed from: package-private */
    public g43<E> zzi() {
        return g43.zzj(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean zzo() {
        return false;
    }
}
