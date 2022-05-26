package p159f.p166c.p201g;

import android.content.Context;
import android.content.Intent;
import p159f.p166c.p201g.p208p.C4565a;

/* renamed from: f.c.g.a */
/* compiled from: EffectConstant */
public class C4506a {

    /* renamed from: a */
    public static int f13119a = 1000;

    /* renamed from: b */
    private static final String[] f13120b = {"31", "62", "125", "250", "500", "1k", "2k", "4k", "8k", "16k"};

    /* renamed from: c */
    private static final String[] f13121c = {"60HZ", "230HZ", "910HZ", "3.6kHZ", "14kHZ"};

    /* renamed from: d */
    public static final int[] f13122d;

    /* renamed from: e */
    public static final int[] f13123e;

    /* renamed from: f */
    public static final int[] f13124f = {C4510e.bass_ic_none, C4510e.bass_ic_s_room, C4510e.bass_ic_m_room, C4510e.bass_ic_l_room, C4510e.bass_ic_m_hall, C4510e.bass_ic_l_hall, C4510e.bass_ic_plate};

    static {
        int i = C4510e.icon_custom;
        int i2 = C4510e.icon_classical;
        int i3 = C4510e.icon_dance;
        int i4 = C4510e.icon_flat;
        int i5 = C4510e.icon_heavymetal;
        int i6 = C4510e.icon_jazz;
        int i7 = C4510e.icon_pop;
        int i8 = C4510e.icon_rock;
        int i9 = C4510e.icon_bass_boost;
        int i10 = C4510e.icon_treble_boost;
        f13122d = new int[]{i, C4510e.icon_normal, i2, i3, i4, C4510e.icon_folk, i5, C4510e.icon_hiphop, i6, i7, i8, C4510e.icon_acoustic, i9, i10, C4510e.icon_vocal_boost, C4510e.icon_head_phones, C4510e.icon_deep, C4510e.icon_electronic, C4510e.icon_latin, C4510e.icon_loud, C4510e.icon_lounge, C4510e.icon_piano, C4510e.icon_rhythm_and_blues};
        f13123e = new int[]{i, i2, i3, i4, i6, i7, i8, C4510e.icon_on_site, C4510e.icon_club, i9, i10, i5, C4510e.icon_strong, C4510e.icon_gentle, C4510e.icon_blues, C4510e.icon_balled, C4510e.icon_gather};
    }

    /* renamed from: a */
    public static String m19727a(Context context) {
        return context.getPackageName() + ".CHANGE_TEN_EQ";
    }

    /* renamed from: b */
    public static int[] m19728b() {
        if (C4565a.m19902a().f13258a) {
            return new int[]{6, 10, 8, 5, 6, 12, 4, 5, 8, 13};
        }
        return new int[]{0, 0, 0, 12, 12};
    }

    /* renamed from: c */
    public static int[] m19729c() {
        if (C4565a.m19902a().f13258a) {
            return new int[]{0, 8, 0, 7, 0, 3, 0, 5, 0, 0};
        }
        return new int[]{8, 7, 3, 6, 0};
    }

    /* renamed from: d */
    public static int m19730d() {
        return C4565a.m19902a().f13258a ? 10 : 5;
    }

    /* renamed from: e */
    public static String[] m19731e() {
        return C4565a.m19902a().f13258a ? f13120b : f13121c;
    }

    /* renamed from: f */
    public static int[] m19732f() {
        if (C4565a.m19902a().f13258a) {
            return new int[]{0, 0, 0, 0, 0, 0, 0, 15, 12, 12};
        }
        return new int[]{-2, 0, 8, 9, 4};
    }

    /* renamed from: g */
    public static int[] m19733g() {
        if (C4565a.m19902a().f13258a) {
            return new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        }
        return new int[]{0, 0, 0, 0, 0};
    }

    /* renamed from: h */
    public static int[] m19734h() {
        return C4565a.m19902a().f13258a ? f13123e : f13122d;
    }

    /* renamed from: i */
    public static String[] m19735i(Context context) {
        if (C4565a.m19902a().f13258a) {
            return context.getResources().getStringArray(C4508c.equalizer_new_eq_name);
        }
        return context.getResources().getStringArray(C4508c.equalizer_old_eq_name);
    }

    /* renamed from: j */
    public static int[] m19736j() {
        return f13124f;
    }

    /* renamed from: k */
    public static String[] m19737k(Context context) {
        return context.getResources().getStringArray(C4508c.equalizer2_reverb_value2);
    }

    /* renamed from: l */
    public static int[] m19738l() {
        if (C4565a.m19902a().f13258a) {
            return new int[]{15, 15, 15, 15, 15, 15, -15, -15, -15, -15};
        }
        return new int[]{15, 11, 7, -11, -11};
    }

    /* renamed from: m */
    public static String m19739m(Context context) {
        return context.getPackageName() + ".UPDATE_UI_EQ_SWITCH";
    }

    /* renamed from: n */
    public static String m19740n(Context context) {
        return context.getPackageName() + ".UPDATE_UI_REVERB";
    }

    /* renamed from: o */
    public static String m19741o(Context context) {
        return context.getPackageName() + ".UPDATE_SOUND_EFFECT";
    }

    /* renamed from: p */
    public static String m19742p(Context context) {
        return context.getPackageName() + ".UPDATE_UI_VB_SWITCH";
    }

    /* renamed from: q */
    public static boolean m19743q(Context context, int i) {
        return i <= m19735i(context).length;
    }

    /* renamed from: r */
    public static void m19744r(Context context, String str, String str2, int i, boolean z) {
        Intent intent = new Intent(context.getPackageName() + ".action.TOGGLE_PLAY_ACTION_EQ");
        intent.putExtra("track", str);
        intent.putExtra("artist", str2);
        if (z) {
            intent.putExtra("id", i);
        } else {
            intent.putExtra("id", 0);
        }
        context.sendBroadcast(intent);
    }
}
