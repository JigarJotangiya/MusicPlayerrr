package p159f.p166c.p201g.p208p;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: f.c.g.p.c */
/* compiled from: EffectPreference */
public class C4568c {
    /* renamed from: A */
    public static void m19940A(Context context, int i) {
        m19961t(context, "sound_effect_key", Integer.valueOf(i));
    }

    /* renamed from: B */
    public static void m19941B(Context context, boolean z) {
        m19961t(context, "virtual_enable", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static Object m19942a(Context context, String str, Object obj) {
        return m19943b(context, "MusicEffect", str, obj);
    }

    /* renamed from: b */
    public static Object m19943b(Context context, String str, String str2, Object obj) {
        if (context == null) {
            return obj;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (obj instanceof String) {
            return sharedPreferences.getString(str2, (String) obj);
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str2, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str2, ((Integer) obj).intValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str2, ((Long) obj).longValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str2, ((Float) obj).floatValue()));
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m19944c(Context context) {
        return ((Boolean) m19942a(context, "bass_enable", Boolean.TRUE)).booleanValue();
    }

    /* renamed from: d */
    public static int m19945d(Context context) {
        return ((Integer) m19942a(context, "bass_value", 0)).intValue();
    }

    /* renamed from: e */
    public static int m19946e(Context context) {
        return ((Integer) m19942a(context, "boost_level", 20)).intValue();
    }

    /* renamed from: f */
    public static boolean m19947f(Context context) {
        return ((Boolean) m19942a(context, "eq_enable", Boolean.TRUE)).booleanValue();
    }

    /* renamed from: g */
    public static int[] m19948g(Context context) {
        int i = 0;
        if (C4565a.m19902a().f13258a) {
            int[] iArr = new int[10];
            Arrays.fill(iArr, 0);
            try {
                JSONArray jSONArray = new JSONArray((String) m19942a(context, "eq_value_for_ten", "['3','0','0','0','3','3','0','0','0','3']"));
                while (i < jSONArray.length()) {
                    iArr[i] = jSONArray.getInt(i);
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return iArr;
        }
        int[] iArr2 = new int[5];
        Arrays.fill(iArr2, 0);
        try {
            JSONArray jSONArray2 = new JSONArray((String) m19942a(context, "eq_value_for_five", "['3','0','0','0','3']"));
            while (i < jSONArray2.length()) {
                iArr2[i] = jSONArray2.getInt(i);
                i++;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return iArr2;
    }

    /* renamed from: h */
    public static boolean m19949h(Context context) {
        return ((Boolean) m19942a(context, "is_open_ten", Boolean.TRUE)).booleanValue();
    }

    /* renamed from: i */
    public static boolean m19950i(Context context) {
        return ((Boolean) m19942a(context, "loudness_enable", Boolean.TRUE)).booleanValue();
    }

    /* renamed from: j */
    public static int m19951j(Context context) {
        return ((Integer) m19942a(context, "reverb_value", 0)).intValue();
    }

    /* renamed from: k */
    public static boolean m19952k(Context context) {
        return ((Boolean) m19942a(context, "sound_effect_enable", Boolean.FALSE)).booleanValue();
    }

    /* renamed from: l */
    public static int m19953l(Context context) {
        return ((Integer) m19942a(context, "sound_effect_key", -1)).intValue();
    }

    /* renamed from: m */
    public static boolean m19954m(Context context) {
        return ((Boolean) m19942a(context, "virtual_enable", Boolean.TRUE)).booleanValue();
    }

    /* renamed from: n */
    public static int m19955n(Context context) {
        return ((Integer) m19942a(context, "virtual_value", 0)).intValue();
    }

    /* renamed from: o */
    public static void m19956o(Context context, int i) {
        m19961t(context, "bass_value", Integer.valueOf(i));
    }

    /* renamed from: p */
    public static void m19957p(Context context, int i) {
        m19961t(context, "boost_level", Integer.valueOf(i));
    }

    /* renamed from: q */
    public static void m19958q(Context context, int[] iArr) {
        int i = 0;
        if (C4565a.m19902a().f13258a) {
            JSONArray jSONArray = new JSONArray();
            int length = iArr.length;
            while (i < length) {
                jSONArray.put(iArr[i]);
                i++;
            }
            m19961t(context, "eq_value_for_ten", jSONArray.toString());
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length2 = iArr.length;
        while (i < length2) {
            jSONArray2.put(iArr[i]);
            i++;
        }
        m19961t(context, "eq_value_for_five", jSONArray2.toString());
    }

    /* renamed from: r */
    public static void m19959r(Context context, int i) {
        m19961t(context, "reverb_value", Integer.valueOf(i));
    }

    /* renamed from: s */
    public static void m19960s(Context context, int i) {
        m19961t(context, "virtual_value", Integer.valueOf(i));
    }

    /* renamed from: t */
    public static void m19961t(Context context, String str, Object obj) {
        m19962u(context, "MusicEffect", str, obj);
    }

    /* renamed from: u */
    public static void m19962u(Context context, String str, String str2, Object obj) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            if (obj instanceof String) {
                sharedPreferences.edit().putString(str2, (String) obj).apply();
            } else if (obj instanceof Boolean) {
                sharedPreferences.edit().putBoolean(str2, ((Boolean) obj).booleanValue()).apply();
            } else if (obj instanceof Integer) {
                sharedPreferences.edit().putInt(str2, ((Integer) obj).intValue()).apply();
            } else if (obj instanceof Long) {
                sharedPreferences.edit().putLong(str2, ((Long) obj).longValue()).apply();
            } else if (obj instanceof Float) {
                sharedPreferences.edit().putFloat(str2, ((Float) obj).floatValue()).apply();
            }
        }
    }

    /* renamed from: v */
    public static void m19963v(Context context, boolean z) {
        m19961t(context, "bass_enable", Boolean.valueOf(z));
    }

    /* renamed from: w */
    public static void m19964w(Context context, boolean z) {
        m19961t(context, "eq_enable", Boolean.valueOf(z));
    }

    /* renamed from: x */
    public static void m19965x(Context context, boolean z) {
        m19961t(context, "is_open_ten", Boolean.valueOf(z));
    }

    /* renamed from: y */
    public static void m19966y(Context context, boolean z) {
        m19961t(context, "loudness_enable", Boolean.valueOf(z));
    }

    /* renamed from: z */
    public static void m19967z(Context context, boolean z) {
        m19961t(context, "sound_effect_enable", Boolean.valueOf(z));
    }
}
