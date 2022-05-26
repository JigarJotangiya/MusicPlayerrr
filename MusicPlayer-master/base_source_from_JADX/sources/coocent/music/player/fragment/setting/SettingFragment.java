package coocent.music.player.fragment.setting;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.text.TextUtils;
import androidx.appcompat.app.C0136e;
import coocent.music.player.base.BaseApplication;
import coocent.musiclibrary.music.p284e.C7344h;
import coocent.musiclibrary.music.p292j.C7393h;
import coocent.musiclibrary.music.p292j.C7397j;
import coocent.musiclibrary.music.p292j.C7401l;
import java.util.Locale;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.PrivacyActivity;
import net.coocent.android.xmlparser.feedback.FeedbackActivity;
import p159f.p166c.p181e.p182a.p190b.p192i.C4461a;
import p159f.p166c.p181e.p182a.p190b.p196k.C4473b;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;
import p369i.C8446k;
import p369i.C8457t;

public class SettingFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener, C4473b, C7401l {

    /* renamed from: S */
    public static Preference f31165S;

    /* renamed from: A */
    private final Preference.OnPreferenceChangeListener f31166A = new C7038e();

    /* renamed from: B */
    private final Preference.OnPreferenceChangeListener f31167B = new C7049c(this);

    /* renamed from: C */
    private final Preference.OnPreferenceChangeListener f31168C = new C7039f();

    /* renamed from: D */
    private final Preference.OnPreferenceClickListener f31169D = new C7047a(this);

    /* renamed from: E */
    private final Preference.OnPreferenceClickListener f31170E = new C7051e(this);

    /* renamed from: F */
    private final Preference.OnPreferenceChangeListener f31171F = new C7040g();

    /* renamed from: G */
    private final Preference.OnPreferenceClickListener f31172G = new C7052f(this);

    /* renamed from: H */
    private final Preference.OnPreferenceChangeListener f31173H = new C7041h();

    /* renamed from: I */
    private final Preference.OnPreferenceChangeListener f31174I = new C7042i();

    /* renamed from: J */
    private final Preference.OnPreferenceChangeListener f31175J = new C7043j();

    /* renamed from: K */
    private final Preference.OnPreferenceChangeListener f31176K = new C7044k();

    /* renamed from: L */
    private final Preference.OnPreferenceChangeListener f31177L = new C7045l();

    /* renamed from: M */
    private final Preference.OnPreferenceChangeListener f31178M = new C7034a();

    /* renamed from: N */
    private final Preference.OnPreferenceChangeListener f31179N = new C7035b();

    /* renamed from: O */
    private final Preference.OnPreferenceChangeListener f31180O = new C7036c();

    /* renamed from: P */
    private final Preference.OnPreferenceChangeListener f31181P = new C7037d();

    /* renamed from: Q */
    private final Preference.OnPreferenceClickListener f31182Q = new C7048b(this);

    /* renamed from: R */
    private final Preference.OnPreferenceClickListener f31183R = new C7050d(this);

    /* renamed from: g */
    public CheckBoxPreference f31184g;

    /* renamed from: h */
    public CheckBoxPreference f31185h;

    /* renamed from: i */
    public CheckBoxPreference f31186i;

    /* renamed from: j */
    public CheckBoxPreference f31187j;

    /* renamed from: k */
    public CheckBoxPreference f31188k;

    /* renamed from: l */
    public CheckBoxPreference f31189l;

    /* renamed from: m */
    public CheckBoxPreference f31190m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ListPreference f31191n;

    /* renamed from: o */
    public Preference f31192o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C8337n f31193p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public CheckBoxPreference f31194q;

    /* renamed from: r */
    private Preference f31195r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public ListPreference f31196s;

    /* renamed from: t */
    private Preference f31197t;

    /* renamed from: u */
    private Preference f31198u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public CheckBoxPreference f31199v;

    /* renamed from: w */
    private C7046m f31200w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public CheckBoxPreference f31201x;

    /* renamed from: y */
    private CheckBoxPreference f31202y;

    /* renamed from: z */
    private C7344h f31203z;

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$a */
    class C7034a implements Preference.OnPreferenceChangeListener {
        C7034a() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30207g2(bool.booleanValue());
            SettingFragment.this.f31186i.setChecked(bool.booleanValue());
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$b */
    class C7035b implements Preference.OnPreferenceChangeListener {
        C7035b() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30211h2(bool.booleanValue());
            SettingFragment.this.f31187j.setChecked(bool.booleanValue());
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$c */
    class C7036c implements Preference.OnPreferenceChangeListener {
        C7036c() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30226l2(bool.booleanValue());
            SettingFragment.this.f31185h.setChecked(bool.booleanValue());
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$d */
    class C7037d implements Preference.OnPreferenceChangeListener {
        C7037d() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30173Y2(bool.booleanValue());
            SettingFragment.this.f31184g.setChecked(bool.booleanValue());
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$e */
    class C7038e implements Preference.OnPreferenceChangeListener {
        C7038e() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30152T1(bool.booleanValue());
            SettingFragment.this.f31201x.setChecked(bool.booleanValue());
            if (C8345u.m46327h() == null) {
                return false;
            }
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.fade_share"));
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$f */
    class C7039f implements Preference.OnPreferenceChangeListener {
        C7039f() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                SettingFragment.this.f31193p.mo30128N1(false);
                SettingFragment.this.f31199v.setChecked(false);
            } else if (C4461a.m19525b(SettingFragment.this.getActivity())) {
                SettingFragment.this.f31193p.mo30128N1(true);
                SettingFragment.this.f31199v.setChecked(true);
            } else {
                SettingFragment settingFragment = SettingFragment.this;
                C4477c.m19584L0(settingFragment, settingFragment);
            }
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$g */
    class C7040g implements Preference.OnPreferenceChangeListener {
        C7040g() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30156U1(bool.booleanValue());
            SettingFragment.this.f31194q.setChecked(bool.booleanValue());
            if (C8345u.m46327h() == null) {
                return false;
            }
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.sensor_share"));
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$h */
    class C7041h implements Preference.OnPreferenceChangeListener {
        C7041h() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (C8287e.m45770A() == null) {
                C8287e.m45876w0(C8287e.m45788J());
            }
            Integer valueOf = Integer.valueOf((String) obj);
            C8287e.m45874v0(C8287e.m45879y(BaseApplication.f31151o));
            C8287e.m45872u0(valueOf.intValue() * 10);
            C4477c.m19656y0(SettingFragment.this.getActivity(), BaseApplication.f31150n);
            SettingFragment.this.f31191n.setValueIndex(valueOf.intValue());
            SettingFragment.this.m40058D();
            if (SettingFragment.this.getActivity() == null) {
                return false;
            }
            SettingFragment.this.getActivity().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.filter_notify_list"));
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$i */
    class C7042i implements Preference.OnPreferenceChangeListener {
        C7042i() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Integer valueOf = Integer.valueOf((String) obj);
            SettingFragment.this.f31196s.setValueIndex(valueOf.intValue());
            C8287e.m45807S0(valueOf.intValue());
            SettingFragment.this.m40057C();
            if (SettingFragment.this.getActivity() == null) {
                return false;
            }
            C8313e.m45971e(SettingFragment.this.getActivity());
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$j */
    class C7043j implements Preference.OnPreferenceChangeListener {
        C7043j() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30215i2(bool.booleanValue());
            SettingFragment.this.f31190m.setChecked(bool.booleanValue());
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$k */
    class C7044k implements Preference.OnPreferenceChangeListener {
        C7044k() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30199e2(bool.booleanValue());
            SettingFragment.this.f31189l.setChecked(bool.booleanValue());
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$l */
    class C7045l implements Preference.OnPreferenceChangeListener {
        C7045l() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            Boolean bool = (Boolean) obj;
            SettingFragment.this.f31193p.mo30203f2(bool.booleanValue());
            SettingFragment.this.f31188k.setChecked(bool.booleanValue());
            return false;
        }
    }

    /* renamed from: coocent.music.player.fragment.setting.SettingFragment$m */
    private class C7046m extends BroadcastReceiver {
        private C7046m() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("media.musicplayer.audioplayer.videoplayer.desktop_lyric_action")) {
                SettingFragment.this.f31199v.setChecked(C8337n.m46065k0(SettingFragment.this.getActivity()).mo30106I());
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.desktop_lyric_action_close")) {
                SettingFragment.this.f31199v.setChecked(C8337n.m46065k0(SettingFragment.this.getActivity()).mo30106I());
            }
        }

        /* synthetic */ C7046m(SettingFragment settingFragment, C7038e eVar) {
            this();
        }
    }

    static {
        Class<SettingFragment> cls = SettingFragment.class;
    }

    /* renamed from: A */
    private void m40055A() {
        this.f31200w = new C7046m(this, (C7038e) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.desktop_lyric_action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.desktop_lyric_action_close");
        getActivity().registerReceiver(this.f31200w, intentFilter);
    }

    /* renamed from: B */
    private void m40056B() {
        Preference preference = f31165S;
        if (preference != null) {
            preference.setSummary(C8345u.m46333n(R.string.sleep_timer_start_tip));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m40057C() {
        this.f31196s.setSummary(C8345u.m46333n(R.string.track_animation_summary).replace("?", this.f31196s.getEntry().toString()));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m40058D() {
        if (this.f31191n.getValue().equals("0")) {
            this.f31191n.setSummary(C8345u.m46333n(R.string.none));
        } else {
            this.f31191n.setSummary(C8345u.m46333n(R.string.track_filter_summary).replace("?", this.f31191n.getEntry().toString()));
        }
    }

    /* renamed from: E */
    private void m40059E() {
        this.f31195r.setOnPreferenceClickListener(this.f31172G);
        f31165S.setOnPreferenceClickListener(this.f31183R);
        this.f31199v.setOnPreferenceChangeListener(this.f31168C);
        this.f31184g.setOnPreferenceChangeListener(this.f31181P);
        this.f31185h.setOnPreferenceChangeListener(this.f31180O);
        this.f31192o.setOnPreferenceClickListener(this.f31182Q);
        this.f31186i.setOnPreferenceChangeListener(this.f31178M);
        this.f31187j.setOnPreferenceChangeListener(this.f31179N);
        this.f31188k.setOnPreferenceChangeListener(this.f31177L);
        this.f31189l.setOnPreferenceChangeListener(this.f31176K);
        this.f31190m.setOnPreferenceChangeListener(this.f31175J);
        this.f31191n.setOnPreferenceChangeListener(this.f31173H);
        this.f31196s.setOnPreferenceChangeListener(this.f31174I);
        this.f31194q.setOnPreferenceChangeListener(this.f31171F);
        this.f31197t.setOnPreferenceClickListener(this.f31169D);
        this.f31198u.setOnPreferenceClickListener(this.f31170E);
    }

    /* renamed from: l */
    private void m40068l() {
        this.f31193p = new C8337n(getActivity());
        f31165S = findPreference("sleep");
        this.f31195r = findPreference("privacyPolicy");
        this.f31199v = (CheckBoxPreference) findPreference("desktop_lyric");
        this.f31201x = (CheckBoxPreference) findPreference("fade_music");
        this.f31199v.setChecked(C8337n.m46065k0(getActivity()).mo30106I());
        this.f31184g = (CheckBoxPreference) findPreference("enable_vibration");
        this.f31185h = (CheckBoxPreference) findPreference("lock_screen");
        this.f31186i = (CheckBoxPreference) findPreference("headset_plug_and_play");
        this.f31187j = (CheckBoxPreference) findPreference("headset_pull_out_pause");
        this.f31188k = (CheckBoxPreference) findPreference("headset_one_click");
        this.f31189l = (CheckBoxPreference) findPreference("headset_double_click");
        this.f31190m = (CheckBoxPreference) findPreference("headset_third_click");
        this.f31202y = (CheckBoxPreference) findPreference("enable_10_band");
        if (Build.VERSION.SDK_INT < 29) {
            ((PreferenceCategory) findPreference("general_setting")).removePreference(this.f31202y);
        }
        this.f31202y.setChecked(C8284c.m45749l());
        this.f31194q = (CheckBoxPreference) findPreference("enable_shake");
        this.f31191n = (ListPreference) findPreference("track_filter");
        this.f31196s = (ListPreference) findPreference("transition_animation");
        this.f31197t = findPreference("appUpdate");
        this.f31198u = findPreference("feedback");
        this.f31201x.setOnPreferenceChangeListener(this.f31166A);
        this.f31202y.setOnPreferenceChangeListener(this.f31167B);
        m40058D();
        m40057C();
        this.f31192o = findPreference("rate");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ boolean mo26950n(Preference preference, Object obj) {
        Boolean bool = (Boolean) obj;
        this.f31202y.setChecked(bool.booleanValue());
        C8284c.m45761x(bool.booleanValue());
        C8284c.m45738a();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ boolean mo26957p(Preference preference) {
        try {
            Activity activity = getActivity();
            if (activity == null) {
                return false;
            }
            C9502v.m49935f(activity);
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ boolean mo26958r(Preference preference) {
        try {
            FeedbackActivity.m49660h2(getActivity(), C0136e.m729j());
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ boolean mo26959t(Preference preference) {
        try {
            PrivacyActivity.m49504d2(getActivity(), TextUtils.equals(Locale.getDefault().getCountry().toUpperCase(), "CN") ? "https://privacypolicy.oss-us-west-1.aliyuncs.com/china/privacyPolicy.txt" : "https://privacypolicy.oss-us-west-1.aliyuncs.com/protocol/privacy.txt", false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ boolean mo26960v(Preference preference) {
        mo26949k();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ C8457t mo26961x(Integer num, Long l, C8446k kVar) {
        if (num.intValue() == 0) {
            C8287e.m45824a1();
            m40056B();
        } else if (num.intValue() == 6) {
            C8287e.m45817X0(l);
        } else {
            C8287e.m45817X0(Long.valueOf(((long) (num.intValue() * 15 * 60)) * 1000));
        }
        C8337n.m46065k0(C8345u.m46327h()).mo30093E2(num.intValue());
        C8337n.m46065k0(C8345u.m46327h()).mo30230m2(((Boolean) kVar.getFirst()).booleanValue());
        C8287e.m45805R0(kVar);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ boolean mo26962z(Preference preference) {
        C7344h i = C7344h.m41524i(getActivity(), C8337n.m46065k0(C8345u.m46327h()).mo30111J0(), C8337n.m46065k0(C8345u.m46327h()).mo30236o0(), new C7053g(this));
        this.f31203z = i;
        i.show();
        return false;
    }

    /* renamed from: a */
    public void mo15175a(int i, boolean z) {
        this.f31193p.mo30128N1(z);
        this.f31199v.setChecked(z);
    }

    /* renamed from: f */
    public void mo26664f() {
        m40056B();
    }

    /* renamed from: k */
    public void mo26949k() {
        Uri parse = Uri.parse("market://details?id=" + getActivity().getPackageName());
        try {
            Intent action = getActivity().getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
            action.setData(parse);
            getActivity().startActivity(action);
        } catch (Exception unused) {
            getActivity().startActivity(new Intent("android.intent.action.VIEW", parse));
        }
    }

    /* renamed from: k1 */
    public void mo26670k1(long j) {
        Preference preference = f31165S;
        if (preference != null) {
            preference.setSummary(C7397j.m41732b((int) (j / 1000)));
        }
        if (this.f31203z != null && getActivity() != null) {
            this.f31203z.mo28087r(j / 1000);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C4477c.m19608a0(C8345u.m46327h(), i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8287e.m45799O0(this);
        addPreferencesFromResource(R.xml.preferences);
        C7393h.m41695f(getActivity());
        C7393h.m41695f(getActivity()).mo28194p(this);
        m40068l();
        m40059E();
        m40055A();
    }

    public void onDestroy() {
        if (this.f31200w != null) {
            if (getActivity() != null) {
                getActivity().unregisterReceiver(this.f31200w);
            }
            this.f31200w = null;
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }
}
