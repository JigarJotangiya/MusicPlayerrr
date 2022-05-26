package coocent.music.player.base;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import com.coocent.marquee.MarqueeOnePixelActivity;
import coocent.music.player.activity.ScreenLockActivity;
import coocent.music.player.skin.net.MySkinEntity;
import coocent.music.player.skin.p274c.C7103a;
import coocent.music.player.skin.p274c.C7105c;
import coocent.music.player.skin.p274c.C7112h;
import coocent.musiclibrary.music.p289g.C7366c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.p461z.C9566f;
import p082e.p143q.C4107a;
import p159f.p166c.p177d.C4341a;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8335m;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.C9317b;

public class BaseApplication extends AbstractApplication {

    /* renamed from: A */
    public static int f31138A = 2;

    /* renamed from: B */
    public static int f31139B = 3;

    /* renamed from: C */
    public static int f31140C = 4;

    /* renamed from: D */
    public static boolean f31141D = false;

    /* renamed from: E */
    public static boolean f31142E = false;

    /* renamed from: F */
    public static boolean f31143F = false;

    /* renamed from: G */
    public static boolean f31144G = false;

    /* renamed from: H */
    public static int f31145H = 0;

    /* renamed from: j */
    public static String f31146j = "";

    /* renamed from: k */
    private static BaseApplication f31147k = null;

    /* renamed from: l */
    private static int f31148l = 0;

    /* renamed from: m */
    private static Handler f31149m = null;

    /* renamed from: n */
    public static int f31150n = 0;

    /* renamed from: o */
    public static int f31151o = 30;

    /* renamed from: p */
    public static int f31152p = 0;

    /* renamed from: q */
    public static int f31153q = 1;

    /* renamed from: r */
    public static float f31154r = 80.0f;

    /* renamed from: s */
    public static float f31155s = 0.0f;

    /* renamed from: t */
    public static boolean f31156t = false;

    /* renamed from: u */
    public static int f31157u = 0;

    /* renamed from: v */
    public static boolean f31158v = false;

    /* renamed from: w */
    public static boolean f31159w = false;

    /* renamed from: x */
    public static String f31160x = "";

    /* renamed from: y */
    public static String f31161y = "oss-us-west-1.aliyuncs.com";

    /* renamed from: z */
    public static int f31162z = 1;

    /* renamed from: i */
    public C7105c f31163i;

    /* renamed from: j */
    public static BaseApplication m40039j() {
        return f31147k;
    }

    /* renamed from: k */
    public static Handler m40040k() {
        return f31149m;
    }

    /* renamed from: l */
    public static int m40041l() {
        return f31148l;
    }

    /* renamed from: m */
    private void m40042m() {
        C4341a.m18953c(this, new C7033a(this));
    }

    /* renamed from: n */
    private void m40043n() {
        C7105c cVar = new C7105c(this);
        this.f31163i = cVar;
        f31160x = cVar.mo27299d(this);
        m40045r();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo26948q(boolean z) {
        if (!z) {
            C8287e.m45808T();
        } else if (C8337n.m46065k0(this).mo30106I()) {
            C8287e.m45815W0();
        }
    }

    /* renamed from: r */
    private void m40045r() {
        mo26946o();
        C8343s.m46306n(C8337n.m46065k0(this).mo30255t());
    }

    /* renamed from: s */
    public static boolean m40046s(MySkinEntity mySkinEntity) {
        File file = new File(f31160x + "/skin" + mySkinEntity.mo27305a());
        if (!file.exists()) {
            file.mkdirs();
        }
        C7112h b = C7112h.m40470b();
        String absolutePath = file.getAbsolutePath();
        return b.mo27304d(mySkinEntity, absolutePath, f31160x + "/skin" + mySkinEntity.mo27305a() + ".zip");
    }

    /* renamed from: a */
    public String mo26940a() {
        return "MusicPlayer16";
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C4107a.m18181l(this);
    }

    /* renamed from: b */
    public List<Class<? extends Activity>> mo26942b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ScreenLockActivity.class);
        arrayList.add(MarqueeOnePixelActivity.class);
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo26943e() {
        return true;
    }

    /* renamed from: f */
    public boolean mo26944f() {
        return false;
    }

    /* renamed from: h */
    public int mo26945h() {
        return 0;
    }

    /* renamed from: o */
    public void mo26946o() {
        C9317b A = C9317b.m49316A(this);
        A.mo32285y(true);
        A.mo32286z(true);
        A.mo32272i(new C7103a());
        A.mo32282v();
    }

    public void onCreate() {
        super.onCreate();
        C8335m.m46057c(this);
        m40043n();
        f31147k = this;
        f31148l = Process.myTid();
        f31149m = new Handler();
        f31150n = C8287e.m45879y(f31151o);
        f31152p = C8287e.m45806S(f31153q);
        f31155s = C8287e.m45804R(f31154r);
        C8287e.m45774C();
        f31143F = C8287e.m45780F();
        f31144G = C8287e.m45877x();
        f31157u = C8345u.m46328i(this);
        f31142E = C8337n.m46065k0(C8345u.m46327h()).mo30115K0();
        f31145H = C8345u.m46332m();
        f31159w = Build.VERSION.SDK_INT >= 21;
        C7366c.m41595g(this);
        C9566f.m50202m(this);
        C4477c.m19604X(this);
        C4477c.m19574G0(false);
        m40042m();
        C8284c.m45747j(this);
        C8343s.m46305m();
    }
}
