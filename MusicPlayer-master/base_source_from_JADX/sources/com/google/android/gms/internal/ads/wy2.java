package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.recyclerview.widget.C0885l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wy2 {

    /* renamed from: a */
    public static final int f25579a;

    /* renamed from: b */
    public static final String f25580b;

    /* renamed from: c */
    public static final String f25581c;

    /* renamed from: d */
    public static final String f25582d;

    /* renamed from: e */
    public static final String f25583e;

    /* renamed from: f */
    public static final byte[] f25584f = new byte[0];

    /* renamed from: g */
    private static HashMap<String, String> f25585g;

    /* renamed from: h */
    private static final String[] f25586h = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: i */
    private static final String[] f25587i = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: j */
    private static final int[] f25588j = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: k */
    private static final int[] f25589k = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};

    static {
        int i = Build.VERSION.SDK_INT;
        f25579a = i;
        String str = Build.DEVICE;
        f25580b = str;
        String str2 = Build.MANUFACTURER;
        f25581c = str2;
        String str3 = Build.MODEL;
        f25582d = str3;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        f25583e = sb.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    }

    /* renamed from: A */
    public static float m33406A(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: B */
    public static <T> T[] m33407B(T[] tArr, int i) {
        gs1.m24486d(i <= tArr.length);
        return Arrays.copyOf(tArr, i);
    }

    /* renamed from: C */
    public static String[] m33408C() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f25579a >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{m33446i(configuration.locale)};
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = m33448k(strArr[i]);
        }
        return strArr;
    }

    /* renamed from: D */
    public static String[] m33409D(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: E */
    public static String[] m33410E(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: F */
    private static String m33411F(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            y92.m34067a("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e);
            return null;
        }
    }

    /* renamed from: G */
    private static HashMap<String, String> m33412G() {
        int length = f25586h.length;
        HashMap<String, String> hashMap = new HashMap<>(r2 + 86);
        int i = 0;
        for (String str : Locale.getISOLanguages()) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f25586h;
            int length2 = strArr.length;
            if (i >= 86) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m33413H(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r7 = java.util.Arrays.binarySearch(r3, r4)
            if (r7 >= 0) goto L_0x0008
            int r3 = ~r7
            goto L_0x0016
        L_0x0008:
            int r7 = r7 + 1
            int r0 = r3.length
            if (r7 >= r0) goto L_0x0013
            r0 = r3[r7]
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0008
        L_0x0013:
            if (r6 != 0) goto L_0x0017
            r3 = r7
        L_0x0016:
            return r3
        L_0x0017:
            int r7 = r7 + -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wy2.m33413H(long[], long, boolean, boolean):int");
    }

    /* renamed from: I */
    public static int m33414I(int[] iArr, int i, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0 || iArr[binarySearch] != i) {
            }
            binarySearch--;
            break;
        } while (iArr[binarySearch] != i);
        return binarySearch;
    }

    /* renamed from: J */
    public static int m33415J(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: K */
    public static int m33416K(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: L */
    public static int m33417L(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: M */
    public static int m33418M(byte[] bArr, int i, int i2, int i3) {
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = f25588j[(i4 >>> 24) ^ (bArr[i5] & 255)] ^ (i4 << 8);
        }
        return i4;
    }

    /* renamed from: N */
    public static int m33419N(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = f25589k[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    /* renamed from: O */
    public static int m33420O(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: P */
    public static int m33421P(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f25579a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: Q */
    public static int m33422Q(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: R */
    public static int m33423R(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: S */
    public static int m33424S(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 + i2;
    }

    /* renamed from: T */
    public static long m33425T(long j, long j2, long j3) {
        long j4 = j + j2;
        if (((j ^ j4) & (j2 ^ j4)) < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    /* renamed from: U */
    public static long m33426U(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: V */
    public static long m33427V(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) * ((double) f));
    }

    /* renamed from: W */
    public static long m33428W(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: X */
    public static long m33429X(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) / ((double) f));
    }

    /* renamed from: Y */
    public static long m33430Y(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: Z */
    public static long m33431Z(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i < 0 || j3 % j2 != 0) {
            return (i >= 0 || j2 % j3 != 0) ? (long) (((double) j) * (((double) j2) / ((double) j3))) : j * (j2 / j3);
        }
        return j / (j3 / j2);
    }

    /* renamed from: a */
    public static Looper m33432a() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    /* renamed from: a0 */
    public static long m33433a0(long j, long j2, long j3) {
        long j4 = j - j2;
        if (((j ^ j4) & (j2 ^ j)) < 0) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* renamed from: b */
    public static C5689w m33434b(int i, int i2, int i3) {
        jb4 jb4 = new jb4();
        jb4.mo18599s("audio/raw");
        jb4.mo18582e0(i2);
        jb4.mo18600t(i3);
        jb4.mo18594n(i);
        return jb4.mo18605y();
    }

    /* renamed from: b0 */
    public static long m33435b0(int i, int i2) {
        return (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
    }

    /* renamed from: c */
    public static <T> T m33436c(T t) {
        return t;
    }

    /* renamed from: c0 */
    public static long m33437c0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: d */
    public static String m33438d(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: d0 */
    public static Point m33439d0(Context context) {
        String str;
        String str2;
        DisplayManager displayManager;
        int i = f25579a;
        Display display = null;
        if (i >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m33457t(context)) {
            if (i < 28) {
                str = m33411F("sys.display-size");
            } else {
                str = m33411F("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Invalid display size: ".concat(valueOf);
                } else {
                    str2 = new String("Invalid display size: ");
                }
                Log.e("Util", str2);
            }
            if ("Sony".equals(f25581c) && f25582d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i2 = f25579a;
        if (i2 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i2 >= 17) {
            display.getRealSize(point);
            return point;
        } else {
            display.getSize(point);
            return point;
        }
    }

    /* renamed from: e */
    public static String m33440e(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, g13.f16857b);
    }

    /* renamed from: e0 */
    public static Handler m33441e0(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: f */
    public static String m33442f(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: f0 */
    public static Handler m33443f0(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        gs1.m24484b(myLooper);
        return new Handler(myLooper, (Handler.Callback) null);
    }

    /* renamed from: g */
    public static String m33444g(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return a13.m20555b(networkCountryIso);
            }
        }
        return a13.m20555b(Locale.getDefault().getCountry());
    }

    /* renamed from: h */
    public static String m33445h(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public static String m33446i(Locale locale) {
        if (f25579a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    /* renamed from: j */
    public static String m33447j(int i) {
        switch (i) {
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return "?";
        }
    }

    /* renamed from: k */
    public static String m33448k(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String a = a13.m20554a(str);
        int i = 0;
        String str2 = a.split("-", 2)[0];
        if (f25585g == null) {
            f25585g = m33412G();
        }
        String str3 = f25585g.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(a.substring(str2.length()));
            if (valueOf.length() != 0) {
                a = str3.concat(valueOf);
            } else {
                a = new String(str3);
            }
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return a;
        }
        while (true) {
            String[] strArr = f25587i;
            int length = strArr.length;
            if (i >= 18) {
                return a;
            }
            if (a.startsWith(strArr[i])) {
                String valueOf2 = String.valueOf(strArr[i + 1]);
                String valueOf3 = String.valueOf(a.substring(strArr[i].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i += 2;
        }
    }

    /* renamed from: l */
    public static ExecutorService m33449l(String str) {
        return Executors.newSingleThreadExecutor(new vx2("ExoPlayer:Loader:ProgressiveMediaPeriod"));
    }

    /* renamed from: m */
    public static void m33450m(qb1 qb1) {
        try {
            qb1.mo15697h();
        } catch (IOException unused) {
        }
    }

    /* renamed from: n */
    public static void m33451n(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > 1000000 ? 1 : (j2 == 1000000 ? 0 : -1));
        if (i2 >= 0 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || 1000000 % j2 != 0) {
            double d = 1000000.0d / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    /* renamed from: o */
    public static void m33452o(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: p */
    public static boolean m33453p(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: q */
    public static boolean m33454q(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: r */
    public static boolean m33455r(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: s */
    public static boolean m33456s(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: t */
    public static boolean m33457t(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: u */
    public static boolean m33458u(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: v */
    public static boolean m33459v(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: w */
    public static byte[] m33460w(String str) {
        return str.getBytes(g13.f16857b);
    }

    /* renamed from: x */
    public static byte[] m33461x(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: y */
    public static <T> T[] m33462y(T[] tArr) {
        return tArr;
    }

    /* renamed from: z */
    public static <T> T[] m33463z(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, copyOf, length, length2);
        return copyOf;
    }
}
