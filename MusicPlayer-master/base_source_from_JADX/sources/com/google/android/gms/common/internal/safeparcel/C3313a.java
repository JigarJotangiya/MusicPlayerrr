package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3313a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class C3314a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3314a(@androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.C3313a.C3314a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @RecentlyNonNull
    /* renamed from: A */
    public static IBinder m14276A(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + D);
        return readStrongBinder;
    }

    /* renamed from: B */
    public static int m14277B(@RecentlyNonNull Parcel parcel, int i) {
        m14282G(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: C */
    public static long m14278C(@RecentlyNonNull Parcel parcel, int i) {
        m14282G(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: D */
    public static int m14279D(@RecentlyNonNull Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: E */
    public static void m14280E(@RecentlyNonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m14279D(parcel, i));
    }

    /* renamed from: F */
    public static int m14281F(@RecentlyNonNull Parcel parcel) {
        String str;
        int z = m14308z(parcel);
        int D = m14279D(parcel, z);
        int dataPosition = parcel.dataPosition();
        if (m14304v(z) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(z));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new C3314a(str, parcel);
        }
        int i = D + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C3314a(sb.toString(), parcel);
    }

    /* renamed from: G */
    private static void m14282G(Parcel parcel, int i, int i2) {
        int D = m14279D(parcel, i);
        if (D != i2) {
            String hexString = Integer.toHexString(D);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(D);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C3314a(sb.toString(), parcel);
        }
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static BigDecimal m14283a(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + D);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static BigDecimal[] m14284b(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + D);
        return bigDecimalArr;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static BigInteger m14285c(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + D);
        return new BigInteger(createByteArray);
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static BigInteger[] m14286d(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + D);
        return bigIntegerArr;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static boolean[] m14287e(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + D);
        return createBooleanArray;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static Bundle m14288f(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + D);
        return readBundle;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public static byte[] m14289g(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + D);
        return createByteArray;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public static double[] m14290h(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + D);
        return createDoubleArray;
    }

    @RecentlyNonNull
    /* renamed from: i */
    public static float[] m14291i(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + D);
        return createFloatArray;
    }

    @RecentlyNonNull
    /* renamed from: j */
    public static int[] m14292j(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + D);
        return createIntArray;
    }

    @RecentlyNonNull
    /* renamed from: k */
    public static ArrayList<Integer> m14293k(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + D);
        return arrayList;
    }

    @RecentlyNonNull
    /* renamed from: l */
    public static long[] m14294l(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + D);
        return createLongArray;
    }

    @RecentlyNonNull
    /* renamed from: m */
    public static Parcel m14295m(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, D);
        parcel.setDataPosition(dataPosition + D);
        return obtain;
    }

    @RecentlyNonNull
    /* renamed from: n */
    public static Parcel[] m14296n(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + D);
        return parcelArr;
    }

    @RecentlyNonNull
    /* renamed from: o */
    public static <T extends Parcelable> T m14297o(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + D);
        return t;
    }

    @RecentlyNonNull
    /* renamed from: p */
    public static String m14298p(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + D);
        return readString;
    }

    @RecentlyNonNull
    /* renamed from: q */
    public static String[] m14299q(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + D);
        return createStringArray;
    }

    @RecentlyNonNull
    /* renamed from: r */
    public static ArrayList<String> m14300r(@RecentlyNonNull Parcel parcel, int i) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + D);
        return createStringArrayList;
    }

    @RecentlyNonNull
    /* renamed from: s */
    public static <T> T[] m14301s(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + D);
        return createTypedArray;
    }

    @RecentlyNonNull
    /* renamed from: t */
    public static <T> ArrayList<T> m14302t(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int D = m14279D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + D);
        return createTypedArrayList;
    }

    /* renamed from: u */
    public static void m14303u(@RecentlyNonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C3314a(sb.toString(), parcel);
        }
    }

    /* renamed from: v */
    public static int m14304v(int i) {
        return (char) i;
    }

    /* renamed from: w */
    public static boolean m14305w(@RecentlyNonNull Parcel parcel, int i) {
        m14282G(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: x */
    public static double m14306x(@RecentlyNonNull Parcel parcel, int i) {
        m14282G(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: y */
    public static float m14307y(@RecentlyNonNull Parcel parcel, int i) {
        m14282G(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: z */
    public static int m14308z(@RecentlyNonNull Parcel parcel) {
        return parcel.readInt();
    }
}
